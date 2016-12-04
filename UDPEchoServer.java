import java.io.*;
import java.net.*;
public class UDPEchoServer
{
public static void main(String args[])throws Exception
{
byte[]recvBuf=new byte[256];
byte[]sendBuf=new byte[256];
DatagramSocket socket= new DatagramSocket(7);
for(;;)
{
DatagramPacket receivePacket= new Datagrampacket(recvBuf,recvBuf.length);
socket.receive(receivePacket);
DatagramPacket sendPacket=newDatagramPacket(sendBuf,sendBuf.length,receivepacket.getAddress(),receivePacket.getPort());
socket.(sendPacket);
}
}
}