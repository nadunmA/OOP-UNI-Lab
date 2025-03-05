public class Test {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("nadun");
        s1.setDitNo(123);
        s1.setAddress("nyc");

        s2.setName("elon");
        s2.setDitNo(345);
        s2.setAddress("miami");

        System.out.println(s1.getName());
        System.out.println(s1.getDitNo());
        System.out.println(s1.getAddress());

        System.out.println();

        System.out.println(s2.getName()); 
        System.out.println(s2.getDitNo());
        System.out.println(s2.getAddress());

        System.out.println();

        System.out.println(s1.getDetails());


    }

}
