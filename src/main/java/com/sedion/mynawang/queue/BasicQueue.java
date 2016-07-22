package com.sedion.mynawang.queue;

import com.alibaba.fastjson.JSON;

/**
 * 简单队列
 * @auther mynawang
 * @create 2016-07-22 15:46
 */
public class BasicQueue {

     /*给出一串数字，首先将第1个数删除，紧接着将第 2 个数放到这串数的末尾，
     再将第 3 个数删除并将第 4 个数放到这串数的末尾，
     再将第 5 个数删除……直到剩下最后一个数，将最后一个数也删除。
     按照刚才删除的顺序，把这些删除的数连在一起就得到qq号【啊哈算法】*/

    public static int[] simpleSortQueue(int[] arrays) {
        // 暂存数字索引（第二个数排队尾）
        int totalNum = arrays.length;
        // 暂存数组
        int[] exchangeQueue = new int[totalNum*2];
        // 返回删除数组
        int[] finalQueue = new int[totalNum];
        // 删除数据位置索引
        int cutIndex = 0;
        // 返回数组添加位置索引
        int queueAddIndex = 0;
        for (int i = 0; i < arrays.length; i++) {
            exchangeQueue[i] = arrays[i];
        }
        while (cutIndex < totalNum) {
            // 删除数字保存
            finalQueue[queueAddIndex] = exchangeQueue[cutIndex];
            cutIndex++;
            queueAddIndex++;
            // 删除数后一个数排队尾
            exchangeQueue[totalNum] = exchangeQueue[cutIndex];
            cutIndex++;
            totalNum++;
        }
        return finalQueue;
    }




    public static void main(String[] args) {
        // QQ:615947283
        int[] array = {6, 3, 1, 7, 5, 8, 9, 2, 4};
        /*61594
        7823
        6159472
        83
        61594728
        3
        615947283*/
        // QQ:6159438027
        int[] array2 = {6, 3, 1, 7, 5, 8, 9, 2, 4, 0};

        // QQ:453237747
        int[] arrays = {4, 7, 5, 7, 3, 4, 2, 7, 3};

        System.out.println(JSON.toJSONString(simpleSortQueue(array2)));
        /*System.out.println(JSON.toJSONString(selfSortQueue(array)));*/
    }




    /*public static int[] selfSortQueue(int[] arrays) {
        int totalNum = arrays.length;
        // 返回删除数组
        int[] finalQueue = new int[totalNum];
        int[] leftQueue = new int[totalNum];
        int finalQueueIndex = 0;
        boolean isOdd = true;
        for (int i = 0; i < totalNum; i++) {
            if (i%2 == 0) {
                //finalQueue[finalQueueIndex]  = arrays[i];
                //finalQueueIndex++;
                System.out.println(arrays[i]);
            }
        }
        if (totalNum%2 == 0) {
            int nextIndex = 1;
            for (int i = 0; i < (totalNum/4); i++) {
                // i = 0;  index = 1
                // i = 1;  index = 5
                // i = 3;  index = 9
                System.out.println(arrays[nextIndex]);
                nextIndex += 4;
            }
        }
        return finalQueue;
    }*/

}
