package com.icetai.portal.master.exception;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ResultInfo {

  private int code;
  private String msg;
  private Object data;

  private ResultInfo() {}

    /**
     * 返回空内容
     * @return
     */
    public static ResultInfo of() {
      ResultInfo info = new ResultInfo();
      info.setCode(200);
      info.setMsg("成功");
      return info;
    }
  public static ResultInfo of(Map map) {
    ResultInfo info = new ResultInfo();
    info.setCode(200);
    info.setMsg("成功");
    info.setData(map);
    return info;
  }
  public static ResultInfo of(List list) {
    ResultInfo info = new ResultInfo();
    info.setCode(200);
    info.setMsg("成功");
    info.setData(list);
    return info;
  }
}
