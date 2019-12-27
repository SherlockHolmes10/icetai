package com.icetai.portal.master.Controller;

import com.icetai.portal.master.domain.Tutor;
import com.icetai.portal.master.exception.ResultInfo;
import com.icetai.portal.master.service.TutorService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/mentorCenter")
public class TutorController extends BaseController<Tutor> {

    @Resource
    private TutorService TutorService;

    // 查
//    @ApiOperation("查询导师")
//    @ApiResponses(
//            value = {
//                    @ApiResponse(code = 200, message = "成功"),
//                    @ApiResponse(code = 0, message = "失败"),
//                    @ApiResponse(code = 1, response = ResultInfo.class, message = "缺少参数")
//            })
//    @RequestMapping(method = RequestMethod.GET)
//    public @ResponseBody
//    List<Tutor> getAllTutor() {
//        return TutorService.listAllTutors();
//
//    }

    // 更 / 或其它
    @ApiOperation("导师编辑")
    @RequestMapping(method = RequestMethod.POST)
    public ResultInfo updateOne(@RequestBody Tutor tutor) {
        TutorService.updateOne(tutor);
        return ResultInfo.of();
    }

    @ApiOperation("查询用户1")
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ResultInfo selectByKey(
            @ApiParam(value = "导师ID", allowEmptyValue = true) @RequestParam(name = "uid") String uid) {
        List<Tutor> list = TutorService.selectByKey(uid);
        Map map = new HashMap();
        map.put("list",list);

        return  ResultInfo.of(map);
    }
    @GetMapping("/getmaster")
    public ResultInfo getmaster(){
        RestTemplate restTemplate = new RestTemplate();
        List list = restTemplate.getForObject("http://localhost:9522/master",List.class) ;
        return ResultInfo.of(list);
    }
}
