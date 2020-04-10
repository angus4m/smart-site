package com.cqxyd.smartsite.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * 心跳
 * @author Angus
 *
 */
public class Heartbeat {
	private String registNo;
	private String serialNo;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date sendTime;
	public String getRegistNo() {
		return registNo;
	}
	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
}
