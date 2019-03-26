package com.qs.sort;

/**
 * @ClassName com.qs.sort.SelectionSort
 * @Package com.qs.sort
 * @author: QS
 * @Date: 2019/3/25 9:58
 * @Description TODO 类功能描述
 */
public class SelectionSort {


    /**
     * 
     * 选择排序
     * 线性搜索数列并找到最下值，
     * 将最小值替换为列中左端的数字并进行排序
     * 如果最小值已经在左端，则不执行任何操作
     * 重复相同操作，直到所有数字都被排序
     * 
     * 
     * @param args
     */
    public static void main(String[] args) {

        int[] bubbbe = {7, 4, 1, 0, 6, 5, 3, 2, 9, 8};

        int a, b;
        int temp;
        int maxLenth, toLenth;
        
        System.out.print("原始数组：");
        show(bubbbe);

        // 需要循环数组长度-1次
        for (int i = 0; i < bubbbe.length - 1; i++) {
            
            // i 初始位数  temp 临时目标位数
            temp = i;
            a = bubbbe [temp];
            int total = 0;
            // 选择数组最小值，并记录位数
            for (int j = i; j < bubbbe.length -1 ; j++) {
                // 目标位数的值
                b = bubbbe [j + 1];
                // 标位数值 小于 初始位数值  记录目标位数
                if (b < a){
                    temp = j + 1;
                    a = bubbbe [temp];
                }
                total++;
            }
            // 初始位数 不等于 临时目标位数 则交换两个位置的值 
            if (i != temp){
                a = bubbbe [temp];
                b = bubbbe [i];
                bubbbe[i] = a;
                bubbbe[temp] = b;
            }
            System.out.println("总共选择了：" + total + " 次");
            show(bubbbe);
                 
        }
        
        
        
    }


    /**
     * 数组输出
     * @param bubbbe
     */
    public static void show(int[] bubbbe) {
        String string = "";
        for (int i = 0; i < bubbbe.length; i++) {
            string += bubbbe[i] + ", ";
        }
        System.out.print(string.substring(0, string.length() - 2));
        System.out.println();
    }
}
