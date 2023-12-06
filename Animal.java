public class Animal{

    String name;

    public Animal(String name){
        this.name = name;
    }

    public void greet(){
        System.out.println(this.name + " " + "is" + " " + "greeting");
    }
}