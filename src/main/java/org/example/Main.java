package org.example;

import java.util.*;

public class Main {

    public static void main(String... A)
    {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        int[] Count = new int[5];
        Count[0]=1000;
        Count[1]=5000;
        Count[2]=10000;
        Count[3]=50000;
        Count[4]=100000;
        String[] columnsHeader = new String[] {"method/count", Integer.toString(Count[0]),
                Integer.toString(Count[1]), Integer.toString(Count[2]), Integer.toString(Count[3]),Integer.toString(Count[4])};
        String[][] str = new String[10][6];
        long time;
        for (int i = 1;i <= 5;i++)
        {
            int count = Count[i-1];
            time = System.currentTimeMillis();
            for (int j = 0;j < count;j++) {
                array.add(j);
            }
            time = System.currentTimeMillis() - time;
            str[0][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0;j < count;j++) {
                list.add(j);
            }
            time = System.currentTimeMillis() - time;
            str[1][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0;j < count;j++) {
                array.get(j);
            }
            time = System.currentTimeMillis() - time;
            str[2][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0;j < count;j++) {
                list.get(j);
            }
            time = System.currentTimeMillis() - time;
            str[3][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0;j < count;j++) {
                array.set(j,j);
            }
            time = System.currentTimeMillis() - time;
            str[4][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = 0;j < count;j++) {
                list.set(j,j);
            }
            time = System.currentTimeMillis() - time;
            str[5][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = count - 1;j >= 0;j--) {
                array.remove(j);
            }
            time = System.currentTimeMillis() - time;
            str[6][i] = Long.toString(time);

            time = System.currentTimeMillis();
            Collections.sort(array);
            time = System.currentTimeMillis() - time;
            str[8][i] = Long.toString(time);

            time = System.currentTimeMillis();
            for (int j = count - 1;j >= 0;j--) {
                list.remove(j);
            }
            time = System.currentTimeMillis() - time;
            str[7][i] = Long.toString(time);

            time = System.currentTimeMillis();
            Collections.sort(list);
            time = System.currentTimeMillis() - time;
            str[9][i] = Long.toString(time);

        }
        str[0][0] = "arraylist add";
        str[1][0] = "linkedlist add";
        str[2][0] = "arraylist get";
        str[3][0] = "linkedlist get";
        str[4][0] = "arraylist set";
        str[5][0] = "linkedlist set";
        str[6][0] = "arraylist remove";
        str[7][0] = "linkedlist remove";
        str[8][0] = "arraylist sort";
        str[9][0] = "linkedlist sort";
        Formatter formatter = new Formatter();
        System.out.println(formatter.format("%17s %17s %17s %17s %17s %17s", columnsHeader[0], columnsHeader[1], columnsHeader[2],
                columnsHeader[3], columnsHeader[4], columnsHeader[5]));
        for (int i = 0;i < 10;i++) {
            formatter = new Formatter();
            System.out.println(formatter.format("%17s %17s %17s %17s %17s %17s", str[i][0], str[i][1]+"ms", str[i][2]+"ms", str[i][3]+"ms",
                    str[i][4]+"ms", str[i][5]+"ms"));
        }
    }

}