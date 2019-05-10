package org.andywong.abstractfactory.v1;

/**
 * 会员基类
 *
 * @author andywong
 * @date 2019-05-09 22:54
 */
public interface IMember {
    void add();

    void get(String no);

    /**
     * mysql数据库的user
     *
     * @author andywong
     * @date 2019-05-09 22:54
     */
    class MysqlMember implements IMember {
        @Override
        public void add() {
            System.out.println("mysql添加会员成功");
        }

        @Override
        public void get(String no) {
            System.out.println("mysql查询会员" + no + "成功");
        }
    }


    /**
     * oracle数据库的user
     *
     * @author andywong
     * @date 2019-05-09 22:54
     */
    class OracleMember implements IMember {
        @Override
        public void add() {
            System.out.println("oracle添加会员成功");
        }

        @Override
        public void get(String no) {
            System.out.println("oracle查询会员" + no + "成功");
        }
    }

}
