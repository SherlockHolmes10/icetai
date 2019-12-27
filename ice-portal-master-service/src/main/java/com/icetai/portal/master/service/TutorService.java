package com.icetai.portal.master.service;

import com.icetai.portal.master.domain.Tutor;

import java.util.List;

public interface TutorService {


  void updateOne(Tutor tutor);

  List<Tutor> selectByKey(String uid);
}
