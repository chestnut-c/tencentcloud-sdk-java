/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.dts.v20180330;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dts.v20180330.models.*;

public class DtsClient extends AbstractClient{
    private static String endpoint = "dts.tencentcloudapi.com";
    private static String version = "2018-03-30";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public DtsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public DtsClient(Credential credential, String region, ClientProfile profile) {
        super(DtsClient.endpoint, DtsClient.version, credential, region, profile);
    }

    /**
     *完成数据迁移任务.
选择采用增量迁移方式的任务, 需要在迁移进度进入准备完成阶段后, 调用本接口, 停止迁移增量数据.
只有当正在迁移的任务, 进入了准备完成阶段, 才能调用本接口完成迁移.
     * @param req CompleteMigrateJobRequest
     * @return CompleteMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public CompleteMigrateJobResponse  CompleteMigrateJob(CompleteMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompleteMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CompleteMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CompleteMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建校验迁移任务
在开始迁移前, 必须调用本接口创建校验, 且校验成功后才能开始迁移. 校验的结果可以通过DescribeMigrateCheckJob查看.
校验成功后,迁移任务若有修改, 则必须重新创建校验并通过后, 才能开始迁移.
     * @param req CreateMigrateCheckJobRequest
     * @return CreateMigrateCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrateCheckJobResponse  CreateMigrateCheckJob(CreateMigrateCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrateCheckJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrateCheckJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMigrateCheckJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建数据迁移任务。

如果是金融区链路, 请使用域名: dts.ap-shenzhen-fsi.tencentcloudapi.com
     * @param req CreateMigrateJobRequest
     * @return CreateMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrateJobResponse  CreateMigrateJob(CreateMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除数据迁移任务. 正在校验和正在迁移的任务不允许删除
     * @param req DeleteMigrateJobRequest
     * @return DeleteMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMigrateJobResponse  DeleteMigrateJob(DeleteMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建校验后,获取校验的结果. 能查询到当前校验的状态和进度. 
若通过校验, 则可调用'StartMigrateJob' 开始迁移.
若未通过校验, 则能查询到校验失败的原因. 请按照报错, 通过'ModifyMigrateJob'修改迁移配置或是调整源/目标实例的相关参数.
     * @param req DescribeMigrateCheckJobRequest
     * @return DescribeMigrateCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateCheckJobResponse  DescribeMigrateCheckJob(DescribeMigrateCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrateCheckJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrateCheckJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMigrateCheckJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询数据迁移任务.
如果是金融区链路, 请使用域名: https://dts.ap-shenzhen-fsi.tencentcloudapi.com
     * @param req DescribeMigrateJobsRequest
     * @return DescribeMigrateJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateJobsResponse  DescribeMigrateJobs(DescribeMigrateJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrateJobsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrateJobsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMigrateJobs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改数据迁移任务. 
当迁移任务处于下述状态时, 允许调用本接口: 迁移创建中, 创建完成, 校验成功, 校验失败, 迁移失败. 
源实例和目标实例类型不允许修改, 目标实例地域不允许修改。

如果是金融区链路, 请使用域名: dts.ap-shenzhen-fsi.tencentcloudapi.com
     * @param req ModifyMigrateJobRequest
     * @return ModifyMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateJobResponse  ModifyMigrateJob(ModifyMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *非定时任务会在调用后立即开始迁移，定时任务则会开始倒计时。
调用此接口前，请务必先校验数据迁移任务通过。
     * @param req StartMigrateJobRequest
     * @return StartMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StartMigrateJobResponse  StartMigrateJob(StartMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *撤销数据迁移任务.
在迁移过程中允许调用该接口撤销迁移, 撤销迁移的任务会失败.
     * @param req StopMigrateJobRequest
     * @return StopMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrateJobResponse  StopMigrateJob(StopMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
