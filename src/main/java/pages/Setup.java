package pages;

import java.util.logging.Logger;

import cucumber.api.java.Before;



public class Setup {
	
	Logger logger = Logger.getLogger("setup");
	
	@Before
	public void beforeScenario(){
		logger.info("adfadsfadsf");
	}
	
	

}
