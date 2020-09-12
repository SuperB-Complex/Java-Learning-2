package self.explore.streams.comparatorcomparingandthencomparing;

public class MusicalInstrument {
	
	private String name;
	private String type;
	
	public MusicalInstrument(String name, String type) {
		setName(name);
		setType(type);
	}	
	
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name=name;
	}
	public String getType() {
		return type;
	}
	public void setType (String type) {
		this.type=type;
	}
	public String toString() {
		return name + " is a " + type + " instrument";
	}
	
}
