import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class DataClient7  {
      public static void main(String args[]) throws IOException  {

 String host="localhost";
byte data[]=new byte[1024];
InetAddress address=InetAddress.getByName(host);
System.out.println("checking at:  " + address);
DatagramPacket dataPacket=new DatagramPacket (data,data.length,address,13);
DatagramSocket socket=new DatagramSocket();
socket.send(dataPacket);
dataPacket= new DatagramPacket (data,data.length);
socket.receive(dataPacket);
String time=new String(dataPacket.getData());
System.out.println("Time on the"+ host+"is:" + time);
   }
}