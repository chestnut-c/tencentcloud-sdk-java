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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptionalRuntimes extends AbstractModel {

    /**
    * 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeType")
    @Expose
    private String RuntimeType;

    /**
    * 运行时版本列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeVersions")
    @Expose
    private String [] RuntimeVersions;

    /**
    * 该类型的默认运行时版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultVersion")
    @Expose
    private String DefaultVersion;

    /**
     * Get 运行时类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeType 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntimeType() {
        return this.RuntimeType;
    }

    /**
     * Set 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeType 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeType(String RuntimeType) {
        this.RuntimeType = RuntimeType;
    }

    /**
     * Get 运行时版本列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeVersions 运行时版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuntimeVersions() {
        return this.RuntimeVersions;
    }

    /**
     * Set 运行时版本列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeVersions 运行时版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeVersions(String [] RuntimeVersions) {
        this.RuntimeVersions = RuntimeVersions;
    }

    /**
     * Get 该类型的默认运行时版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultVersion 该类型的默认运行时版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultVersion() {
        return this.DefaultVersion;
    }

    /**
     * Set 该类型的默认运行时版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultVersion 该类型的默认运行时版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultVersion(String DefaultVersion) {
        this.DefaultVersion = DefaultVersion;
    }

    public OptionalRuntimes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptionalRuntimes(OptionalRuntimes source) {
        if (source.RuntimeType != null) {
            this.RuntimeType = new String(source.RuntimeType);
        }
        if (source.RuntimeVersions != null) {
            this.RuntimeVersions = new String[source.RuntimeVersions.length];
            for (int i = 0; i < source.RuntimeVersions.length; i++) {
                this.RuntimeVersions[i] = new String(source.RuntimeVersions[i]);
            }
        }
        if (source.DefaultVersion != null) {
            this.DefaultVersion = new String(source.DefaultVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuntimeType", this.RuntimeType);
        this.setParamArraySimple(map, prefix + "RuntimeVersions.", this.RuntimeVersions);
        this.setParamSimple(map, prefix + "DefaultVersion", this.DefaultVersion);

    }
}

