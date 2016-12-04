import java.io.*;
import java.net.*;
public class UDPEchoClient
{
public static void main(String args[])throws Exception
{
byte[]recvBuf=new byte[256];
byte[]sendBuf=new byte[256];
DatagramSocket socket=new DatagramSocket();
InetAddress serverAddr=InetAddress.getByName("server name");
BufferedReader In=new BufferedReader (new Input StreamReader(System.in));
String sendString=In.readLine();
sendBuf=sendString.getByte();
DatagramPacket sendPacket=new DatagramPacket(sendBuf,sendBuf.length,serverAddr,serverPort);
socket.send(sendPacket);
DatagramPacket recvString=new String(recvPacket.getData());
System.out.println("Received from server:"+recvString);
socket.close()
}
}
