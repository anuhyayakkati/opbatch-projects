//write a java program which reads a 3digit number and check whether it is a palindrome or not?
class Palindrome
{
public static void main(String[]args)
int a=151;
String result;
result=(a%10==a/100)?"palindrome":"Not a palindrome";
System.out.println(result);
}
}