import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Collection1 {

	public static void main(String[] args) {
		
		/*Collection value = new ArrayList();
		value.add(3);
		value.add("naveen");
		value.add(5.8f);
		*/
		/* traversing Collection using iterator interface
		Iterator i = value.iterator();
		while(i.hasNext()){
		System.out.println(i.next());
		}
		*/
		
		/*traversing Collection using enhance forloop
		for(Object i1 : value)
		{
			System.out.println(i1);
		}
		*/
		//Example of generic.
		Collection<Integer> value = new ArrayList<>();
		value.add(3);
		value.add(7);
		value.add(9);
	}

}
