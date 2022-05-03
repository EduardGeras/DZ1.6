public class Main {
    public static void main(String[] args) {

    // Задание 1
        int[] arr = generateRandomArray();
        float sum = 0f;
        for (int i : arr) {
            sum += i;
        }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    // Задание 2
        int maxWeight = 0;
        int minWeight = 0;
        for (int i = 0; i < arr.length; i++) {
            maxWeight = arr[0];
            if (maxWeight < arr[i]) {
                maxWeight = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            minWeight = arr[0];
            if (minWeight > arr[i]) {
                minWeight = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWeight + " рублей. Максимальная сумма трат за день составила " + maxWeight + " рублей");

    // Задание 3
        float averageWeight = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageWeight + " рублей");

    // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[reverseFullName.length - 1 - i]);
        }
    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}