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
		System.out.println("����:"+name+" ����:"+age+" �Ա�:"+gender);
	}
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
		System.out.println("����:"+name+" ����:"+age);
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		System.out.println("����:"+name+"����:"+age+"�Ա�:"+gender);
//		return super.toString();
//	}
}
