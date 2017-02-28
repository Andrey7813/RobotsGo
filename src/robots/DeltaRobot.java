package robots;

public class DeltaRobot {
	
	final private String DELTA_ROBOT_PORT = "/dev/tty.usbmodem14121";
	
	private ComPort port;
	private boolean isRobotIdle = true;
	
	public DeltaRobot()
	{
		this.port = new ComPort(DELTA_ROBOT_PORT);
		wait(5000);
	}
	
	public void push_1(){doMovement(1);}
	public void push_2(){doMovement(2);}
	public void push_3(){doMovement(3);}
	public void push_4(){doMovement(4);}
	public void push_5(){doMovement(5);}
	public void push_6(){doMovement(6);}
	public void push_7(){doMovement(7);}
	public void push_8(){doMovement(8);}
	public void push_9(){doMovement(9);}
	public void push_0(){doMovement(0);}
	
	public void push_CANCEL(){doMovement(10);}
	public void push_ENTER(){doMovement(11);}
	
	public void moveToSavePosition1(){doMovement(12);}
	public void moveToSavePosition2(){doMovement(13);}
	
	public void moveToCenter(){doMovement(14);}
	
	public void closePort(){port.closePort();}

	
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
		case 9: port.sendMessage("9"); break;
		case 0: port.sendMessage("0"); break;
		case 10: port.sendMessage("a"); break;
		case 11: port.sendMessage("b"); break;
		case 12: port.sendMessage("c"); break;
		case 13: port.sendMessage("d"); break;
		case 14: port.sendMessage("e"); break;
		} 
		port.waitForResponceFromRobot();
		isRobotIdle = true;
	}
	
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
