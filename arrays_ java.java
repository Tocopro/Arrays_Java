

package com.company;
import  java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] my_array = {
                1234, 5432, 5412, 3458, 4765, 6709, 2134, 5476, 7645
        };
        String[] my_array2 = {
                "Java", "Python", "C++", "Ruby", "Javascript", "HTML", "CSS"
        };
        System.out.println("Original numeric Array: " + Arrays.toString(my_array));
        Arrays.sort(my_array);
        System.out.println("Sorted numeric Array: " + Arrays.toString(my_array));

        System.out.println("Original Text Array: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted Text Array: " + Arrays.toString(my_array2));

    }
}
package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(7);
        myList.add(3);
        myList.add(8);
        myList.add(12);
        myList.add(9);
        myList.add(22);
        myList.add(18);
        myList.add(-9);
        for(Integer x: myList)
        {
            System.out.println(x);
        }
        System.out.println("Size " + myList.size());
        myList.remove(1);
        myList.set(3,679);
        for(Integer x : myList)
        {
            System.out.println(x);
        }
        System.out.println("Size " + myList.size());

    }
}
    public static int findIndex (int[] my_array, int t) {
        if(my_array == null) return  -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i = i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 54, 15, 34, 65, 99, 77, 18, 29};
        System.out.println(findIndex(my_array,100));

    }
}
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] my_array = {23, 34, 54, 76, 89, 110};
        System.out.println(Arrays.toString(my_array));

        int removeIndex = 1;
        for(int i = removeIndex; i < my_array.length -1; i++)
        {
            my_array[i] = my_array[i + 1];
        }
        System.out.println(Arrays.toString(my_array));

    }
}
