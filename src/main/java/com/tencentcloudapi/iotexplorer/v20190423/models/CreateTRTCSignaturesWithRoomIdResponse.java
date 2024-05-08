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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTRTCSignaturesWithRoomIdResponse extends AbstractModel {

    /**
    * 返回参数数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TRTCParamList")
    @Expose
    private TRTCParams [] TRTCParamList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回参数数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TRTCParamList 返回参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TRTCParams [] getTRTCParamList() {
        return this.TRTCParamList;
    }

    /**
     * Set 返回参数数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param TRTCParamList 返回参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTRTCParamList(TRTCParams [] TRTCParamList) {
        this.TRTCParamList = TRTCParamList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateTRTCSignaturesWithRoomIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTRTCSignaturesWithRoomIdResponse(CreateTRTCSignaturesWithRoomIdResponse source) {
        if (source.TRTCParamList != null) {
            this.TRTCParamList = new TRTCParams[source.TRTCParamList.length];
            for (int i = 0; i < source.TRTCParamList.length; i++) {
                this.TRTCParamList[i] = new TRTCParams(source.TRTCParamList[i]);
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
        this.setParamArrayObj(map, prefix + "TRTCParamList.", this.TRTCParamList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

