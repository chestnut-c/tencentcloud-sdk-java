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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudStorageAIServiceRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 云存 AI 服务类型。可选值：
- `PackageDetect`：包裹检测
- `Highlight`：视频浓缩
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 启用状态
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 视频分析区域
    */
    @SerializedName("ROI")
    @Expose
    private String ROI;

    /**
    * 云存 AI 服务的配置参数
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 云存 AI 服务类型。可选值：
- `PackageDetect`：包裹检测
- `Highlight`：视频浓缩 
     * @return ServiceType 云存 AI 服务类型。可选值：
- `PackageDetect`：包裹检测
- `Highlight`：视频浓缩
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 云存 AI 服务类型。可选值：
- `PackageDetect`：包裹检测
- `Highlight`：视频浓缩
     * @param ServiceType 云存 AI 服务类型。可选值：
- `PackageDetect`：包裹检测
- `Highlight`：视频浓缩
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 启用状态 
     * @return Enabled 启用状态
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 启用状态
     * @param Enabled 启用状态
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 视频分析区域 
     * @return ROI 视频分析区域
     */
    public String getROI() {
        return this.ROI;
    }

    /**
     * Set 视频分析区域
     * @param ROI 视频分析区域
     */
    public void setROI(String ROI) {
        this.ROI = ROI;
    }

    /**
     * Get 云存 AI 服务的配置参数 
     * @return Config 云存 AI 服务的配置参数
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 云存 AI 服务的配置参数
     * @param Config 云存 AI 服务的配置参数
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public ModifyCloudStorageAIServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudStorageAIServiceRequest(ModifyCloudStorageAIServiceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ROI != null) {
            this.ROI = new String(source.ROI);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "ROI", this.ROI);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

