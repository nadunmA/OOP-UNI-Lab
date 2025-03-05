public class Person {

    String name;
    String address;

    public Person(String name, String addresss){

        this.name = name;
        this.address = addresss;

    }

    public void showDetails(){
        System.out.println("name : "+name);
        System.out.println("address : "+address);
    }

}
