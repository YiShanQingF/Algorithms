package com.qs.sort;

import com.qs.common.utils.SortUtils;

/**
 * @ClassName com.qs.sort.HeapSort
 * @Package com.qs.sort
 * @author: QS
 * @Date: 2019/3/27 23:04
 * @Description 堆排序
 */
public class HeapSort {


    public static void sort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }

        int heapSize = arr.length;
        while (heapSize > 0){
            // 头结点，和尾节点交换，并让 size-1
            SortUtils.swap(arr, 0, --heapSize);
            // 进行完成，也就生产大根堆
            heapify(arr, 0, heapSize);
            
        }
        
    }

    /**
     * 堆的头尾交换（从上至下）
     * @param arr
     * @param index
     * @param size
     */
    private static void heapify(int[] arr, int index, int size) {
        // 获取当前index的左子节点
        int left = index * 2 + 1;
        
        while (left < size){
            
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            
            largest = arr[largest] > arr [index] ? largest : index;
            
            if (largest == index){
                break;
            }
            
            SortUtils.swap(arr, index, largest);
            
            index = largest;
            
            left = index * 2 +1;
        }
        
    }

    /**
     * 堆生产的插入过程（从下至上），可以认为把大的换到上面去
     * 每次插入一个数跟他的父节点比较大小
     * 如果子节点比父节点大那么交换，交换完以后，子节点下边变换成了父节点那个位置，然后继续（index - 1） / 2 向上跟父节点比，直到比父节点小的位置. stop
     * 
     * 
     * @param arr
     * @param index
     */
    private static void heapInsert(int[] arr, int index) {
        
        int temp = (index - 1) / 2;
        
        // 如果当前节点比父节点大
        while( arr[index] > arr[(index - 1) / 2]){
            // 则进行位置交换
            SortUtils.swap(arr, index, (index - 1) / 2);
            // 交换后把子节点下标改为父节点的index，然后以这个节点继续向上比较，直到比父节点小
            index = (index - 1) / 2;
        }
    }

    /**
     * 特点是利用堆的数据结构进行排序
     * 将所有的数字存储在堆中，按降序构建堆
     * 然后逐个取出储存在堆中的数字
     * 降堆的一个特性是数据将被从大到小取出，将取出来的数组按相反的顺序排列，数字将完成排序
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arrays = {7, 4, 1, 0, 6, 5, 3, 2, 9, 8};
        
        sort(arrays);

        SortUtils.showArrays(arrays);
    }
}
