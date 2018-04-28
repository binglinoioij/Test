/**
 * Copyright (C), 2011-2018, 微贷网.
 */

import java.util.concurrent.locks.LockSupport;

/**
 * @author binglin 2018/3/18.
 */
public class LockSupportTest {

    public static void main(String[] args) {
        LockSupport.unpark(Thread.currentThread());
        LockSupport.unpark(Thread.currentThread());
        LockSupport.unpark(Thread.currentThread());

        System.out.println("1");
        LockSupport.park();
        System.out.println("2");
        LockSupport.park();
        System.out.println("3");

    }
}
