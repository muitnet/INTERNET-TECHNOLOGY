import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;
public class DataServer7 {
     public static void main(String args[]) throws IOException{
    DatagramSocket socket=new DatagramSocket(13);
    while(true){
    byte buffer[]=new byte[256];
DatagramPacket packet=new DatagramPacket(buffer,buffer.length);
socket.receive(packet);
String date=new Date().toString();
buffer=date.getBytes();
InetAddress address=packet.getAddress();
int port=packet.getPort();
packet=new DatagramPacket(buffer,buffer.length,address ,port);
socket.send(packet);
            }
      }
}