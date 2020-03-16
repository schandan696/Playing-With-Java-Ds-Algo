	import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 public class Comprator_interface {

		public static void main(String[] args) throws Exception
		{
			List<Integer> value = new ArrayList<Integer>();
			value.add(387);
			value.add(753);
			value.add(962);
			value.add(435);
			value.add(864);
			//Comparator<Integer> com= new Compimpl(); //using another class compimpl
			Comparator<Integer> com= new Comparator<Integer>()
			{
				@Override
				public int compare(Integer o1, Integer o2) 
				{
					 if(o1%100 > o2%100)
						 return 1;
					return -1;
				
				}
			};
			
			Collections.sort(value,com);
			
			
			
			
			//Collections.reverse(value); to reverse the sorting
			// traversing Genrics using enhance forloop
			for(Integer i1 : value)
			{
				System.out.println(i1);
			}
		}

	}
