// ДЗ 2  Java 1 Уровень Панарина Ксения
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        invertArray();
        System.out.println("\nЗадание 2:");
        fillArray();
        System.out.println("\nЗадание 3:");
        multiplyArray();
        System.out.println("\nЗадание 4:");
        fillDiagonals();
        System.out.println("\nЗадание 5:");
        findMinMaxOfArray();
        System.out.println("\nЗадание 6:");
        System.out.println(checkBalance(new int[] { 1, 2, 1, 2, 2 })); // true
        System.out.println(checkBalance(new int[] { 2, 2, 2, 1, 2, 2, 10,1 })); // true
        System.out.println(checkBalance(new int[] { 2, 1, 2, 1, 2, 2, 14,1 })); // false
    }

    /* 1. Задать целочисленный массив, состоящий из 0 и 1. Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0].
     * С помощью циклаи условия заменить 0 на 1, 1 на 0 */
    static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            array[i] = 1 - array[i];
        System.out.println(Arrays.toString(array));
    }

    /* 2. Задать пустой целочисленный массив размером 8. С помощью цикла
    заполнить его значениями 0 3 6 9 12 15 18 21 */
    static void fillArray() {
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j += 3)
            array[i] = j;
        System.out.println(Arrays.toString(array));
    }

    /* 3. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом
    и числа меньшие 6 умножить на 2 */
    static void multiplyArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        System.out.println(Arrays.toString(array));
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами */
    static void fillDiagonals() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++)
        {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }

        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }

    /* 5. ** Задать одномерный массив и найти в нём минимальный и максимальный элементы */
        static void findMinMaxOfArray() {
            int[] array = {6, 2, 11, 9, 17, -3, 5, 0, 7, 1, 15, 8, -2};
            int min = array[0];
            int max = array[0];
            System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                min = (min < array[i]) ? min : array[i];
                max = (max > array[i]) ? max : array[i];
            }
            System.out.println("Минимальный элемент: " + min + "\nМаксимальный элемент: " + max);
        }

    /* 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
    части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    эти символы в массив не входят.*/

    static boolean checkBalance(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length + 1; i++) {
           int leftSum = 0;
           int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += array[j] ;
            }

            for (int j = i; j < array.length; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}