

public class ConstructorExample {
	String name;
	ConstructorExample(String name){
		this.name="my name is Upasana";
	}
	public static void main(String[] args) {
		ConstructorExample CE= new ConstructorExample("Kiara");
		System.out.println(CE.name);
	}
}
