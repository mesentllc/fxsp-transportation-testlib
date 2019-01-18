package com.fedex.smartpost.testers.transportation.model;

import java.math.BigDecimal;
import java.sql.Date;

public class ContainerModel {
	private String containerId;
	private String containerStatusCd;
	private String containerValidatedFlag;
	private Date containerValidatedDt;
	private Integer destinationSortGroupSeq;
	private Integer hubLocationSeq;
	private String processingCtg;
	private Integer tripStopSeq;
	private String containerTypeCd;
	private Integer chuteLocSeq;
	private String chuteNm;
	private Integer bolPackageCnt;
	private BigDecimal bolPackageWgt;
	private Integer carrierSmsCntcSeq;
	private Integer tmsLoadSeqId;

	public String getContainerId() {
		return containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

	public String getContainerStatusCd() {
		return containerStatusCd;
	}

	public void setContainerStatusCd(String containerStatusCd) {
		this.containerStatusCd = containerStatusCd;
	}

	public String getContainerValidatedFlag() {
		return containerValidatedFlag;
	}

	public void setContainerValidatedFlag(String containerValidatedFlag) {
		this.containerValidatedFlag = containerValidatedFlag;
	}

	public Date getContainerValidatedDt() {
		return containerValidatedDt;
	}

	public void setContainerValidatedDt(Date containerValidatedDt) {
		this.containerValidatedDt = containerValidatedDt;
	}

	public Integer getDestinationSortGroupSeq() {
		return destinationSortGroupSeq;
	}

	public void setDestinationSortGroupSeq(Integer destinationSortGroupSeq) {
		this.destinationSortGroupSeq = destinationSortGroupSeq;
	}

	public Integer getHubLocationSeq() {
		return hubLocationSeq;
	}

	public void setHubLocationSeq(Integer hubLocationSeq) {
		this.hubLocationSeq = hubLocationSeq;
	}

	public String getProcessingCtg() {
		return processingCtg;
	}

	public void setProcessingCtg(String processingCtg) {
		this.processingCtg = processingCtg;
	}

	public Integer getTripStopSeq() {
		return tripStopSeq;
	}

	public void setTripStopSeq(Integer tripStopSeq) {
		this.tripStopSeq = tripStopSeq;
	}

	public String getContainerTypeCd() {
		return containerTypeCd;
	}

	public void setContainerTypeCd(String containerTypeCd) {
		this.containerTypeCd = containerTypeCd;
	}

	public Integer getChuteLocSeq() {
		return chuteLocSeq;
	}

	public void setChuteLocSeq(Integer chuteLocSeq) {
		this.chuteLocSeq = chuteLocSeq;
	}

	public String getChuteNm() {
		return chuteNm;
	}

	public void setChuteNm(String chuteNm) {
		this.chuteNm = chuteNm;
	}

	public Integer getBolPackageCnt() {
		return bolPackageCnt;
	}

	public void setBolPackageCnt(Integer bolPackageCnt) {
		this.bolPackageCnt = bolPackageCnt;
	}

	public BigDecimal getBolPackageWgt() {
		return bolPackageWgt;
	}

	public void setBolPackageWgt(BigDecimal bolPackageWgt) {
		this.bolPackageWgt = bolPackageWgt;
	}

	public Integer getCarrierSmsCntcSeq() {
		return carrierSmsCntcSeq;
	}

	public void setCarrierSmsCntcSeq(Integer carrierSmsCntcSeq) {
		this.carrierSmsCntcSeq = carrierSmsCntcSeq;
	}

	public Integer getTmsLoadSeqId() {
		return tmsLoadSeqId;
	}

	public void setTmsLoadSeqId(Integer tmsLoadSeqId) {
		this.tmsLoadSeqId = tmsLoadSeqId;
	}
}
