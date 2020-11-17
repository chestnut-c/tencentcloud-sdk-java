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
package com.tencentcloudapi.asw.v20200722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartExecutionResponse extends AbstractModel{

    /**
    * 执行资源名
    */
    @SerializedName("ExecutionResourceName")
    @Expose
    private String ExecutionResourceName;

    /**
    * 执行开始时间
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 执行资源名 
     * @return ExecutionResourceName 执行资源名
     */
    public String getExecutionResourceName() {
        return this.ExecutionResourceName;
    }

    /**
     * Set 执行资源名
     * @param ExecutionResourceName 执行资源名
     */
    public void setExecutionResourceName(String ExecutionResourceName) {
        this.ExecutionResourceName = ExecutionResourceName;
    }

    /**
     * Get 执行开始时间 
     * @return StartDate 执行开始时间
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 执行开始时间
     * @param StartDate 执行开始时间
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionResourceName", this.ExecutionResourceName);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
