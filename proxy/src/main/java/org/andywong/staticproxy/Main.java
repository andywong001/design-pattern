package org.andywong.staticproxy;

/**
 * 测试类
 *
 * @author andywong
 * @date 2019-05-10 10:35
 */
public class Main {
    public static void main(String[] args) {
        Ticket ticket = new SoftTicketProxy();
        ticket.buyTicket();
    }
}
