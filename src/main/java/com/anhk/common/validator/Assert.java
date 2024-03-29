package com.anhk.common.validator;

import com.anhk.common.exception.BusinessException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 *
 * @author Mark sunlightcs@gmail.com
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new BusinessException(400, message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new BusinessException(400, message);
        }
    }
}
