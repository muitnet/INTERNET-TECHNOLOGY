import java.io.*;
import java.net.*;
class TimeClient
{
public static void main(String[]args)throws Exception
{
Socket c=new Socket(InetAddress.getLocalHost(),1234);
BufferedReader br=new BufferedReader(new InputStreamReader(c.getInputStream()));
String userInput;
while((userInput=br.readLine())!=null)
{
	System.out.println(userInput);
}
c.close();

}
}