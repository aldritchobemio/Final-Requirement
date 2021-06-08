import java.io.*;
import java.net.*;
public class client {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("\n....[Client trying to Connect to Server]....");
			Socket s = new Socket("localhost",5575); 
			System.out.println("......[Client Successfully Connected]......\n");
			
			
			DataInputStream din = new DataInputStream(s.getInputStream()); 
			DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
			
			String msgin = "";
				
			msgin = din.readUTF(); 
			System.out.println(msgin); 
			
			s.close(); 
				
			
		} catch (Exception exc) {
			System.out.println("Exception: "+exc);
		}
		

	}

}
