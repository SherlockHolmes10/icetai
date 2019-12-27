package com.icetai.portal.master.Controller;

import com.icetai.portal.master.domain.ReplaceMaster;
import com.icetai.portal.master.exception.ResultInfo;
import com.icetai.portal.master.service.ReplaceMasterService;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/replace")
public class ReplaceMasterController extends BaseController<ReplaceMaster>{

    @Resource
    private ReplaceMasterService replaceMasterService;

    @ApiParam("更换导师列表")
    @GetMapping
    public @ResponseBody ResultInfo selectchanging(){
        List list = replaceMasterService.selectchangingOne();
        return ResultInfo.of(list);
    }

    @ApiParam("城市筛选")
    @GetMapping("/city")
    public @ResponseBody ResultInfo selectcity(
            @ApiParam(value = "城市", allowEmptyValue = true) @RequestParam(name = "location") String location){
        List list = replaceMasterService.selectcityOne(location);
        return ResultInfo.of(list);
    }

    @ApiParam("人气导师")
    @GetMapping("/fans")
    public @ResponseBody ResultInfo selectfans(){
        List list = replaceMasterService.selectfansOne();
        return ResultInfo.of(list);
    }
}
