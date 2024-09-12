package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 社区人员出入
 *
 * @author 
 * @email
 */
@TableName("shequchuru")
public class ShequchuruEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShequchuruEntity() {

	}

	public ShequchuruEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 住户
     */
    @TableField(value = "zhuhu_id")

    private Integer zhuhuId;


    /**
     * 出入类型
     */
    @TableField(value = "shequchuru_types")

    private Integer shequchuruTypes;


    /**
     * 体温
     */
    @TableField(value = "shequchuru_tiwen")

    private Double shequchuruTiwen;


    /**
     * 从哪来
     */
    @TableField(value = "lai_address")

    private String laiAddress;


    /**
     * 到哪去
     */
    @TableField(value = "qu_address")

    private String quAddress;


    /**
     * 备注
     */
    @TableField(value = "shequchuru_content")

    private String shequchuruContent;


    /**
     * 登记时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：住户
	 */
    public Integer getZhuhuId() {
        return zhuhuId;
    }


    /**
	 * 获取：住户
	 */

    public void setZhuhuId(Integer zhuhuId) {
        this.zhuhuId = zhuhuId;
    }
    /**
	 * 设置：出入类型
	 */
    public Integer getShequchuruTypes() {
        return shequchuruTypes;
    }


    /**
	 * 获取：出入类型
	 */

    public void setShequchuruTypes(Integer shequchuruTypes) {
        this.shequchuruTypes = shequchuruTypes;
    }
    /**
	 * 设置：体温
	 */
    public Double getShequchuruTiwen() {
        return shequchuruTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setShequchuruTiwen(Double shequchuruTiwen) {
        this.shequchuruTiwen = shequchuruTiwen;
    }
    /**
	 * 设置：从哪来
	 */
    public String getLaiAddress() {
        return laiAddress;
    }


    /**
	 * 获取：从哪来
	 */

    public void setLaiAddress(String laiAddress) {
        this.laiAddress = laiAddress;
    }
    /**
	 * 设置：到哪去
	 */
    public String getQuAddress() {
        return quAddress;
    }


    /**
	 * 获取：到哪去
	 */

    public void setQuAddress(String quAddress) {
        this.quAddress = quAddress;
    }
    /**
	 * 设置：备注
	 */
    public String getShequchuruContent() {
        return shequchuruContent;
    }


    /**
	 * 获取：备注
	 */

    public void setShequchuruContent(String shequchuruContent) {
        this.shequchuruContent = shequchuruContent;
    }
    /**
	 * 设置：登记时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：登记时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shequchuru{" +
            "id=" + id +
            ", zhuhuId=" + zhuhuId +
            ", shequchuruTypes=" + shequchuruTypes +
            ", shequchuruTiwen=" + shequchuruTiwen +
            ", laiAddress=" + laiAddress +
            ", quAddress=" + quAddress +
            ", shequchuruContent=" + shequchuruContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
