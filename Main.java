import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i = 0;
        int[] array2;
        array2 = new int[8];
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int [][] array4;
        array4 = new int [8][8];
        int minTask5, maxTask5, sdvig;
        int[] maxMinForTask5 = {0,0};
//        maxMinForTask5 = new int[2];
        byte printNumberTask = 1;
        boolean sumBalance;
// number 1
        System.out.print(" Task 1: ");
        for (i = 0; i < array1.length; i++) System.out.print(array1[i] + " "); // Arrays.toString(Array) not work
        replaseArray(array1);
        System.out.println(" ");
// number 2
        System.out.print("\nTask 2: ");
        for (i = 0; i < 8; i++) {
            array2[i] = i * 3;
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
// number 3
        System.out.print("\nTask 3: ");
        for (i = 0; i < array3.length; i++) System.out.print(array3[i] + " ");
        System.out.print("\nResult: ");
        for (i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] = array3[i] * 2;
            System.out.print(array3[i] + " ");
        }
        System.out.println(" ");
// number 4
        System.out.print("\nTask 4: ");
        fillArray4(array4);
        System.out.println(" ");

// number 5 use array3 as data
        System.out.print("\nTask 5: "+array3[0]+" ");
        maxTask5 = array3[0];
        minTask5 = array3[0];
        for (i = 1; i < array3.length; i++)
        {
            if (array3[i] > maxTask5) maxTask5 = array3[i];
            if (array3[i] < minTask5) minTask5 = array3[i];
            System.out.print(array3[i]+" ");
        }
        System.out.print("\n Result: Min = "+minTask5+"  Max = "+maxTask5);
        System.out.println(" ");

// number 6
// use array3 as data
    System.out.print("\nTask 6: ");
    for (int n = 0; n < array3.length; n++) {System.out.print(array3[n]+" ");}
    sumBalance = leftRightSum(array3);
    System.out.print("\nResult: "+sumBalance);
    System.out.println(" ");
    
// number 7
// use array3 as data
// sdvig
    sdvig = 3;
    System.out.print("\nTask 7: ");
    for (i = 0; i < array3.length; i++) { System.out.print(array3[i]+" ");}
    System.out.print(" сдвиг = "+sdvig);
    sdvigArray (array3,sdvig);
    System.out.print("\nResult: ");
    for (int n = 0; n < array3.length; n++) {System.out.print(array3[n]+" ");}

    }
    // number 6
    public static boolean leftRightSum (int[] array3){
        boolean resultFunc = false;
        int leftSum=0, rightSum=0;
        int leftPosition=0;

        for (int w=0;w<array3.length-1;w++)
        {
         leftSum+=array3[w];
          rightSum=0;
          for (int a=w+1;a<array3.length; a++) rightSum+=array3[a];
          if (leftSum == rightSum)
          {
              resultFunc = true;
              leftPosition=w;
              break;
          }
        }

        if (resultFunc == true) {
            System.out.print("\n LeftSumm= " + leftSum + "   RightSumm= " + rightSum + "\n Array: ");
            for (int a = 0; a <array3.length; a++) {
                System.out.print(array3[a] + " ");
             if (a == leftPosition)  System.out.print("|| ");
            }
        }
        return resultFunc;
    }

    // number 1
    public static void replaseArray (int[] array1){
            System.out.print("\nResult : ");
            for (short i = 0; i < array1.length; i++) {
                if (array1[i] == 0) array1[i] = 1;
                else array1[i] = 0;
                System.out.print(array1[i] + " ");
            }
        }
// number 4
    public static void fillArray4 (int[][] array4) {
        byte diagonal = 0;
        for (byte arrayColumn = 0; arrayColumn < array4.length; arrayColumn++) {
            for (byte arrayLine = 0; arrayLine < array4.length; arrayLine++) {
                if (arrayLine == diagonal || diagonal == array4.length - arrayLine - 1)
                    array4[arrayColumn][arrayLine] = 1;
                else array4[arrayColumn][arrayLine] = 0;
                System.out.print(array4[arrayColumn][arrayLine] + " ");
            }
            diagonal++;
            System.out.print("\n        ");
        }
    }

// number 7
public static void sdvigArray (int[] array3, int i) {
    int buff;
    if (i < 0) {
        do {
            buff = array3[0];
            for (int k = 1; k < array3.length; k++) array3[k - 1] = array3[k];
            array3[array3.length-1] = buff;
            i++;
        }
        while (i != 0) ;
    }
    if (i > 0) {
        do {
            buff = array3[array3.length-1];
            for (int k = array3.length - 2; k >= 0; k--) {array3[k + 1] = array3[k];}
            array3[0] = buff;
            i--;
        }
        while (i != 0);
    }

}

}