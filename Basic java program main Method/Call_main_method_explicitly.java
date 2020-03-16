class Call_main_method_explicitly{
	public static void main(String argv[]){
		System.out.println("Hello java");
		Demo1.main("hi");
	}
};
class Demo1{
	public static void main(String... s){
		System.out.println("from demo1");
	}
};