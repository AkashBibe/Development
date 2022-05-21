import java.lang.*;
import java.io.*;

class Stringx
{
	public static void main(String args[])
	{
		//string literals
		String str1="Jay";
		String str2="Ganesh";
		
		System.out.println(str1);
		System.out.println(str1.length());
		
		String str3=str1+str2;//+ is used to concatenate and in arithemetic is used to add two operands
		System.out.println(str3);
		
		//string objects
		String str4=new String("Hello");
		String str5=new String("World");
		String str6=new String("Hello");
		
	}
}