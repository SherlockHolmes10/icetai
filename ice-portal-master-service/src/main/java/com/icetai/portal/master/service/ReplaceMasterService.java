package com.icetai.portal.master.service;

import com.icetai.portal.master.domain.ReplaceMaster;

import java.util.List;

public interface ReplaceMasterService {

    List<ReplaceMaster> selectchangingOne();

    List<ReplaceMaster> selectcityOne(String location);

    List<ReplaceMaster> selectfansOne();
}
