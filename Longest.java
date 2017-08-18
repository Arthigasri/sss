# sss
import java.io.*;
import java.util.*;
 public class Longest
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    int len=a.length();
    if(len>b.length())
    {
      len=b.length();
    }
    
    StringBuilder s = new StringBuilder();
    for(int i=0;i<len;i++)
    {
      if(a.charAt(i)==b.charAt(i))
      {
        s.append(a.charAt(i));
      }
      else
      {
        break;
      }
    }       
    System.out.println(s.toString());
  }
     }
