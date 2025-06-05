package inheritance1;

public class HierarchyChild2 extends HierarchiParent {
	public void method3() {
		System.out.println("how are you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchyChild2  obj2= new HierarchyChild2 ();
		obj2.method1();
		obj2.method3();

	}

}
