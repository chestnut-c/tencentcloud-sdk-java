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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSSLRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 操作类型。enable-开启SSL，disable-关闭SSL，renew-更新证书有效期
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 操作设置。0-立即执行，1- 维护时间内执行，默认取值0。
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 操作类型。enable-开启SSL，disable-关闭SSL，renew-更新证书有效期 
     * @return Type 操作类型。enable-开启SSL，disable-关闭SSL，renew-更新证书有效期
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 操作类型。enable-开启SSL，disable-关闭SSL，renew-更新证书有效期
     * @param Type 操作类型。enable-开启SSL，disable-关闭SSL，renew-更新证书有效期
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 操作设置。0-立即执行，1- 维护时间内执行，默认取值0。 
     * @return WaitSwitch 操作设置。0-立即执行，1- 维护时间内执行，默认取值0。
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set 操作设置。0-立即执行，1- 维护时间内执行，默认取值0。
     * @param WaitSwitch 操作设置。0-立即执行，1- 维护时间内执行，默认取值0。
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    public ModifyDBInstanceSSLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSSLRequest(ModifyDBInstanceSSLRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);

    }
}

