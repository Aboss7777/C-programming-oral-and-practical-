public class Exp2 {
	public static void main(String[] args){
		System.out.println("The Prime Numbers between 1 to 1000 are: ");
		int i=0,j=0;
		for(i=1;i<=1000;i++)
		{
			int c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					++c;
			}
			if(c==2)
				System.out.println(i);
		}
	}
}
