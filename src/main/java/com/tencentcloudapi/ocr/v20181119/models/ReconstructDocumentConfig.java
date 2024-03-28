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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconstructDocumentConfig extends AbstractModel {

    /**
    * 生成的Markdown中是否嵌入图片
    */
    @SerializedName("EnableInsetImage")
    @Expose
    private Boolean EnableInsetImage;

    /**
     * Get 生成的Markdown中是否嵌入图片 
     * @return EnableInsetImage 生成的Markdown中是否嵌入图片
     */
    public Boolean getEnableInsetImage() {
        return this.EnableInsetImage;
    }

    /**
     * Set 生成的Markdown中是否嵌入图片
     * @param EnableInsetImage 生成的Markdown中是否嵌入图片
     */
    public void setEnableInsetImage(Boolean EnableInsetImage) {
        this.EnableInsetImage = EnableInsetImage;
    }

    public ReconstructDocumentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconstructDocumentConfig(ReconstructDocumentConfig source) {
        if (source.EnableInsetImage != null) {
            this.EnableInsetImage = new Boolean(source.EnableInsetImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableInsetImage", this.EnableInsetImage);

    }
}

