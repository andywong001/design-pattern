package org.andywong.abstractfactory.v2;

import org.andywong.abstractfactory.v1.IJoinLog;
import org.andywong.abstractfactory.v1.IMember;

/**
 * 简单工厂+抽象工厂
 *
 * @author andywong
 * @date 2019-05-09 23:19
 */
public class Factory {
    /**
     * 这个值从配置读取
     */
    private static  final  String db ="MYSQL";

    IMember connectionMember(){
        IMember member = null;
        switch (db){
            case "MYSQL":
                member = new IMember.MysqlMember();
                break;
            case "ORACLE":
                member = new IMember.OracleMember();
                break;
        }
        return member;
    }

    IJoinLog connectionJoinLog(){
        IJoinLog joinLog = null;
        switch (db){
            case "MYSQL":
                joinLog = new IJoinLog.MysqlJoinLog();
                break;
            case "ORACLE":
                joinLog = new IJoinLog.OracleJoinLog();
                break;
        }
        return joinLog;
    }
}
