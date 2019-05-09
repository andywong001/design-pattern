package org.andywong.abstractfactory.v2;

import org.andywong.abstractfactory.v1.IJoinLog;
import org.andywong.abstractfactory.v1.IMember;

/**
 * 测试类
 *
 * @author andywong
 * @date 2019-05-09 23:02
 */
public class Main {
    public static void main(String[] args) {
        Factory driverFactory = new Factory();
        IMember member = driverFactory.connectionMember();
        member.add();
        member.get("1");

        IJoinLog joinLog = driverFactory.connectionJoinLog();
        joinLog.add();
        joinLog.get("2");
    }
}
