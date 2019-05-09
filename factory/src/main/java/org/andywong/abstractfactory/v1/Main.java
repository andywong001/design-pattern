package org.andywong.abstractfactory.v1;

/**
 * 测试类
 *
 * @author andywong
 * @date 2019-05-09 23:02
 */
public class Main {
    public static void main(String[] args) {
        DriverFactory driverFactory = new DriverFactory.OracleDriverFactory();
        IMember member = driverFactory.connectionMember();
        member.add();
        member.get("1");

        IJoinLog joinLog = driverFactory.connectionJoinLog();
        joinLog.add();
        joinLog.get("2");
    }
}
