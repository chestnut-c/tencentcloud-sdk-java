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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiParagraphInfo extends AbstractModel {

    /**
    * 分段摘要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 分段起始时间点，秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 分段结束时间点，秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get 分段摘要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary 分段摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 分段摘要
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary 分段摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 分段起始时间点，秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTimeOffset 分段起始时间点，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 分段起始时间点，秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTimeOffset 分段起始时间点，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 分段结束时间点，秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTimeOffset 分段结束时间点，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 分段结束时间点，秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTimeOffset 分段结束时间点，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public AiParagraphInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiParagraphInfo(AiParagraphInfo source) {
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

