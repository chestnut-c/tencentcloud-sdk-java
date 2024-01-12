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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePrometheusAlertGroupsRequest extends AbstractModel {

    /**
    * prometheus实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要删除的告警分组ID，形如alert-xxxxx
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
     * Get prometheus实例id 
     * @return InstanceId prometheus实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set prometheus实例id
     * @param InstanceId prometheus实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要删除的告警分组ID，形如alert-xxxxx 
     * @return GroupIds 需要删除的告警分组ID，形如alert-xxxxx
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 需要删除的告警分组ID，形如alert-xxxxx
     * @param GroupIds 需要删除的告警分组ID，形如alert-xxxxx
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public DeletePrometheusAlertGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrometheusAlertGroupsRequest(DeletePrometheusAlertGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);

    }
}

