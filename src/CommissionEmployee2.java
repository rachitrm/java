//CommissionEmployee2.java
//CommissionEmployee2 concrete class extends abstract class Employee which implements Payable interface.

public class CommissionEmployee2 extends Employee2 {
	 
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee2 ( String first, String last, String ssn, double sales, double rate ) {
		super ( first, last, ssn );
		setGrossSales ( sales );
		setCommissionRate( rate );
	}

	public void setGrossSales( double sales ) {
		if ( sales >= 0.0 )
			grossSales = sales;
		else
			throw new IllegalArgumentException(" Gross sales must be >=0.0 ");
	}

	public double getGrossSales( ) {
		return grossSales;
	}

	public void setCommissionRate( double rate ) {
		if ( rate > 0.0 && rate < 1.0 )
			commissionRate = rate;
		else 
			throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0 ");
	}

	public double getCommissionRate( ) {
		return commissionRate;
	}

	@Override
	public double getPaymentAmount( ) {
		return getCommissionRate( ) * getGrossSales( );
	}
	@Override
	public String toString ( ) {
		return String.format( "salaried employee : %s\n%s :  $%,.2f; %s : $%,.2f",super.toString( ),
			"gross sales ", getGrossSales( ),
			"commission rate ", getCommissionRate( ) );
	}


}