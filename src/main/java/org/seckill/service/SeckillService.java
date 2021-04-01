package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

import java.rmi.RemoteException;
import java.util.List;

/**
 * @author Dong
 * date: 2021/4/1 15:04<br/>
 */

//业务接口:站在使用者(程序员)的角度设计接口
//  三个方面:
//  1.方法定义粒度，方法定义的要非常清楚
//  2.参数，要越简练越好
//  3.返回类型(return 类型一定要友好/或者return异常，我们允许的异常)
//

public interface SeckillService {
    /**
     * 查询所有秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 在秒杀开启时输出秒杀接口的地址，否则输出系统时间和秒杀时间
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
        throws SeckillException, RemoteException, SeckillCloseException;
}
