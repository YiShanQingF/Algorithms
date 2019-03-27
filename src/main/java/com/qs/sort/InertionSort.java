package com.qs.sort;

import com.qs.common.utils.SortUtils;

/**
 * @ClassName com.qs.sort.InertionSort
 * @Package com.qs.sort
 * @author: QS
 * @Date: 2019/3/25 9:59
 * @Description 插入排序
 */
public class InertionSort {
    
    /**
     * 插入排序
     * 首先 最左端的数字已经完成排序
     * 然后取出哪些尚未操作的右端的数字将其与已经操作的左侧的数字进行比较
     * 如果左边的数字较大，交换两个数字
     * 重复操作，直到出现一个较小的数字或数字到达左端
     * 直到所有数字完成排序
     * 
     * @param args
     */
    public static void main(String[] args) {

        int[] arrays = {9, 4, 1, 8, 6, 5, 3, 2, 7, 0};
        int a, b = 0;
        System.out.print("原始数组：");
        SortUtils.showArrays(arrays);

        // 从数列的第二位开始排序(默认第一位已经排序完成)
        for (int i = 1; i < arrays.length; i++) {
            // 目标数字
            a = arrays [i];
            
            for (int j = i; j >= 0; j--) {
                if (j == 0){
                    // 如果对比到最后一位，认为目标数字是，已排序完成数列中最小的数字，跳出循环
                    arrays [j] = a;
                    break;
                }else {
                    // 对比数字
                    b = arrays [j - 1];
                }
                
                if (a < b){
                    // 如果目标数字,小于已排序完成的数列中的数值，将已排序完成的数值向前移动一位
                    arrays [j] = b;
                }else {
                    // 如果目标数字,不小于已排序完成的数列中的数值，则当前位置就是目标数字的位置
                    arrays [j] = a;
                    break;
                }
            }
            SortUtils.showArrays(arrays);
        }
    }


}
