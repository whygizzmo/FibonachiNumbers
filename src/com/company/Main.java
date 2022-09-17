package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> searchFibonachiNums(int fibonachiNumber) throws IOException {
        int i = 0;
        int j = 1;
        System.out.print(i + "->" + j);
        List<String> fibonacResult = new ArrayList<>();
        fibonacResult.add(i + "->" + j);

        while (i < fibonachiNumber || j < fibonachiNumber) {
            i += j;
            if (i>fibonachiNumber){
                return fibonacResult;
            }
            System.out.print("->" + i);
            fibonacResult.add("->" + i);
            j += i;
            if (j>fibonachiNumber){
                return fibonacResult;
            }
            System.out.print("->" + j);
            fibonacResult.add("->" + j);

        }
         System.out.println(Arrays.deepToString(fibonacResult.toArray()));

        return fibonacResult;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fibonachi num");

        int userNum = scanner.nextInt();
        FileWriter fileWriterSecond = new FileWriter("fibonachi.txt",false);
         List<String> stringList = searchFibonachiNums(userNum);
        System.out.println();
        System.out.println(Arrays.deepToString(stringList.toArray()));
        fileWriterSecond.write(""+stringList);
        fileWriterSecond.close();

        FileWriter fileWriter = new FileWriter("fibonachi.txt",true);
        fileWriter.write(" - Fibonachi Numbers");
        fileWriter.close();


    }
}
