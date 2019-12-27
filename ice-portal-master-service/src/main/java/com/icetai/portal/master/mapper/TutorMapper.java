package com.icetai.portal.master.mapper;

import com.icetai.portal.master.domain.Tutor;

import java.util.List;

public interface TutorMapper {
//    int deleteByPrimaryKey(String uid);
//
//    int insert(Tutor record);
//
//    int insertSelective(Tutor record);
//
//    int updateByPrimaryKeySelective(Tutor record);

//    List<Tutor> getAll();


    void updateByPrimaryKeySelective(Tutor tutor);

    List<Tutor> selectByPrimaryKey(String uid);
}