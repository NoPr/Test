package 算法;
/*
    首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
    再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
    重复第二步，直到所有元素均排序完毕

    可以找最大，也可以找最小
 */
public class 选择排序 {
    public static void main(String[] args) {
        int [] array ={12,25,55,48,16,257,36,22,99};

        for (int end = array.length-1; end  >0 ; end--) {
            int maxIndex=0;         //默认最大值的索引为0 即array【0】=array【maxIndex】
            for (int begin = 0; begin <=end ; begin++) {
                if (array[begin]>=array[maxIndex]){

                    maxIndex = begin;
                }
            }
            int tmp = array[maxIndex];
            array[maxIndex]=array[end];
            array[end] = tmp;
            }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
