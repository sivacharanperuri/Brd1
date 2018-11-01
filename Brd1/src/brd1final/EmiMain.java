package brd1final;
import java.util.Scanner;
public class EmiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p;
		double r;// rate of interest
		int n;// no of installments for the tenure
		int t;// no of installments per year
		int m;// no of years|period
		double x ;// installment amount
		EmiCalculation em =new EmiCalculation();
		EmiIPComponent ip=new EmiIPComponent();
		EmiIPComponentBreak ipb=new EmiIPComponentBreak();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the following details:\nLoan amount:");
		p = sc.nextDouble();
		System.out.println("Rate of interest in percent:");
		r = sc.nextDouble();
		System.out.println("Period or tenure of loan in months:");
		m = sc.nextInt();
		System.out.println("Enter the number of installments for year:");
		t = sc.nextInt();
		x = em.installment(p, r, m, t); 
		ip.IPComponent(p,r,m,t);
		ipb.IPComponentBreak(p, r, m, t);

	}

}
