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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusDTO extends AbstractModel {

    /**
    * export类型（jmx_export\node_export）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * vip
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * vport
    */
    @SerializedName("SourcePort")
    @Expose
    private Long SourcePort;

    /**
     * Get export类型（jmx_export\node_export） 
     * @return Type export类型（jmx_export\node_export）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set export类型（jmx_export\node_export）
     * @param Type export类型（jmx_export\node_export）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get vip 
     * @return SourceIp vip
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set vip
     * @param SourceIp vip
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get vport 
     * @return SourcePort vport
     */
    public Long getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set vport
     * @param SourcePort vport
     */
    public void setSourcePort(Long SourcePort) {
        this.SourcePort = SourcePort;
    }

    public PrometheusDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusDTO(PrometheusDTO source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new Long(source.SourcePort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "SourcePort", this.SourcePort);

    }
}

