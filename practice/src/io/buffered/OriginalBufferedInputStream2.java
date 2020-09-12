package io.buffered;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class OriginalBufferedInputStream2 extends FilterInputStream {
	   /**
	    * This is the default buffer size
	    */
	   private static final int DEFAULT_BUFFER_SIZE = 2048;
	 
	   /**
	    * The buffer used for storing data from the underlying stream.
	    */
	   protected byte[] buf;
	 
	   /**
	    * The number of valid bytes currently in the buffer.  It is also the index
	    * of the buffer position one byte past the end of the valid data.
	    */
	   protected int count;
	 
	   /**
	    * The index of the next character that will by read from the buffer.
	    * When <code>pos == count</code>, the buffer is empty.
	    */
	   protected int pos;
	 
	   /**
	    * The value of <code>pos</code> when the <code>mark()</code> method was
	    * called.  
	    * This is set to -1 if there is no mark set.
	    */
	   protected int markpos = -1;
	 
	   /**
	    * This is the maximum number of bytes than can be read after a 
	    * call to <code>mark()</code> before the mark can be discarded.
	    * After this may bytes are read, the <code>reset()</code> method
	    * may not be called successfully.
	    */
	   protected int marklimit;
	 
	   /**
	    * This is the initial buffer size. When the buffer is grown because
	    * of marking requirements, it will be grown by bufferSize increments.
	    * The underlying stream will be read in chunks of bufferSize.
	    */
	   private final int bufferSize;
	 
	   /**
	    * This method initializes a new <code>BufferedInputStream</code> that will
	    * read from the specified subordinate stream with a default buffer size
	    * of 2048 bytes
	    *
	    * @param in The subordinate stream to read from
	    */
	   public OriginalBufferedInputStream2(InputStream in)
	   {
	     this(in, DEFAULT_BUFFER_SIZE);
	   }
	 
	   /**
	    * This method initializes a new <code>BufferedInputStream</code> that will
	    * read from the specified subordinate stream with a buffer size that
	    * is specified by the caller.
	    *
	    * @param in The subordinate stream to read from
	    * @param size The buffer size to use
	    *
	    * @exception IllegalArgumentException when size is smaller then 1
	    */
	   public OriginalBufferedInputStream2(InputStream in, int size)
	   {
	     super(in);
	     if (size <= 0)
	       throw new IllegalArgumentException();
	     buf = new byte[size];
	     // initialize pos & count to bufferSize, to prevent refill from
	     // allocating a new buffer (if the caller starts out by calling mark()).
	     pos = count = bufferSize = size;
	   }
	 
	   /**
	    * This method returns the number of bytes that can be read from this
	    * stream before a read can block.  A return of 0 indicates that blocking
	    * might (or might not) occur on the very next read attempt.
	    * <p>
	    * The number of available bytes will be the number of read ahead bytes 
	    * stored in the internal buffer plus the number of available bytes in
	    * the underlying stream.
	    *
	    * @return The number of bytes that can be read before blocking could occur
	    *
	    * @exception IOException If an error occurs
	    */
	   public synchronized int available() throws IOException
	   {
	     return count - pos + super.available();
	   }
	 
	   /**
	    * This method closes the underlying input stream and frees any
	    * resources associated with it. Sets <code>buf</code> to <code>null</code>.
	    *
	    * @exception IOException If an error occurs.
	    */
	   public void close() throws IOException
	   {
	     // Free up the array memory.
	     buf = null;
	     pos = count = 0;
	     markpos = -1;
	     super.close();
	   }
	 
	   /**
	    * This method marks a position in the input to which the stream can be
	    * "reset" by calling the <code>reset()</code> method.  The parameter
	    * <code>readlimit</code> is the number of bytes that can be read from the 
	    * stream after setting the mark before the mark becomes invalid.  For
	    * example, if <code>mark()</code> is called with a read limit of 10, then
	    * when 11 bytes of data are read from the stream before the
	    * <code>reset()</code> method is called, then the mark is invalid and the
	    * stream object instance is not required to remember the mark.
	    * <p>
	    * Note that the number of bytes that can be remembered by this method
	    * can be greater than the size of the internal read buffer.  It is also
	    * not dependent on the subordinate stream supporting mark/reset
	    * functionality.
	    *
	    * @param readlimit The number of bytes that can be read before the mark
	    * becomes invalid
	    */
	   public synchronized void mark(int readlimit)
	   {
	     marklimit = readlimit;
	     markpos = pos;
	   }
	 
	   /**
	    * This method returns <code>true</code> to indicate that this class
	    * supports mark/reset functionality.
	    *
	    * @return <code>true</code> to indicate that mark/reset functionality is
	    * supported
	    *
	    */
	   public boolean markSupported()
	   {
	     return true;
	   }

	   /**
	    * This method reads an unsigned byte from the input stream and returns it
	    * as an int in the range of 0-255.  This method also will return -1 if
	    * the end of the stream has been reached.
	    * <p>
	    * This method will block until the byte can be read.
	    *
	    * @return The byte read or -1 if end of stream
	    *
	    * @exception IOException If an error occurs
	    */
	   public synchronized int read() throws IOException
	   {
	     if (pos >= count && !refill())
	       return -1;    // EOF
	 
	     return buf[pos++] & 0xFF;
	   }
	 
	   /**
	    * This method reads bytes from a stream and stores them into a caller
	    * supplied buffer.  It starts storing the data at index <code>off</code>
	    * into the buffer and attempts to read <code>len</code> bytes.  This method
	    * can return before reading the number of bytes requested, but it will try
	    * to read the requested number of bytes by repeatedly calling the underlying
	    * stream as long as available() for this stream continues to return a
	    * non-zero value (or until the requested number of bytes have been read).
	    * The actual number of bytes read is returned as an int.  A -1 is returned
	    * to indicate the end of the stream.
	    * <p>
	    * This method will block until some data can be read.
	    *
	    * @param b The array into which the bytes read should be stored
	    * @param off The offset into the array to start storing bytes
	    * @param len The requested number of bytes to read
	    *
	    * @return The actual number of bytes read, or -1 if end of stream.
	    *
	    * @exception IOException If an error occurs.
	    * @exception IndexOutOfBoundsException when <code>off</code> or
	    *            <code>len</code> are negative, or when <code>off + len</code>
	    *            is larger then the size of <code>b</code>,
	    */
	   public synchronized int read(byte[] b, int off, int len) throws IOException
	   {
	     if (off < 0 || len < 0 || b.length - off < len)
	       throw new IndexOutOfBoundsException();
	 
	     if (len == 0)
	       return 0;
	 
	     if (pos >= count && !refill())
	       return -1;        // No bytes were read before EOF.
	 
	     int totalBytesRead = Math.min(count - pos, len);
	     System.arraycopy(buf, pos, b, off, totalBytesRead);
	     pos += totalBytesRead;
	     off += totalBytesRead;
	      len -= totalBytesRead;
	 
	     while (len > 0 && super.available() > 0 && refill())
	        {
	     int remain = Math.min(count - pos, len);
	     System.arraycopy(buf, pos, b, off, remain);
	     pos += remain;
	     off += remain;
	     len -= remain;
	     totalBytesRead += remain;
	       }
	 
	     return totalBytesRead;
	   }
	 
	   /**
	    * This method resets a stream to the point where the <code>mark()</code>
	    * method was called.  Any bytes that were read after the mark point was
	    * set will be re-read during subsequent reads.
	    * <p>
	    * This method will throw an IOException if the number of bytes read from
	    * the stream since the call to <code>mark()</code> exceeds the mark limit
	    * passed when establishing the mark.
	    *
	    * @exception IOException If <code>mark()</code> was never called or more
	    *            then <code>marklimit</code> bytes were read since the last
	    *            call to <code>mark()</code>
	    */
	   public synchronized void reset() throws IOException
	   {
	     if (markpos == -1)
	        throw new IOException(buf == null ? "Stream closed." : "Invalid mark.");
	 
	     pos = markpos;
	   }
	 
	   /**
	    * This method skips the specified number of bytes in the stream.  It
	    * returns the actual number of bytes skipped, which may be less than the
	    * requested amount.
	    *
	    * @param n The requested number of bytes to skip
	     *
	    * @return The actual number of bytes skipped.
	     *
	     * @exception IOException If an error occurs
	    */
	   public synchronized long skip(long n) throws IOException
	   {
	     if (buf == null)
	        throw new IOException("Stream closed.");
	 
	      final long origN = n;
	 
	     while (n > 0L)
	       {
	     if (pos >= count && !refill())
	           break;
	 
	     int numread = (int) Math.min((long) (count - pos), n);
	     pos += numread;
	     n -= numread;
	       }
	 
	     return origN - n;
	   }
	 
	   /**
	    * Called to refill the buffer (when count is equal to pos).
	    *
	    * @return <code>true</code> when at least one additional byte was read
	    *         into <code>buf</code>, <code>false</code> otherwise (at EOF).
	    */
	   private boolean refill() throws IOException
	   {
	     if (buf == null)
	       throw new IOException("Stream closed.");
	 
	     if (markpos == -1 || count - markpos >= marklimit)
	       {
	     markpos = -1;
	     pos = count = 0;
	       }
	     else
	       {
	     byte[] newbuf = buf;
	     if (markpos < bufferSize)
	       {
	         newbuf = new byte[count - markpos + bufferSize];
	       }
	     System.arraycopy(buf, markpos, newbuf, 0, count - markpos);
	     buf = newbuf;
	     count -= markpos;
	     pos -= markpos;
	     markpos = 0;
	       }
	 
	     int numread = super.read(buf, count, bufferSize);
	 
	     if (numread <= 0)    // EOF
	       return false;
	 
	     count += numread;
	     return true;
	   }
}
