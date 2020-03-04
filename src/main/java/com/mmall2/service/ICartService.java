package com.mmall2.service;

import com.mmall2.common.ServerResponse;
import com.mmall2.vo.CartVo;

/**
 * Created by zhw on 2020/2/25.
 */
public interface ICartService {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo> update(Integer userId,Integer productId,Integer count);
    ServerResponse<CartVo> deleteProduct(Integer userId,String productIds);
    ServerResponse<CartVo> list (Integer userId);
    ServerResponse<CartVo> selectOrUnSelect (Integer userId,Integer productId,Integer checked);
    ServerResponse<Integer> getCartProductCount(Integer userId);

}
