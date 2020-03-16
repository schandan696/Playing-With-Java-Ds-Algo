	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Iterator;

class Collection_Generics {


		public static void main(String[] args) {
			//Example of generic.
			Collection<Integer> value = new ArrayList<>();
			value.add(3);
			value.add(7);
			value.add(9);
			
			// traversing Genrics using enhance forloop
			for(Integer i1 : value)
			{
				System.out.println(i1);
			}
			
		}

	}
