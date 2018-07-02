package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeVulsNumberTimelineResponse  extends AbstractModel{


    /**
    * 统计数据记录数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 用户漏洞数随时间变化统计数据。
    */
    @SerializedName("VulsTimeline")
    @Expose
    private VulsTimeline [] VulsTimeline;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取统计数据记录数量。
     * @return TotalCount 统计数据记录数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置统计数据记录数量。
     * @param TotalCount 统计数据记录数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取用户漏洞数随时间变化统计数据。
     * @return VulsTimeline 用户漏洞数随时间变化统计数据。
     */
    public VulsTimeline [] getVulsTimeline() {
        return this.VulsTimeline;
    }

    /**
     * 设置用户漏洞数随时间变化统计数据。
     * @param VulsTimeline 用户漏洞数随时间变化统计数据。
     */
    public void setVulsTimeline(VulsTimeline [] VulsTimeline) {
        this.VulsTimeline = VulsTimeline;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "VulsTimeline.", this.VulsTimeline);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

