package brd1final;

public class EmiCalculation {
	double installment(double p, double r, int m, int t) {
		double x;
		int n;
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
		System.out.println("Equated monthly installment is:"+x);
		return x;

	}


}
