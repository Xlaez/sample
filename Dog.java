
public class Dog extends Animal{

    String breed;

    public Dog(String breed, String name){
        super(name);
        this.breed = breed;
    }

    public void breed(){
        System.out.println(this.breed + "is a breed of dogs");
    }
}