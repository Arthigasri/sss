import java.io.*;
import java.util.*;
public class Delete
{
  public static void main(String args[]) throws IOException
  {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number");
    String a=br.readLine();
    int len=a.length();
    System.out.println("Enter how many digits to be deleted");
    Integer b=Integer.parseInt(br.readLine());
    String str=a.substring((len-b),len);
    String str1=a.substring(0,(len-b));
    Integer c=Integer.parseInt(str1);
    Integer r=c-1;
    System.out.println(r);
    }
    }
