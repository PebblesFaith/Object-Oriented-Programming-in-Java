public class Test2 {
    public static void main(String[] args) {
        int value = 12;
        calculate(value);

    }

    public static void calculate (int data) {
        int tempValue = data + 3;
        int newValue = tempValue * 2;
        System.out.println(newValue);
    }
}
