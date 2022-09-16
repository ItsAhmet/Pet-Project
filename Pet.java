public class Pet {

	private String name;
	private String animal;
	private int age;
	private boolean isAdopted;
	

	public Pet() {
		name="Animal";
		animal="Dino";
		age=0;
		isAdopted=false;
	}

	public Pet(String name, String animal, int ag, boolean Adopted){
		this.name=name;
		age=ag;
		this.animal=animal;
		isAdopted=Adopted;
	}

	public  String getName() {
		return name;
	}
	public  String getAnimal() {
		return animal;
	}
	public  int getAge() {
		return age;
	}
	public  boolean getIsAdopted() {
		return isAdopted;
	}
	 public void setAge(int Age) {
		 this.age=Age;
	 }
	 public void setName(String Name) {
		 this.name=Name;
	 }
	 public void setAnimal(String Animal) {
		 this.animal=Animal;
	 }
	 public void setAdopted(boolean isAdopted) {
		 this.isAdopted=isAdopted;
	 }
	 public String toString() {
		 return "Animal name:\t"+name+"\nAnimal type:\t"+animal+"\nAnimals age is:\t"+age+"\nAnimal adopted:\t"+ isAdopted;
	 }
	 public static void main(String[] args) {
		 Pet x = new Pet();
		 System.out.println(x);

	 }
	 
}
