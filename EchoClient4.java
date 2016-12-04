import java.net.*;
import java.io.*;
public class EchoClient4
{
public static void main(String[]args)throws IOException
{
String serHostname=new String("localhost");
if(args.length>0)
{
serHostname=args[0];
}
System.out.println("connection to host"+serHostname+"on port 8000.");
Socket socket=null;
PrintWriter out=null;
BufferedReader in= null;
try
{
socket=new Socket(serHostname,8000);
out=new PrintWriter(socket.getOutputStream(),true);
in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
}
catch(UnknownHostException e)
{
System.err.println("Unknown Host:"+serHostname);
System.exit(1);
}
catch(IOException e)
{
System.err.println("couldnt get IO for"+"the connection to:"+serHostname+"please open the server connection first");
System.exit(1);
}
BufferedReader bin =new BufferedReader(new InputStreamReader(System.in));
String userInput;
System.out.println("input:");
while((userInput=bin.readLine())!=null)
{
out.println(userInput);
System.out.println("echo:" + in.readLine());
System.out.println("input:");
}
out.close();
in.close();
bin.close();
socket.close();
}
}