import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_interface {
		public static void main(String[] argv)
		{	
				Map<String,String> map=new HashMap();
				map.put("myname","Shashank");
				map.put("actress","natalia");
				map.put("ceo","Sundar pichai");
				map.put("city","lucknow");
				
				System.out.println(map); //printing all value in one line
				 
				Set<String> keys = map.keySet();// printing value using Set
				for(String key : keys)
				{
						System.out.println(key+" : "+map.get(key));
				}
		}
}