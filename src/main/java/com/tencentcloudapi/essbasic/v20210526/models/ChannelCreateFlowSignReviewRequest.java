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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateFlowSignReviewRequest extends AbstractModel {

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同流程ID，为32位字符串。
<ul><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</li>
<li>可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 企业内部审核结果
<ul><li>PASS: 审核通过</li>
<li>REJECT: 审核拒绝</li>
<li>SIGN_REJECT:拒签(流程结束)</li></ul>
    */
    @SerializedName("ReviewType")
    @Expose
    private String ReviewType;

    /**
    * 审核结果原因
<ul><li>字符串长度不超过200</li>
<li>当ReviewType 是拒绝（REJECT） 时此字段必填。</li>
<li>当ReviewType 是拒绝（SIGN_REJECT） 时此字段必填。</li></ul>
    */
    @SerializedName("ReviewMessage")
    @Expose
    private String ReviewMessage;

    /**
    * 审核节点的签署人标志，用于指定当前审核的签署方
<ul><li>**如果签署审核节点是个人， 此参数必填**。</li></ul>
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 流程审核操作类型，取值如下：
<ul><li>**SignReview**：（默认）签署审核</li>
<li>**CreateReview**：发起审核</li>
<li>注意：`该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程`</li></ul>


    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 合同流程ID，为32位字符串。
<ul><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</li>
<li>可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul> 
     * @return FlowId 合同流程ID，为32位字符串。
<ul><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</li>
<li>可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID，为32位字符串。
<ul><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</li>
<li>可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul>
     * @param FlowId 合同流程ID，为32位字符串。
<ul><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。</li>
<li>可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 企业内部审核结果
<ul><li>PASS: 审核通过</li>
<li>REJECT: 审核拒绝</li>
<li>SIGN_REJECT:拒签(流程结束)</li></ul> 
     * @return ReviewType 企业内部审核结果
<ul><li>PASS: 审核通过</li>
<li>REJECT: 审核拒绝</li>
<li>SIGN_REJECT:拒签(流程结束)</li></ul>
     */
    public String getReviewType() {
        return this.ReviewType;
    }

    /**
     * Set 企业内部审核结果
<ul><li>PASS: 审核通过</li>
<li>REJECT: 审核拒绝</li>
<li>SIGN_REJECT:拒签(流程结束)</li></ul>
     * @param ReviewType 企业内部审核结果
<ul><li>PASS: 审核通过</li>
<li>REJECT: 审核拒绝</li>
<li>SIGN_REJECT:拒签(流程结束)</li></ul>
     */
    public void setReviewType(String ReviewType) {
        this.ReviewType = ReviewType;
    }

    /**
     * Get 审核结果原因
<ul><li>字符串长度不超过200</li>
<li>当ReviewType 是拒绝（REJECT） 时此字段必填。</li>
<li>当ReviewType 是拒绝（SIGN_REJECT） 时此字段必填。</li></ul> 
     * @return ReviewMessage 审核结果原因
<ul><li>字符串长度不超过200</li>
<li>当ReviewType 是拒绝（REJECT） 时此字段必填。</li>
<li>当ReviewType 是拒绝（SIGN_REJECT） 时此字段必填。</li></ul>
     */
    public String getReviewMessage() {
        return this.ReviewMessage;
    }

    /**
     * Set 审核结果原因
<ul><li>字符串长度不超过200</li>
<li>当ReviewType 是拒绝（REJECT） 时此字段必填。</li>
<li>当ReviewType 是拒绝（SIGN_REJECT） 时此字段必填。</li></ul>
     * @param ReviewMessage 审核结果原因
<ul><li>字符串长度不超过200</li>
<li>当ReviewType 是拒绝（REJECT） 时此字段必填。</li>
<li>当ReviewType 是拒绝（SIGN_REJECT） 时此字段必填。</li></ul>
     */
    public void setReviewMessage(String ReviewMessage) {
        this.ReviewMessage = ReviewMessage;
    }

    /**
     * Get 审核节点的签署人标志，用于指定当前审核的签署方
<ul><li>**如果签署审核节点是个人， 此参数必填**。</li></ul> 
     * @return RecipientId 审核节点的签署人标志，用于指定当前审核的签署方
<ul><li>**如果签署审核节点是个人， 此参数必填**。</li></ul>
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 审核节点的签署人标志，用于指定当前审核的签署方
<ul><li>**如果签署审核节点是个人， 此参数必填**。</li></ul>
     * @param RecipientId 审核节点的签署人标志，用于指定当前审核的签署方
<ul><li>**如果签署审核节点是个人， 此参数必填**。</li></ul>
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 流程审核操作类型，取值如下：
<ul><li>**SignReview**：（默认）签署审核</li>
<li>**CreateReview**：发起审核</li>
<li>注意：`该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程`</li></ul>

 
     * @return OperateType 流程审核操作类型，取值如下：
<ul><li>**SignReview**：（默认）签署审核</li>
<li>**CreateReview**：发起审核</li>
<li>注意：`该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程`</li></ul>


     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 流程审核操作类型，取值如下：
<ul><li>**SignReview**：（默认）签署审核</li>
<li>**CreateReview**：发起审核</li>
<li>注意：`该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程`</li></ul>


     * @param OperateType 流程审核操作类型，取值如下：
<ul><li>**SignReview**：（默认）签署审核</li>
<li>**CreateReview**：发起审核</li>
<li>注意：`该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程`</li></ul>


     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    public ChannelCreateFlowSignReviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowSignReviewRequest(ChannelCreateFlowSignReviewRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ReviewType != null) {
            this.ReviewType = new String(source.ReviewType);
        }
        if (source.ReviewMessage != null) {
            this.ReviewMessage = new String(source.ReviewMessage);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "ReviewType", this.ReviewType);
        this.setParamSimple(map, prefix + "ReviewMessage", this.ReviewMessage);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);

    }
}

