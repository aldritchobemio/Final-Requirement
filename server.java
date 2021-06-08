import java.io.*;
import java.net.*;
public class server {

	public static void main(String[] args) {
		
		String haiku = "\nRainbow after rain"
				+ "\nLife's not always blue and pain"
				+ "\nCan you tell me when?";
		
		try {
			
			ServerSocket ss = new ServerSocket(5575); 
			
			System.out.println("\n....[Waiting for Client to Connect]....");
			Socket s = ss.accept();
			System.out.println("....[Client Successfully Connected]....\n");
			
			DataInputStream din = new DataInputStream(s.getInputStream()); 
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			
			System.out.println(haiku);	
			dout.writeUTF(haiku);	
			dout.flush();
				
			
			s.close();
			
			
			
		} catch (Exception exc) {
			System.out.println("Exception: "+exc);
		}
		

	}

}
