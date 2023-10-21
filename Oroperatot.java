package logicaloperators;

public class Oroperatot {

	public static void main(String[] args) {
		int a=1000;
		int b=2000;
		if(a>500||b>500)
		{
			System.out.println("hi i am true in both condition");
		}
if(a>500 ||b>5000)
{
	System.out.println("hi i am true in either condition");
	}
if(a>5000 ||b>5000)
{
	System.out.println("hi am false in both condition");
	
}
	}

}
