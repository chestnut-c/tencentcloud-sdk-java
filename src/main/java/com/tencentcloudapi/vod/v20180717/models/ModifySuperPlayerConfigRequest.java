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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySuperPlayerConfigRequest extends AbstractModel {

    /**
    * 播放器配置名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * 允许输出的未加密的自适应码流模板 ID。
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * 允许输出的 DRM 自适应码流模板内容。
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfoForUpdate DrmStreamingsInfo;

    /**
    * 允许输出的转码模板 ID。
    */
    @SerializedName("TranscodeDefinition")
    @Expose
    private Long TranscodeDefinition;

    /**
    * 允许输出的雪碧图模板 ID。
    */
    @SerializedName("ImageSpriteDefinition")
    @Expose
    private Long ImageSpriteDefinition;

    /**
    * 播放器对于不同分辨率的子流展示名字。
    */
    @SerializedName("ResolutionNames")
    @Expose
    private ResolutionNameInfo [] ResolutionNames;

    /**
    * 播放时使用的域名。填 Default 表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 播放时使用的 Scheme。取值范围：
<li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li>
<li>HTTP；</li>
<li>HTTPS。</li>
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 播放器配置名称。 
     * @return Name 播放器配置名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 播放器配置名称。
     * @param Name 播放器配置名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li> 
     * @return AudioVideoType 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
     * @param AudioVideoType 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li> 
     * @return DrmSwitch 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
     * @param DrmSwitch 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get 允许输出的未加密的自适应码流模板 ID。 
     * @return AdaptiveDynamicStreamingDefinition 允许输出的未加密的自适应码流模板 ID。
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set 允许输出的未加密的自适应码流模板 ID。
     * @param AdaptiveDynamicStreamingDefinition 允许输出的未加密的自适应码流模板 ID。
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get 允许输出的 DRM 自适应码流模板内容。 
     * @return DrmStreamingsInfo 允许输出的 DRM 自适应码流模板内容。
     */
    public DrmStreamingsInfoForUpdate getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set 允许输出的 DRM 自适应码流模板内容。
     * @param DrmStreamingsInfo 允许输出的 DRM 自适应码流模板内容。
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfoForUpdate DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
    }

    /**
     * Get 允许输出的转码模板 ID。 
     * @return TranscodeDefinition 允许输出的转码模板 ID。
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set 允许输出的转码模板 ID。
     * @param TranscodeDefinition 允许输出的转码模板 ID。
     */
    public void setTranscodeDefinition(Long TranscodeDefinition) {
        this.TranscodeDefinition = TranscodeDefinition;
    }

    /**
     * Get 允许输出的雪碧图模板 ID。 
     * @return ImageSpriteDefinition 允许输出的雪碧图模板 ID。
     */
    public Long getImageSpriteDefinition() {
        return this.ImageSpriteDefinition;
    }

    /**
     * Set 允许输出的雪碧图模板 ID。
     * @param ImageSpriteDefinition 允许输出的雪碧图模板 ID。
     */
    public void setImageSpriteDefinition(Long ImageSpriteDefinition) {
        this.ImageSpriteDefinition = ImageSpriteDefinition;
    }

    /**
     * Get 播放器对于不同分辨率的子流展示名字。 
     * @return ResolutionNames 播放器对于不同分辨率的子流展示名字。
     */
    public ResolutionNameInfo [] getResolutionNames() {
        return this.ResolutionNames;
    }

    /**
     * Set 播放器对于不同分辨率的子流展示名字。
     * @param ResolutionNames 播放器对于不同分辨率的子流展示名字。
     */
    public void setResolutionNames(ResolutionNameInfo [] ResolutionNames) {
        this.ResolutionNames = ResolutionNames;
    }

    /**
     * Get 播放时使用的域名。填 Default 表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。 
     * @return Domain 播放时使用的域名。填 Default 表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 播放时使用的域名。填 Default 表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。
     * @param Domain 播放时使用的域名。填 Default 表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 播放时使用的 Scheme。取值范围：
<li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li>
<li>HTTP；</li>
<li>HTTPS。</li> 
     * @return Scheme 播放时使用的 Scheme。取值范围：
<li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li>
<li>HTTP；</li>
<li>HTTPS。</li>
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 播放时使用的 Scheme。取值范围：
<li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li>
<li>HTTP；</li>
<li>HTTPS。</li>
     * @param Scheme 播放时使用的 Scheme。取值范围：
<li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li>
<li>HTTP；</li>
<li>HTTPS。</li>
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public ModifySuperPlayerConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySuperPlayerConfigRequest(ModifySuperPlayerConfigRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.AudioVideoType != null) {
            this.AudioVideoType = new String(source.AudioVideoType);
        }
        if (source.DrmSwitch != null) {
            this.DrmSwitch = new String(source.DrmSwitch);
        }
        if (source.AdaptiveDynamicStreamingDefinition != null) {
            this.AdaptiveDynamicStreamingDefinition = new Long(source.AdaptiveDynamicStreamingDefinition);
        }
        if (source.DrmStreamingsInfo != null) {
            this.DrmStreamingsInfo = new DrmStreamingsInfoForUpdate(source.DrmStreamingsInfo);
        }
        if (source.TranscodeDefinition != null) {
            this.TranscodeDefinition = new Long(source.TranscodeDefinition);
        }
        if (source.ImageSpriteDefinition != null) {
            this.ImageSpriteDefinition = new Long(source.ImageSpriteDefinition);
        }
        if (source.ResolutionNames != null) {
            this.ResolutionNames = new ResolutionNameInfo[source.ResolutionNames.length];
            for (int i = 0; i < source.ResolutionNames.length; i++) {
                this.ResolutionNames[i] = new ResolutionNameInfo(source.ResolutionNames[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "DrmSwitch", this.DrmSwitch);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamObj(map, prefix + "DrmStreamingsInfo.", this.DrmStreamingsInfo);
        this.setParamSimple(map, prefix + "TranscodeDefinition", this.TranscodeDefinition);
        this.setParamSimple(map, prefix + "ImageSpriteDefinition", this.ImageSpriteDefinition);
        this.setParamArrayObj(map, prefix + "ResolutionNames.", this.ResolutionNames);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

