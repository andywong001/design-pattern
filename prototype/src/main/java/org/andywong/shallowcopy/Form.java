package org.andywong.shallowcopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 表单数据
 *
 * @author andywong
 * @date 2019-05-10 14:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Form implements Cloneable {

    /**
     * 表单名
     */
    private String name;

    /**
     * 表单创建时间
     */
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
