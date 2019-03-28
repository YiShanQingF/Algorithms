package com.qs.common.utils;

/**
 * @ClassName com.qs.common.utils.SortUtils
 * @Package com.qs.common.utils
 * @author: QS
 * @Date: 2019/3/26 21:19
 * @Description  分类排序工具类
 */
public class SortUtils {
    

    /**
     * 数组输出
     * @param arrays
     */
    public static void showArrays(int [] arrays){

        String string = "";
        for (int i = 0; i < arrays.length; i++) {
            string += arrays[i] + ", ";
        }
        System.out.print(string.substring(0, string.length() - 2));
        System.out.println();
        
    }
    
    /**
     * 交换数组中俩个位置的值
     * @param arrays
     */
    public static void swap(int [] arrays , int i, int j){

        int temp = arrays [i];
        arrays [i] = arrays [j];
        arrays [j] = temp;
        
    }
    
}
