public class BmiService {
    public static int calculate(int mass, int height) {
        float heightMeter = height / 100f;
        int index = Math.round(mass / (heightMeter * heightMeter));

        return index;
    }
}