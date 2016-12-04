import java.io.*;
import java.util.*;
import java.net.*;
class ShortestPath {
	public static int a1, a2,b1,b2,n,m;
	public static int a[][]=new int[10][10],par[][]=new int[10][10],distance[][]=new int[10][10],i,j;
	public static void main(String s[]) throws IOException{
	int x,y,num;
	LinkedList list=new LinkedList();
	LinkedList path=new LinkedList();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the value for n & m 1st matrix");
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(bf.readLine());
	m=Integer.parseInt(bf.readLine());
	System.out.println("Enter the  element for 1st matrix(0 or 1)");
	for(i=0;i<n;i++) {
		for(j=0;j<m;j++) {
			a[i][j]=Integer.parseInt(bf.readLine());
			par[i][j]=-1;
			distance[i][j]=n*m;
	}
}
	System.out.println("Enter the position of source(x,y)");
	a1=Integer.parseInt(bf.readLine());
	b1=Integer.parseInt(bf.readLine());
	System.out.println("Enter the position of destination(x,y)");
	a2=Integer.parseInt(bf.readLine());
	b2=Integer.parseInt(bf.readLine());
	list.add(getnumber(a1,b1));
	distance[a1][b1]=0;
	while (list.size() !=0) {
		num=Integer.parseInt(list.removeLast().toString());
		x=num/m;
		y=num%m;		
		if(x>0 && a[x-1][y] !=1 &&(distance[x-1][y]>(distance[x][y] +1)) )
		{
			list.add(getnumber(x-1,y));
			distance[x-1][y]=distance[x][y]+1;
			par[x-1][y]=num;
		} 
		if(y>0 && a[x][y-1] !=1 && (distance[x][y-1]>(distance[x][y] +1)) )
		{
			list.add(getnumber(x,y-1));
			distance[x][y-1]=distance[x][y]+1;
			par[x][y-1]=num;
		}
		if(x<n-1 && a[x+1][y] !=1 && (distance[x+1][y]>(distance[x][y] +1)) )
		{
			list.add(getnumber(x+1,y));
			distance[x+1][y]=distance[x][y]+1;
			par[x+1][y]=num;
		}
		if(y<m-1 && a[x][y+1] !=1 && (distance[x][y+1]>(distance[x][y] +1)) )
		{
			list.add(getnumber(x,y+1));
			distance[x][y+1]=distance[x][y]+1;
			par[x][y+1]=num;
		}
	}
		path.add("("+ a2 +","+ b2 +")");
		x=a2;
		y=b2;
		do {
			num=par[x][y];
			x=num/m;
			y=num%m;
			path.add("("+ x +","+ y +")");
		}
		while(!(x==a1 && y==b1));
		while(path.size() !=0)  {
			System.out.println(path.removeLast());
		}
	}
		public static Integer getnumber(int x,int y)  {
			return new Integer(x *m+y);
		}
	}
			




		
	

	
