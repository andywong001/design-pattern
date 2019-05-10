package org.andywong.abstractfactory.v1;

/**
 * 数据库
 */
public interface DriverFactory {
    IMember connectionMember();

    IJoinLog connectionJoinLog();

    /**
     * mysql数据库
     *
     * @author andywong
     * @date 2019-05-09 22:59
     */
    class MysqlDriverFactory implements DriverFactory {
        @Override
        public IMember connectionMember() {
            return new IMember.MysqlMember();
        }

        @Override
        public IJoinLog connectionJoinLog() {
            return new IJoinLog.MysqlJoinLog();
        }
    }

    /**
     * oracle数据库
     *
     * @author andywong
     * @date 2019-05-09 23:00
     */
    class OracleDriverFactory implements DriverFactory {
        @Override
        public IMember connectionMember() {
            return new IMember.OracleMember();
        }

        @Override
        public IJoinLog connectionJoinLog() {
            return new IJoinLog.OracleJoinLog();
        }
    }

}
