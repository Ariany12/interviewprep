package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int [] numbers = new int[3];
//        int [] numbersx = {3, 3, 2, 1};
//        int [] numberFinal = {3, 3, 2, 1, 6};
//
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(numbersx));
//        System.out.println(numbersx.length);
//        System.out.println(Arrays.toString(numberFinal));

        Array numbers = new Array(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(230);
        numbers.insert(120);
//      numbers.removeAt(4);
//      System.out.println(numbers.indexOf(30));
//      System.out.println(numbers.indexOf(100));
//      System.out.println(numbers.max());
//        numbers.intersect(new int[]{20, 450, 13, 120, 70, 230});
        numbers.reverse(new int[]{20, 450, 13});



//        numbers.print();
    }

}