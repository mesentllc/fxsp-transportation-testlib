package com.fedex.smartpost.testers.transportation.dao;

import com.fedex.smartpost.common.io.classpath.ClassPathResourceUtil;
import com.fedex.smartpost.testers.transportation.model.PackageModel;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class PackageDaoImpl extends NamedParameterJdbcTemplate implements PackageDao {
	private static final Log log = LogFactory.getLog(PackageDao.class);
	private static final String RETRIEVE_RANDOM_PACKAGE = ClassPathResourceUtil.getString("dao/retrieveRandomPackage.sql");
	private static final String RETRIEVE_BY_PACKAGE_ID = ClassPathResourceUtil.getString("dao/retrievePackageByPackageId.sql");
	private static final String RETRIEVE_BY_CONTAINER_ID = ClassPathResourceUtil.getString("dao/retrievePackageByContainerId.sql");

	private static final RowMapper<PackageModel> PACKAGE_ROW_MAPPER = (rs, rowNum) -> {
		PackageModel model = new PackageModel();
		model.setPackageId(rs.getString("PACKAGE_ID"));
		model.setContainerId(rs.getString("CONTAINER_ID"));
		model.setDestinationSortCd(rs.getString("DESTINATION_SORT_CD"));
		model.setMailClass(rs.getString("MAIL_CLASS"));
		model.setMailSubclass(rs.getString("MAIL_SUBCLASS"));
		model.setDimX(rs.getBigDecimal("DIM_X"));
		model.setDimY(rs.getBigDecimal("DIM_Y"));
		model.setDimZ(rs.getBigDecimal("DIM_Z"));
		model.setWgt(rs.getBigDecimal("WGT"));
		model.setProcessingCtg(rs.getString("PROCESSING_CTG"));
		model.setUnivPkgNbr(rs.getInt("UNIV_PKG_NBR"));
		model.setTripStopSeq(rs.getInt("TRIP_STOP_SEQ"));
		model.setSortEventDt(rs.getDate("SORT_EVENT_DT"));
		model.setEventFxgLocationId(rs.getInt("EVENT_FXG_LOCATION_ID"));
		model.setBolTripSeq(rs.getInt("BOL_TRIP_SEQ"));
		model.setBolTripStopSeq(rs.getInt("BOL_TRIP_STOP_SEQ"));
		model.setBolContainerId(rs.getString("BOL_CONTAINER_ID"));
		model.setChanlAppId(rs.getString("CHANL_APP_ID"));
		model.setDestinationSortGroupNm(rs.getString("DESTINATION_SORT_GROUP_NM"));
		model.setFxgLocationId(rs.getInt("FXG_LOCATION_ID"));
		return model;
	};

	public PackageDaoImpl(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	public PackageModel retrieveRandom() {
		log.debug("Retrieving a random Package Object from the PACKAGE Table.");
		PackageModel model = query(RETRIEVE_RANDOM_PACKAGE, PACKAGE_ROW_MAPPER).get(0);
		log.debug("Package retrieved: " + ReflectionToStringBuilder.toString(model, ToStringStyle.MULTI_LINE_STYLE));
		return model;
	}

	@Override
	public PackageModel retrieveById(String packageId) {
		log.debug("Retrieving Package Object with Package Id:" + packageId + " from the PACKAGE Table.");
		PackageModel model = query(RETRIEVE_BY_PACKAGE_ID, new MapSqlParameterSource("pkgId", packageId), PACKAGE_ROW_MAPPER).get(0);
		log.debug("Package retrieved: " + ReflectionToStringBuilder.toString(model, ToStringStyle.MULTI_LINE_STYLE));
		return model;
	}

	@Override
	public List<PackageModel> retrieveByContainerId(String containerId) {
		log.debug("Retrieving Package Objects with Container Id:" + containerId + " from the PACKAGE Table.");
		List<PackageModel> models = query(RETRIEVE_BY_CONTAINER_ID, new MapSqlParameterSource("containerId", containerId), PACKAGE_ROW_MAPPER);
		log.debug(models.size() + " packages retrieved.");
		return models;
	}
}
