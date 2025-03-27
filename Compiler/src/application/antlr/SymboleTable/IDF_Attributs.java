package application.antlr.SymboleTable;

public class IDF_Attributs {
	public StringBuilder mutalability= new StringBuilder("Not Defined");
    public StringBuilder dataType = new StringBuilder("Not Defined");
    public StringBuilder value = new StringBuilder("No Value");
    public StringBuilder error = new StringBuilder("No Error");
    public StringBuilder size = new StringBuilder("Not Array");

    
    public IDF_Attributs() {}
    
    
   //REDEFINED , SIZE , /0 , MISSMATCH
    public IDF_Attributs(StringBuilder error){
  	  this.error.setLength(0);
  	  this.error.append(error);
   }
    
  //NORMAL_NO_VALUE
  public IDF_Attributs(String type, String mutalability){
	  this.mutalability.setLength(0);
	  this.dataType.setLength(0);
	  this.dataType.append(type);
	  this.mutalability.append(mutalability);
  }

  //MISSMATCH 
  public IDF_Attributs(String type, String mutalability , String value,String error){
   this.error.setLength(0); 
   this.mutalability.setLength(0);
   this.dataType.setLength(0);
   this.value.setLength(0);
   this.error.append(error);
   this.value.append(value);
   this.dataType.append(type);
   this.mutalability.append(mutalability);
  }
  
 // REDEFINITION , SIZE_IDF 
 public IDF_Attributs(String type , String mutalability,StringBuilder error){
	   this.mutalability.setLength(0);
	   this.dataType.setLength(0);
	   this.mutalability.append(mutalability);
	   this.dataType.append(type);
	   this.error.setLength(0);
	   this.error.append(error);
}
  
  
  //NORMAL_WITH_VALUE / 
  public IDF_Attributs(String type , String mutalability,String value){
   this.mutalability.setLength(0);
   this.dataType.setLength(0);
   this.mutalability.append(mutalability);
   this.dataType.append(type);
   this.value.setLength(0);
   this.value.append(value);
   
  }
  
  
  public IDF_Attributs(String type , String mutalability,String value, StringBuilder error){
	   this.mutalability.setLength(0);
	   this.dataType.setLength(0);
	   this.value.setLength(0);
	   this.mutalability.append(mutalability);
	   this.dataType.append(type);
	   this.value.append(value);
	   this.error.append(error);
	   
	  }
  
  @Override
  public String toString () {
    return "Type : "+this.dataType+" Value : "+this.value+" Error : "+this.error;
  }
 
}
