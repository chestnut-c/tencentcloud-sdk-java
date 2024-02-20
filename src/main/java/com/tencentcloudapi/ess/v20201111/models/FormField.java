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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FormField extends AbstractModel {

    /**
    * 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT ：  文本内容
MULTI_LINE_TEXT ：文本内容
CHECK_BOX ：true/false
FILL_IMAGE、ATTACHMENT ： 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR ： 选项值
DYNAMIC_TABLE ：传入json格式的表格内容，具体见数据结构[点击查看](https://qian.tencent.com/developers/company/dynamic_table)
    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * 控件id，和ComponentName选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件ID的方式</a>
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * 控件名字，最大长度不超过30字符，和ComponentId选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件名字的方式</a>
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
     * Get 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT ：  文本内容
MULTI_LINE_TEXT ：文本内容
CHECK_BOX ：true/false
FILL_IMAGE、ATTACHMENT ： 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR ： 选项值
DYNAMIC_TABLE ：传入json格式的表格内容，具体见数据结构[点击查看](https://qian.tencent.com/developers/company/dynamic_table) 
     * @return ComponentValue 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT ：  文本内容
MULTI_LINE_TEXT ：文本内容
CHECK_BOX ：true/false
FILL_IMAGE、ATTACHMENT ： 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR ： 选项值
DYNAMIC_TABLE ：传入json格式的表格内容，具体见数据结构[点击查看](https://qian.tencent.com/developers/company/dynamic_table)
     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT ：  文本内容
MULTI_LINE_TEXT ：文本内容
CHECK_BOX ：true/false
FILL_IMAGE、ATTACHMENT ： 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR ： 选项值
DYNAMIC_TABLE ：传入json格式的表格内容，具体见数据结构[点击查看](https://qian.tencent.com/developers/company/dynamic_table)
     * @param ComponentValue 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT ：  文本内容
MULTI_LINE_TEXT ：文本内容
CHECK_BOX ：true/false
FILL_IMAGE、ATTACHMENT ： 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR ： 选项值
DYNAMIC_TABLE ：传入json格式的表格内容，具体见数据结构[点击查看](https://qian.tencent.com/developers/company/dynamic_table)
     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    /**
     * Get 控件id，和ComponentName选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件ID的方式</a> 
     * @return ComponentId 控件id，和ComponentName选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件ID的方式</a>
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 控件id，和ComponentName选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件ID的方式</a>
     * @param ComponentId 控件id，和ComponentName选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件ID的方式</a>
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get 控件名字，最大长度不超过30字符，和ComponentId选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件名字的方式</a> 
     * @return ComponentName 控件名字，最大长度不超过30字符，和ComponentId选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件名字的方式</a>
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 控件名字，最大长度不超过30字符，和ComponentId选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件名字的方式</a>
     * @param ComponentName 控件名字，最大长度不超过30字符，和ComponentId选择一项传入即可

<a href="https://dyn.ess.tencent.cn/guide/apivideo/component_name.mp4" target="_blank">点击查看在模板中找到控件名字的方式</a>
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    public FormField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FormField(FormField source) {
        if (source.ComponentValue != null) {
            this.ComponentValue = new String(source.ComponentValue);
        }
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentValue", this.ComponentValue);
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);

    }
}

