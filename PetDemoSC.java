import java.util.Scanner;
public class PetDemoSC{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		String animal;
		int age;
		boolean isAdopted;
		System.out.println("Enter the animal's name ===> ");
		name = keyboard.nextLine();
		System.out.println("Enter the animal's type ===> ");
		animal = keyboard.nextLine();
		System.out.println("Enter the animal's age	===> ");
		age = keyboard.nextInt();
		System.out.println("Enter if the animal is adopted (true or false) ===> ");
		isAdopted = keyboard.nextBoolean();
		
		
		Pet y = new Pet(name,animal, age,isAdopted);
		
		
		System.out.println(y);
}
}
