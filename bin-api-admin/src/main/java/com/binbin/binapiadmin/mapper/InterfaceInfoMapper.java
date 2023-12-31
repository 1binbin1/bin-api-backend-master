package com.binbin.binapiadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.binbin.binapicommon.mode.entity.InterfaceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author hongxiaobin
 * @description 针对表【interface_info(接口信息)】的数据库操作Mapper
 * @createDate 2023-07-12 16:52:34
 * @Entity generator.domain.InterfaceInfo
 */
@Mapper
public interface InterfaceInfoMapper extends BaseMapper<InterfaceInfo> {

}




