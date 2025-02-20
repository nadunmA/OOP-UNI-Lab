public class App {
    public static void main(String[] args) throws Exception {
        
        int miles, yards;
        double kilometer;

        miles = 26;
        yards = 385;

        kilometer = miles * 1609 + (yards / 1760.0) * 1609;

        System.out.println("kilometer is "+kilometer);
    }
}
