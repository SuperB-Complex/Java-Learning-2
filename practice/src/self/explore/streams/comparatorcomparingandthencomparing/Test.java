package self.explore.streams.comparatorcomparingandthencomparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	
	private static List musicalInstruments=new ArrayList<>();
	static {
		musicalInstruments.add(new MusicalInstrument("Trumpet","brass0"));
		musicalInstruments.add(new MusicalInstrument("Tuba","brass0"));
		musicalInstruments.add(new MusicalInstrument("Timpani","percussion0"));
		musicalInstruments.add(new MusicalInstrument("Piano","keyboard0"));
		musicalInstruments.add(new MusicalInstrument("Trumpet","brass1"));
		musicalInstruments.add(new MusicalInstrument("Tuba","brass1"));
		musicalInstruments.add(new MusicalInstrument("Timpani","percussion1"));
		musicalInstruments.add(new MusicalInstrument("Piano","keyboard1"));
	}
	
	public static void main (String args[]) {
		System.out.println("Musical instruments in the collection sorted by name:");
		Collections.sort(musicalInstruments, 
				Comparator.comparing((MusicalInstrument instrument) -> instrument.getName()));
		musicalInstruments.stream().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Musical instruments in the collection sorted by type:");
		Collections.sort(musicalInstruments, 
				Comparator.comparing((MusicalInstrument instrument) -> instrument.getType()));
		musicalInstruments.stream().forEach(instrument->System.out.println(instrument));

		System.out.println();
		
		System.out.println("Musical instruments in the collection sorted by name then type:");
		// first comparing name
		Comparator<MusicalInstrument> compareName = Comparator.comparing(MusicalInstrument::getName); 
		// then comparing type
		Comparator<MusicalInstrument> compareType = Comparator.comparing(MusicalInstrument::getType);
		Comparator<MusicalInstrument> compareNameType = compareName.thenComparing(compareType);
		Collections.sort(musicalInstruments, compareNameType);
		musicalInstruments.stream().forEach(System.out::println);
	}
}
