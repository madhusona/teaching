import java.io.*;
import java.util.*;
import java.lang.*;
class snail
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int t=ob.nextInt();
while(t-->0)
{
	double h=ob.nextDouble(),u=ob.nextDouble(),d=ob.nextDouble(),f=ob.nextDouble();
	if(h==0)
        System.out.println("0");
        double fall=u*f/100,now=0;
        int u1=0,day=0;
        while(now>=0&&now<=h)
        {
            day++;
            if(u1==1&&u-fall>=0)
            {
                u-=fall;
            }
            if(u1==1&&u-fall<0)
            {
                u=0;
            }
            if(u1==0)
            {
                u1=1;
            }
            now+=u;
            if(now>h)
            {
                System.out.println("success on day "+day);
                break;
            }
            now-=d;
            if(now<0)
            {
                System.out.println("failure on day "+day);
                break;
            }}}}
}

