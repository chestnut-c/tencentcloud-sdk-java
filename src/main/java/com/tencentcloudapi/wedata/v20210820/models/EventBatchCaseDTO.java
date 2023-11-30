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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventBatchCaseDTO extends AbstractModel {

    /**
    * 事件实例id
    */
    @SerializedName("CaseId")
    @Expose
    private String CaseId;

    /**
    * 事件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件触发起始时间
    */
    @SerializedName("StartDimension")
    @Expose
    private String StartDimension;

    /**
    * 创建时间
    */
    @SerializedName("CreationTs")
    @Expose
    private String CreationTs;

    /**
    * 消费者id
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 事件触发结束时间
    */
    @SerializedName("EndDimension")
    @Expose
    private String EndDimension;

    /**
    * 事件周期
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
     * Get 事件实例id 
     * @return CaseId 事件实例id
     */
    public String getCaseId() {
        return this.CaseId;
    }

    /**
     * Set 事件实例id
     * @param CaseId 事件实例id
     */
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    /**
     * Get 事件名 
     * @return Name 事件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 事件名
     * @param Name 事件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 事件触发起始时间 
     * @return StartDimension 事件触发起始时间
     */
    public String getStartDimension() {
        return this.StartDimension;
    }

    /**
     * Set 事件触发起始时间
     * @param StartDimension 事件触发起始时间
     */
    public void setStartDimension(String StartDimension) {
        this.StartDimension = StartDimension;
    }

    /**
     * Get 创建时间 
     * @return CreationTs 创建时间
     */
    public String getCreationTs() {
        return this.CreationTs;
    }

    /**
     * Set 创建时间
     * @param CreationTs 创建时间
     */
    public void setCreationTs(String CreationTs) {
        this.CreationTs = CreationTs;
    }

    /**
     * Get 消费者id 
     * @return ConsumerId 消费者id
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set 消费者id
     * @param ConsumerId 消费者id
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get 描述信息 
     * @return Description 描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
     * @param Description 描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 事件触发结束时间 
     * @return EndDimension 事件触发结束时间
     */
    public String getEndDimension() {
        return this.EndDimension;
    }

    /**
     * Set 事件触发结束时间
     * @param EndDimension 事件触发结束时间
     */
    public void setEndDimension(String EndDimension) {
        this.EndDimension = EndDimension;
    }

    /**
     * Get 事件周期 
     * @return EventSubType 事件周期
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件周期
     * @param EventSubType 事件周期
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    public EventBatchCaseDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventBatchCaseDTO(EventBatchCaseDTO source) {
        if (source.CaseId != null) {
            this.CaseId = new String(source.CaseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartDimension != null) {
            this.StartDimension = new String(source.StartDimension);
        }
        if (source.CreationTs != null) {
            this.CreationTs = new String(source.CreationTs);
        }
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EndDimension != null) {
            this.EndDimension = new String(source.EndDimension);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseId", this.CaseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartDimension", this.StartDimension);
        this.setParamSimple(map, prefix + "CreationTs", this.CreationTs);
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EndDimension", this.EndDimension);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);

    }
}

