package org.andywong.myproxy;

/**
 * 测试类
 *
 * @author andywong
 * @date 2019-05-10 10:35
 */
public class Main {
    public static void main(String[] args) {
        //被代理类
        Ticket ticket = new TrainStation();
        Ticket ticketProxy = (Ticket) new MyInvocationHandler().getInstance(ticket);
        ticketProxy.buyTicket();

    }
}
