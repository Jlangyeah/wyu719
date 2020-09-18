package day3;

public class Emp {
	String name ;
	int age;
	String gender;
	int salary;
	String  hiredate;
	public Emp(String name,int age,String gender,int salary,String hiredate) {
		// TODO Auto-generated constructor stub
		this.age= age;
		this.gender=gender;
		this.hiredate=hiredate;
		this.salary=salary;
		this.name= name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public String getname()
	{
		return name;
	}
	public void setage(int age)
	{
		this.age= age;
	}
	public int getage()
	{
		return age;
	}
	public void setgender(String gender)
	{
		this.gender=gender;
	}
	public String getgender()
	{
		return gender;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+gender+",н��:"+salary+",��ְʱ��:"+hiredate);
		return super.toString();
	}
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if(obj instanceof Emp){
            Emp emp=(Emp)obj;
            if(emp.age==this.age&&emp.name==this.name&&emp.gender==this.gender&&emp.salary==this.salary){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
		Emp emp1 = new Emp("����",18,"��",7000,"2020-7-20");
		Emp emp2 = new Emp("����",18,"��",7000,"2020-8-20");
		emp1.toString();
		if(emp1.equals(emp2))
		{
			System.out.println("����һ��");
		}
		else
		{
			System.out.println("���ݲ�һ��");
		}
	}
}
