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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebManagedRulesTopDataResponse extends AbstractModel{

    /**
    * topn数据
    */
    @SerializedName("Data")
    @Expose
    private TopNEntry [] Data;

    /**
    * 状态，1:失败，0:成功
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 返回消息
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get topn数据 
     * @return Data topn数据
     */
    public TopNEntry [] getData() {
        return this.Data;
    }

    /**
     * Set topn数据
     * @param Data topn数据
     */
    public void setData(TopNEntry [] Data) {
        this.Data = Data;
    }

    /**
     * Get 状态，1:失败，0:成功 
     * @return Status 状态，1:失败，0:成功
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，1:失败，0:成功
     * @param Status 状态，1:失败，0:成功
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 返回消息 
     * @return Msg 返回消息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 返回消息
     * @param Msg 返回消息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
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

    public DescribeWebManagedRulesTopDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebManagedRulesTopDataResponse(DescribeWebManagedRulesTopDataResponse source) {
        if (source.Data != null) {
            this.Data = new TopNEntry[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TopNEntry(source.Data[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
