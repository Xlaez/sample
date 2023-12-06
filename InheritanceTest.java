public class InheritanceTest {
    public static void main(String[] args){
        Dog myDog = new Dog("pitbull", "jaimy");

        System.out.println(myDog.name);
        System.out.println(myDog.breed);

        myDog.greet();
        myDog.breed();
    }    
}


