package day2;

public class Vehicle {
	private int speed;//�ٶ�
	private int size;//���
	public Vehicle(int speed,int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.speed = speed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("�ٶ�:"+speed+"km/h"+"\n���:"+size+"����");
		return super.toString();
	}
	public void speedUp()
	{
		System.out.println("����");
	}
	public void speedDown()
	{
		System.out.println("����");
	}
//	public static void main(String[] args) {
//		Vehicle vehicle = new Vehicle();
//		vehicle.Main(100, 20);
//		System.out.println(vehicle.size);
//		System.out.println(vehicle.speed);
//	}
}
