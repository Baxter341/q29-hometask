public class Zero {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            count += countZeros(i);
        }
        System.out.println("Количество нулей в произведении всех чисел от 1 до 100 = " + count);
    }

    public static int countZeros(int number) {
        int count = 0;
        while (number % 5 == 0 && number != 0) {
            count++;
            number /= 5;
        }
        return count;
    }
}
