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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceLoginSettingsResponse extends AbstractModel {

    /**
    * 服务登录配置详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSetting [] LoginSettings;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务登录配置详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoginSettings 服务登录配置详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoginSetting [] getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 服务登录配置详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoginSettings 服务登录配置详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoginSettings(LoginSetting [] LoginSettings) {
        this.LoginSettings = LoginSettings;
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

    public DescribeServiceLoginSettingsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceLoginSettingsResponse(DescribeServiceLoginSettingsResponse source) {
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSetting[source.LoginSettings.length];
            for (int i = 0; i < source.LoginSettings.length; i++) {
                this.LoginSettings[i] = new LoginSetting(source.LoginSettings[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

