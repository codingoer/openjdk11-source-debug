package top.codingoer.collection;

import java.util.ArrayList;

/**
 * Description：
 *
 * @author Lionel
 * @date Created in 2022/5/11 01:34
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add("ad1");

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
