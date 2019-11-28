import org.junit.Test;

import java.util.ArrayList;

public class ArrayList_01 {
    /*
     * 关于ArrayList
     * */
    @Test
    public void test1() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.ensureCapacity(20);
        for (Object o : arrayList) {
            System.out.println(o);
        }

        // arrayList.trimToSize();//将数组的大小变为跟有多少元素就有多大
    }

    @Test
    public void test() {
        //冒泡排序
        int k[] = {10, 24, 70, 1, 8, 3};
        for (int i = 0; i < k.length - 1; i++) {
            for (int j = i + 1; j < k.length; j++) {
                if (k[i] > k[j]) {
                    //排序交换
                    int temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                }
            }
        }
//        输出结果
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
    }
}
