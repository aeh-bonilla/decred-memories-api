-- CREATE TABLE "decred_condig_jwt_app" ----------------------------------------

DROP TABLE IF EXISTS `decred_condig_jwt_app` ;
CREATE TABLE `decred_condig_jwt_app` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `app_key` varchar(255) DEFAULT NULL,
  `app_secret` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `decred_condig_jwt_app__appkey_idx` (`app_key`)
)
CHARACTER SET = utf8
COLLATE = utf8_general_ci
ENGINE = InnoDB
AUTO_INCREMENT = 0;
