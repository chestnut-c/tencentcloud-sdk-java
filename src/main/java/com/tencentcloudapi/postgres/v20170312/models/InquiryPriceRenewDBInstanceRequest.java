package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InquiryPriceRenewDBInstanceRequest  extends AbstractModel{


    /**
    * 实例ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 续费周期，按月计算，最大不超过48
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
     * 获取实例ID
     * @return DBInstanceId 实例ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置实例ID
     * @param DBInstanceId 实例ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 获取续费周期，按月计算，最大不超过48
     * @return Period 续费周期，按月计算，最大不超过48
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置续费周期，按月计算，最大不超过48
     * @param Period 续费周期，按月计算，最大不超过48
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

