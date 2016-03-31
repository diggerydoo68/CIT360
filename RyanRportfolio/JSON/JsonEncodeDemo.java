import org.json.simple.JSONObject;

class JsonEncodeDemo {

   public static void main(String[] args){
      JSONObject obj = new JSONObject(); //Encoding the values in a new object

      obj.put("name", "Neil Peart");
      obj.put("Ranking", new Integer(100));
      obj.put("networth", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));

      System.out.print(obj);
   }
}
