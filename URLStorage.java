import java.util.HashMap;

public class URLStorage {
   private HashMap<String, String> map = new HashMap();

   public URLStorage() {
   }

   public void saveURL(String var1, String var2) {
      this.map.put(var1, var2);
   }

   public String getLongURL(String var1) {
      return (String)this.map.get(var1);
   }

   public void displayAll() {
      for(String var2 : this.map.keySet()) {
         System.out.println(var2 + " -> " + (String)this.map.get(var2));
      }

   }
}
