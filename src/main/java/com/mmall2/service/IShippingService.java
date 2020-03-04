package com.mmall2.service;

import com.github.pagehelper.PageInfo;
import com.mmall2.common.ServerResponse;
import com.mmall2.pojo.Shipping;

/**
 * Created by zhw on 2020/2/26.
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId,Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}
