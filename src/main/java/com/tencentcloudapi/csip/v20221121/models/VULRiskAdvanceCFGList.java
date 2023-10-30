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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VULRiskAdvanceCFGList extends AbstractModel {

    /**
    * 漏洞名称
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 识别来源
    */
    @SerializedName("CheckFrom")
    @Expose
    private String CheckFrom;

    /**
    * 是否启用，1-启用，0-禁用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 风险类型
    */
    @SerializedName("VULType")
    @Expose
    private String VULType;

    /**
    * 影响版本
    */
    @SerializedName("ImpactVersion")
    @Expose
    private String ImpactVersion;

    /**
    * CVE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * 漏洞标签
    */
    @SerializedName("VULTag")
    @Expose
    private String [] VULTag;

    /**
    * 修复方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixMethod")
    @Expose
    private String [] FixMethod;

    /**
    * 披露时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

    /**
    * 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VULDescribe")
    @Expose
    private String VULDescribe;

    /**
    * 影响组件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImpactComponent")
    @Expose
    private String ImpactComponent;

    /**
     * Get 漏洞名称 
     * @return VULName 漏洞名称
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set 漏洞名称
     * @param VULName 漏洞名称
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 识别来源 
     * @return CheckFrom 识别来源
     */
    public String getCheckFrom() {
        return this.CheckFrom;
    }

    /**
     * Set 识别来源
     * @param CheckFrom 识别来源
     */
    public void setCheckFrom(String CheckFrom) {
        this.CheckFrom = CheckFrom;
    }

    /**
     * Get 是否启用，1-启用，0-禁用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 是否启用，1-启用，0-禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用，1-启用，0-禁用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 是否启用，1-启用，0-禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 风险类型 
     * @return VULType 风险类型
     */
    public String getVULType() {
        return this.VULType;
    }

    /**
     * Set 风险类型
     * @param VULType 风险类型
     */
    public void setVULType(String VULType) {
        this.VULType = VULType;
    }

    /**
     * Get 影响版本 
     * @return ImpactVersion 影响版本
     */
    public String getImpactVersion() {
        return this.ImpactVersion;
    }

    /**
     * Set 影响版本
     * @param ImpactVersion 影响版本
     */
    public void setImpactVersion(String ImpactVersion) {
        this.ImpactVersion = ImpactVersion;
    }

    /**
     * Get CVE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVE CVE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set CVE
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVE CVE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get 漏洞标签 
     * @return VULTag 漏洞标签
     */
    public String [] getVULTag() {
        return this.VULTag;
    }

    /**
     * Set 漏洞标签
     * @param VULTag 漏洞标签
     */
    public void setVULTag(String [] VULTag) {
        this.VULTag = VULTag;
    }

    /**
     * Get 修复方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixMethod 修复方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set 修复方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixMethod 修复方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixMethod(String [] FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get 披露时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseTime 披露时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set 披露时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseTime 披露时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EMGCVulType 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
     * @param EMGCVulType 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    /**
     * Get 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VULDescribe 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVULDescribe() {
        return this.VULDescribe;
    }

    /**
     * Set 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param VULDescribe 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVULDescribe(String VULDescribe) {
        this.VULDescribe = VULDescribe;
    }

    /**
     * Get 影响组件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImpactComponent 影响组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImpactComponent() {
        return this.ImpactComponent;
    }

    /**
     * Set 影响组件
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImpactComponent 影响组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImpactComponent(String ImpactComponent) {
        this.ImpactComponent = ImpactComponent;
    }

    public VULRiskAdvanceCFGList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VULRiskAdvanceCFGList(VULRiskAdvanceCFGList source) {
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.CheckFrom != null) {
            this.CheckFrom = new String(source.CheckFrom);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VULType != null) {
            this.VULType = new String(source.VULType);
        }
        if (source.ImpactVersion != null) {
            this.ImpactVersion = new String(source.ImpactVersion);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.VULTag != null) {
            this.VULTag = new String[source.VULTag.length];
            for (int i = 0; i < source.VULTag.length; i++) {
                this.VULTag[i] = new String(source.VULTag[i]);
            }
        }
        if (source.FixMethod != null) {
            this.FixMethod = new String[source.FixMethod.length];
            for (int i = 0; i < source.FixMethod.length; i++) {
                this.FixMethod[i] = new String(source.FixMethod[i]);
            }
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.EMGCVulType != null) {
            this.EMGCVulType = new Long(source.EMGCVulType);
        }
        if (source.VULDescribe != null) {
            this.VULDescribe = new String(source.VULDescribe);
        }
        if (source.ImpactComponent != null) {
            this.ImpactComponent = new String(source.ImpactComponent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "CheckFrom", this.CheckFrom);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "ImpactVersion", this.ImpactVersion);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamArraySimple(map, prefix + "VULTag.", this.VULTag);
        this.setParamArraySimple(map, prefix + "FixMethod.", this.FixMethod);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);
        this.setParamSimple(map, prefix + "VULDescribe", this.VULDescribe);
        this.setParamSimple(map, prefix + "ImpactComponent", this.ImpactComponent);

    }
}

