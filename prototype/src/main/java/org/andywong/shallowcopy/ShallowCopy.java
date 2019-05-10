package org.andywong.shallowcopy;

import java.util.Date;

/**
 * 浅拷贝(只能拷贝对象的非引用类型属性)
 *
 * @author andywong
 * @date 2019-05-10 14:23
 */
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Form form = new Form("表单1", new Date());
        Object clone = form.clone();
        System.out.println(form == clone);
    }
}
