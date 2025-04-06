package lessonOne;
/*
 *	Андрей Трифонов
 *	задание к занятию 1
 */


public class LessonOne {

    public static void main(String[] args) {
       printThreeWords();
        System.out.println("\n");
       checkSummSing();
        System.out.println("\n");
       printColor();
        System.out.println("\n");
       compareNumbers();
        System.out.println("\n");
       System.out.println(aFive(11, 2 ));
       aSix(10);
        System.out.println("\n");
       System.out.println(aSeven(11));

       aEaght("Hello", 3);
       aNine(2022);
       aTen();
        System.out.println("\n");
       elevenArray();
        System.out.println("\n");
       twelveArray();
        System.out.println("\n");
        fillDiagonal();
        System.out.println("\n");
        aFourteen(2,3);
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSummSing(){
        int a=10;
        int b=-11;
        if (a+b>=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 99;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }
    public static void compareNumbers(){
        int a=11;
        int b=24;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean aFive(int a , int b){
        int summa = a+b;
        if (summa > 10 && summa < 20) return true;
        else return false;
    }

    public static void aSix(int a){
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    public static boolean aSeven(int a) {
        if (a < 0) return true;
        return false;
    }

    static void aEaght(String line, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(line);
    }


    public static void aNine(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " False");
        else System.out.println(year + " True");
    }

    public static void aTen() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("До: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nПосле:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void elevenArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void twelveArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("До: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nПосле:  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int length = 5; // length of array

        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }

        //CHECK
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void aFourteen(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }


}
