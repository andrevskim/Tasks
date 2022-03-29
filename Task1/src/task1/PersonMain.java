package task1;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		p1.setName("Mihail");
		p2.setName("Mihail's Mother");
		p3.setName("Mihail's Father");
		p1.setFather(p3);
		p1.setMother(p2);
		
		p1.printFamilyNames();

	}

}
