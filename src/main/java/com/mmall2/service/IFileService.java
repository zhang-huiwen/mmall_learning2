package com.mmall2.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zhw on 2020/2/24.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
