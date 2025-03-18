import java.util.HashMap;
import java.util.Map;

public class IDF_HashTable {
  public HashMap<String,IDF_Attributs> IDF_Map = new HashMap<String,IDF_Attributs>();
  public static final IDF_HashTable table = new IDF_HashTable();
  
  public void insert(String IDF_Name) {
    if(!this.IDF_Map.containsKey(IDF_Name)){
      this.IDF_Map.put(IDF_Name,new IDF_Attributs());
    }
  }

  public void updateTypeValue(String IDF_Name,String type,String value,String tokenType){
    updateType(IDF_Name,type);
    updateValue(IDF_Name,value,tokenType);
  }

  public String addZero (String floatValue){
    if(floatValue.startsWith(".")) {floatValue = "0"+floatValue;}
    else if (floatValue.endsWith(".")) {floatValue = floatValue+"0";}
    return floatValue;
  }

  public String getSign(String floatValue) {
    if(floatValue.contains("-")) {return "-";}
    else if (floatValue.contains("+")) {return "+";}
    else {return "";}
  }

  public void updateValue(String IDF_Name,String value,String tokenType) {
     String type = this.IDF_Map.get(IDF_Name).dataType;
     switch(type) {
      case "Int":
        if(!type.equalsIgnoreCase(tokenType)) {updateError(IDF_Name,"Missmatch Type");}
        else { this.IDF_Map.get(IDF_Name).value = value.replace("(","").replace(")","");}
        break;
      case "Float":
        if(!type.equalsIgnoreCase(tokenType)) {updateError(IDF_Name,"Missmatch Type");}
        else {
           String sign = getSign(value);
           System.out.println("value : "+value+" Sign : "+sign);
           value = value.replace("(","").replace(")","").replace(sign,"");
           value = addZero(value);
           value = sign+value;
           this.IDF_Map.get(IDF_Name).value = value;}
        break;
     } 
     this.IDF_Map.get(IDF_Name).value = value;
  }

  public void updateType(String IDF_Name,String type) {
     if(this.IDF_Map.get(IDF_Name).dataType.isEmpty()){
     this.IDF_Map.get(IDF_Name).dataType = type;
    }
    else{
      updateError(IDF_Name,"IDF Redefinition");
    }
  }

  public void updateError(String IDF_Name,String error) {
    if(!this.IDF_Map.containsKey(IDF_Name)){
      this.IDF_Map.put(IDF_Name,new IDF_Attributs(error));
    }
    else {
      if(this.IDF_Map.get(IDF_Name).error.toString().equalsIgnoreCase("No Error")){ 
         this.IDF_Map.get(IDF_Name).error.setLength(0); 
          this.IDF_Map.get(IDF_Name).error.append(error);
      }
      else{
      this.IDF_Map.get(IDF_Name).error.append("\n"+error);
      }
    }
  }

  public void printTable() {
      System.out.println("Table: Size = " + this.IDF_Map.size());
    for (Map.Entry<String, IDF_Attributs> entry : this.IDF_Map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }

 }
