package com.epam1.LoggersTask;

	import java.util.Scanner;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;

	public class Testing {
		private static Logger LOGGER = LogManager.getLogger(App.class);
		static Scanner sc = new Scanner(System.in);
		public void takeInput() {
			// TODO Auto-generated method stub
			boolean flag = true;
			Testing test = new Testing();
			while(flag) {
				LOGGER.info("Enter an option 1.Calculate Simple Interest 2.Calculate Compound Interest 3.exit");
				int val = sc.nextInt();
				switch(val) {
				case 1:
					test.takeInputForSimpleInterest();
					break;
				case 2:
					test.takeInputForCompoundInterest();
					break;
				case 3:
					flag = false;
					break;
				default:
					LOGGER.info("Enter valid input");	
					break;
				}
			}
		}
		private void takeInputForCompoundInterest() {
			LOGGER.info("Enter the principle");
			double principle = sc.nextDouble();
			LOGGER.info("Enter interest");
			double interest = sc.nextDouble();
			LOGGER.info("Enter the time period");
			double numberOfYears = sc.nextDouble();
			LOGGER.info("Enter the value of number of interest compounded per unit time period");
			double interestIsCompounded = sc.nextDouble();
			Compound_Interest ci = new Compound_Interest();
			LOGGER.info("Compound Interest = " + ci.compoundInterest(principle, interest, numberOfYears, interestIsCompounded)); 
		}
		private void takeInputForSimpleInterest() {
			LOGGER.info("Enter the value of money borrowed");
			double money = sc.nextDouble();
			LOGGER.info("Enter the value of rate of interest");
			double interest = sc.nextDouble();
			LOGGER.info("Enter the time period");
			double timePeriod = sc.nextDouble();
			Simple_Interest simpleInterest = new Simple_Interest();
			LOGGER.info("Simple Interest = " + simpleInterest.simpleIntrest(money, interest, timePeriod));
		}	
	}

