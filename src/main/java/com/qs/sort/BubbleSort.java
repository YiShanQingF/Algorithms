package com.qs.sort;

/**
 * @ClassName com.qs.sort.Bubble
 * @Package com.qs.sort
 * @author: QS
 * @Date: 2019/3/25 9:54
 * @Description TODO 类功能描述
 * <p>
 * 一 、分类
 * 01 冒泡排序法
 * 02 选择排序
 * 03 插入排序
 */
public class BubbleSort {


    /**
     * 冒泡排序 是数列排序的算法之一
     * 将天平放在序列的右端，并比较天平左右的数字
     * 比较后如果右边的数字较小，则交换
     * 比较完成后，逐一移动天平
     * 重复同样的操作，直到天平移动到左端
     * 这样最小的数字就已经移动到最左端
     * 将天平返回最右端，重复相同的操作，直到所有数字都被排序
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] bubbbe = {9, 4, 1, 8, 6, 5, 3, 2, 7, 0};

        int a, b;
        int maxLenth, toLenth;

        toLenth = 1;
        System.out.print("原始数组：");
        show(bubbbe);

        // 需要循环数组长度-1次
        for (int i = bubbbe.length - 1; i > 0; i--) {
            System.out.println("排序比较到：" + toLenth + " 位数");
            int total = 0;
            // 每次循环排序好1位数字
            for (maxLenth = bubbbe.length; maxLenth > toLenth; maxLenth--) {
                a = bubbbe[maxLenth - 1];
                b = bubbbe[maxLenth - 2];
                if (a < b) {
                    bubbbe[maxLenth - 1] = b;
                    bubbbe[maxLenth - 2] = a;
                }
                total++;
            }
            System.out.println("总共比较了：" + total + " 次");
            toLenth++;
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
