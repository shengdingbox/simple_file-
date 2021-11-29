package com.zhouzifei.mediaTool.modules.file.service;

import com.zhouzifei.mediaTool.modules.file.entity.RPanFile;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 实体文件业务处理接口
 * Created by RubinChu on 2021/1/22 下午 4:11
 */
public interface IFileService {

    RPanFile save(MultipartFile file, Long userId, String md5, Long size,String storageType);

    RPanFile saveWithChunk(MultipartFile file, Long userId, String md5, Integer chunks, Integer chunk, Long size, String name,String storageType);

    void delete(String fileIds,String storageType);

    RPanFile getFileDetail(Long realFileId,String storageType);

    List<RPanFile> getFileListByMd5(String md5,String storageType);

}
