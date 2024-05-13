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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeThaiIDCardOCRResponse extends AbstractModel {

    /**
    * 身份证号码
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 泰文姓名
    */
    @SerializedName("ThaiName")
    @Expose
    private String ThaiName;

    /**
    * 英文姓名
    */
    @SerializedName("EnFirstName")
    @Expose
    private String EnFirstName;

    /**
    * 英文姓名
    */
    @SerializedName("EnLastName")
    @Expose
    private String EnLastName;

    /**
    * 泰文签发日期
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 泰文到期日期
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 泰文出生日期
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 证件人像照片抠取
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 身份证号码 
     * @return ID 身份证号码
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 身份证号码
     * @param ID 身份证号码
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 泰文姓名 
     * @return ThaiName 泰文姓名
     */
    public String getThaiName() {
        return this.ThaiName;
    }

    /**
     * Set 泰文姓名
     * @param ThaiName 泰文姓名
     */
    public void setThaiName(String ThaiName) {
        this.ThaiName = ThaiName;
    }

    /**
     * Get 英文姓名 
     * @return EnFirstName 英文姓名
     */
    public String getEnFirstName() {
        return this.EnFirstName;
    }

    /**
     * Set 英文姓名
     * @param EnFirstName 英文姓名
     */
    public void setEnFirstName(String EnFirstName) {
        this.EnFirstName = EnFirstName;
    }

    /**
     * Get 英文姓名 
     * @return EnLastName 英文姓名
     */
    public String getEnLastName() {
        return this.EnLastName;
    }

    /**
     * Set 英文姓名
     * @param EnLastName 英文姓名
     */
    public void setEnLastName(String EnLastName) {
        this.EnLastName = EnLastName;
    }

    /**
     * Get 泰文签发日期 
     * @return IssueDate 泰文签发日期
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 泰文签发日期
     * @param IssueDate 泰文签发日期
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get 泰文到期日期 
     * @return ExpirationDate 泰文到期日期
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 泰文到期日期
     * @param ExpirationDate 泰文到期日期
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get 泰文出生日期 
     * @return Birthday 泰文出生日期
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 泰文出生日期
     * @param Birthday 泰文出生日期
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 证件人像照片抠取 
     * @return PortraitImage 证件人像照片抠取
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set 证件人像照片抠取
     * @param PortraitImage 证件人像照片抠取
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通 
     * @return WarnCardInfos 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     * @param WarnCardInfos 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
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

    public RecognizeThaiIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeThaiIDCardOCRResponse(RecognizeThaiIDCardOCRResponse source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.ThaiName != null) {
            this.ThaiName = new String(source.ThaiName);
        }
        if (source.EnFirstName != null) {
            this.EnFirstName = new String(source.EnFirstName);
        }
        if (source.EnLastName != null) {
            this.EnLastName = new String(source.EnLastName);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
        if (source.WarnCardInfos != null) {
            this.WarnCardInfos = new Long[source.WarnCardInfos.length];
            for (int i = 0; i < source.WarnCardInfos.length; i++) {
                this.WarnCardInfos[i] = new Long(source.WarnCardInfos[i]);
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ThaiName", this.ThaiName);
        this.setParamSimple(map, prefix + "EnFirstName", this.EnFirstName);
        this.setParamSimple(map, prefix + "EnLastName", this.EnLastName);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);
        this.setParamArraySimple(map, prefix + "WarnCardInfos.", this.WarnCardInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

