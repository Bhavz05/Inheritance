package superkeyword;

public class SuperVariableChild extends SuperVariablePare {
String color="green";
public  void set()
{
	System.out.println(super.color);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj=new SuperVariableChild();
		System.out.println(obj.color);
		obj.set();
		

	}

}
