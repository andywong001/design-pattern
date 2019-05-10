package org.andywong.deepcopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
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
public class Form implements Cloneable, Serializable{

    /**
     * 表单名
     */
    private String name;

    /**
     * 表单创建时间
     */
    private Date createTime;

    /**
     * 表单配置
     */
    private FormConfig formConfig;

    @Override
    protected Object clone(){
        Object o = null;
        try {
            o = this.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

    private Form deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Form o = (Form)objectInputStream.readObject();

        return o;
    }
}
