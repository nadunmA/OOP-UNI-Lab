public class Student {

    private String name;
    private int ditNo;
    private String address;

    public Student(){}

    public Student(String name, int ditNo, String address){

        this.name = name;
        this.ditNo = ditNo;
        this.address = address;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setDitNo(int ditNo){
        this.ditNo = ditNo;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public int getDitNo(){
        return ditNo;
    }

    public String getAddress(){
        return address;
    }

    public String getDetails(){
            
        return "I am a Student\n" + "My name is udaya\n" + "I am from malabe\n" + "My dit no is DIT/11/c1/0010";
    }



}
