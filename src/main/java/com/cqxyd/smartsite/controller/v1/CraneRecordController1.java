package com.cqxyd.smartsite.controller.v1;

import com.cqxyd.smartsite.util.JSONResult;
import com.cqxyd.smartsite.version.ApiVersion;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@ApiVersion(1)
@RequestMapping(value = "{version}/api/crane")
@Api(value = "塔吊监控信息接口", tags = "塔吊监控信息接口")
public class CraneRecordController1 {

	@PostMapping(value = "record")
	@ApiOperation(value = "上传塔吊监控信息", notes = "测试接口(未实现)", produces = "application/json")
	public JSONResult<String> postElevator(@PathVariable("version") String version) {
		String result = "";
		try {
			result = DigestUtils.sha1Hex("jUY9ybWcM3DH_1526438202_Ny35o694RgXURrNQ7hCBbI4wyearCWxx7H4n_ RMSRvZBhviBiWlddbXil5EqVQhkHJ0WJUbH7");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSONResult.ok("目标结果：e914fed7db86318b6d8ce01a6f7cfe463c929f3d，实际结果："+result);
	}
	@GetMapping(value = "record")
	@ApiOperation(value = "上传塔吊监控信息", notes = "测试接口(未实现)", produces = "application/json")
	public JSONResult<String> getElevator(@PathVariable("version") String version) {

		return JSONResult.ok("getElevator");
	}
}
