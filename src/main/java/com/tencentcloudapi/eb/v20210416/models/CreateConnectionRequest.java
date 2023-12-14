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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConnectionRequest extends AbstractModel {

    /**
    * 连接器描述
    */
    @SerializedName("ConnectionDescription")
    @Expose
    private ConnectionDescription ConnectionDescription;

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * 连接器名称
    */
    @SerializedName("ConnectionName")
    @Expose
    private String ConnectionName;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 使能开关
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 连接器类型，目前支持以下类型:apigw/ckafka/dts/tdmq
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 连接器描述 
     * @return ConnectionDescription 连接器描述
     */
    public ConnectionDescription getConnectionDescription() {
        return this.ConnectionDescription;
    }

    /**
     * Set 连接器描述
     * @param ConnectionDescription 连接器描述
     */
    public void setConnectionDescription(ConnectionDescription ConnectionDescription) {
        this.ConnectionDescription = ConnectionDescription;
    }

    /**
     * Get 事件集ID 
     * @return EventBusId 事件集ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID
     * @param EventBusId 事件集ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get 连接器名称 
     * @return ConnectionName 连接器名称
     */
    public String getConnectionName() {
        return this.ConnectionName;
    }

    /**
     * Set 连接器名称
     * @param ConnectionName 连接器名称
     */
    public void setConnectionName(String ConnectionName) {
        this.ConnectionName = ConnectionName;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 使能开关 
     * @return Enable 使能开关
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 使能开关
     * @param Enable 使能开关
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 连接器类型，目前支持以下类型:apigw/ckafka/dts/tdmq 
     * @return Type 连接器类型，目前支持以下类型:apigw/ckafka/dts/tdmq
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 连接器类型，目前支持以下类型:apigw/ckafka/dts/tdmq
     * @param Type 连接器类型，目前支持以下类型:apigw/ckafka/dts/tdmq
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConnectionRequest(CreateConnectionRequest source) {
        if (source.ConnectionDescription != null) {
            this.ConnectionDescription = new ConnectionDescription(source.ConnectionDescription);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.ConnectionName != null) {
            this.ConnectionName = new String(source.ConnectionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ConnectionDescription.", this.ConnectionDescription);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "ConnectionName", this.ConnectionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

