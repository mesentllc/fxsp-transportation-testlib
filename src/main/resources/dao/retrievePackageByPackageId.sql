select PACKAGE_ID, CONTAINER_ID, DESTINATION_SORT_CD, MAIL_CLASS, MAIL_SUBCLASS, DIM_X, DIM_Y, DIM_Z, WGT, PROCESSING_CTG,
       UNIV_PKG_NBR, ROW_VERSION_NBR, TRIP_STOP_SEQ, SORT_EVENT_DT, EVENT_FXG_LOCATION_ID, BOL_TRIP_SEQ, BOL_TRIP_STOP_SEQ,
       BOL_CONTAINER_ID, CHANL_APP_ID, DESTINATION_SORT_GROUP_NM, FXG_LOCATION_ID
from package where PACKAGE_ID = :pkgId