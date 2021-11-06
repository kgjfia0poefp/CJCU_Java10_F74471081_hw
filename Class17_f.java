package Java10;
class Car
{
	protected String owner;
	protected String id;

	public Car(String own,String s)
	{
		owner=own;
		id=s;
	}
	final void show()
	{
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌號碼:"+id);
	}
}

class CColor extends Car
{
	public String color;

	public CColor(String own,String s,String c)
	{
		super(own,s);
		color=c;
	}
	public void show_data()
	{
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌號碼:"+id);
		System.out.println("車身顏色:"+color);
	}
}
public class Class17_f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CColor mycar=new CColor("Riaan","A1-2345","Black");
		mycar.show_data();
	}

}
