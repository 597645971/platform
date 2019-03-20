/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2019-03-20 23:19:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for gx_company
-- ----------------------------
DROP TABLE IF EXISTS `gx_company`;
CREATE TABLE `gx_company` (
  `ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `CODE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `UPDATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of gx_company
-- ----------------------------
INSERT INTO `gx_company` VALUES ('1', 'SH', '上海', '1', '2019-03-19 22:26:55', '1', '2019-03-19 22:26:58');
INSERT INTO `gx_company` VALUES ('2', '2', '2', '1', '2019-03-19 22:27:44', '1', '2019-03-19 22:27:47');

-- ----------------------------
-- Table structure for gx_function
-- ----------------------------
DROP TABLE IF EXISTS `gx_function`;
CREATE TABLE `gx_function` (
  `ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `PARENT_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `URL` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `UPDATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of gx_function
-- ----------------------------

-- ----------------------------
-- Table structure for gx_function_role
-- ----------------------------
DROP TABLE IF EXISTS `gx_function_role`;
CREATE TABLE `gx_function_role` (
  `ROLE_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `FUNCTION_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `CREATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `UPDATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ROLE_ID`,`FUNCTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of gx_function_role
-- ----------------------------

-- ----------------------------
-- Table structure for gx_role
-- ----------------------------
DROP TABLE IF EXISTS `gx_role`;
CREATE TABLE `gx_role` (
  `ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `ROLE_NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ROLE_CODE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ROLE_DESC` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `COMPANY_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `UPDATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of gx_role
-- ----------------------------
INSERT INTO `gx_role` VALUES ('1', '系统管理员', null, '系统管理', '1', null, '0', '2019-03-17 23:16:29', null, null);

-- ----------------------------
-- Table structure for gx_user
-- ----------------------------
DROP TABLE IF EXISTS `gx_user`;
CREATE TABLE `gx_user` (
  `ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `USER_NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PASSWORD` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PERSON_NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EMAIL` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PHONE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADDRESS` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `USER_TYPE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `REG_TIME` datetime DEFAULT NULL,
  `COMAPNY_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS_ID` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `UPDATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_USER_COMPANY` (`COMAPNY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of gx_user
-- ----------------------------
INSERT INTO `gx_user` VALUES ('1', 'admin', '123456', '系统管理员', 'admin@163.com', null, null, null, '2019-03-17 23:15:14', '1', '0', '1', '2019-03-17 23:17:41', null, null);

-- ----------------------------
-- Table structure for gx_user_role
-- ----------------------------
DROP TABLE IF EXISTS `gx_user_role`;
CREATE TABLE `gx_user_role` (
  `USER_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `ROLE_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `CREATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  `UPDATE_ID` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`USER_ID`,`ROLE_ID`),
  KEY `USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of gx_user_role
-- ----------------------------
