package com.mmall2.service;

import com.mmall2.common.ServerResponse;
import com.mmall2.pojo.Category;

import java.util.List;

/**
 * Created by zhw on 2020/2/21.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
