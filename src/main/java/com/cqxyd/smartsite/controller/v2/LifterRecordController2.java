package com.cqxyd.smartsite.controller.v2;
import com.cqxyd.smartsite.util.JSONResult;
import com.cqxyd.smartsite.version.ApiVersion;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@ApiVersion(2)
@RequestMapping(value = "{version}/api/lifter")
@Api(value = "升降机接口信息", tags = "升降机信息接口")
public class LifterRecordController2 {

	@PostMapping(value = "record")
	@ApiOperation(value = "上传升降机信息", notes = "测试接口(未实现)", produces = "application/json")
	public JSONResult<String> postElevator(@PathVariable("version") String version) {
		return JSONResult.ok("上传升降机信息(版本2)成功");
	}
	
}
