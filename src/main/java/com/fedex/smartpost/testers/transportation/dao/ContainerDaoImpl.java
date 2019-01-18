package com.fedex.smartpost.testers.transportation.dao;

import com.fedex.smartpost.common.io.classpath.ClassPathResourceUtil;
import com.fedex.smartpost.testers.transportation.model.ContainerModel;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

public class ContainerDaoImpl extends NamedParameterJdbcTemplate implements ContainerDao {
	private static final Log log = LogFactory.getLog(ContainerDao.class);
	private static final String RETRIEVE_RANDOM_PACKAGE = ClassPathResourceUtil.getString("dao/retrieveRandomContainer.sql");
	private static final String RETRIEVE_BY_CONTAINER_ID = ClassPathResourceUtil.getString("dao/retrieveContainerByContainerId.sql");

	private RowMapper<ContainerModel> CONTAINER_ROW_MAPPER = (rs, rowNum) -> {
		ContainerModel model = new ContainerModel();
		model.setContainerId(rs.getString("CONTAINER_ID"));
		model.setContainerStatusCd(rs.getString("CONTAINER_STATUS_CD"));
		model.setContainerValidatedFlag(rs.getString("CONTAINER_VALIDATED_FLAG"));
		model.setContainerValidatedDt(rs.getDate("CONTAINER_VALIDATED_DT"));
		model.setDestinationSortGroupSeq(rs.getInt("DESTINATION_SORT_GROUP_SEQ"));
		model.setHubLocationSeq(rs.getInt("HUB_LOCATION_SEQ"));
		model.setProcessingCtg(rs.getString("PROCESSING_CTG"));
		model.setTripStopSeq(rs.getInt("TRIP_STOP_SEQ"));
		model.setContainerTypeCd(rs.getString("CONTAINER_TYPE_CD"));
		model.setChuteLocSeq(rs.getInt("CHUTE_LOC_SEQ"));
		model.setChuteNm(rs.getString("CHUTE_NM"));
		model.setBolPackageCnt(rs.getInt("BOL_PACKAGE_CNT"));
		model.setBolPackageWgt(rs.getBigDecimal("BOL_PACKAGE_WGT"));
		model.setCarrierSmsCntcSeq(rs.getInt("CARRIER_SMS_CNTC_SEQ"));
		model.setTmsLoadSeqId(rs.getInt("TMS_LOAD_SEQ_ID"));
		return model;
	};

	public ContainerDaoImpl(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	public ContainerModel retrieveRandom() {
		log.debug("Retrieving a random Container Object from the CONTAINER Table.");
		ContainerModel model = query(RETRIEVE_RANDOM_PACKAGE, CONTAINER_ROW_MAPPER).get(0);
		log.debug("Container retrieved: " + ReflectionToStringBuilder.toString(model, ToStringStyle.MULTI_LINE_STYLE));
		return model;
	}

	@Override
	public ContainerModel retrieveById(String containerId) {
		log.debug("Retrieving Container Object with Container Id:" + containerId + " from the CONTAINER Table.");
		ContainerModel model = query(RETRIEVE_BY_CONTAINER_ID, new MapSqlParameterSource("containerId", containerId), CONTAINER_ROW_MAPPER).get(0);
		log.debug("Container retrieved: " + ReflectionToStringBuilder.toString(model, ToStringStyle.MULTI_LINE_STYLE));
		return model;
	}
}
