package robots;

public class BigRobot {
	
	//Milford robot
	//final private String BIG_ROBOT_PORT = "/dev/tty.usbserial-A5059QDI";
	//Canada robot
	final private String BIG_ROBOT_PORT = "/dev/tty.usbserial-A505DTTK";
	
	private ComPort port;
	private boolean isRobotIdle = true;
	
	public BigRobot()
	{
		this.port = new ComPort(BIG_ROBOT_PORT);
		wait(8000);
	}
	
	public void initSlot1(){doMovement(1);}
	public void initSlot2(){doMovement(2);}
	public void initSlot3(){doMovement(3);}
	public void initSlot4(){doMovement(4);}
	public void initSlot5(){doMovement(5);}
	public void initSlot6(){doMovement(6);}
	
	public void insertCardFromSlot1(){doMovement(7);}
	public void insertCardFromSlot2(){doMovement(8);}
	public void insertCardFromSlot3(){doMovement(9);}
	public void insertCardFromSlot4(){doMovement(10);}
	public void insertCardFromSlot5(){doMovement(11);}
	public void insertCardFromSlot6(){doMovement(12);}
	
	public void insertCardFromSlot1AndGoAway(){doMovement(13);}
	public void insertCardFromSlot2AndGoAway(){doMovement(14);}
	public void insertCardFromSlot3AndGoAway(){doMovement(15);}
	public void insertCardFromSlot4AndGoAway(){doMovement(16);}
	public void insertCardFromSlot5AndGoAway(){doMovement(17);}
	public void insertCardFromSlot6AndGoAway(){doMovement(18);}
	
	public void exchangeStartFromSlot1(){doMovement(19);}
	public void exchangeReturnToSlot1(){doMovement(20);}
	public void exchangeStartFromSlot2(){doMovement(21);}
	public void exchangeReturnToSlot2(){doMovement(22);}
	public void exchangeStartFromSlot3(){doMovement(23);}
	public void exchangeReturnToSlot3(){doMovement(24);}
	public void exchangeStartFromSlot4(){doMovement(25);}
	public void exchangeReturnToSlot4(){doMovement(26);}
	public void exchangeStartFromSlot5(){doMovement(27);}
	public void exchangeReturnToSlot5(){doMovement(28);}
	public void exchangeStartFromSlot6(){doMovement(29);}
	public void exchangeReturnToSlot6(){doMovement(30);}
	
	public void exchangeWait(){doMovement(31);}
	public void exchangePrepareToReturn(){doMovement(32);}
	
	

	public void closePort(){port.closePort();}

	
	private void doMovement(int movement)
	{
		isRobotIdle = false; 
		switch(movement)
		{
		case 1: port.sendMessage("7"); break;
		case 2: port.sendMessage("8"); break;
		case 3: port.sendMessage("9"); break;
		case 4: port.sendMessage("a"); break;
		case 5: port.sendMessage("b"); break;
		case 6: port.sendMessage("c"); break;
		case 7: port.sendMessage("1"); break;
		case 8: port.sendMessage("2"); break;
		case 9: port.sendMessage("3"); break;
		case 10: port.sendMessage("4"); break;
		case 11: port.sendMessage("5"); break;
		case 12: port.sendMessage("6"); break;
		case 13: port.sendMessage("e"); break;
		case 14: port.sendMessage("f"); break;
		case 15: port.sendMessage("g"); break;
		case 16: port.sendMessage("h"); break;
		case 17: port.sendMessage("i"); break;
		case 18: port.sendMessage("j"); break;
		case 19: port.sendMessage("l"); break;
		case 20: port.sendMessage("m"); break;
		case 21: port.sendMessage("n"); break;
		case 22: port.sendMessage("o"); break;
		case 23: port.sendMessage("p"); break;
		case 24: port.sendMessage("q"); break;
		case 25: port.sendMessage("r"); break;
		case 26: port.sendMessage("s"); break;
		case 27: port.sendMessage("t"); break;
		case 28: port.sendMessage("u"); break;
		case 29: port.sendMessage("v"); break;
		case 30: port.sendMessage("w"); break;
		case 31: port.sendMessage("d"); break;
		case 32: port.sendMessage("k"); break;
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
