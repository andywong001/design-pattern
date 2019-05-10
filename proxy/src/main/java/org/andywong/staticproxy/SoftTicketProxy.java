package org.andywong.staticproxy;

/**
 * 第三方购票平台
 *
 * @author andywong
 * @date 2019-05-10 10:32
 */
public class SoftTicketProxy implements Ticket {
    /**
     * 第三方是需要授权的
     */
    private TrainStation trainStation;

    @Override
    public void buyTicket() {
        if (null == trainStation) {
            trainStation = new TrainStation();
        }
        trainStation.buyTicket();
        System.out.println("第三方平台购票成功");
    }
}
