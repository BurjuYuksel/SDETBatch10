package class11;

public class Cat {

	String name;
	String color;
	int age;
	void eat () {
		
	
	System.out.println(name + "is eating");	
	}
	void sleep() {
		System.out.println(name +" is slepping" );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Cat cat1=new Cat();
	
	cat1.name="Hobby";
	
	cat1.color="Gray";
	
	cat1.age=5;
	
	cat1.eat();
	cat1.sleep();
	
	Cat cat2=new Cat();
	
	cat2.name=" Pamuk ";
	cat2.color=" White";
	cat2.age=3;
	
	
	cat2.sleep();
	
	
	
	}

}
