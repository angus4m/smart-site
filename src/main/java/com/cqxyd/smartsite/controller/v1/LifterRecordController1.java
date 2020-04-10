package com.cqxyd.smartsite.controller.v1;

import java.util.ArrayList;
import java.util.List;

import com.cqxyd.smartsite.pojo.CraneRecord;
import com.cqxyd.smartsite.util.JSONResult;
import com.cqxyd.smartsite.version.ApiVersion;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@ApiVersion(1)
@RequestMapping(value = "{version}/api/lifter")
@Api(value = "升降机信息接口", tags = "升降机信息接口")
public class LifterRecordController1 {

    @PostMapping(value = "record")
    @ApiOperation(value = "上传升降机信息", notes = "测试接口(未实现)", produces = "application/json")
    public JSONResult<String> postElevator(@PathVariable("version") String version) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            List<CraneRecord> list = new ArrayList<CraneRecord>();
            list.add(new CraneRecord());
            list.add(new CraneRecord());
            String strCraneRecord = mapper.writeValueAsString(list);
            return JSONResult.ok(strCraneRecord);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return JSONResult.ok("上传升降机信息(版本1)成功");
    }

}
