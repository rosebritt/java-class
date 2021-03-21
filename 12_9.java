import java.util.*;
//defining BinaryFormatException which extends Exception class
class BinaryFormatException extends Exception{
//default constructor which prints out the error message
BinaryFormatException(){
System.out.println("Exception: Given string is not in binary format");
}
}
public class BinaryNumber {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
//asks the user to input a binary string
System.out.println("Enter a binary number");
String binary=scan.nextLine();
//calls method which return decimal value
int decimal = bin2Dec(binary);
//if returned value is greater than 0
if(decimal>0)
System.out.println(decimal);
}
static int bin2Dec(String binary){
//converting the string to integer
int binaryNumber=Integer.parseInt(binary);
//try block opens
try{
int b=binaryNumber;
boolean status = true;
//loops until a number other than 1 or 0 is found or to till the number ends
while(true){
if(b == 0){
break;
}
else
{
int tmp = b%10;
//if a number other than 1 or 0 is found status turns false and breaks the loop
if(tmp > 1){
status = false;
break;
}
b = b/10;
}
}
//if status is false it throws a exception
if (status==false)
throw new BinaryFormatException();
}
catch(BinaryFormatException ex){
//if exception is thrown -1 is returned such that decimal value becomes -1 which doesnt print out
return -1;
}
//if an exception is not thrown the method continues and returns the decimal value
int decimal = 0;
int p = 0;
while(true){
if(binaryNumber == 0){
break;
}
else
{
int temp = binaryNumber%10;
decimal += temp*Math.pow(2, p);
binaryNumber = binaryNumber/10;
p++;
}
}
return decimal;
}
}
