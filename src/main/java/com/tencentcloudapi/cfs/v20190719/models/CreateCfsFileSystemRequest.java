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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCfsFileSystemRequest extends AbstractModel{

    /**
    * 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 网络类型，可选值为 VPC，BASIC，CCN；其中 VPC 为私有网络，BASIC 为基础网络, CCN 为云联网，Turbo系列当前必须选择云联网。目前基础网络已逐渐淘汰，不推荐使用。
    */
    @SerializedName("NetInterface")
    @Expose
    private String NetInterface;

    /**
    * 权限组 ID，通用标准型和性能型必填，turbo系列请填写pgroupbasic
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * 文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择turbo，不支持NFS、CIFS
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID，若网络类型选择的是VPC，该字段为必填。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定
    */
    @SerializedName("MountIP")
    @Expose
    private String MountIP;

    /**
    * 用户自定义文件系统名称
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * 文件系统标签
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 云联网ID， 若网络类型选择的是CCN，该字段为必填
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售40TiB，即40960 GiB；扩容步长20TiB，即20480 GiB。turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，10240 GiB。
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
     * Get 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表 
     * @return Zone 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     * @param Zone 可用区名称，例如ap-beijing-1，请参考 [概览](https://cloud.tencent.com/document/product/582/13225) 文档中的地域与可用区列表
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 网络类型，可选值为 VPC，BASIC，CCN；其中 VPC 为私有网络，BASIC 为基础网络, CCN 为云联网，Turbo系列当前必须选择云联网。目前基础网络已逐渐淘汰，不推荐使用。 
     * @return NetInterface 网络类型，可选值为 VPC，BASIC，CCN；其中 VPC 为私有网络，BASIC 为基础网络, CCN 为云联网，Turbo系列当前必须选择云联网。目前基础网络已逐渐淘汰，不推荐使用。
     */
    public String getNetInterface() {
        return this.NetInterface;
    }

    /**
     * Set 网络类型，可选值为 VPC，BASIC，CCN；其中 VPC 为私有网络，BASIC 为基础网络, CCN 为云联网，Turbo系列当前必须选择云联网。目前基础网络已逐渐淘汰，不推荐使用。
     * @param NetInterface 网络类型，可选值为 VPC，BASIC，CCN；其中 VPC 为私有网络，BASIC 为基础网络, CCN 为云联网，Turbo系列当前必须选择云联网。目前基础网络已逐渐淘汰，不推荐使用。
     */
    public void setNetInterface(String NetInterface) {
        this.NetInterface = NetInterface;
    }

    /**
     * Get 权限组 ID，通用标准型和性能型必填，turbo系列请填写pgroupbasic 
     * @return PGroupId 权限组 ID，通用标准型和性能型必填，turbo系列请填写pgroupbasic
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组 ID，通用标准型和性能型必填，turbo系列请填写pgroupbasic
     * @param PGroupId 权限组 ID，通用标准型和性能型必填，turbo系列请填写pgroupbasic
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get 文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择turbo，不支持NFS、CIFS 
     * @return Protocol 文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择turbo，不支持NFS、CIFS
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择turbo，不支持NFS、CIFS
     * @param Protocol 文件系统协议类型， 值为 NFS、CIFS、TURBO ; 若留空则默认为 NFS协议，turbo系列必须选择turbo，不支持NFS、CIFS
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。 
     * @return StorageType 文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。
     * @param StorageType 文件系统存储类型，默认值为 SD ；其中 SD 为通用标准型标准型存储， HP为通用性能型存储， TB为turbo标准型， TP 为turbo性能型。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。 
     * @return VpcId 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。
     * @param VpcId 私有网络（VPC） ID，若网络类型选择的是VPC，该字段为必填。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 ID，若网络类型选择的是VPC，该字段为必填。 
     * @return SubnetId 子网 ID，若网络类型选择的是VPC，该字段为必填。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID，若网络类型选择的是VPC，该字段为必填。
     * @param SubnetId 子网 ID，若网络类型选择的是VPC，该字段为必填。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定 
     * @return MountIP 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定
     */
    public String getMountIP() {
        return this.MountIP;
    }

    /**
     * Set 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定
     * @param MountIP 指定IP地址，仅VPC网络支持；若不填写、将在该子网下随机分配 IP，Turbo系列当前不支持指定
     */
    public void setMountIP(String MountIP) {
        this.MountIP = MountIP;
    }

    /**
     * Get 用户自定义文件系统名称 
     * @return FsName 用户自定义文件系统名称
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set 用户自定义文件系统名称
     * @param FsName 用户自定义文件系统名称
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get 文件系统标签 
     * @return ResourceTags 文件系统标签
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 文件系统标签
     * @param ResourceTags 文件系统标签
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。用于保证请求幂等性的字符串失效时间为2小时。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 云联网ID， 若网络类型选择的是CCN，该字段为必填 
     * @return CcnId 云联网ID， 若网络类型选择的是CCN，该字段为必填
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID， 若网络类型选择的是CCN，该字段为必填
     * @param CcnId 云联网ID， 若网络类型选择的是CCN，该字段为必填
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突 
     * @return CidrBlock 云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突
     * @param CidrBlock 云联网中CFS使用的网段， 若网络类型选择的是Ccn，该字段为必填，且不能和Ccn中已经绑定的网段冲突
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售40TiB，即40960 GiB；扩容步长20TiB，即20480 GiB。turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，10240 GiB。 
     * @return Capacity 文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售40TiB，即40960 GiB；扩容步长20TiB，即20480 GiB。turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，10240 GiB。
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售40TiB，即40960 GiB；扩容步长20TiB，即20480 GiB。turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，10240 GiB。
     * @param Capacity 文件系统容量，turbo系列必填，单位为GiB。 turbo标准型单位GB，起售40TiB，即40960 GiB；扩容步长20TiB，即20480 GiB。turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，10240 GiB。
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    public CreateCfsFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCfsFileSystemRequest(CreateCfsFileSystemRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NetInterface != null) {
            this.NetInterface = new String(source.NetInterface);
        }
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.MountIP != null) {
            this.MountIP = new String(source.MountIP);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfo[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfo(source.ResourceTags[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NetInterface", this.NetInterface);
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "MountIP", this.MountIP);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);

    }
}

