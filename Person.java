package assignment6;

public class Person {
	
     final int age;
     final String name;
     
     
     Person(){
    	 this.age=15;
    	 this.name="om";
     }
	





	public final int getAge() {
		return age;
	}





	public final String getName() {
		return name;
	}





	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.getAge();
		person.getName();
		System.out.println(person);

	}

}
