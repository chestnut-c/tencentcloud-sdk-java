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

public class DescribeBillUsageDetailRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于31天
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于31天
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询的套餐类型 （选填 ）不传则查询所有套餐；
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定分页每页返回的数据条数，如果不传默认为 50，单页最大支持 50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于31天 
     * @return StartTime 查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于31天
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于31天
     * @param StartTime 查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于31天
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于31天 
     * @return EndTime 查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于31天
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于31天
     * @param EndTime 查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于31天
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询的套餐类型 （选填 ）不传则查询所有套餐；
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询 
     * @return QuotaType 查询的套餐类型 （选填 ）不传则查询所有套餐；
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set 查询的套餐类型 （选填 ）不传则查询所有套餐；
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询
     * @param QuotaType 查询的套餐类型 （选填 ）不传则查询所有套餐；
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0 
     * @return Offset 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0
     * @param Offset 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定分页每页返回的数据条数，如果不传默认为 50，单页最大支持 50。 
     * @return Limit 指定分页每页返回的数据条数，如果不传默认为 50，单页最大支持 50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定分页每页返回的数据条数，如果不传默认为 50，单页最大支持 50。
     * @param Limit 指定分页每页返回的数据条数，如果不传默认为 50，单页最大支持 50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeBillUsageDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillUsageDetailRequest(DescribeBillUsageDetailRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

