package org.andywong.deepcopy;

import java.util.Date;

/**
 * 深拷贝
 *
 * @author andywong
 * @date 2019-05-10 14:23
 */
public class DeepCopy {
    public static void main(String[] args) {
        Form form = new Form("深度拷贝",new Date(),
                FormConfig.builder().img("这个是图片")
                .maxSize(3).build()
                );

        Form clone = (Form)form.clone();

        System.out.println(clone == form);
    }
}
