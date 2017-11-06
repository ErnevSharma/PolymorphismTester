public class InterfaceTester {
	public static void main(String[]args)
	{
		Human j;
		Worker ernev = new Worker("Ernev", 3, 16, "Software Engineer", 3);
		Student matt = new Student("Matt", 1, 16, 987687, 11);
		j = matt;
		ernev = (Worker)j;
		
		System.out.println(ernev.getAge());
		
		
		System.out.println(ernev.getName());
		System.out.println(ernev);
	}	
}