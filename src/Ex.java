abstract class Welcome
{
	abstract void a();
	void welcome()
	{
		System.out.println("welcome");
	}
}
class New extends Welcome
{
	void a()
	{
		System.out.println("abstract method");
	}
}
class Old extends Welcome
{
	void a()
	{
		System.out.println("abstract method 2");
	}
}
public class Ex {

	public static void main(String[] args) {
		
		Welcome w=new New();
		Welcome e=new Old();
		w.welcome();
		w.a();
		e.a();

	}

}
