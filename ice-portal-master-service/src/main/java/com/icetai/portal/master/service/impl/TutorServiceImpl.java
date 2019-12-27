package com.icetai.portal.master.service.impl;

import com.icetai.portal.master.domain.Tutor;
import com.icetai.portal.master.mapper.TutorMapper;
import com.icetai.portal.master.service.TutorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class TutorServiceImpl implements TutorService {

    @Resource
    private TutorMapper tutorMapper;

//    @Override
//    public List<Tutor> listAllTutors() {
//        return tutorMapper.getAll();
//    }

    @Override
    public void updateOne(Tutor tutor) { tutorMapper.updateByPrimaryKeySelective(tutor);
    }

    @Override
    public List<Tutor> selectByKey(String uid) {
        return tutorMapper.selectByPrimaryKey(uid);
    }

}
