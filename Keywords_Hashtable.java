import java.util.HashMap;
public class Keywords_Hashtable {

	HashMap<String, Keywords_Attributs> KeywordsHashMap = new HashMap<String, Keywords_Attributs>();
	public static final Keywords_Hashtable KeywordsTable = new Keywords_Hashtable ();
	
	public void insertTable(String name , String type) {
		if(!this.KeywordsHashMap.containsKey(name)){
		 this.KeywordsHashMap.put(name,new Keywords_Attributs(type));
	}
  }
}