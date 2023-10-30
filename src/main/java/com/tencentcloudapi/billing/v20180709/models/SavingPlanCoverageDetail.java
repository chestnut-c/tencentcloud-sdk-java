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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SavingPlanCoverageDetail extends AbstractModel {

    /**
    * 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 产品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 费用起始日期，格式yyyy-MM-dd
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 节省计划覆盖金额（即节省计划支付金额）
    */
    @SerializedName("SpCoveredAmount")
    @Expose
    private Float SpCoveredAmount;

    /**
    * 节省计划未覆盖金额（即优惠后总价）
    */
    @SerializedName("SpUncoveredAmount")
    @Expose
    private Float SpUncoveredAmount;

    /**
    * 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）
    */
    @SerializedName("TotalRealAmount")
    @Expose
    private Float TotalRealAmount;

    /**
    * 按量计费预期金额（即折前价 * 折扣）
    */
    @SerializedName("ExpectedAmount")
    @Expose
    private Float ExpectedAmount;

    /**
    * 覆盖率结果，取值[0, 100]
    */
    @SerializedName("SpCoverage")
    @Expose
    private Float SpCoverage;

    /**
     * Get 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID 
     * @return ResourceId 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID
     * @param ResourceId 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 产品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子产品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubProductCode 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubProductCode 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 费用起始日期，格式yyyy-MM-dd 
     * @return StartDate 费用起始日期，格式yyyy-MM-dd
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 费用起始日期，格式yyyy-MM-dd
     * @param StartDate 费用起始日期，格式yyyy-MM-dd
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等 
     * @return EndDate 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等
     * @param EndDate 费用结束日期，格式yyyy-MM-dd，目前与StartDate相等
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 节省计划覆盖金额（即节省计划支付金额） 
     * @return SpCoveredAmount 节省计划覆盖金额（即节省计划支付金额）
     */
    public Float getSpCoveredAmount() {
        return this.SpCoveredAmount;
    }

    /**
     * Set 节省计划覆盖金额（即节省计划支付金额）
     * @param SpCoveredAmount 节省计划覆盖金额（即节省计划支付金额）
     */
    public void setSpCoveredAmount(Float SpCoveredAmount) {
        this.SpCoveredAmount = SpCoveredAmount;
    }

    /**
     * Get 节省计划未覆盖金额（即优惠后总价） 
     * @return SpUncoveredAmount 节省计划未覆盖金额（即优惠后总价）
     */
    public Float getSpUncoveredAmount() {
        return this.SpUncoveredAmount;
    }

    /**
     * Set 节省计划未覆盖金额（即优惠后总价）
     * @param SpUncoveredAmount 节省计划未覆盖金额（即优惠后总价）
     */
    public void setSpUncoveredAmount(Float SpUncoveredAmount) {
        this.SpUncoveredAmount = SpUncoveredAmount;
    }

    /**
     * Get 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额） 
     * @return TotalRealAmount 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）
     */
    public Float getTotalRealAmount() {
        return this.TotalRealAmount;
    }

    /**
     * Set 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）
     * @param TotalRealAmount 总支出（即节省计划未覆盖金额 + 节省计划覆盖金额）
     */
    public void setTotalRealAmount(Float TotalRealAmount) {
        this.TotalRealAmount = TotalRealAmount;
    }

    /**
     * Get 按量计费预期金额（即折前价 * 折扣） 
     * @return ExpectedAmount 按量计费预期金额（即折前价 * 折扣）
     */
    public Float getExpectedAmount() {
        return this.ExpectedAmount;
    }

    /**
     * Set 按量计费预期金额（即折前价 * 折扣）
     * @param ExpectedAmount 按量计费预期金额（即折前价 * 折扣）
     */
    public void setExpectedAmount(Float ExpectedAmount) {
        this.ExpectedAmount = ExpectedAmount;
    }

    /**
     * Get 覆盖率结果，取值[0, 100] 
     * @return SpCoverage 覆盖率结果，取值[0, 100]
     */
    public Float getSpCoverage() {
        return this.SpCoverage;
    }

    /**
     * Set 覆盖率结果，取值[0, 100]
     * @param SpCoverage 覆盖率结果，取值[0, 100]
     */
    public void setSpCoverage(Float SpCoverage) {
        this.SpCoverage = SpCoverage;
    }

    public SavingPlanCoverageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SavingPlanCoverageDetail(SavingPlanCoverageDetail source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.SpCoveredAmount != null) {
            this.SpCoveredAmount = new Float(source.SpCoveredAmount);
        }
        if (source.SpUncoveredAmount != null) {
            this.SpUncoveredAmount = new Float(source.SpUncoveredAmount);
        }
        if (source.TotalRealAmount != null) {
            this.TotalRealAmount = new Float(source.TotalRealAmount);
        }
        if (source.ExpectedAmount != null) {
            this.ExpectedAmount = new Float(source.ExpectedAmount);
        }
        if (source.SpCoverage != null) {
            this.SpCoverage = new Float(source.SpCoverage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "SpCoveredAmount", this.SpCoveredAmount);
        this.setParamSimple(map, prefix + "SpUncoveredAmount", this.SpUncoveredAmount);
        this.setParamSimple(map, prefix + "TotalRealAmount", this.TotalRealAmount);
        this.setParamSimple(map, prefix + "ExpectedAmount", this.ExpectedAmount);
        this.setParamSimple(map, prefix + "SpCoverage", this.SpCoverage);

    }
}

