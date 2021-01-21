package 算法;
/*
    算法描述:比较两个相邻的元素,如果升序的话,前面的比后面的大,就交换,这样一轮下来,
    就会找到这组数据中最大的元素,然后抛开这个元素继续重复上述步骤.直到排完为止.
    冒泡排序的最好时间复杂度为O(n),最坏时间复杂度为O(n²),平均时间复杂度为O(n²),空间复杂度为O(1),它是一种稳定的排序算法。
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int [] array ={12,25,55,48,16,257,36,22,99};

//        for (int end = array.length-1; end >0 ; end--) {
//            boolean sorted = true;      //设置一个节点，默认排序正确
//            //完全提前有序，复杂度升高，代码运行时间就会上升。
//            for (int begin = 1; begin <=end ; begin++) {
//                if (array[begin]<array[begin-1]){
//                    int tmp =array[begin];
//                    array[begin]=array[begin-1];
//                    array[begin-1]=tmp;
//
//                    sorted =false;
//                }
//            }
//            if (sorted) break; //如果排序为true，则break
//        }
//        for (int i = 0; i <array.length ; i++) {
//            System.out.println(array[i]+"-");
//        }
        //如果尾部已经局部有序，可以记录最后一次交换的位置，减少比较次数
        //如果完全有序，不会进入循环
        for (int end = array.length-1; end >0 ; end--) {
            int sortedIndex =1;
            //sortindex的初始值在数组完全有序的时候有用。
            //设置一个节点，默认排序正确
            for (int begin = 1; begin <=end ; begin++) {
                if (array[begin]<array[begin-1]){
                    int tmp =array[begin];
                    array[begin]=array[begin-1];
                    array[begin-1]=tmp;

                    sortedIndex =begin;     //最后一次比较位置
                }
            }
            end =sortedIndex;       //将最后一次比较位置赋值给end，
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]+"-");
        }
    }
}
