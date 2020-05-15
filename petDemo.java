import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class petDemo {

	public static void main (String [ ] args) throws IOException
	{
		File fn = new File("pets.dat");
		Scanner inputfile = new Scanner(fn);

		ArrayList <Pet> allpets = new ArrayList<Pet>();

		readPets(allpets);
		printPets(allpets);

	}

	//This method should read in the fields for a pet, create a pet object, and add it to the ArrayList
	public static void readPets(ArrayList allpets) throws IOException
	{
		File fn = new File("pets.dat");
		Scanner inputfile = new Scanner(fn);
		int count = 0;

		while(inputfile.hasNext())
		{
		String name = inputfile.next();

		inputfile.nextLine();

		String owner = inputfile.nextLine();
		String species = inputfile.nextLine();
		String breed = inputfile.nextLine();
		//breed.replaceAll("\\s","");
		double age = inputfile.nextDouble();
		double weight = inputfile.nextDouble();

		allpets.add(new Pet(name,owner,species,breed,age,weight));
		}

	}

	public static void printPets(ArrayList allpets)
	{
		for(int x = 0; x < allpets.size(); x++)
		{
			System.out.println(allpets.get(x));
		}
	}
}
