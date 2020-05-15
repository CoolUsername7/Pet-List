
public class Pet {

	public String name,owner,species,breed;
	public double age,weight;

	public Pet () {

	}

	public Pet(String name, String owner, String species, String breed, double age, double weight) {
		this.name = name;
		this.owner = owner;
		this.species = species;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}

	public boolean equals(Pet one, Pet two) {
		if(one == two)
		{
			return true;
		}

		else return false;
	}

	public String toString() {
		return "Name: " + name + "\n" +
			   "Owner: " + owner + "\n" +
				"Species: " + species + "\n" +
			   "Breed: " + breed + "\n" +
				"Age: " + age + "\n" +
			   "Weight: " + weight + "\n" + "\n";
	}
}
