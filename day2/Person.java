package day2;

public class Person {
	private String name;
	private int age;
	private String gender;
	public Person(String name,int age,String gender) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.println("姓名:"+name+" 年龄:"+age+" 性别:"+gender);
	}
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
		System.out.println("姓名:"+name+" 年龄:"+age);
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		System.out.println("姓名:"+name+"年龄:"+age+"性别:"+gender);
//		return super.toString();
//	}
}
