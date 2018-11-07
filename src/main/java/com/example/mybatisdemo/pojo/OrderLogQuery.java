/*
 * Powered By rkylin-code-generator
 * Web Site: http://www.chanjetpay.com
 * Since 2014 - 2018
 */

package com.example.mybatisdemo.pojo;

import java.io.Serializable;

/**
 * OrderLogQuery
 * @author code-generator
 *
 */
public class OrderLogQuery implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String orderNo;
	private String opType;
	private String opResult;
	private Integer auditUserId;
	private Object extend;
	private String remark;
	private java.util.Date createTime;
	private java.util.Date updateTime;

	/**
	 * 订单no
	 * @param orderNo
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	/**
	 * 订单no
	 * @return
	 */
	public String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * 操作类型
	 * @param opType
	 */
	public void setOpType(String opType) {
		this.opType = opType;
	}
	
	/**
	 * 操作类型
	 * @return
	 */
	public String getOpType() {
		return this.opType;
	}
	/**
	 * 操作结果
	 * @param opResult
	 */
	public void setOpResult(String opResult) {
		this.opResult = opResult;
	}
	
	/**
	 * 操作结果
	 * @return
	 */
	public String getOpResult() {
		return this.opResult;
	}
	/**
	 * 操作用户
	 * @param auditUserId
	 */
	public void setAuditUserId(Integer auditUserId) {
		this.auditUserId = auditUserId;
	}
	
	/**
	 * 操作用户
	 * @return
	 */
	public Integer getAuditUserId() {
		return this.auditUserId;
	}
	/**
	 * 扩展
	 * @param extend
	 */
	public void setExtend(Object extend) {
		this.extend = extend;
	}
	
	/**
	 * 扩展
	 * @return
	 */
	public Object getExtend() {
		return this.extend;
	}
	/**
	 * 备注
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * 备注
	 * @return
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 创建时间
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	
	/**
	 * 创建时间
	 * @return
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * 更新时间
	 * @param updateTime
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	
	/**
	 * 更新时间
	 * @return
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
}