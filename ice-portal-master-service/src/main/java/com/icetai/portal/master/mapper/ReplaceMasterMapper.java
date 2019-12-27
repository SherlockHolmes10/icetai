package com.icetai.portal.master.mapper;

import com.icetai.portal.master.domain.ReplaceMaster;

import java.util.List;

public interface ReplaceMasterMapper {
//    int deleteByPrimaryKey(String mid);
//
//    int insert(ReplaceMaster record);
//
//    int insertSelective(ReplaceMaster record);
//
//    ReplaceMaster selectByPrimaryKey(String mid);
//
//    int updateByPrimaryKeySelective(ReplaceMaster record);
//
//    int updateByPrimaryKey(ReplaceMaster record);

    List<ReplaceMaster> selectchanging();

    List<ReplaceMaster> selectcity(String location);

    List<ReplaceMaster> selectfans();
}