public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1.Массивы.Часть 1.
        // Задание 1.
        System.out.println("Задание 1");
        int[] numbers = new int[]{1, 2, 3};
        double[] fractions = new double[]{1.57, 7.654, 9.986};
        int[] arbitraryArray = {1, 2, 10, 22, 45, 55, 67, 153, 89};

        // Задание 2
        System.out.println("Задание 2");
        int[] numbersInf = new int[]{1, 2, 3};

            System.out.print(numbersInf[0] + ",");
            System.out.print(numbersInf[1] + ",");
            System.out.print(numbersInf[2] + "");

        System.out.println("");
        double[] fractionsInf = new double[]{1.57, 7.654, 9.986};
        System.out.print(fractionsInf[0] + ", ");
        System.out.print(fractionsInf[1] + ", ");
        System.out.print(fractionsInf[2] + " ");
        System.out.println("");

        int[] arbitraryArrayInf = {1, 2, 10, 22, 45, 55, 67, 153, 89};
        System.out.print(arbitraryArrayInf[0] + ",");
        System.out.print(arbitraryArrayInf[1] + ",");
        System.out.print(arbitraryArrayInf[2] + ",");
        System.out.print(arbitraryArrayInf[3] + ",");
        System.out.print(arbitraryArrayInf[4] + ",");
        System.out.print(arbitraryArrayInf[5] + ",");
        System.out.print(arbitraryArrayInf[6] + ",");
        System.out.print(arbitraryArrayInf[7] + ",");
        System.out.print(arbitraryArrayInf[8] + "");
        System.out.println(" ");

        // Задание 3
        System.out.println("Задание 3");
        int[] numbersFC = new int[]{1, 2, 3};

        System.out.print(numbersFC[2] + ",");
        System.out.print(numbersFC[1] + ",");
        System.out.print(numbersFC[0] + "");

        System.out.println("");
        double[] fractionsFC = new double[]{1.57, 7.654, 9.986};
        System.out.print(fractionsFC[2] + ", ");
        System.out.print(fractionsFC[1] + ", ");
        System.out.print(fractionsFC[0] + " ");
        System.out.println("");

        int[] arbitraryArrayFC = {1, 2, 10, 22, 45, 55, 67, 153, 89};
        System.out.print(arbitraryArrayFC[8] + ",");
        System.out.print(arbitraryArrayFC[7] + ",");
        System.out.print(arbitraryArrayFC[6] + ",");
        System.out.print(arbitraryArrayFC[5] + ",");
        System.out.print(arbitraryArrayFC[4] + ",");
        System.out.print(arbitraryArrayFC[3] + ",");
        System.out.print(arbitraryArrayFC[2] + ",");
        System.out.print(arbitraryArrayFC[1] + ",");
        System.out.print(arbitraryArrayFC[0] + "");
        System.out.println(" ");

        // Задание 4
        System.out.println("Задание 4");
        int[] evenNumbers = new int[]{1, 2, 3};
        if( evenNumbers[0] % 2 == 0){
            System.out.print(evenNumbers[0] + ",");
        } else {
            evenNumbers[0] = evenNumbers[0] + 1; {
                System.out.print(evenNumbers[0] + ",");
            }
        }
        if( evenNumbers[1] % 2 == 0){
            System.out.print(evenNumbers[1] + ",");
        } else {
            evenNumbers[1] = evenNumbers[1] + 1; {
                System.out.print(evenNumbers[1] + ",");
            }
        }
        if( evenNumbers[2] % 2 == 0){
            System.out.print(evenNumbers[2] + ",");
        } else {
            evenNumbers[2] = evenNumbers[2] + 1; {
                System.out.print(evenNumbers[2] + " ");
            }
        }




    }
}





