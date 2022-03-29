package task1;

public class Person {
	private String name;
	private Person mother;
	private Person father;

	public Person() {
		super();
	}

	public Person(String name, Person mother, Person father) {
		super();
		this.name = name;
		this.mother = mother;
		this.father = father;
	}

	public void printFamilyNames() {
		System.out.println(name + "\t" + mother.getName() + "\t" + father.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", mother=" + mother + ", father=" + father + "]";
	}

}
