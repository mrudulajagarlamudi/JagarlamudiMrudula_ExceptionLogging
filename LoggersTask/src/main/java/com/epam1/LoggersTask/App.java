package com.epam1.LoggersTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Testing test = new Testing();
    	test.takeInput();
    	HouseConstruction cost = new HouseConstruction();
    	cost.estimation();
    }
}