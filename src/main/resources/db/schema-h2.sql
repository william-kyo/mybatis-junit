DROP TABLE IF EXISTS `visitor`;

CREATE TABLE visitor (
  id bigint(32) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  created_time datetime NOT NULL COMMENT '创建时间',
  updated_time datetime NOT NULL COMMENT '更新时间',
  device_code varchar(32) NOT NULL COMMENT '设备号'
) COMMENT='游客表';