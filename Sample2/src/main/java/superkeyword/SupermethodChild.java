package superkeyword;

public class SupermethodChild extends SuperMethod {
public void display()
{
	super.set1(10);
	System.out.println("hello");
	super.display();
	this.set(5);
}
public void set(int a)
{
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SupermethodChild obj= new SupermethodChild();
obj.display();
//obj.set(5);
	}

}
