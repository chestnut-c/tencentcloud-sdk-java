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

public class GenerateSignedVideoURLRequest extends AbstractModel {

    /**
    * 视频播放原始URL地址
    */
    @SerializedName("VideoURL")
    @Expose
    private String VideoURL;

    /**
    * 播放链接过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 通道ID 非NVR设备不填 NVR设备必填 默认为无	
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
     * Get 视频播放原始URL地址 
     * @return VideoURL 视频播放原始URL地址
     */
    public String getVideoURL() {
        return this.VideoURL;
    }

    /**
     * Set 视频播放原始URL地址
     * @param VideoURL 视频播放原始URL地址
     */
    public void setVideoURL(String VideoURL) {
        this.VideoURL = VideoURL;
    }

    /**
     * Get 播放链接过期时间 
     * @return ExpireTime 播放链接过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 播放链接过期时间
     * @param ExpireTime 播放链接过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 通道ID 非NVR设备不填 NVR设备必填 默认为无	 
     * @return ChannelId 通道ID 非NVR设备不填 NVR设备必填 默认为无	
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID 非NVR设备不填 NVR设备必填 默认为无	
     * @param ChannelId 通道ID 非NVR设备不填 NVR设备必填 默认为无	
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    public GenerateSignedVideoURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateSignedVideoURLRequest(GenerateSignedVideoURLRequest source) {
        if (source.VideoURL != null) {
            this.VideoURL = new String(source.VideoURL);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoURL", this.VideoURL);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

