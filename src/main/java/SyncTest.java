/**
 * Copyright (C), 2011-2018, 微贷网.
 */

/**
 * @author binglin 2018/3/29.
 */
public class SyncTest {
    public static void main(String[] args) {
        Integer i = 23;
        synchronized (i){
            i++;
        }
    }
}
