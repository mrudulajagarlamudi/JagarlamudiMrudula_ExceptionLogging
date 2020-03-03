package com.epam1.LoggersTask;

public class Compound_Interest {
		public double principle;
		public double interest;
		public double numberOfYears;
		public double interestIsCompounded;
		
		public Compound_Interest() {
			super();
		}
		
		public static double compoundInterest(double principle, double interest, double numberOfYears, double interestIsCompounded) {
			double compoundInterest;
			compoundInterest = (1 + (interest/100));
			while(interestIsCompounded != 0) {
				compoundInterest = compoundInterest * (1 + (interest/100));
				interestIsCompounded--;
			} compoundInterest = compoundInterest * principle;
			return compoundInterest;
		}
}
