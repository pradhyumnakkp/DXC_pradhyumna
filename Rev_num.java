package dxc;

public class MyNum {

	public static void main(String[] args) {
		int x=1234;
		int l;
		while(x!=0)
		{
			l=x%10;
			System.out.print(l+",");
			x=x/10;
		}

	}

}
