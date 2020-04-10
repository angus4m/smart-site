package com.cqxyd.smartsite.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 升降机记录
 * @author Angus
 *
 */
public class LifterRecord {

	@JsonInclude(Include.NON_EMPTY)
	private String sourceId;
	private String registNo;
	private String serialNo;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recordTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date stopTime;
	private Double startHeight;
	private Double stopHeight;
	private Double speed;
	private String load;
	private String loadPercent;
	private int direction;
	private String driverId;
	private String driverLicence;
	private String driverName;
	private String status;
	private String message;
	public String getRegistNo() {
		return registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Date getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStopTime() {
		return stopTime;
	}

	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}

	public Double getStartHeight() {
		return startHeight;
	}

	public void setStartHeight(Double startHeight) {
		this.startHeight = startHeight;
	}

	public Double getStopHeight() {
		return stopHeight;
	}

	public void setStopHeight(Double stopHeight) {
		this.stopHeight = stopHeight;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public String getLoad() {
		return load;
	}

	public void setLoad(String load) {
		this.load = load;
	}

	public String getLoadPercent() {
		return loadPercent;
	}

	public void setLoadPercent(String loadPercent) {
		this.loadPercent = loadPercent;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getDriverLicence() {
		return driverLicence;
	}

	public void setDriverLicence(String driverLicence) {
		this.driverLicence = driverLicence;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
