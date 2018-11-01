package brd1final;
import java.util.Scanner;
public class EmiIPComponentBreak {
	void IPComponentBreak(double p, double r, int m, int t)
	{
		double x;
		int ni,n;
		r=r/100;
		n = (m * t) / 12;
		if(n<0)
		{
			System.out.println("Tenure can not be negative");
			System.exit(0);
		}
		if(n<(12/t))
		{
			System.out.println("Tenure is less than the period of first intallment");
			System.exit(0);
		}
		x = (p * (r / t)) / (1 - 1 / Math.pow((1 + r / t), n));
		ni=(t*m)/12;
		float[] in = new float[ni + 1];
		float[] pn = new float[ni + 1];
	    float[] op = new float[ni + 1];
	    op[0] = (float) p;
	    System.out.println("Please enter the installment number for which break up is required");
	    Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		if(k>ni)
		{
			System.out.printf("Total number of installments are only:%d.\nBreak up is asked for:%d",ni,k);
		}
		System.out.println("s.no          O/s   \t       I              P        Installment");
		for (int l = 0; l < ni; l++) {
			in[l] = (op[l]) * ((float) r) /12.0f;                      
			pn[l] = ((float) x - in[l]);
			if (l < ni) 
			{
				op[l + 1] = op[l] - pn[l];
				if((l+1)==k)
				{
				System.out.printf("%d\t%10.2f\t%10.2f\t%10.2f\t%10.2f\n", (l + 1), op[l], in[l], pn[l], x);
				System.exit(0);
			}
	   	 }
      }
   }
}
