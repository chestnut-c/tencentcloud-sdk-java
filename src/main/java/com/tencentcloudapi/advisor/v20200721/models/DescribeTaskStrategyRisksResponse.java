/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.advisor.v20200721.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStrategyRisksResponse extends AbstractModel{

    /**
    * 根据此配置，匹配风险实例列表（Risks）对应字段，例如:
{"Response":{"RequestId":"111","RiskFieldsDesc":[{"Field":"InstanceId","FieldName":"ID","FieldType":"string","FieldDict":{}},{"Field":"InstanceName","FieldName":"名称","FieldType":"string","FieldDict":{}},{"Field":"InstanceState","FieldName":"状态","FieldType":"string","FieldDict":{"LAUNCH_FAILED":"创建失败","PENDING":"创建中","REBOOTING":"重启中","RUNNING":"运行中","SHUTDOWN":"停止待销毁","STARTING":"开机中","STOPPED":"关机","STOPPING":"关机中","TERMINATING":"销毁中"}},{"Field":"Zone","FieldName":"可用区","FieldType":"string","FieldDict":{}},{"Field":"PrivateIPAddresses","FieldName":"IP地址(内)","FieldType":"stringSlice","FieldDict":{}},{"Field":"PublicIPAddresses","FieldName":"IP地址(公)","FieldType":"stringSlice","FieldDict":{}},{"Field":"Tags","FieldName":"标签","FieldType":"tags","FieldDict":{}}],"RiskTotalCount":1,"Risks":[{"InstanceId":"ins-diha6wb3","InstanceName":"tke_cls-13rigq6t_worker","InstanceState":"RUNNING","PrivateIPAddresses":["1.0.0.1"],"PublicIPAddresses":null,"Tags":null,"Zone":"ap-beijing-1"}],"StrategyId":9}}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskFieldsDesc")
    @Expose
    private RiskFieldsDesc [] RiskFieldsDesc;

    /**
    * 评估项ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 风险实例个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskTotalCount")
    @Expose
    private Long RiskTotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 根据此配置，匹配风险实例列表（Risks）对应字段，例如:
{"Response":{"RequestId":"111","RiskFieldsDesc":[{"Field":"InstanceId","FieldName":"ID","FieldType":"string","FieldDict":{}},{"Field":"InstanceName","FieldName":"名称","FieldType":"string","FieldDict":{}},{"Field":"InstanceState","FieldName":"状态","FieldType":"string","FieldDict":{"LAUNCH_FAILED":"创建失败","PENDING":"创建中","REBOOTING":"重启中","RUNNING":"运行中","SHUTDOWN":"停止待销毁","STARTING":"开机中","STOPPED":"关机","STOPPING":"关机中","TERMINATING":"销毁中"}},{"Field":"Zone","FieldName":"可用区","FieldType":"string","FieldDict":{}},{"Field":"PrivateIPAddresses","FieldName":"IP地址(内)","FieldType":"stringSlice","FieldDict":{}},{"Field":"PublicIPAddresses","FieldName":"IP地址(公)","FieldType":"stringSlice","FieldDict":{}},{"Field":"Tags","FieldName":"标签","FieldType":"tags","FieldDict":{}}],"RiskTotalCount":1,"Risks":[{"InstanceId":"ins-diha6wb3","InstanceName":"tke_cls-13rigq6t_worker","InstanceState":"RUNNING","PrivateIPAddresses":["1.0.0.1"],"PublicIPAddresses":null,"Tags":null,"Zone":"ap-beijing-1"}],"StrategyId":9}}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskFieldsDesc 根据此配置，匹配风险实例列表（Risks）对应字段，例如:
{"Response":{"RequestId":"111","RiskFieldsDesc":[{"Field":"InstanceId","FieldName":"ID","FieldType":"string","FieldDict":{}},{"Field":"InstanceName","FieldName":"名称","FieldType":"string","FieldDict":{}},{"Field":"InstanceState","FieldName":"状态","FieldType":"string","FieldDict":{"LAUNCH_FAILED":"创建失败","PENDING":"创建中","REBOOTING":"重启中","RUNNING":"运行中","SHUTDOWN":"停止待销毁","STARTING":"开机中","STOPPED":"关机","STOPPING":"关机中","TERMINATING":"销毁中"}},{"Field":"Zone","FieldName":"可用区","FieldType":"string","FieldDict":{}},{"Field":"PrivateIPAddresses","FieldName":"IP地址(内)","FieldType":"stringSlice","FieldDict":{}},{"Field":"PublicIPAddresses","FieldName":"IP地址(公)","FieldType":"stringSlice","FieldDict":{}},{"Field":"Tags","FieldName":"标签","FieldType":"tags","FieldDict":{}}],"RiskTotalCount":1,"Risks":[{"InstanceId":"ins-diha6wb3","InstanceName":"tke_cls-13rigq6t_worker","InstanceState":"RUNNING","PrivateIPAddresses":["1.0.0.1"],"PublicIPAddresses":null,"Tags":null,"Zone":"ap-beijing-1"}],"StrategyId":9}}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskFieldsDesc [] getRiskFieldsDesc() {
        return this.RiskFieldsDesc;
    }

    /**
     * Set 根据此配置，匹配风险实例列表（Risks）对应字段，例如:
{"Response":{"RequestId":"111","RiskFieldsDesc":[{"Field":"InstanceId","FieldName":"ID","FieldType":"string","FieldDict":{}},{"Field":"InstanceName","FieldName":"名称","FieldType":"string","FieldDict":{}},{"Field":"InstanceState","FieldName":"状态","FieldType":"string","FieldDict":{"LAUNCH_FAILED":"创建失败","PENDING":"创建中","REBOOTING":"重启中","RUNNING":"运行中","SHUTDOWN":"停止待销毁","STARTING":"开机中","STOPPED":"关机","STOPPING":"关机中","TERMINATING":"销毁中"}},{"Field":"Zone","FieldName":"可用区","FieldType":"string","FieldDict":{}},{"Field":"PrivateIPAddresses","FieldName":"IP地址(内)","FieldType":"stringSlice","FieldDict":{}},{"Field":"PublicIPAddresses","FieldName":"IP地址(公)","FieldType":"stringSlice","FieldDict":{}},{"Field":"Tags","FieldName":"标签","FieldType":"tags","FieldDict":{}}],"RiskTotalCount":1,"Risks":[{"InstanceId":"ins-diha6wb3","InstanceName":"tke_cls-13rigq6t_worker","InstanceState":"RUNNING","PrivateIPAddresses":["1.0.0.1"],"PublicIPAddresses":null,"Tags":null,"Zone":"ap-beijing-1"}],"StrategyId":9}}
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskFieldsDesc 根据此配置，匹配风险实例列表（Risks）对应字段，例如:
{"Response":{"RequestId":"111","RiskFieldsDesc":[{"Field":"InstanceId","FieldName":"ID","FieldType":"string","FieldDict":{}},{"Field":"InstanceName","FieldName":"名称","FieldType":"string","FieldDict":{}},{"Field":"InstanceState","FieldName":"状态","FieldType":"string","FieldDict":{"LAUNCH_FAILED":"创建失败","PENDING":"创建中","REBOOTING":"重启中","RUNNING":"运行中","SHUTDOWN":"停止待销毁","STARTING":"开机中","STOPPED":"关机","STOPPING":"关机中","TERMINATING":"销毁中"}},{"Field":"Zone","FieldName":"可用区","FieldType":"string","FieldDict":{}},{"Field":"PrivateIPAddresses","FieldName":"IP地址(内)","FieldType":"stringSlice","FieldDict":{}},{"Field":"PublicIPAddresses","FieldName":"IP地址(公)","FieldType":"stringSlice","FieldDict":{}},{"Field":"Tags","FieldName":"标签","FieldType":"tags","FieldDict":{}}],"RiskTotalCount":1,"Risks":[{"InstanceId":"ins-diha6wb3","InstanceName":"tke_cls-13rigq6t_worker","InstanceState":"RUNNING","PrivateIPAddresses":["1.0.0.1"],"PublicIPAddresses":null,"Tags":null,"Zone":"ap-beijing-1"}],"StrategyId":9}}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskFieldsDesc(RiskFieldsDesc [] RiskFieldsDesc) {
        this.RiskFieldsDesc = RiskFieldsDesc;
    }

    /**
     * Get 评估项ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyId 评估项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 评估项ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyId 评估项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 风险实例个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskTotalCount 风险实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskTotalCount() {
        return this.RiskTotalCount;
    }

    /**
     * Set 风险实例个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskTotalCount 风险实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskTotalCount(Long RiskTotalCount) {
        this.RiskTotalCount = RiskTotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTaskStrategyRisksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskStrategyRisksResponse(DescribeTaskStrategyRisksResponse source) {
        if (source.RiskFieldsDesc != null) {
            this.RiskFieldsDesc = new RiskFieldsDesc[source.RiskFieldsDesc.length];
            for (int i = 0; i < source.RiskFieldsDesc.length; i++) {
                this.RiskFieldsDesc[i] = new RiskFieldsDesc(source.RiskFieldsDesc[i]);
            }
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.RiskTotalCount != null) {
            this.RiskTotalCount = new Long(source.RiskTotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RiskFieldsDesc.", this.RiskFieldsDesc);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "RiskTotalCount", this.RiskTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

