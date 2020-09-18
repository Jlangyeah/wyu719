package day2;

public class Vehicle {
	private int speed;//速度
	private int size;//体积
	public Vehicle(int speed,int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.speed = speed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("速度:"+speed+"km/h"+"\n体积:"+size+"立方");
		return super.toString();
	}
	public void speedUp()
	{
		System.out.println("加速");
	}
	public void speedDown()
	{
		System.out.println("减速");
	}
//	public static void main(String[] args) {
//		Vehicle vehicle = new Vehicle();
//		vehicle.Main(100, 20);
//		System.out.println(vehicle.size);
//		System.out.println(vehicle.speed);
//	}
}
