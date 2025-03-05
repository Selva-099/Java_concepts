package accessmodifiers;

class ParentAbstractModifiers{
	
	ParentAbstractModifiers(){
		System.out.println("ParentAbstractModifiers class");
	}
	
	ParentAbstractModifiers( int a){
		System.out.println("ParentAbstractModifiers class with value "+a);
	}
	
	public void m1() {
		System.out.println("Parent class method");
	}
}

public class AbstractModifiers extends ParentAbstractModifiers {
	
	AbstractModifiers(){
		super(10);
		System.out.println("AbstractModifiers class");
		
	}

	public static void main(String[] args) {
		
		AbstractModifiers ams = new AbstractModifiers();
		ams.m1();

	}

}
