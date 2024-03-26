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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceIdRiskInfoRequest extends AbstractModel {

    /**
    * SDK人脸核身流程的标识，调用GetFaceidRiskInfoToken接口时生成。
    */
    @SerializedName("FaceIdToken")
    @Expose
    private String FaceIdToken;

    /**
     * Get SDK人脸核身流程的标识，调用GetFaceidRiskInfoToken接口时生成。 
     * @return FaceIdToken SDK人脸核身流程的标识，调用GetFaceidRiskInfoToken接口时生成。
     */
    public String getFaceIdToken() {
        return this.FaceIdToken;
    }

    /**
     * Set SDK人脸核身流程的标识，调用GetFaceidRiskInfoToken接口时生成。
     * @param FaceIdToken SDK人脸核身流程的标识，调用GetFaceidRiskInfoToken接口时生成。
     */
    public void setFaceIdToken(String FaceIdToken) {
        this.FaceIdToken = FaceIdToken;
    }

    public GetFaceIdRiskInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFaceIdRiskInfoRequest(GetFaceIdRiskInfoRequest source) {
        if (source.FaceIdToken != null) {
            this.FaceIdToken = new String(source.FaceIdToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceIdToken", this.FaceIdToken);

    }
}

