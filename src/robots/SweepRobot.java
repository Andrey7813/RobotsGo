package robots;

public class SweepRobot {
	
	//Milford robot
    //final private String SWEEP_ROBOT_PORT = "/dev/tty.usbserial-AI04O4S9";
    //Canada Robot
    final private String SWEEP_ROBOT_PORT = "/dev/tty.usbmodem1421";
	
	private ComPort port;
	private boolean isRobotIdle = true;
	
	public SweepRobot()
	{
		this.port = new ComPort(SWEEP_ROBOT_PORT);
		wait(2000);
	}
	
	public void sweepCardFromSlot1(){doMovement(1);}
	public void sweepCardFromSlot2(){doMovement(2);}
	public void sweepCardFromSlot3(){doMovement(3);}
	public void sweepCardFromSlot4(){doMovement(4);}
	public void sweepCardFromSlot5(){doMovement(5);}
	public void getCardFromAnotherRobot(){doMovement(6);}
	public void sweepAnotherRobotsCard(){doMovement(7);}
	public void releaseCard(){doMovement(8);}
	
	private void doMovement(int movement)
	{
		isRobotIdle = false; 
		switch(movement)
		{
		case 1: port.sendMessage("1"); break;
		case 2: port.sendMessage("2"); break;
		case 3: port.sendMessage("3"); break;
		case 4: port.sendMessage("4"); break;
		case 5: port.sendMessage("5"); break;
		case 6: port.sendMessage("6"); break;
		case 7: port.sendMessage("7"); break;
		case 8: port.sendMessage("8"); break;
		} 
		port.waitForResponceFromRobot();
		isRobotIdle = true;
	}
	
	public void closePort(){port.closePort();}
	
	private void wait(int msec)
	{
		try {
			Thread.sleep(msec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
