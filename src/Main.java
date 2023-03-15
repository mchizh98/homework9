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
    public static void task1 () {
        System.out.println("Задача1");
        int[] arr = generateRandomArray();
        int sum = 0;
            for (int element : arr) {
                sum += element;
            }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        }

    public static void task2 () {
        System.out.println("Задача2");
        int[] arr = generateRandomArray();
        arr = generateRandomArray();
        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        System.out.println(maxArr);

        int minArr = arr [0];
        for (int i : arr) {
            if ( i < minArr) {
                minArr = i;
            }
        }
        System.out.println(minArr);
    }
    public static void task3 () {
        System.out.println("Задача3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int average = 0;
        for (int element : arr) {
            sum += element;
            average = sum / 30;{
                if (average % 1 != 0 && average % 1 == 0);
            }
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }


    public static void task4 () {
        System.out.println("Задача4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}