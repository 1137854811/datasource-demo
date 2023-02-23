/*
 Navicat Premium Data Transfer

 Source Server         : mysql1
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : 172.17.0.1:3307
 Source Schema         : user1

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 17/02/2023 18:34:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'lisi', '2023-01-05 18:27:36');
INSERT INTO `user` VALUES (1626522228080377858, '333', '2023-02-17 08:00:00');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
