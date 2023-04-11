package inheritanceSample;

public class SingleInheritanceChild extends SingleInheritanceSample {
	public void print() {
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		SingleInheritanceChild ob= new SingleInheritanceChild();
		ob.display();
		ob.print();

	}

}
