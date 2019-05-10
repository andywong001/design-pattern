package org.andywong.abstractfactory.v2;

/**
 * 参与记录表
 *
 * @author andywong
 * @date 2019-05-09 22:54
 */
public interface IJoinLog {
    void add();

    void get(String no);

    /**
     * mysql数据库的参与记录表
     *
     * @author andywong
     * @date 2019-05-09 22:54
     */
    class MysqlJoinLog implements IJoinLog {
        @Override
        public void add() {
            System.out.println("mysql添加参与记录成功");
        }

        @Override
        public void get(String no) {
            System.out.println("mysql查询会员" + no + "的参与记录成功");
        }
    }

    /**
     * oracle数据库的参与记录表
     *
     * @author andywong
     * @date 2019-05-09 22:54
     */
    class OracleJoinLog implements IJoinLog {
        @Override
        public void add() {
            System.out.println("oracle添加参与记录成功");
        }

        @Override
        public void get(String no) {
            System.out.println("oracle查询会员" + no + "的参与记录成功");
        }
    }

}
