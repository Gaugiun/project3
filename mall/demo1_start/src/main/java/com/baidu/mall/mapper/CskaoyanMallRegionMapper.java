package com.baidu.mall.mapper;

import com.baidu.mall.bean.CskaoyanMallRegion;

public interface CskaoyanMallRegionMapper {
    int deleteByPrimaryKey(Integer id);

    CskaoyanMallRegion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CskaoyanMallRegion record);

    int updateByPrimaryKey(CskaoyanMallRegion record);
}