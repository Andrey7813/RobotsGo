package robots;


public class TestRobot {

	
	
	public static void main(String[] args) {
		
		BigRobot bigRobot = new BigRobot();
		//DeltaRobot deltaRobot = new DeltaRobot();
		SweepRobot sweepRobot = new SweepRobot();
		
		//deltaRobot.moveToSavePosition1();
		bigRobot.exchangeStartFromSlot1();
		sweepRobot.getCardFromAnotherRobot();
		bigRobot.exchangeWait();
		sweepRobot.sweepAnotherRobotsCard();
		bigRobot.exchangePrepareToReturn();
		sweepRobot.releaseCard();
		bigRobot.exchangeReturnToSlot1();
		
		//deltaRobot.moveToCenter();
		
		//deltaRobot.closePort();
		bigRobot.closePort();
		sweepRobot.closePort();
		
		
		
		
		
		/*
		SweepRobot sweepRobot = new SweepRobot();
		DeltaRobot deltaRobot = new DeltaRobot();
		deltaRobot.moveToSavePosition1();
		sweepRobot.sweepCardFromSlot2();
		deltaRobot.moveToCenter();
		sweepRobot.closePort();
		deltaRobot.closePort();
		*/
		/*
		BigRobot bigRobot = new BigRobot();
		DeltaRobot deltaRobot = new DeltaRobot();
		deltaRobot.moveToSavePosition2();
		//bigRobot.initSlot1();
		bigRobot.insertCardFromSlot1();
		deltaRobot.moveToCenter();
		bigRobot.closePort();
		deltaRobot.closePort();
		*/
		
		/*
		BigRobot bigRobot = new BigRobot();
		DeltaRobot deltaRobot = new DeltaRobot();
		SweepRobot sweepRobot = new SweepRobot();
		
		deltaRobot.moveToSavePosition1();
		sweepRobot.sweepCardFromSlot1();
		
		deltaRobot.moveToSavePosition2();
		bigRobot.insertCardFromSlot1();
		
		
		deltaRobot.moveToCenter();
		deltaRobot.closePort();
		sweepRobot.closePort();
		bigRobot.closePort();
		*/
		
		/*BigRobot bigRobot = new BigRobot();
		DeltaRobot deltaRobot = new DeltaRobot();
		
		deltaRobot.moveToSavePosition2();
		//bigRobot.initSlot1();
		bigRobot.insertCardFromSlot1AndGoAway();
		deltaRobot.moveToCenter();
		deltaRobot.push_1();
		deltaRobot.push_2();
		deltaRobot.push_3();
		deltaRobot.push_4();
		deltaRobot.push_ENTER();
		deltaRobot.moveToSavePosition2();
		bigRobot.initSlot1();
		deltaRobot.moveToCenter();
		
		bigRobot.closePort();
		deltaRobot.closePort();*/
		
	/*
		BigRobot bigRobot = new BigRobot();
		DeltaRobot deltaRobot = new DeltaRobot();
		deltaRobot.moveToSavePosition2();
		bigRobot.initSlot1();
		bigRobot.closePort();
		deltaRobot.closePort();
		*/
		//WagRobot wagRobot = new WagRobot();
		//wagRobot.wagTheCard();
		//wagRobot.closePort();
		
		//BigRobot bigRobot = new BigRobot();
		//bigRobot.initSlot6();
		//bigRobot.insertCardFromSlot6();
		//bigRobot.closePort();
		


	}

}
