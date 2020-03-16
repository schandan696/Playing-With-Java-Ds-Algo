import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class List_Interface {

	public static void main(String[] args) throws Exception
	{
		
		//Example of generic.
		List<Integer> value = new ArrayList<Integer>();
		value.add(3);
		value.add(7);
		value.add(9);
		value.add(1,6);
		value.add(4);
		value.add(8);
		Collections.sort(value);
		// traversing collection using stream api
		value.forEach(System.out::println);
		
		/* traversing Genrics using enhance forloop
		for(Integer i1 : value)
		{
			System.out.println(i1);
		}
		*/
	}

}
