public class IDF_Attributs {
    String dataType = "";
    String value = "";
    StringBuilder error = new StringBuilder("No Error");

  public IDF_Attributs(){}

  public IDF_Attributs(String error){
   this.error.setLength(0); 
   this.error.append(error);
  }
   
  public IDF_Attributs(String type , String value){
   this.value = value;
   this.dataType = type;
  }
  
  @Override
  public String toString () {
    return "Type : "+this.dataType+" Value : "+this.value+" Error : "+this.error;
  }
 
}