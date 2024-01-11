import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] numbers1 = {1.57, 7.654, 9.986};

        long[] numbers2 = new long[13];
        numbers2[0] = 234843257349L;
        numbers2[7] = 32321346567677567L;
        numbers2[12] = 5678788922256567L;


        System.out.println("Задача 2");

        int[] numbers3 = new int[3];
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;
        for (int index = 0; index < numbers3.length; index++) {
            if (index == numbers3.length - 1) {
                System.out.println(numbers3[index]);
                break;
            }
            System.out.print(numbers3[index] + ", ");
        }


        double[] numbers4 = {1.57, 7.654, 9.986};
        for (int index1 = 0; index1 < numbers4.length; index1++) {
            if (index1 == numbers4.length - 1) {
                System.out.println(numbers4[index1]);
                break;
            }
            System.out.print(numbers4[index1] + ", ");
        }

        long[] numbers5 = new long[13];
        numbers5[0] = 234843257349L;
        numbers5[7] = 32321346567677567L;
        numbers5[12] = 5678788922256567L;
        for (int index1 = 0; index1 < numbers5.length; index1++) {
            if (index1 == numbers5.length - 1) {
                System.out.println(numbers5[index1]);
                break;
            }
            System.out.print(numbers5[index1] + ", ");
        }

        System.out.println("Задача 3");

        int[] numbers6 = new int[3];
        numbers6[0] = 1;
        numbers6[1] = 2;
        numbers6[2] = 3;
        for (int index = numbers6.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(numbers6[index]);
                break;
            }
            System.out.print(numbers6[index] + ", ");
        }

        System.out.println();


        System.out.println("Задача 4");
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }


}