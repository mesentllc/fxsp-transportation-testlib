package com.fedex.smartpost.testers.transportation.model;

import java.math.BigDecimal;
import java.sql.Date;

public class PackageModel {
	private String packageId;
	private String containerId;
	private String destinationSortCd;
	private String mailClass;
	private String mailSubclass;
	private BigDecimal dimX;
	private BigDecimal dimY;
	private BigDecimal dimZ;
	private BigDecimal wgt;
	private String processingCtg;
	private Integer univPkgNbr;
	private Integer tripStopSeq;
	private Date sortEventDt;
	private Integer eventFxgLocationId;
	private Integer bolTripSeq;
	private Integer bolTripStopSeq;
	private String bolContainerId;
	private String chanlAppId;
	private String destinationSortGroupNm;
	private Integer fxgLocationId;

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getContainerId() {
		return containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

	public String getDestinationSortCd() {
		return destinationSortCd;
	}

	public void setDestinationSortCd(String destinationSortCd) {
		this.destinationSortCd = destinationSortCd;
	}

	public String getMailClass() {
		return mailClass;
	}

	public void setMailClass(String mailClass) {
		this.mailClass = mailClass;
	}

	public String getMailSubclass() {
		return mailSubclass;
	}

	public void setMailSubclass(String mailSubclass) {
		this.mailSubclass = mailSubclass;
	}

	public BigDecimal getDimX() {
		return dimX;
	}

	public void setDimX(BigDecimal dimX) {
		this.dimX = dimX;
	}

	public BigDecimal getDimY() {
		return dimY;
	}

	public void setDimY(BigDecimal dimY) {
		this.dimY = dimY;
	}

	public BigDecimal getDimZ() {
		return dimZ;
	}

	public void setDimZ(BigDecimal dimZ) {
		this.dimZ = dimZ;
	}

	public BigDecimal getWgt() {
		return wgt;
	}

	public void setWgt(BigDecimal wgt) {
		this.wgt = wgt;
	}

	public String getProcessingCtg() {
		return processingCtg;
	}

	public void setProcessingCtg(String processingCtg) {
		this.processingCtg = processingCtg;
	}

	public Integer getUnivPkgNbr() {
		return univPkgNbr;
	}

	public void setUnivPkgNbr(Integer univPkgNbr) {
		this.univPkgNbr = univPkgNbr;
	}

	public Integer getTripStopSeq() {
		return tripStopSeq;
	}

	public void setTripStopSeq(Integer tripStopSeq) {
		this.tripStopSeq = tripStopSeq;
	}

	public Date getSortEventDt() {
		return sortEventDt;
	}

	public void setSortEventDt(Date sortEventDt) {
		this.sortEventDt = sortEventDt;
	}

	public Integer getEventFxgLocationId() {
		return eventFxgLocationId;
	}

	public void setEventFxgLocationId(Integer eventFxgLocationId) {
		this.eventFxgLocationId = eventFxgLocationId;
	}

	public Integer getBolTripSeq() {
		return bolTripSeq;
	}

	public void setBolTripSeq(Integer bolTripSeq) {
		this.bolTripSeq = bolTripSeq;
	}

	public Integer getBolTripStopSeq() {
		return bolTripStopSeq;
	}

	public void setBolTripStopSeq(Integer bolTripStopSeq) {
		this.bolTripStopSeq = bolTripStopSeq;
	}

	public String getBolContainerId() {
		return bolContainerId;
	}

	public void setBolContainerId(String bolContainerId) {
		this.bolContainerId = bolContainerId;
	}

	public String getChanlAppId() {
		return chanlAppId;
	}

	public void setChanlAppId(String chanlAppId) {
		this.chanlAppId = chanlAppId;
	}

	public String getDestinationSortGroupNm() {
		return destinationSortGroupNm;
	}

	public void setDestinationSortGroupNm(String destinationSortGroupNm) {
		this.destinationSortGroupNm = destinationSortGroupNm;
	}

	public Integer getFxgLocationId() {
		return fxgLocationId;
	}

	public void setFxgLocationId(Integer fxgLocationId) {
		this.fxgLocationId = fxgLocationId;
	}
}
