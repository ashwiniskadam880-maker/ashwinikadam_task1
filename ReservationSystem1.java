import java.util.Scanner;

public class ReservationSystem1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("___LOGIN FORM___");
System.out.println("Enter Username:");
String user=sc.next();
System.out.println("Enter password:");
String pass=sc.next();

if(user.equals("admin")&&pass.equals("1234")){
System.out.println("\n Login Successful!");

String pnr="PNR101";
String passengerName="";
String trainName="";

while(true){
System.out.println("\n___MENU__");
System.out.println("1.Reservation Form");
System.out.println("2.cancellation form");
System.out.println("3.exit");
System.out.println("(1/2/3):");
int choice =sc.nextInt();

if(choice==1){
System.out.println("\n___RESERVATION FORM___");
System.out.println("enter passenger Name");
passengerName=sc.next();

System.out.print("enter train number:");
int trainNum=sc.nextInt();

if(trainNum ==12345){
trainName="Mumbai express";
}
else{
trainName="Local Train";
}
System.out.println("Train Name:"+trainName);

System.out.println("Enter class(AC/Sleeper):");
String classType=sc.next();

System.out.println("Press 1 to save (Insert):");
int insert=sc.nextInt();

if(insert ==1){
System.out.println("Ticket saved!Your PNR is:"+pnr);
}
}else if(choice==2){
System.out.println("\n___cancellation form___");
System.out.println("Enter PNR Number");
String inputPnr=sc.next();

if(inputPnr.equals(pnr)&&!passengerName.equals("")){
System.out.println("Passenger:"+passengerName);
System.out.println("train:"+trainName);

System.out.println("press 1 to confirm cancel(ok):");
int ok=sc.nextInt();
if(ok==1){
System.out.println("ticket cancelled successfully!");
passengerName="";
}
}else{
System.out.println("No ticket found or already cancelled!");
}
}else if(choice ==3){
System.out.println("Thank you!");
break;
}else{
System.out.println("Invalid Choice!");
}
}
}
}
}












