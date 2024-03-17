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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GovernanceServiceContract extends AbstractModel {

    /**
    * 契约名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 所属服务命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 契约ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 所属服务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 信息摘要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
    * 额外内容描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 契约接口列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Interfaces")
    @Expose
    private GovernanceInterfaceDescription [] Interfaces;

    /**
     * Get 契约名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 契约名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 契约名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 契约名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 所属服务命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 所属服务命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 所属服务命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 所属服务命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 契约ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 契约ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 契约ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 契约ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 所属服务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service 所属服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 所属服务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service 所属服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 信息摘要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Revision 信息摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set 信息摘要
注意：此字段可能返回 null，表示取不到有效值。
     * @param Revision 信息摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
    }

    /**
     * Get 额外内容描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 额外内容描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 额外内容描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 额外内容描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 契约接口列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Interfaces 契约接口列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GovernanceInterfaceDescription [] getInterfaces() {
        return this.Interfaces;
    }

    /**
     * Set 契约接口列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Interfaces 契约接口列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterfaces(GovernanceInterfaceDescription [] Interfaces) {
        this.Interfaces = Interfaces;
    }

    public GovernanceServiceContract() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceServiceContract(GovernanceServiceContract source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Revision != null) {
            this.Revision = new String(source.Revision);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Interfaces != null) {
            this.Interfaces = new GovernanceInterfaceDescription[source.Interfaces.length];
            for (int i = 0; i < source.Interfaces.length; i++) {
                this.Interfaces[i] = new GovernanceInterfaceDescription(source.Interfaces[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Revision", this.Revision);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArrayObj(map, prefix + "Interfaces.", this.Interfaces);

    }
}

