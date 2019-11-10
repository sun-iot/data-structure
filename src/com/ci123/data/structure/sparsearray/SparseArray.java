package com.ci123.data.structure.sparsearray;

import java.util.Arrays;

/**
 * Copyright (c) 2018-2028 Corp-ci All Rights Reserved
 * <p> 稀疏矩阵
 * Project: data-structure
 * Package: com.ci123.data.structure.sparsearray
 * Version: 1.0
 * <p>
 *     稀疏数组：当一个数组中有大部分值相同时，在我们看来是属于没有意义的数据，就可以用稀疏数组来保存我们的数组信息。
 *     稀疏数组的处理方法：
 *     1） 记录数组一共有几行几列，有多少个不同的值
 *     2） 把具有不同值的元素的行列及值记录在一个小规模的数组中，从而缩小程序的规模
 *
 *     二维数组转稀疏数组的思路如下：
 *     1) 遍历原始的二维数组，得到有效数据的个数 sum
 *     2) 根据sum 就可以创建稀疏数组 sparseArray int[sum + 1][3]
 *     3) 将二维数组的有效数据存入到稀疏数组
 *
 *     稀疏数组转二维数组的思路：
 *     1) 先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组
 *     2) 在读取稀疏数组后几行数据，并赋给原始二维数组即可
 * Created by SunYang on 2019/11/6 13:44
 */
public class SparseArray {

    public static void main(String[] args) {
        // 我现在有一个 11*11 的二维数组, 1 ,2 分别小时两种不同的数据
        int initArray[][] = new int[11][11] ;
        for (int i = 0 , j = 0 ; i < 5 && j <11 ; i ++ , j +=2 ){
            initArray[i][j] = 1 ;
            initArray[i+5][(j+2)%11] = 2 ;
        }

        // 先输出原始的二维数组
        for (int[] ints : initArray) {
            for (int anInt : ints) {
                System.out.printf("%d \t" ,anInt);
            }
            System.out.println();
        }

        // 将二维数组转稀疏数组
        // 先遍历二维数组，得到非0数据的个数
        int sum = 0 ;

    }


}
