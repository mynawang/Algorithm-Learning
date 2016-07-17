package com.sedion.mynawang.sort;

import java.util.Scanner;

/**
 * 冒泡排序
 * @auther mynawang
 * @create 2016-07-17 14:33
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arrays     = new int[100];                            // 数组数量
        int inputNum     = 100;                                     // 输入数量
        int exchangeNum  = 0;
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        Scanner scannerNums = new Scanner(System.in);
        for (int i = 0; i < inputNum; i++) {
            arrays[i] = scannerNums.nextInt();                      // 输入数据保存
        }
        /*****冒泡排序核心算法******/
        for (int i = 0; i < (inputNum-1) ; i++) {                   // 遍历所有数组(数据量减1的趟数)
            for (int j = 0; j < (inputNum-i-1); j++) {              // 遍历一次待对比数组次数，上一层循环走完一趟后，待对比数组长度减1
                if (arrays[j] < arrays[j+1]) {                      // 比较大小交换
                    exchangeNum = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = exchangeNum;
                }
            }
        }
        for (int i = 0; i < inputNum; i++) {
            System.out.println(i + ":" + arrays[i]);
        }
        System.exit(0);
    }

}
