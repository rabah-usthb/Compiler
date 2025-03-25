public class Constant_Attributs {

	public String range;
    public String dataType;
	public String error = "No Error";
	
	public Constant_Attributs(String range, String dataType) {
		this.range = range;
		this.dataType = dataType;
	}
	
	public Constant_Attributs(String range, String dataType,String error) {
		this.range = range;
		this.dataType = dataType;
		this.error = error;
	}
}
