import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
class ArpClient
{
public static void main(String args[]) throws Exception
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
Socket clientSocket=new Socket("localhost",8000);
DataInputStream dataIn=new DataInputStream(clientSocket.getInputStream());
DataOutputStream dataOut=new DataOutputStream(clientSocket.getOutputStream());
System.out.println("Enter the Logical address(IP from 192.168.1.1 to192.168.1.5) ");
String str1=in.readLine();
dataOut.writeBytes(str1+'\n');
String str=dataIn.readLine();
System.out.println("The Physical Address is: "+str);
clientSocket.close();
}
}
