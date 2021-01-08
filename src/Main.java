public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 69;
        int height = 170;
        int index = service.calculate(mass, height);
        System.out.println(index);
    }
}