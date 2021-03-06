package self.explore.streams.flatmap;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
	public static void main(String args[]) {
		  //Find the distinct words in a file
		  // Path path = Paths.get("/home/demo/Documents/docs/test.txt");
		  // Set setOfWords = new HashSet();
//		  try {
//			List<String> lines = Files.readAllLines(path);
//
//			//This is a test file
//			//This test file is 
//			//a demo of flatMap
//			for(String line: lines) {
//				String[] words = line.split("\\s+");
//				//["This", "is", "a", "test", "file"]
//				//["This", "test", "file", "is"]
//				//["a", "demo", "of", "flatMap"]
//				for(String word: words) {
//					setOfWords.add(word);
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("distinct words from traditional approach is "+setOfWords);
		
		String simulateFiles = new String("fai fahsid uagfai aisgf asfauisfai hhifa fhiasfgaoigfaoriugfa bvics hiuigag");
		//Streams Implementation
		//try {
			//Files.lines(path)
			Stream.of(simulateFiles)
			.map(e -> e.split("\\s+"))
			  //Stream of String array Stream(String[])
			  //Stream(["This", "is", "a", "test", "file"],
			  //       ["This", "test", "file", "is"],
			  //       ["a", "demo", "of", "flatMap"]
			  //      )
			.flatMap(Arrays::stream) //Stream of stream  Stream(Stream<String>)
			 //Stream(
			 //	     Stream.of(["This", "is", "a", "test", "file"]),
			 //	     Stream.of(["This", "test", "file", "is"]),
			 //      Stream.of(["a", "demo", "of", "flatMap"])
			 //      )
			.distinct()
			.forEach(System.out::println);
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
	  }
}
