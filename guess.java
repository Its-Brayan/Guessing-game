import java.util.Scanner;


public class guess{
	
	int number = (int)Math.ceil(Math.random()*100);
Scanner scan = new Scanner(System.in);
public void guess1(){
	int count = 0;
	System.out.println("please enter a number");
do{
	int a = scan.nextInt();
if(a >number){
	System.out.println("Too high");
	count++;
	
}
else if(a < number){
	System.out.println("Too low");
	count++;
	
}
else if(a == number){
	System.out.println("Correct");
	count++;
	break;

}
else{
	System.out.println("please be serious");
	count++;
	
}

}while(count > 0);

System.out.println("Number of guesses = "+count);
}
	public static void main(String [] args){
guess any = new guess();
any.guess1();

	}
}
