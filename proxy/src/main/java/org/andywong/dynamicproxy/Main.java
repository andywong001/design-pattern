package org.andywong.dynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试类
 *
 * @author andywong
 * @date 2019-05-10 10:35
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //被代理类
        Ticket ticket = new TrainStation();
        Ticket ticketProxy = (Ticket) new MyInvocationHandler().getInstance(ticket);
        ticketProxy.buyTicket();

        byte[] byteProxy = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Ticket.class});
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/xing.huang/temp/$Proxy0.class");
        fileOutputStream.write(byteProxy);
        fileOutputStream.close();

    }
}
