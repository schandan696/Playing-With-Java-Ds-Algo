import java.util.Vector;

public class vector1 
{

	public static void main(String[] args) 
	
	{
		// Implementation of vector
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(8);
		v.add(4);
		v.add(3);
		v.add(7);
		v.add(9);
		v.add(0);
		v.remove(2); //remove second index value
		//Traversing all vector using enhance forEach loop
		
		for(int i : v)
		{
			System.out.println(i);
		}
		
	}

}
