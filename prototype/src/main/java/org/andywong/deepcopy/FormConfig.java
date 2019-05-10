package org.andywong.deepcopy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 表单配置
 *
 * @author andywong
 * @date 2019-05-10 14:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FormConfig implements Serializable {

    /**
     * 背景颜色
     */
    private String img;

    /**
     * 表单题目大小限制
     */
    private int maxSize;
}
