package com.epam1.LoggersTask;

public class Simple_Interest {
		public double moneyBorrowed;
		public double interest;
		public double timePeriod;
		
		public Simple_Interest() {
			super();
		}

		public static double simpleIntrest(double moneyBorrowed, double interest, double timePeriod) {
			double simpleIntrest;
			simpleIntrest = (moneyBorrowed * interest * timePeriod) / 100;
			return simpleIntrest;
		}
}
