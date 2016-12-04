import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
class ArpServer
{
public static void main(String args[]) throws Exception
{
System.out.println(": : : : :Server Ready: : :");
{
ServerSocket  serverSocket=new ServerSocket(8000);
Socket socket=serverSocket.accept();
while(true)
{
DataInputStream din=new DataInputStream(socket.getInputStream());
DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
String str=din.readLine();
String ipAdress[]={"192.168.1.1","192.168.1.2","192.168.1.3","192.168.1.4","192.168.1.5"};
String macAdress[]={"2A:07:AC:C2","CC:DD:E3:FA","9A:07:BB:CC","AA:BB:E3:FA","BB:CC:8E:EA"};
for(int i=0;i<ipAdress.length;i++)
{
if(str.equals(ipAdress[i]))
{
dout.writeBytes(macAdress[i]+'\n');
break;
}
}
}
}
}
}
