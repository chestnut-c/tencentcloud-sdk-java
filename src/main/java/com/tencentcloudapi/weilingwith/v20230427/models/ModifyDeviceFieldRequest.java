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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceFieldRequest extends AbstractModel {

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 设备自定义字段修改信息集合
    */
    @SerializedName("Set")
    @Expose
    private ModifyDeviceFieldInfo [] Set;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 设备自定义字段修改信息集合 
     * @return Set 设备自定义字段修改信息集合
     */
    public ModifyDeviceFieldInfo [] getSet() {
        return this.Set;
    }

    /**
     * Set 设备自定义字段修改信息集合
     * @param Set 设备自定义字段修改信息集合
     */
    public void setSet(ModifyDeviceFieldInfo [] Set) {
        this.Set = Set;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    public ModifyDeviceFieldRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceFieldRequest(ModifyDeviceFieldRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.Set != null) {
            this.Set = new ModifyDeviceFieldInfo[source.Set.length];
            for (int i = 0; i < source.Set.length; i++) {
                this.Set[i] = new ModifyDeviceFieldInfo(source.Set[i]);
            }
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArrayObj(map, prefix + "Set.", this.Set);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);

    }
}

