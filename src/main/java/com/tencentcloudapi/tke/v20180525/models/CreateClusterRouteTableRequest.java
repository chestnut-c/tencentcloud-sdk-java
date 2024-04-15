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

public class CreateClusterRouteTableRequest extends AbstractModel {

    /**
    * 路由表名称，一般为集群ID
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * 路由表CIDR
    */
    @SerializedName("RouteTableCidrBlock")
    @Expose
    private String RouteTableCidrBlock;

    /**
    * 路由表绑定的VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 是否忽略CIDR与 vpc 路由表的冲突， 0 表示不忽略，1表示忽略。默认不忽略
    */
    @SerializedName("IgnoreClusterCidrConflict")
    @Expose
    private Long IgnoreClusterCidrConflict;

    /**
     * Get 路由表名称，一般为集群ID 
     * @return RouteTableName 路由表名称，一般为集群ID
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set 路由表名称，一般为集群ID
     * @param RouteTableName 路由表名称，一般为集群ID
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get 路由表CIDR 
     * @return RouteTableCidrBlock 路由表CIDR
     */
    public String getRouteTableCidrBlock() {
        return this.RouteTableCidrBlock;
    }

    /**
     * Set 路由表CIDR
     * @param RouteTableCidrBlock 路由表CIDR
     */
    public void setRouteTableCidrBlock(String RouteTableCidrBlock) {
        this.RouteTableCidrBlock = RouteTableCidrBlock;
    }

    /**
     * Get 路由表绑定的VPC 
     * @return VpcId 路由表绑定的VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 路由表绑定的VPC
     * @param VpcId 路由表绑定的VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 是否忽略CIDR与 vpc 路由表的冲突， 0 表示不忽略，1表示忽略。默认不忽略 
     * @return IgnoreClusterCidrConflict 是否忽略CIDR与 vpc 路由表的冲突， 0 表示不忽略，1表示忽略。默认不忽略
     */
    public Long getIgnoreClusterCidrConflict() {
        return this.IgnoreClusterCidrConflict;
    }

    /**
     * Set 是否忽略CIDR与 vpc 路由表的冲突， 0 表示不忽略，1表示忽略。默认不忽略
     * @param IgnoreClusterCidrConflict 是否忽略CIDR与 vpc 路由表的冲突， 0 表示不忽略，1表示忽略。默认不忽略
     */
    public void setIgnoreClusterCidrConflict(Long IgnoreClusterCidrConflict) {
        this.IgnoreClusterCidrConflict = IgnoreClusterCidrConflict;
    }

    public CreateClusterRouteTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRouteTableRequest(CreateClusterRouteTableRequest source) {
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
        }
        if (source.RouteTableCidrBlock != null) {
            this.RouteTableCidrBlock = new String(source.RouteTableCidrBlock);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.IgnoreClusterCidrConflict != null) {
            this.IgnoreClusterCidrConflict = new Long(source.IgnoreClusterCidrConflict);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamSimple(map, prefix + "RouteTableCidrBlock", this.RouteTableCidrBlock);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "IgnoreClusterCidrConflict", this.IgnoreClusterCidrConflict);

    }
}

