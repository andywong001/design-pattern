package org.andywong.staticproxy;

/**
 * 火车站
 *
 * @author andywong
 * @date 2019-05-10 10:33
 */
public class TrainStation implements Ticket {
    @Override
    public void buyTicket() {
        System.out.println("火车站购票成功");
    }
}
