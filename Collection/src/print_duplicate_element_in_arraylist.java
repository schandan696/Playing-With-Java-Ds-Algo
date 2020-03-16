import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class print_duplicate_element_in_arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		name.add("naveen");
		name.add("Rahul");
		name.add("yogesh");
		name.add("naveen");
		name.add("Rahul");
		
		Set<String> s = new HashSet<>();
		
		for(String n : name)
		{
			if(s.add(n)==false)
				System.out.println(n);
		}

	}

}
