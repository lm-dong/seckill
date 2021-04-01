package org.seckill.exception;

/**
 * 秒杀关闭异常
 * @author Dong
 * date: 2021/4/1 15:31<br/>
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
