package Assigement;

public class Test {

	public static void main(String[] args) {

		Encapulation e = new Encapulation("Tom", 25, 345678, true, 'M');
		System.out.println(e.getName());
		System.out.println(e.isActive());
		
		e.setActive(false);
		e.setAge(30);
		e.setName("hey");
		
		System.out.println(e.getAge()+""+e.getName()+""+e.isActive());
		
		
		
	}

}
