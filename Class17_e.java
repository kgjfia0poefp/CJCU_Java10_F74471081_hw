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
		System.out.println("���D�m�W:"+owner);
		System.out.println("���P���X:"+id);
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
}
public class Class17_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CColor mycar=new CColor("Riaan","A1-2345","Black");
		mycar.show();
		System.out.println("�����C��:"+mycar.color);
	}

}
