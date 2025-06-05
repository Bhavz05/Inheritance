package inheritance1;

public class HierarchyChild1 extends HierarchiParent {
public void get()
{
	System.out.println("hii parent class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HierarchyChild1 obj1=new HierarchyChild1();
        obj1.get();
        obj1.method1();
	}

}
