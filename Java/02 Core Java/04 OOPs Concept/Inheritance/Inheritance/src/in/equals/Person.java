package in.equals;

import java.util.Objects;

public class Person {
	private String name;
	private String id;
	private int age;
	
	public Person(String name, String id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(!(obj instanceof Person)) {
//			return false;
//		}		
//		// Type Casting of Object (obj into person object.)
//		Person per = (Person) obj;
//		return per.name.equals(name) && 
//				per.age == age &&
//				per.id.equals(id);
//	}
	

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
}
