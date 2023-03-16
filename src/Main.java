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
        /*
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
int maxWeight = -1;
for (final int current : weights) {
// Переменная final int current объявляется внутри скобок for
// Ей присваивается значение каждого элемента массива weights
    if (current > maxWeight) {
        maxWeight = current;
    }
}
System.out.println(maxWeight);

         */
        int[] arr = generateRandomArray();
        int maxArr = -1;
        int minArr = arr [0];
        for (final int day : arr) {
            if (day > maxArr) {
                maxArr = day;
            }
            if (day < minArr) {
                minArr = day;
            }
        }
        System.out.println(maxArr);
        System.out.println(minArr);
    }
    public static void task3 () {
        System.out.println("Задача3");
        int [] arr = generateRandomArray();
        double sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double average = sum / arr.length;
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