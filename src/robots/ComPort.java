package robots;
import jssc.*;

/**
 * 
 * @author Andrey Teplyakov (teplyakov_a@subway.com)
 * 
 * Command to obtain available COM ports (MAC OS): ls /dev/{tty,cu}.*
 * Try to use tty alias first
 * For example:
 *     /dev/tty.usbserial-AI04O4S9
 *
 */


public class ComPort {
	
	private SerialPort port;

	public ComPort(String port)
	{
	this.port = new SerialPort(port);
	
	/*System.out.println("Available ports:");
	String[] portNames = SerialPortList.getPortNames();
    for(int i = 0; i < portNames.length; i++){
        System.out.println(portNames[i]);
    }*/
	try {
		
		this.port.openPort();
		
		
		this.port.setParams(SerialPort.BAUDRATE_9600, 
                SerialPort.DATABITS_8,
                SerialPort.STOPBITS_1,
                SerialPort.PARITY_NONE);
		//this.port.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN | 
                //SerialPort.FLOWCONTROL_RTSCTS_OUT);
                this.port.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
	} catch (SerialPortException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public boolean sendMessage(String message) 
	{
		try {
			return this.port.writeString(message);
		} catch (SerialPortException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public void closePort()
	{
		try {
			this.port.closePort();
		} catch (SerialPortException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public void waitForResponceFromRobot() {
		 
		 int waitingTime = 0;
		 
		 while(waitingTime < 70000)
		 {
			 System.out.println("Waiting for answer... " + waitingTime + " msec" );
	        
	            try {
	                String receivedData = this.port.readString();
	                if(receivedData != null && receivedData.contains("DONE"))
	                {
	                System.out.println("Received response: " + receivedData);
	                
	                    break;
	                }
	            }
	            catch (SerialPortException ex) {
	                System.out.println("Error in receiving string from COM-port: " + ex);
	            }
	        
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        waitingTime += 1000;
		 }
	 }
	 
     public boolean waitForResponceFromRobot(String response) {
		 
		 int waitingTime = 0;
		 
		 while(true||waitingTime < 45000)
		 {
			 System.out.println("Waiting for answer...");
	        
	            try {
	                String receivedData = this.port.readString();
	                if(receivedData != null && receivedData.equals(response) )
	                {
	                System.out.println("Received response: " + receivedData);
	                return true;
	                }
	            }
	            catch (SerialPortException ex) {
	                System.out.println("Error in receiving string from COM-port: " + ex);
	                return false;
	            }
	        
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        waitingTime += 1000;
		 }
		 return false;
	 }
}

