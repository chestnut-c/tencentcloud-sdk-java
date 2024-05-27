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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyChangePwdTaskRequest extends AbstractModel {

    /**
    * 改密任务id
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * 改密资产id列表
    */
    @SerializedName("DeviceIdSet")
    @Expose
    private Long [] DeviceIdSet;

    /**
    * 改密资产的账号列表
    */
    @SerializedName("AccountSet")
    @Expose
    private String [] AccountSet;

    /**
    * 修改类型：1：修改任务信息  2：关联任务资产账号
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * 改密方式。1：使用执行账号修改密码；2：修改自身密码
    */
    @SerializedName("ChangeMethod")
    @Expose
    private Long ChangeMethod;

    /**
    * 密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码
    */
    @SerializedName("AuthGenerationStrategy")
    @Expose
    private Long AuthGenerationStrategy;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 所属部门ID，"1,2,3"
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 任务的执行账号	
    */
    @SerializedName("RunAccount")
    @Expose
    private String RunAccount;

    /**
    * 密码，手动指定密码时必传。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 密码限制长度，自动生成密码必传。	
    */
    @SerializedName("PasswordLength")
    @Expose
    private Long PasswordLength;

    /**
    * 密码包含小写字母，0：否，1：是。
    */
    @SerializedName("SmallLetter")
    @Expose
    private Long SmallLetter;

    /**
    * 密码包含大写字母，0：否，1：是。
    */
    @SerializedName("BigLetter")
    @Expose
    private Long BigLetter;

    /**
    * 密码包含数字，0：否，1：是。
    */
    @SerializedName("Digit")
    @Expose
    private Long Digit;

    /**
    * 密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * 改密完成通知。0：不通知 1：通知
    */
    @SerializedName("CompleteNotify")
    @Expose
    private Long CompleteNotify;

    /**
    * 通知邮箱
    */
    @SerializedName("NotifyEmails")
    @Expose
    private String [] NotifyEmails;

    /**
    * 加密压缩文件密码
    */
    @SerializedName("FilePassword")
    @Expose
    private String FilePassword;

    /**
    * 任务类型， 4：手工执行  5：周期自动执行
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 周期任务周期，单位天（大于等于 1，小于等于 365）
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 周期任务首次执行时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
     * Get 改密任务id 
     * @return OperationId 改密任务id
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set 改密任务id
     * @param OperationId 改密任务id
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get 改密资产id列表 
     * @return DeviceIdSet 改密资产id列表
     */
    public Long [] getDeviceIdSet() {
        return this.DeviceIdSet;
    }

    /**
     * Set 改密资产id列表
     * @param DeviceIdSet 改密资产id列表
     */
    public void setDeviceIdSet(Long [] DeviceIdSet) {
        this.DeviceIdSet = DeviceIdSet;
    }

    /**
     * Get 改密资产的账号列表 
     * @return AccountSet 改密资产的账号列表
     */
    public String [] getAccountSet() {
        return this.AccountSet;
    }

    /**
     * Set 改密资产的账号列表
     * @param AccountSet 改密资产的账号列表
     */
    public void setAccountSet(String [] AccountSet) {
        this.AccountSet = AccountSet;
    }

    /**
     * Get 修改类型：1：修改任务信息  2：关联任务资产账号 
     * @return ModifyType 修改类型：1：修改任务信息  2：关联任务资产账号
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 修改类型：1：修改任务信息  2：关联任务资产账号
     * @param ModifyType 修改类型：1：修改任务信息  2：关联任务资产账号
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get 改密方式。1：使用执行账号修改密码；2：修改自身密码 
     * @return ChangeMethod 改密方式。1：使用执行账号修改密码；2：修改自身密码
     */
    public Long getChangeMethod() {
        return this.ChangeMethod;
    }

    /**
     * Set 改密方式。1：使用执行账号修改密码；2：修改自身密码
     * @param ChangeMethod 改密方式。1：使用执行账号修改密码；2：修改自身密码
     */
    public void setChangeMethod(Long ChangeMethod) {
        this.ChangeMethod = ChangeMethod;
    }

    /**
     * Get 密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码 
     * @return AuthGenerationStrategy 密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码
     */
    public Long getAuthGenerationStrategy() {
        return this.AuthGenerationStrategy;
    }

    /**
     * Set 密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码
     * @param AuthGenerationStrategy 密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码
     */
    public void setAuthGenerationStrategy(Long AuthGenerationStrategy) {
        this.AuthGenerationStrategy = AuthGenerationStrategy;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 所属部门ID，"1,2,3" 
     * @return DepartmentId 所属部门ID，"1,2,3"
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 所属部门ID，"1,2,3"
     * @param DepartmentId 所属部门ID，"1,2,3"
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 任务的执行账号	 
     * @return RunAccount 任务的执行账号	
     */
    public String getRunAccount() {
        return this.RunAccount;
    }

    /**
     * Set 任务的执行账号	
     * @param RunAccount 任务的执行账号	
     */
    public void setRunAccount(String RunAccount) {
        this.RunAccount = RunAccount;
    }

    /**
     * Get 密码，手动指定密码时必传。 
     * @return Password 密码，手动指定密码时必传。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码，手动指定密码时必传。
     * @param Password 密码，手动指定密码时必传。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 密码限制长度，自动生成密码必传。	 
     * @return PasswordLength 密码限制长度，自动生成密码必传。	
     */
    public Long getPasswordLength() {
        return this.PasswordLength;
    }

    /**
     * Set 密码限制长度，自动生成密码必传。	
     * @param PasswordLength 密码限制长度，自动生成密码必传。	
     */
    public void setPasswordLength(Long PasswordLength) {
        this.PasswordLength = PasswordLength;
    }

    /**
     * Get 密码包含小写字母，0：否，1：是。 
     * @return SmallLetter 密码包含小写字母，0：否，1：是。
     */
    public Long getSmallLetter() {
        return this.SmallLetter;
    }

    /**
     * Set 密码包含小写字母，0：否，1：是。
     * @param SmallLetter 密码包含小写字母，0：否，1：是。
     */
    public void setSmallLetter(Long SmallLetter) {
        this.SmallLetter = SmallLetter;
    }

    /**
     * Get 密码包含大写字母，0：否，1：是。 
     * @return BigLetter 密码包含大写字母，0：否，1：是。
     */
    public Long getBigLetter() {
        return this.BigLetter;
    }

    /**
     * Set 密码包含大写字母，0：否，1：是。
     * @param BigLetter 密码包含大写字母，0：否，1：是。
     */
    public void setBigLetter(Long BigLetter) {
        this.BigLetter = BigLetter;
    }

    /**
     * Get 密码包含数字，0：否，1：是。 
     * @return Digit 密码包含数字，0：否，1：是。
     */
    public Long getDigit() {
        return this.Digit;
    }

    /**
     * Set 密码包含数字，0：否，1：是。
     * @param Digit 密码包含数字，0：否，1：是。
     */
    public void setDigit(Long Digit) {
        this.Digit = Digit;
    }

    /**
     * Get 密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$ 
     * @return Symbol 密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set 密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$
     * @param Symbol 密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get 改密完成通知。0：不通知 1：通知 
     * @return CompleteNotify 改密完成通知。0：不通知 1：通知
     */
    public Long getCompleteNotify() {
        return this.CompleteNotify;
    }

    /**
     * Set 改密完成通知。0：不通知 1：通知
     * @param CompleteNotify 改密完成通知。0：不通知 1：通知
     */
    public void setCompleteNotify(Long CompleteNotify) {
        this.CompleteNotify = CompleteNotify;
    }

    /**
     * Get 通知邮箱 
     * @return NotifyEmails 通知邮箱
     */
    public String [] getNotifyEmails() {
        return this.NotifyEmails;
    }

    /**
     * Set 通知邮箱
     * @param NotifyEmails 通知邮箱
     */
    public void setNotifyEmails(String [] NotifyEmails) {
        this.NotifyEmails = NotifyEmails;
    }

    /**
     * Get 加密压缩文件密码 
     * @return FilePassword 加密压缩文件密码
     */
    public String getFilePassword() {
        return this.FilePassword;
    }

    /**
     * Set 加密压缩文件密码
     * @param FilePassword 加密压缩文件密码
     */
    public void setFilePassword(String FilePassword) {
        this.FilePassword = FilePassword;
    }

    /**
     * Get 任务类型， 4：手工执行  5：周期自动执行 
     * @return Type 任务类型， 4：手工执行  5：周期自动执行
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 任务类型， 4：手工执行  5：周期自动执行
     * @param Type 任务类型， 4：手工执行  5：周期自动执行
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 周期任务周期，单位天（大于等于 1，小于等于 365） 
     * @return Period 周期任务周期，单位天（大于等于 1，小于等于 365）
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 周期任务周期，单位天（大于等于 1，小于等于 365）
     * @param Period 周期任务周期，单位天（大于等于 1，小于等于 365）
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 周期任务首次执行时间 
     * @return FirstTime 周期任务首次执行时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 周期任务首次执行时间
     * @param FirstTime 周期任务首次执行时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    public ModifyChangePwdTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyChangePwdTaskRequest(ModifyChangePwdTaskRequest source) {
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.DeviceIdSet != null) {
            this.DeviceIdSet = new Long[source.DeviceIdSet.length];
            for (int i = 0; i < source.DeviceIdSet.length; i++) {
                this.DeviceIdSet[i] = new Long(source.DeviceIdSet[i]);
            }
        }
        if (source.AccountSet != null) {
            this.AccountSet = new String[source.AccountSet.length];
            for (int i = 0; i < source.AccountSet.length; i++) {
                this.AccountSet[i] = new String(source.AccountSet[i]);
            }
        }
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.ChangeMethod != null) {
            this.ChangeMethod = new Long(source.ChangeMethod);
        }
        if (source.AuthGenerationStrategy != null) {
            this.AuthGenerationStrategy = new Long(source.AuthGenerationStrategy);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.RunAccount != null) {
            this.RunAccount = new String(source.RunAccount);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.PasswordLength != null) {
            this.PasswordLength = new Long(source.PasswordLength);
        }
        if (source.SmallLetter != null) {
            this.SmallLetter = new Long(source.SmallLetter);
        }
        if (source.BigLetter != null) {
            this.BigLetter = new Long(source.BigLetter);
        }
        if (source.Digit != null) {
            this.Digit = new Long(source.Digit);
        }
        if (source.Symbol != null) {
            this.Symbol = new String(source.Symbol);
        }
        if (source.CompleteNotify != null) {
            this.CompleteNotify = new Long(source.CompleteNotify);
        }
        if (source.NotifyEmails != null) {
            this.NotifyEmails = new String[source.NotifyEmails.length];
            for (int i = 0; i < source.NotifyEmails.length; i++) {
                this.NotifyEmails[i] = new String(source.NotifyEmails[i]);
            }
        }
        if (source.FilePassword != null) {
            this.FilePassword = new String(source.FilePassword);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamArraySimple(map, prefix + "DeviceIdSet.", this.DeviceIdSet);
        this.setParamArraySimple(map, prefix + "AccountSet.", this.AccountSet);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "ChangeMethod", this.ChangeMethod);
        this.setParamSimple(map, prefix + "AuthGenerationStrategy", this.AuthGenerationStrategy);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "RunAccount", this.RunAccount);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PasswordLength", this.PasswordLength);
        this.setParamSimple(map, prefix + "SmallLetter", this.SmallLetter);
        this.setParamSimple(map, prefix + "BigLetter", this.BigLetter);
        this.setParamSimple(map, prefix + "Digit", this.Digit);
        this.setParamSimple(map, prefix + "Symbol", this.Symbol);
        this.setParamSimple(map, prefix + "CompleteNotify", this.CompleteNotify);
        this.setParamArraySimple(map, prefix + "NotifyEmails.", this.NotifyEmails);
        this.setParamSimple(map, prefix + "FilePassword", this.FilePassword);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);

    }
}

