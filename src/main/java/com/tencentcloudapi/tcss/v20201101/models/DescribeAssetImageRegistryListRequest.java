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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRegistryListRequest extends AbstractModel{

    /**
    * 需要返回的数量，默认为10，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤字段
IsAuthorized是否授权，取值全部all，未授权0，已授权1
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方式，asc，desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 是否仅展示各repository最新的镜像, 默认为false
    */
    @SerializedName("OnlyShowLatest")
    @Expose
    private Boolean OnlyShowLatest;

    /**
    * 是否仅展示运行中容器镜像
    */
    @SerializedName("IsRunning")
    @Expose
    private Boolean IsRunning;

    /**
     * Get 需要返回的数量，默认为10，最大值为100 
     * @return Limit 需要返回的数量，默认为10，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为100
     * @param Limit 需要返回的数量，默认为10，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤字段
IsAuthorized是否授权，取值全部all，未授权0，已授权1 
     * @return Filters 过滤字段
IsAuthorized是否授权，取值全部all，未授权0，已授权1
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤字段
IsAuthorized是否授权，取值全部all，未授权0，已授权1
     * @param Filters 过滤字段
IsAuthorized是否授权，取值全部all，未授权0，已授权1
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方式，asc，desc 
     * @return Order 排序方式，asc，desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，asc，desc
     * @param Order 排序方式，asc，desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 是否仅展示各repository最新的镜像, 默认为false 
     * @return OnlyShowLatest 是否仅展示各repository最新的镜像, 默认为false
     */
    public Boolean getOnlyShowLatest() {
        return this.OnlyShowLatest;
    }

    /**
     * Set 是否仅展示各repository最新的镜像, 默认为false
     * @param OnlyShowLatest 是否仅展示各repository最新的镜像, 默认为false
     */
    public void setOnlyShowLatest(Boolean OnlyShowLatest) {
        this.OnlyShowLatest = OnlyShowLatest;
    }

    /**
     * Get 是否仅展示运行中容器镜像 
     * @return IsRunning 是否仅展示运行中容器镜像
     */
    public Boolean getIsRunning() {
        return this.IsRunning;
    }

    /**
     * Set 是否仅展示运行中容器镜像
     * @param IsRunning 是否仅展示运行中容器镜像
     */
    public void setIsRunning(Boolean IsRunning) {
        this.IsRunning = IsRunning;
    }

    public DescribeAssetImageRegistryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryListRequest(DescribeAssetImageRegistryListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OnlyShowLatest != null) {
            this.OnlyShowLatest = new Boolean(source.OnlyShowLatest);
        }
        if (source.IsRunning != null) {
            this.IsRunning = new Boolean(source.IsRunning);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OnlyShowLatest", this.OnlyShowLatest);
        this.setParamSimple(map, prefix + "IsRunning", this.IsRunning);

    }
}

