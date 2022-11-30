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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDescribeOrganizationSealsRequest extends AbstractModel{

    /**
    * 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 返回最大数量，最大为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0，最大为20000
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询信息类型，为1时返回授权用户，为其他值时不返回
    */
    @SerializedName("InfoType")
    @Expose
    private Long InfoType;

    /**
    * 印章id（没有输入返回所有）
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
     * Get 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。 
     * @return Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     * @param Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 返回最大数量，最大为100 
     * @return Limit 返回最大数量，最大为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回最大数量，最大为100
     * @param Limit 返回最大数量，最大为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0，最大为20000 
     * @return Offset 偏移量，默认为0，最大为20000
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0，最大为20000
     * @param Offset 偏移量，默认为0，最大为20000
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询信息类型，为1时返回授权用户，为其他值时不返回 
     * @return InfoType 查询信息类型，为1时返回授权用户，为其他值时不返回
     */
    public Long getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 查询信息类型，为1时返回授权用户，为其他值时不返回
     * @param InfoType 查询信息类型，为1时返回授权用户，为其他值时不返回
     */
    public void setInfoType(Long InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 印章id（没有输入返回所有） 
     * @return SealId 印章id（没有输入返回所有）
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章id（没有输入返回所有）
     * @param SealId 印章id（没有输入返回所有）
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    public ChannelDescribeOrganizationSealsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeOrganizationSealsRequest(ChannelDescribeOrganizationSealsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InfoType != null) {
            this.InfoType = new Long(source.InfoType);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "SealId", this.SealId);

    }
}

