package com.mmall2.service;

import com.github.pagehelper.PageInfo;
import com.mmall2.common.ServerResponse;
import com.mmall2.vo.OrderVo;

import java.util.Map;

/**
 * Created by zhw on 2020/3/3.
 */
public interface IOrderService {
    public ServerResponse pay(Long orderNo, Integer userId, String path);
    public ServerResponse aliCallback(Map<String,String> params);
    ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);
    ServerResponse createOrder(Integer userId, Integer shippingId);
    ServerResponse<String> cancel(Integer userId,Long orderNo);
    ServerResponse getOrderCartProduct(Integer userId);
    ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);
    ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);
    ServerResponse<PageInfo> manageList(int pageNum,int pageSize);
    ServerResponse<OrderVo> manageDetail(Long orderNo);
    ServerResponse<PageInfo> manageSearch(Long orderNo,int pageNum,int pageSize);
    ServerResponse<String> manageSendGoods(Long orderNo);
}
