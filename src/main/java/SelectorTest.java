/**
 * Copyright (C), 2011-2018, 微贷网.
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author binglin 2018/3/23.
 */
public class SelectorTest {

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(1234));
        serverSocketChannel.configureBlocking(false);

        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true){
            int select = selector.select();
            if (select <= 0) {
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey next = iterator.next();
                if (next.isAcceptable()) {
                    // 新连接
                    SelectableChannel channel = serverSocketChannel.accept();
                    channel.configureBlocking(false);
                    channel.register(selector, SelectionKey.OP_READ);
                    iterator.remove();
                } else if (next.isReadable()) {
                    // TODO: 2018/3/23 read
                    System.out.println("read");
                } else if (next.isWritable()) {
                    // TODO: 2018/3/23 write
                    System.out.println("write");
                } else if (next.isConnectable()) {
                    // log
                    System.out.println("connect");
                }

            }
        }
    }
}
