import java.io.*;
import java.net.*;
import java.util.*;
class TimeServer
{
public static void main(String[]args)throws Exception
{

{
ServerSocket s=new ServerSocket(1234);
Socket c=s.accept();
Calendar cal=new GregorianCalendar();
PrintWriter out=new PrintWriter(c.getOutputStream());
out.println(new Date());
out.println("TIme: ");
out.println(cal.get(Calendar.HOUR)+"Hrs:"+cal.get(Calendar.MINUTE)+"Minu"+cal.get(Calendar.SECOND)+"Sec");
out.flush();
s.close();
c.close();

}

}
}