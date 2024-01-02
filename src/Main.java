import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] array = generateRandomArray();
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц "+sum);
    }
    public static void task2() {
        int[] array = generateRandomArray();
        System.out.println(Arrays.toString(array));
        int minSpendAmount = array[0];
        int maxSpendAmount = array[0];
        for (final int currentSpendAmount : array) {
            if (currentSpendAmount <= minSpendAmount) {
                minSpendAmount = currentSpendAmount;
            }
            if (currentSpendAmount >= maxSpendAmount) {
                maxSpendAmount = currentSpendAmount;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendAmount + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSpendAmount + " рублей");
    }
    public static void task3() {
        int[] array = generateRandomArray();
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Средняя сумма трат за месяц составила "+(float)sum / array.length+" рублей");
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(reverseFullName));
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}



