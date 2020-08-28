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
package com.tencentcloudapi.ft.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceCartoonPicResponse extends AbstractModel{

    /**
    * 结果图片Base64信息。
    */
    @SerializedName("ResultImage")
    @Expose
    private String ResultImage;

    /**
    * RspImgType 为 url 时，返回处理后的图片 url 数据。(暂时不支持)
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 结果图片Base64信息。 
     * @return ResultImage 结果图片Base64信息。
     */
    public String getResultImage() {
        return this.ResultImage;
    }

    /**
     * Set 结果图片Base64信息。
     * @param ResultImage 结果图片Base64信息。
     */
    public void setResultImage(String ResultImage) {
        this.ResultImage = ResultImage;
    }

    /**
     * Get RspImgType 为 url 时，返回处理后的图片 url 数据。(暂时不支持) 
     * @return ResultUrl RspImgType 为 url 时，返回处理后的图片 url 数据。(暂时不支持)
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set RspImgType 为 url 时，返回处理后的图片 url 数据。(暂时不支持)
     * @param ResultUrl RspImgType 为 url 时，返回处理后的图片 url 数据。(暂时不支持)
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
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
        this.setParamSimple(map, prefix + "ResultImage", this.ResultImage);
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

