package datastructures;

import java.util.Arrays;

import java.util.ArrayList;

public class ArraysConcept {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int i = 0;
        arr[0] = i++;
        arr[1] = i++;
        arr[2] = i++;
        arr[3] = i++;
        arr[4] = i++;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        boolean[] boolArr = {true,false,false};
        System.out.println(boolArr);
        System.out.println(Arrays.toString(boolArr));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(11);
        list.remove(2);
        list.add(1);
        System.out.println(list.contains(1));
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        var res = list.toArray();
        System.out.println(Arrays.toString(res));
        System.out.println(list);

        Array myArr = new Array(3);
        myArr.insert(10);
        myArr.insert(20);
        myArr.insert(30);
        myArr.print();
        myArr.insert(40);
        myArr.print();
        myArr.insert(50);
        myArr.insert(60);
        myArr.print();
        myArr.remove(3);
        myArr.print();
        myArr.remove(0);
        myArr.print();
        myArr.insert(10);
        myArr.print();
        System.out.println(myArr.indexOf(20));
        System.out.println(myArr.indexOf(10));
        myArr.remove(4);

    }
}
