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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanTaskInfoList extends AbstractModel{

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * cron格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanPlanContent")
    @Expose
    private String ScanPlanContent;

    /**
    * 0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 排除扫描资产信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDefiningAssets")
    @Expose
    private String [] SelfDefiningAssets;

    /**
    * 预估时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PredictTime")
    @Expose
    private Long PredictTime;

    /**
    * 预估完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PredictEndTime")
    @Expose
    private String PredictEndTime;

    /**
    * 报告数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportNumber")
    @Expose
    private Long ReportNumber;

    /**
    * 资产数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetNumber")
    @Expose
    private Long AssetNumber;

    /**
    * 扫描状态, 0-初始值，1-正在扫描，2-扫描完成，3-扫描出错，4-停止扫描
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * 任务进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * port/poc/weakpass/webcontent/configrisk
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanItem")
    @Expose
    private String ScanItem;

    /**
    * 0-全扫，1-指定资产扫，2-排除资产扫
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanAssetType")
    @Expose
    private Long ScanAssetType;

    /**
    * vss子任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VSSTaskId")
    @Expose
    private String VSSTaskId;

    /**
    * cspm子任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CSPMTaskId")
    @Expose
    private String CSPMTaskId;

    /**
    * 主机漏扫子任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CWPPOCId")
    @Expose
    private String CWPPOCId;

    /**
    * 主机基线子任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CWPBlId")
    @Expose
    private String CWPBlId;

    /**
    * vss子任务进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VSSTaskProcess")
    @Expose
    private Long VSSTaskProcess;

    /**
    * cspm子任务进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CSPMTaskProcess")
    @Expose
    private Long CSPMTaskProcess;

    /**
    * 主机漏扫子任务进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CWPPOCProcess")
    @Expose
    private Long CWPPOCProcess;

    /**
    * 主机基线子任务进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CWPBlProcess")
    @Expose
    private Long CWPBlProcess;

    /**
    * 异常状态码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * 周期任务开始的天数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartDay")
    @Expose
    private Long StartDay;

    /**
    * 扫描频率,单位天,1-每天,7-每周,30-月,0-扫描一次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * 完成次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompleteNumber")
    @Expose
    private Long CompleteNumber;

    /**
    * 已完成资产个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompleteAssetNumber")
    @Expose
    private Long CompleteAssetNumber;

    /**
    * 风险数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 资产
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Assets")
    @Expose
    private TaskAssetObject [] Assets;

    /**
    * 用户Appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户主账户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UIN")
    @Expose
    private String UIN;

    /**
    * 用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 体检模式，0-标准模式，1-快速模式，2-高级模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * 扫描来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanFrom")
    @Expose
    private String ScanFrom;

    /**
    * 是否限免体检0不是，1是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsFree")
    @Expose
    private Long IsFree;

    /**
    * 是否可以删除，1-可以，0-不可以，对应多账户管理使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDelete")
    @Expose
    private Long IsDelete;

    /**
    * 任务源类型，0-默认，1-小助手，2-体检项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get cron格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanPlanContent cron格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanPlanContent() {
        return this.ScanPlanContent;
    }

    /**
     * Set cron格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanPlanContent cron格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanPlanContent(String ScanPlanContent) {
        this.ScanPlanContent = ScanPlanContent;
    }

    /**
     * Get 0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 排除扫描资产信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDefiningAssets 排除扫描资产信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSelfDefiningAssets() {
        return this.SelfDefiningAssets;
    }

    /**
     * Set 排除扫描资产信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDefiningAssets 排除扫描资产信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDefiningAssets(String [] SelfDefiningAssets) {
        this.SelfDefiningAssets = SelfDefiningAssets;
    }

    /**
     * Get 预估时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PredictTime 预估时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPredictTime() {
        return this.PredictTime;
    }

    /**
     * Set 预估时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PredictTime 预估时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPredictTime(Long PredictTime) {
        this.PredictTime = PredictTime;
    }

    /**
     * Get 预估完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PredictEndTime 预估完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPredictEndTime() {
        return this.PredictEndTime;
    }

    /**
     * Set 预估完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PredictEndTime 预估完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPredictEndTime(String PredictEndTime) {
        this.PredictEndTime = PredictEndTime;
    }

    /**
     * Get 报告数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportNumber 报告数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReportNumber() {
        return this.ReportNumber;
    }

    /**
     * Set 报告数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportNumber 报告数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportNumber(Long ReportNumber) {
        this.ReportNumber = ReportNumber;
    }

    /**
     * Get 资产数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetNumber 资产数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetNumber() {
        return this.AssetNumber;
    }

    /**
     * Set 资产数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetNumber 资产数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetNumber(Long AssetNumber) {
        this.AssetNumber = AssetNumber;
    }

    /**
     * Get 扫描状态, 0-初始值，1-正在扫描，2-扫描完成，3-扫描出错，4-停止扫描
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanStatus 扫描状态, 0-初始值，1-正在扫描，2-扫描完成，3-扫描出错，4-停止扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 扫描状态, 0-初始值，1-正在扫描，2-扫描完成，3-扫描出错，4-停止扫描
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanStatus 扫描状态, 0-初始值，1-正在扫描，2-扫描完成，3-扫描出错，4-停止扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 任务进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set 任务进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get port/poc/weakpass/webcontent/configrisk
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanItem port/poc/weakpass/webcontent/configrisk
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanItem() {
        return this.ScanItem;
    }

    /**
     * Set port/poc/weakpass/webcontent/configrisk
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanItem port/poc/weakpass/webcontent/configrisk
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanItem(String ScanItem) {
        this.ScanItem = ScanItem;
    }

    /**
     * Get 0-全扫，1-指定资产扫，2-排除资产扫
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanAssetType 0-全扫，1-指定资产扫，2-排除资产扫
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanAssetType() {
        return this.ScanAssetType;
    }

    /**
     * Set 0-全扫，1-指定资产扫，2-排除资产扫
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanAssetType 0-全扫，1-指定资产扫，2-排除资产扫
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanAssetType(Long ScanAssetType) {
        this.ScanAssetType = ScanAssetType;
    }

    /**
     * Get vss子任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VSSTaskId vss子任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVSSTaskId() {
        return this.VSSTaskId;
    }

    /**
     * Set vss子任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VSSTaskId vss子任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVSSTaskId(String VSSTaskId) {
        this.VSSTaskId = VSSTaskId;
    }

    /**
     * Get cspm子任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CSPMTaskId cspm子任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCSPMTaskId() {
        return this.CSPMTaskId;
    }

    /**
     * Set cspm子任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CSPMTaskId cspm子任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCSPMTaskId(String CSPMTaskId) {
        this.CSPMTaskId = CSPMTaskId;
    }

    /**
     * Get 主机漏扫子任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CWPPOCId 主机漏扫子任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCWPPOCId() {
        return this.CWPPOCId;
    }

    /**
     * Set 主机漏扫子任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CWPPOCId 主机漏扫子任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCWPPOCId(String CWPPOCId) {
        this.CWPPOCId = CWPPOCId;
    }

    /**
     * Get 主机基线子任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CWPBlId 主机基线子任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCWPBlId() {
        return this.CWPBlId;
    }

    /**
     * Set 主机基线子任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CWPBlId 主机基线子任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCWPBlId(String CWPBlId) {
        this.CWPBlId = CWPBlId;
    }

    /**
     * Get vss子任务进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VSSTaskProcess vss子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVSSTaskProcess() {
        return this.VSSTaskProcess;
    }

    /**
     * Set vss子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param VSSTaskProcess vss子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVSSTaskProcess(Long VSSTaskProcess) {
        this.VSSTaskProcess = VSSTaskProcess;
    }

    /**
     * Get cspm子任务进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CSPMTaskProcess cspm子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCSPMTaskProcess() {
        return this.CSPMTaskProcess;
    }

    /**
     * Set cspm子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param CSPMTaskProcess cspm子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCSPMTaskProcess(Long CSPMTaskProcess) {
        this.CSPMTaskProcess = CSPMTaskProcess;
    }

    /**
     * Get 主机漏扫子任务进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CWPPOCProcess 主机漏扫子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCWPPOCProcess() {
        return this.CWPPOCProcess;
    }

    /**
     * Set 主机漏扫子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param CWPPOCProcess 主机漏扫子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCWPPOCProcess(Long CWPPOCProcess) {
        this.CWPPOCProcess = CWPPOCProcess;
    }

    /**
     * Get 主机基线子任务进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CWPBlProcess 主机基线子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCWPBlProcess() {
        return this.CWPBlProcess;
    }

    /**
     * Set 主机基线子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param CWPBlProcess 主机基线子任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCWPBlProcess(Long CWPBlProcess) {
        this.CWPBlProcess = CWPBlProcess;
    }

    /**
     * Get 异常状态码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode 异常状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 异常状态码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode 异常状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorInfo 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorInfo 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get 周期任务开始的天数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartDay 周期任务开始的天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartDay() {
        return this.StartDay;
    }

    /**
     * Set 周期任务开始的天数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartDay 周期任务开始的天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartDay(Long StartDay) {
        this.StartDay = StartDay;
    }

    /**
     * Get 扫描频率,单位天,1-每天,7-每周,30-月,0-扫描一次
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Frequency 扫描频率,单位天,1-每天,7-每周,30-月,0-扫描一次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 扫描频率,单位天,1-每天,7-每周,30-月,0-扫描一次
注意：此字段可能返回 null，表示取不到有效值。
     * @param Frequency 扫描频率,单位天,1-每天,7-每周,30-月,0-扫描一次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get 完成次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompleteNumber 完成次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompleteNumber() {
        return this.CompleteNumber;
    }

    /**
     * Set 完成次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompleteNumber 完成次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompleteNumber(Long CompleteNumber) {
        this.CompleteNumber = CompleteNumber;
    }

    /**
     * Get 已完成资产个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompleteAssetNumber 已完成资产个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompleteAssetNumber() {
        return this.CompleteAssetNumber;
    }

    /**
     * Set 已完成资产个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompleteAssetNumber 已完成资产个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompleteAssetNumber(Long CompleteAssetNumber) {
        this.CompleteAssetNumber = CompleteAssetNumber;
    }

    /**
     * Get 风险数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCount 风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCount 风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 资产
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Assets 资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskAssetObject [] getAssets() {
        return this.Assets;
    }

    /**
     * Set 资产
注意：此字段可能返回 null，表示取不到有效值。
     * @param Assets 资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssets(TaskAssetObject [] Assets) {
        this.Assets = Assets;
    }

    /**
     * Get 用户Appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户Appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户Appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户Appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户主账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UIN 用户主账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUIN() {
        return this.UIN;
    }

    /**
     * Set 用户主账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UIN 用户主账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /**
     * Get 用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 体检模式，0-标准模式，1-快速模式，2-高级模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskMode 体检模式，0-标准模式，1-快速模式，2-高级模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set 体检模式，0-标准模式，1-快速模式，2-高级模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskMode 体检模式，0-标准模式，1-快速模式，2-高级模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get 扫描来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanFrom 扫描来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanFrom() {
        return this.ScanFrom;
    }

    /**
     * Set 扫描来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanFrom 扫描来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanFrom(String ScanFrom) {
        this.ScanFrom = ScanFrom;
    }

    /**
     * Get 是否限免体检0不是，1是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsFree 是否限免体检0不是，1是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsFree() {
        return this.IsFree;
    }

    /**
     * Set 是否限免体检0不是，1是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsFree 是否限免体检0不是，1是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsFree(Long IsFree) {
        this.IsFree = IsFree;
    }

    /**
     * Get 是否可以删除，1-可以，0-不可以，对应多账户管理使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDelete 是否可以删除，1-可以，0-不可以，对应多账户管理使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set 是否可以删除，1-可以，0-不可以，对应多账户管理使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDelete 是否可以删除，1-可以，0-不可以，对应多账户管理使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDelete(Long IsDelete) {
        this.IsDelete = IsDelete;
    }

    /**
     * Get 任务源类型，0-默认，1-小助手，2-体检项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 任务源类型，0-默认，1-小助手，2-体检项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 任务源类型，0-默认，1-小助手，2-体检项
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 任务源类型，0-默认，1-小助手，2-体检项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    public ScanTaskInfoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskInfoList(ScanTaskInfoList source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ScanPlanContent != null) {
            this.ScanPlanContent = new String(source.ScanPlanContent);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SelfDefiningAssets != null) {
            this.SelfDefiningAssets = new String[source.SelfDefiningAssets.length];
            for (int i = 0; i < source.SelfDefiningAssets.length; i++) {
                this.SelfDefiningAssets[i] = new String(source.SelfDefiningAssets[i]);
            }
        }
        if (source.PredictTime != null) {
            this.PredictTime = new Long(source.PredictTime);
        }
        if (source.PredictEndTime != null) {
            this.PredictEndTime = new String(source.PredictEndTime);
        }
        if (source.ReportNumber != null) {
            this.ReportNumber = new Long(source.ReportNumber);
        }
        if (source.AssetNumber != null) {
            this.AssetNumber = new Long(source.AssetNumber);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.ScanItem != null) {
            this.ScanItem = new String(source.ScanItem);
        }
        if (source.ScanAssetType != null) {
            this.ScanAssetType = new Long(source.ScanAssetType);
        }
        if (source.VSSTaskId != null) {
            this.VSSTaskId = new String(source.VSSTaskId);
        }
        if (source.CSPMTaskId != null) {
            this.CSPMTaskId = new String(source.CSPMTaskId);
        }
        if (source.CWPPOCId != null) {
            this.CWPPOCId = new String(source.CWPPOCId);
        }
        if (source.CWPBlId != null) {
            this.CWPBlId = new String(source.CWPBlId);
        }
        if (source.VSSTaskProcess != null) {
            this.VSSTaskProcess = new Long(source.VSSTaskProcess);
        }
        if (source.CSPMTaskProcess != null) {
            this.CSPMTaskProcess = new Long(source.CSPMTaskProcess);
        }
        if (source.CWPPOCProcess != null) {
            this.CWPPOCProcess = new Long(source.CWPPOCProcess);
        }
        if (source.CWPBlProcess != null) {
            this.CWPBlProcess = new Long(source.CWPBlProcess);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.StartDay != null) {
            this.StartDay = new Long(source.StartDay);
        }
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.CompleteNumber != null) {
            this.CompleteNumber = new Long(source.CompleteNumber);
        }
        if (source.CompleteAssetNumber != null) {
            this.CompleteAssetNumber = new Long(source.CompleteAssetNumber);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.Assets != null) {
            this.Assets = new TaskAssetObject[source.Assets.length];
            for (int i = 0; i < source.Assets.length; i++) {
                this.Assets[i] = new TaskAssetObject(source.Assets[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.UIN != null) {
            this.UIN = new String(source.UIN);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.ScanFrom != null) {
            this.ScanFrom = new String(source.ScanFrom);
        }
        if (source.IsFree != null) {
            this.IsFree = new Long(source.IsFree);
        }
        if (source.IsDelete != null) {
            this.IsDelete = new Long(source.IsDelete);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ScanPlanContent", this.ScanPlanContent);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "SelfDefiningAssets.", this.SelfDefiningAssets);
        this.setParamSimple(map, prefix + "PredictTime", this.PredictTime);
        this.setParamSimple(map, prefix + "PredictEndTime", this.PredictEndTime);
        this.setParamSimple(map, prefix + "ReportNumber", this.ReportNumber);
        this.setParamSimple(map, prefix + "AssetNumber", this.AssetNumber);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "ScanItem", this.ScanItem);
        this.setParamSimple(map, prefix + "ScanAssetType", this.ScanAssetType);
        this.setParamSimple(map, prefix + "VSSTaskId", this.VSSTaskId);
        this.setParamSimple(map, prefix + "CSPMTaskId", this.CSPMTaskId);
        this.setParamSimple(map, prefix + "CWPPOCId", this.CWPPOCId);
        this.setParamSimple(map, prefix + "CWPBlId", this.CWPBlId);
        this.setParamSimple(map, prefix + "VSSTaskProcess", this.VSSTaskProcess);
        this.setParamSimple(map, prefix + "CSPMTaskProcess", this.CSPMTaskProcess);
        this.setParamSimple(map, prefix + "CWPPOCProcess", this.CWPPOCProcess);
        this.setParamSimple(map, prefix + "CWPBlProcess", this.CWPBlProcess);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "StartDay", this.StartDay);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "CompleteNumber", this.CompleteNumber);
        this.setParamSimple(map, prefix + "CompleteAssetNumber", this.CompleteAssetNumber);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamArrayObj(map, prefix + "Assets.", this.Assets);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UIN", this.UIN);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamSimple(map, prefix + "ScanFrom", this.ScanFrom);
        this.setParamSimple(map, prefix + "IsFree", this.IsFree);
        this.setParamSimple(map, prefix + "IsDelete", this.IsDelete);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

