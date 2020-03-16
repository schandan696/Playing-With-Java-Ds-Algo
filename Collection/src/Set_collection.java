import java.util.HashSet;
import java.util.Set;

public class Set_collection 
{

	public static void main(String[] args) 
	{
		//implementation of set interface
		Set<Integer> value = new HashSet<>();
		System.out.println(value.add(5));
		System.out.println(value.add(7));
		System.out.println(value.add(9));
		System.out.println(value.add(5));
		
		for(int i : value){
			System.out.println(i);
		}
		
	}

}
