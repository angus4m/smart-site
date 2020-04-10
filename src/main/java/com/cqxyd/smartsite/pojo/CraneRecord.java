package com.cqxyd.smartsite.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 塔吊记录
 * 
 * @author Angus
 *
 */
public class CraneRecord {

	@JsonInclude(Include.NON_EMPTY)
	private String sourceId;
	private String registNo;

	private String serialNo;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recordTime;

	private Double angle;
	private Double radius;
	private Double height;
	private Double load;
	private Double safeLoad;
	private Double percent;

	private Double windSpeed;
	private Double obliquity;
	private Double dirAngle;

	private int fall;
	private String status;
	private String message;

	public Double getAngle() {
		return angle;
	}

	public void setAngle(Double angle) {
		this.angle = angle;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getLoad() {
		return load;
	}

	public void setLoad(Double load) {
		this.load = load;
	}

	public Double getSafeLoad() {
		return safeLoad;
	}

	public void setSafeLoad(Double safeLoad) {
		this.safeLoad = safeLoad;
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Double getObliquity() {
		return obliquity;
	}

	public void setObliquity(Double obliquity) {
		this.obliquity = obliquity;
	}

	public Double getDirAngle() {
		return dirAngle;
	}

	public void setDirAngle(Double dirAngle) {
		this.dirAngle = dirAngle;
	}

	public int getFall() {
		return fall;
	}

	public void setFall(int fall) {
		this.fall = fall;
	}

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
