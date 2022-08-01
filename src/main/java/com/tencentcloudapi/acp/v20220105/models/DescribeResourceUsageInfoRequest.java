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
package com.tencentcloudapi.acp.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceUsageInfoRequest extends AbstractModel{

    /**
    * 资源计费项名称(为空时，则根据TaskType和Platform进行查询)
    */
    @SerializedName("PriceName")
    @Expose
    private String PriceName;

    /**
    * 任务类型, 0:基础版, 1:专家版
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 应用平台, 0:android
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
     * Get 资源计费项名称(为空时，则根据TaskType和Platform进行查询) 
     * @return PriceName 资源计费项名称(为空时，则根据TaskType和Platform进行查询)
     */
    public String getPriceName() {
        return this.PriceName;
    }

    /**
     * Set 资源计费项名称(为空时，则根据TaskType和Platform进行查询)
     * @param PriceName 资源计费项名称(为空时，则根据TaskType和Platform进行查询)
     */
    public void setPriceName(String PriceName) {
        this.PriceName = PriceName;
    }

    /**
     * Get 任务类型, 0:基础版, 1:专家版 
     * @return TaskType 任务类型, 0:基础版, 1:专家版
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型, 0:基础版, 1:专家版
     * @param TaskType 任务类型, 0:基础版, 1:专家版
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 应用平台, 0:android 
     * @return Platform 应用平台, 0:android
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 应用平台, 0:android
     * @param Platform 应用平台, 0:android
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    public DescribeResourceUsageInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceUsageInfoRequest(DescribeResourceUsageInfoRequest source) {
        if (source.PriceName != null) {
            this.PriceName = new String(source.PriceName);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PriceName", this.PriceName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

