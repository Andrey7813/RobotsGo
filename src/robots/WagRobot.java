package robots;

public class WagRobot {
	
    final private String WAG_ROBOT_PORT = "/dev/tty.usbserial-AI04O4S9";
	
	private ComPort port;
	private boolean isRobotIdle = true;
	
	public WagRobot()
	{
		this.port = new ComPort(WAG_ROBOT_PORT);
		wait(2000);
	}
	
	public void wagTheCard()
	{
		isRobotIdle = false; 
		port.sendMessage("6");
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
