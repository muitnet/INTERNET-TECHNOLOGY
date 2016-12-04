import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.ServerSocket;

class ChatServer
{
private static int port=1001;
	public static void main(String[] args) throws IOException
	{
		ServerSocket server=null;
		try
		{
			server=new ServerSocket(port);
		}
		catch(IOException e)
		{
			System.err.println("Could not listen on port:"+port);
			System.err.println(e);
			System.exit(1);
		}
Socket client=null;
try
{
client=server.accept();
}
catch(IOException e)
{
System.err.println("Accept failed ");
System.err.println(e);
System.exit(1);
}
BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
String msg;
while((msg=in.readLine())!=null)
		{
			System.out.println("Client says:"+msg);
		}
}
}