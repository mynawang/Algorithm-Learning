package com.sedion.mynawang.sort;

import com.alibaba.fastjson.JSON;

/**
 * 快速排序
 * @auther mynawang
 * @create 2016-07-21 11:11
 */
public class QuickSort {

    public static void main(String args[]) {
        int[] p = { 23, 11, 4657, 5, 4, 68, 788, 198, 12, 0 };
        QuickSort.quickSortImpl(p, 0, p.length-1);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i] + "\n");
        }
    }

    public static void quickSortImpl(int[] arrays, int startIndex, int endIndex) {
        int referNum = arrays[startIndex];                                          // 参考数
        int leftIndex = startIndex;                                                 // 左边开头起始索引
        int rightIndex = endIndex;                                                  // 右边尾巴起始索引

        System.out.println("************referNum: " + referNum);
        System.out.println("**************arrays: " + JSON.toJSONString(arrays));

        // 开头起始索引小于尾巴起始 证明排序还在进行
        while (leftIndex < rightIndex) {

            // 从右边尾巴起始索引开始比较，数值大于比较数则不动，继续往左边偏移索引
            while (arrays[rightIndex] > referNum && leftIndex < rightIndex) {
                rightIndex--;
            }
            // 直到找到反例，将右边暂停数赋值给左边起始数
            arrays[leftIndex] = arrays[rightIndex];


            // 从左边开头起始索引开始比较，数值小于比较数则不动，继续往右边偏移索引
            while (arrays[leftIndex] < referNum && leftIndex < rightIndex) {
                leftIndex++;
            }
            // 直到找到反例，将左边暂停数赋值给右边暂停数
            arrays[rightIndex] = arrays[leftIndex];
        }

        // 一次轮回结束，referNum插入后，左边的数都小于referNum，右边的数都大于referNum
        arrays[leftIndex] = referNum;

        // 此轮比较后暂停数的左边起始索引有往右移动2位   递归调用
        if (leftIndex - 1 > startIndex) {
            quickSortImpl(arrays, startIndex, leftIndex-1);
        }

        // 此轮比较后暂停数的左边起始索引往右移动的位数有2位遗留的   递归调用
        if (leftIndex + 1 < endIndex) {
            quickSortImpl(arrays, leftIndex+1, endIndex);
        }
    }


}
