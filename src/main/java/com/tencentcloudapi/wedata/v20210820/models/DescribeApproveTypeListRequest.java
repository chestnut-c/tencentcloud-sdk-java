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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApproveTypeListRequest extends AbstractModel {

    /**
    * 类型key
    */
    @SerializedName("Classification")
    @Expose
    private String Classification;

    /**
     * Get 类型key 
     * @return Classification 类型key
     */
    public String getClassification() {
        return this.Classification;
    }

    /**
     * Set 类型key
     * @param Classification 类型key
     */
    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    public DescribeApproveTypeListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApproveTypeListRequest(DescribeApproveTypeListRequest source) {
        if (source.Classification != null) {
            this.Classification = new String(source.Classification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Classification", this.Classification);

    }
}

