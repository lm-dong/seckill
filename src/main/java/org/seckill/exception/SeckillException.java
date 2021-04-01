package org.seckill.exception;

/**
 * 秒杀业务相关异常
 * @author Dong
 * date: 2021/4/1 15:32<br/>
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
