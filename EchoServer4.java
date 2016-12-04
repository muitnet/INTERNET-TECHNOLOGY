import java.net.*;
import java.io.*;
public class EchoServer4
{
public static void main(String[]args)throws IOException
{
ServerSocket serverSocket=null;
Socket clientSocket=null;
try
{
serverSocket=new ServerSocket(8000);
}
catch (IOException e)
{
System.err.println("someting went wrong on port:8000");
System.exit(1);
}
System.out.println("waitin for connection...");
try
{
clientSocket =serverSocket.accept();
}
catch(IOException e)
{
System.err.println("sorry failed...");
System.exit(1);
}
System.out.println("connection succesfull");
System.out.println("plz input value");
PrintWriter out=new PrintWriter(clientSocket.getOutputStream(),true);
BufferedReader in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
String inputLine;
while((inputLine=in.readLine())!=null)
{
System.out.println("server:"+inputLine);
out.println(inputLine);
if (inputLine.equals("bye"))
{
break;
}
}
out.close();
in.close();
clientSocket.close();
serverSocket.close();
}
}