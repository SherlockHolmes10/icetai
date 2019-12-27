package com.icetai.portal.master.service.impl;

import com.icetai.portal.master.domain.ReplaceMaster;
import com.icetai.portal.master.mapper.ReplaceMasterMapper;
import com.icetai.portal.master.service.ReplaceMasterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ReplaceMasterServiceImpl implements ReplaceMasterService {

    @Resource
    private ReplaceMasterMapper replaceMasterMapper;

    @Override
    public List<ReplaceMaster> selectchangingOne() {
        return replaceMasterMapper.selectchanging();
    }

    @Override
    public List<ReplaceMaster> selectcityOne(String location) {
        return replaceMasterMapper.selectcity(location);
    }

    @Override
    public List<ReplaceMaster> selectfansOne() {
        return replaceMasterMapper.selectfans();
    }
}
