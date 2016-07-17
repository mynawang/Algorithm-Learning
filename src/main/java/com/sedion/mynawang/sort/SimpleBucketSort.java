package com.sedion.mynawang.sort;

import java.util.Scanner;

/**
 * 简单捅排序
 * @auther mynawang
 * @create 2016-07-16 22:57
 */
public class SimpleBucketSort {

    public static void main(String[] args) {
        int maxNum          = 100;                          // 最大数值
        int inputNum        = 5;                            // 输入数量
        int inputVal        = 0;                            // 输入数值
        int[] arrays = new int[maxNum + 1];                 // 数组总容量从0到maxNum数量
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < inputNum ; i++) {
            inputVal = scanner.nextInt();
            arrays[inputVal]++;                             // 相应位置数量加1
        }
        for (int i = (arrays.length-1); i > 0; i--) {       // 遍历声明的数组
            for (int j = 0; j < arrays[i]; j++) {           // 遍历数量
                System.out.println(i);
            }
        }
        System.exit(0);
    }
}
