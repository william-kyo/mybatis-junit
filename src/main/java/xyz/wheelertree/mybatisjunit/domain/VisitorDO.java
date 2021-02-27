package xyz.wheelertree.mybatisjunit.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

@TableName("visitor")
public class VisitorDO {



    /**
     * 自增主键
     */
    @TableId
    private Long id;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;
    /**
     * 设备号
     */
    @TableField(value = "`device_code`")
    private String deviceCode;



}
