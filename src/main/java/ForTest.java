/**
 * Copyright (C), 2011-2018, 微贷网.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author binglin 2018/3/30.
 */
public class ForTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("12");
        list.add("23");
        list.add("24");
        list.add("25");
        list.add("26");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if ("24".equals(iterator.next())) {
                iterator.remove();
            }
        }
        for (String s : list) {
            if ("25".equals(s)) {
                list.add("we");
            }
            System.out.println(s);
        }
    }
}
