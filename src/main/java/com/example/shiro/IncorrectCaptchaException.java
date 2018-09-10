package com.example.shiro;

import org.apache.shiro.authc.AuthenticationException;

/**
 * Created with IntelliJ IDEA.
 * packageName  : com.xuezhijian.shiro
 * Company      : 彼得科技
 * User         : zj
 * Date         : 17/2/13
 * Time         : 下午11:31
 * Description  : 验证码错误异常
 */
public class IncorrectCaptchaException extends AuthenticationException {

    private static final long serialVersionUID = 1L;

    public IncorrectCaptchaException() {
        super();
    }

    public IncorrectCaptchaException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectCaptchaException(String message) {
        super(message);
    }

    public IncorrectCaptchaException(Throwable cause) {
        super(cause);
    }

}
