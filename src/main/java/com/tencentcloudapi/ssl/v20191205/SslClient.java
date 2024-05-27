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
package com.tencentcloudapi.ssl.v20191205;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ssl.v20191205.models.*;

public class SslClient extends AbstractClient{
    private static String endpoint = "ssl.tencentcloudapi.com";
    private static String service = "ssl";
    private static String version = "2019-12-05";
    
    public SslClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SslClient(Credential credential, String region, ClientProfile profile) {
        super(SslClient.endpoint, SslClient.version, credential, region, profile);
    }

    /**
     *本接口（ApplyCertificate）用于免费证书申请。
     * @param req ApplyCertificateRequest
     * @return ApplyCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ApplyCertificateResponse ApplyCertificate(ApplyCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyCertificate", ApplyCertificateResponse.class);
    }

    /**
     *取消证书审核
     * @param req CancelAuditCertificateRequest
     * @return CancelAuditCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CancelAuditCertificateResponse CancelAuditCertificate(CancelAuditCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelAuditCertificate", CancelAuditCertificateResponse.class);
    }

    /**
     *取消证书订单。
     * @param req CancelCertificateOrderRequest
     * @return CancelCertificateOrderResponse
     * @throws TencentCloudSDKException
     */
    public CancelCertificateOrderResponse CancelCertificateOrder(CancelCertificateOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelCertificateOrder", CancelCertificateOrderResponse.class);
    }

    /**
     *本接口（CheckCertificateChain）用于检查证书链是否完整。
     * @param req CheckCertificateChainRequest
     * @return CheckCertificateChainResponse
     * @throws TencentCloudSDKException
     */
    public CheckCertificateChainResponse CheckCertificateChain(CheckCertificateChainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCertificateChain", CheckCertificateChainResponse.class);
    }

    /**
     *提交证书订单。
     * @param req CommitCertificateInformationRequest
     * @return CommitCertificateInformationResponse
     * @throws TencentCloudSDKException
     */
    public CommitCertificateInformationResponse CommitCertificateInformation(CommitCertificateInformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommitCertificateInformation", CommitCertificateInformationResponse.class);
    }

    /**
     *本接口（CompleteCertificate）用于主动触发证书验证。仅非DNSPod和Wotrus品牌证书支持使用此接口。
     * @param req CompleteCertificateRequest
     * @return CompleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CompleteCertificateResponse CompleteCertificate(CompleteCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteCertificate", CompleteCertificateResponse.class);
    }

    /**
     *本接口（CreateCertificate）用于创建付费证书。
     * @param req CreateCertificateRequest
     * @return CreateCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateResponse CreateCertificate(CreateCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCertificate", CreateCertificateResponse.class);
    }

    /**
     *创建证书绑定关联云资源异步任务， 该接口用于查询证书关联云资源。 若证书ID已存在查询云资源任务，则结果返回该任务ID。关联云资源类型，支持以下云资源：clb、cdn、waf、live、vod、ddos、tke、apigateway、tcb、teo（edgeOne）。查询关联云资源结果使用DescribeCertificateBindResourceTaskResult接口
     * @param req CreateCertificateBindResourceSyncTaskRequest
     * @return CreateCertificateBindResourceSyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateBindResourceSyncTaskResponse CreateCertificateBindResourceSyncTask(CreateCertificateBindResourceSyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCertificateBindResourceSyncTask", CreateCertificateBindResourceSyncTaskResponse.class);
    }

    /**
     *使用权益点创建证书
     * @param req CreateCertificateByPackageRequest
     * @return CreateCertificateByPackageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateByPackageResponse CreateCertificateByPackage(CreateCertificateByPackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCertificateByPackage", CreateCertificateByPackageResponse.class);
    }

    /**
     *本接口（DeleteCertificate）用于删除证书。
     * @param req DeleteCertificateRequest
     * @return DeleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertificateResponse DeleteCertificate(DeleteCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCertificate", DeleteCertificateResponse.class);
    }

    /**
     *删除管理人
     * @param req DeleteManagerRequest
     * @return DeleteManagerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteManagerResponse DeleteManager(DeleteManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteManager", DeleteManagerResponse.class);
    }

    /**
     *证书部署到云资源实例列表
     * @param req DeployCertificateInstanceRequest
     * @return DeployCertificateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeployCertificateInstanceResponse DeployCertificateInstance(DeployCertificateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployCertificateInstance", DeployCertificateInstanceResponse.class);
    }

    /**
     *云资源部署重试部署记录
     * @param req DeployCertificateRecordRetryRequest
     * @return DeployCertificateRecordRetryResponse
     * @throws TencentCloudSDKException
     */
    public DeployCertificateRecordRetryResponse DeployCertificateRecordRetry(DeployCertificateRecordRetryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployCertificateRecordRetry", DeployCertificateRecordRetryResponse.class);
    }

    /**
     *云资源部署一键回滚
     * @param req DeployCertificateRecordRollbackRequest
     * @return DeployCertificateRecordRollbackResponse
     * @throws TencentCloudSDKException
     */
    public DeployCertificateRecordRollbackResponse DeployCertificateRecordRollback(DeployCertificateRecordRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployCertificateRecordRollback", DeployCertificateRecordRollbackResponse.class);
    }

    /**
     *本接口（DescribeCertificate）用于获取证书信息。
     * @param req DescribeCertificateRequest
     * @return DescribeCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateResponse DescribeCertificate(DescribeCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificate", DescribeCertificateResponse.class);
    }

    /**
     *查询CreateCertificateBindResourceSyncTask任务结果， 返回证书关联云资源异步任务结果， 支持以下云资源：clb、cdn、waf、live、vod、ddos、tke、apigateway、tcb、teo（edgeOne）
     * @param req DescribeCertificateBindResourceTaskDetailRequest
     * @return DescribeCertificateBindResourceTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateBindResourceTaskDetailResponse DescribeCertificateBindResourceTaskDetail(DescribeCertificateBindResourceTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateBindResourceTaskDetail", DescribeCertificateBindResourceTaskDetailResponse.class);
    }

    /**
     *查询CreateCertificateBindResourceSyncTask任务结果， 返回证书关联云资源异步任务结果， 支持以下云资源：clb、cdn、waf、live、vod、ddos、tke、apigateway、tcb、teo（edgeOne）
     * @param req DescribeCertificateBindResourceTaskResultRequest
     * @return DescribeCertificateBindResourceTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateBindResourceTaskResultResponse DescribeCertificateBindResourceTaskResult(DescribeCertificateBindResourceTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateBindResourceTaskResult", DescribeCertificateBindResourceTaskResultResponse.class);
    }

    /**
     *获取证书详情。
     * @param req DescribeCertificateDetailRequest
     * @return DescribeCertificateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateDetailResponse DescribeCertificateDetail(DescribeCertificateDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateDetail", DescribeCertificateDetailResponse.class);
    }

    /**
     *获取用户账号下有关证书的操作日志。
     * @param req DescribeCertificateOperateLogsRequest
     * @return DescribeCertificateOperateLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateOperateLogsResponse DescribeCertificateOperateLogs(DescribeCertificateOperateLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateOperateLogs", DescribeCertificateOperateLogsResponse.class);
    }

    /**
     *本接口（DescribeCertificates）用于获取证书列表。
     * @param req DescribeCertificatesRequest
     * @return DescribeCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificatesResponse DescribeCertificates(DescribeCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificates", DescribeCertificatesResponse.class);
    }

    /**
     *查询公司列表
     * @param req DescribeCompaniesRequest
     * @return DescribeCompaniesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompaniesResponse DescribeCompanies(DescribeCompaniesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompanies", DescribeCompaniesResponse.class);
    }

    /**
     *查询批量删除任务结果
     * @param req DescribeDeleteCertificatesTaskResultRequest
     * @return DescribeDeleteCertificatesTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeleteCertificatesTaskResultResponse DescribeDeleteCertificatesTaskResult(DescribeDeleteCertificatesTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeleteCertificatesTaskResult", DescribeDeleteCertificatesTaskResultResponse.class);
    }

    /**
     *证书查询关联资源， 最新查询接口请使用CreateCertificateBindResourceSyncTask， 可以查询更多支持的云资源
     * @param req DescribeDeployedResourcesRequest
     * @return DescribeDeployedResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployedResourcesResponse DescribeDeployedResources(DescribeDeployedResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeployedResources", DescribeDeployedResourcesResponse.class);
    }

    /**
     *获取下载证书链接
     * @param req DescribeDownloadCertificateUrlRequest
     * @return DescribeDownloadCertificateUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDownloadCertificateUrlResponse DescribeDownloadCertificateUrl(DescribeDownloadCertificateUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDownloadCertificateUrl", DescribeDownloadCertificateUrlResponse.class);
    }

    /**
     *查询证书apiGateway云资源部署实例列表
     * @param req DescribeHostApiGatewayInstanceListRequest
     * @return DescribeHostApiGatewayInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostApiGatewayInstanceListResponse DescribeHostApiGatewayInstanceList(DescribeHostApiGatewayInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostApiGatewayInstanceList", DescribeHostApiGatewayInstanceListResponse.class);
    }

    /**
     *查询证书cdn云资源部署实例列表
     * @param req DescribeHostCdnInstanceListRequest
     * @return DescribeHostCdnInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostCdnInstanceListResponse DescribeHostCdnInstanceList(DescribeHostCdnInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostCdnInstanceList", DescribeHostCdnInstanceListResponse.class);
    }

    /**
     *查询证书clb云资源部署实例列表
     * @param req DescribeHostClbInstanceListRequest
     * @return DescribeHostClbInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostClbInstanceListResponse DescribeHostClbInstanceList(DescribeHostClbInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostClbInstanceList", DescribeHostClbInstanceListResponse.class);
    }

    /**
     *查询证书cos云资源部署实例列表
     * @param req DescribeHostCosInstanceListRequest
     * @return DescribeHostCosInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostCosInstanceListResponse DescribeHostCosInstanceList(DescribeHostCosInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostCosInstanceList", DescribeHostCosInstanceListResponse.class);
    }

    /**
     *查询证书ddos云资源部署实例列表
     * @param req DescribeHostDdosInstanceListRequest
     * @return DescribeHostDdosInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostDdosInstanceListResponse DescribeHostDdosInstanceList(DescribeHostDdosInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostDdosInstanceList", DescribeHostDdosInstanceListResponse.class);
    }

    /**
     *查询证书云资源部署记录列表
     * @param req DescribeHostDeployRecordRequest
     * @return DescribeHostDeployRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostDeployRecordResponse DescribeHostDeployRecord(DescribeHostDeployRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostDeployRecord", DescribeHostDeployRecordResponse.class);
    }

    /**
     *查询证书云资源部署记录详情列表
     * @param req DescribeHostDeployRecordDetailRequest
     * @return DescribeHostDeployRecordDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostDeployRecordDetailResponse DescribeHostDeployRecordDetail(DescribeHostDeployRecordDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostDeployRecordDetail", DescribeHostDeployRecordDetailResponse.class);
    }

    /**
     *查询证书Lighthouse云资源部署实例列表
     * @param req DescribeHostLighthouseInstanceListRequest
     * @return DescribeHostLighthouseInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLighthouseInstanceListResponse DescribeHostLighthouseInstanceList(DescribeHostLighthouseInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostLighthouseInstanceList", DescribeHostLighthouseInstanceListResponse.class);
    }

    /**
     *查询证书live云资源部署实例列表
     * @param req DescribeHostLiveInstanceListRequest
     * @return DescribeHostLiveInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLiveInstanceListResponse DescribeHostLiveInstanceList(DescribeHostLiveInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostLiveInstanceList", DescribeHostLiveInstanceListResponse.class);
    }

    /**
     *查询证书EdgeOne云资源部署实例列表
     * @param req DescribeHostTeoInstanceListRequest
     * @return DescribeHostTeoInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostTeoInstanceListResponse DescribeHostTeoInstanceList(DescribeHostTeoInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostTeoInstanceList", DescribeHostTeoInstanceListResponse.class);
    }

    /**
     *查询证书tke云资源部署实例列表
     * @param req DescribeHostTkeInstanceListRequest
     * @return DescribeHostTkeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostTkeInstanceListResponse DescribeHostTkeInstanceList(DescribeHostTkeInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostTkeInstanceList", DescribeHostTkeInstanceListResponse.class);
    }

    /**
     *查询证书云资源更新记录列表
     * @param req DescribeHostUpdateRecordRequest
     * @return DescribeHostUpdateRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostUpdateRecordResponse DescribeHostUpdateRecord(DescribeHostUpdateRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostUpdateRecord", DescribeHostUpdateRecordResponse.class);
    }

    /**
     *查询证书云资源更新记录详情列表
     * @param req DescribeHostUpdateRecordDetailRequest
     * @return DescribeHostUpdateRecordDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostUpdateRecordDetailResponse DescribeHostUpdateRecordDetail(DescribeHostUpdateRecordDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostUpdateRecordDetail", DescribeHostUpdateRecordDetailResponse.class);
    }

    /**
     *查询证书Vod云资源部署实例列表
     * @param req DescribeHostVodInstanceListRequest
     * @return DescribeHostVodInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostVodInstanceListResponse DescribeHostVodInstanceList(DescribeHostVodInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostVodInstanceList", DescribeHostVodInstanceListResponse.class);
    }

    /**
     *查询证书waf云资源部署实例列表
     * @param req DescribeHostWafInstanceListRequest
     * @return DescribeHostWafInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostWafInstanceListResponse DescribeHostWafInstanceList(DescribeHostWafInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostWafInstanceList", DescribeHostWafInstanceListResponse.class);
    }

    /**
     *查询管理人详情
     * @param req DescribeManagerDetailRequest
     * @return DescribeManagerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeManagerDetailResponse DescribeManagerDetail(DescribeManagerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeManagerDetail", DescribeManagerDetailResponse.class);
    }

    /**
     *查询管理人列表
     * @param req DescribeManagersRequest
     * @return DescribeManagersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeManagersResponse DescribeManagers(DescribeManagersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeManagers", DescribeManagersResponse.class);
    }

    /**
     *获得权益包列表
     * @param req DescribePackagesRequest
     * @return DescribePackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackagesResponse DescribePackages(DescribePackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePackages", DescribePackagesResponse.class);
    }

    /**
     *本接口（DownloadCertificate）用于下载证书。
     * @param req DownloadCertificateRequest
     * @return DownloadCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DownloadCertificateResponse DownloadCertificate(DownloadCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadCertificate", DownloadCertificateResponse.class);
    }

    /**
     *用户传入证书id和备注来修改证书备注。
     * @param req ModifyCertificateAliasRequest
     * @return ModifyCertificateAliasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateAliasResponse ModifyCertificateAlias(ModifyCertificateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificateAlias", ModifyCertificateAliasResponse.class);
    }

    /**
     *批量修改证书所属项目。
     * @param req ModifyCertificateProjectRequest
     * @return ModifyCertificateProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateProjectResponse ModifyCertificateProject(ModifyCertificateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificateProject", ModifyCertificateProjectResponse.class);
    }

    /**
     *针对审核失败或审核取消的付费证书，重新发起审核
     * @param req ModifyCertificateResubmitRequest
     * @return ModifyCertificateResubmitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateResubmitResponse ModifyCertificateResubmit(ModifyCertificateResubmitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificateResubmit", ModifyCertificateResubmitResponse.class);
    }

    /**
     *修改忽略证书到期通知。打开或关闭证书到期通知。
     * @param req ModifyCertificatesExpiringNotificationSwitchRequest
     * @return ModifyCertificatesExpiringNotificationSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificatesExpiringNotificationSwitchResponse ModifyCertificatesExpiringNotificationSwitch(ModifyCertificatesExpiringNotificationSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificatesExpiringNotificationSwitch", ModifyCertificatesExpiringNotificationSwitchResponse.class);
    }

    /**
     *本接口（ReplaceCertificate）用于重颁发证书。已申请的免费证书仅支持 RSA 算法、密钥对参数为2048的证书重颁发，并且目前仅支持1次重颁发。
     * @param req ReplaceCertificateRequest
     * @return ReplaceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceCertificateResponse ReplaceCertificate(ReplaceCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceCertificate", ReplaceCertificateResponse.class);
    }

    /**
     *本接口（RevokeCertificate）用于吊销证书。
     * @param req RevokeCertificateRequest
     * @return RevokeCertificateResponse
     * @throws TencentCloudSDKException
     */
    public RevokeCertificateResponse RevokeCertificate(RevokeCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokeCertificate", RevokeCertificateResponse.class);
    }

    /**
     *重新提交审核管理人
     * @param req SubmitAuditManagerRequest
     * @return SubmitAuditManagerResponse
     * @throws TencentCloudSDKException
     */
    public SubmitAuditManagerResponse SubmitAuditManager(SubmitAuditManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitAuditManager", SubmitAuditManagerResponse.class);
    }

    /**
     *提交证书资料。输入参数信息可以分多次提交，但提交的证书资料应最低限度保持完整。
     * @param req SubmitCertificateInformationRequest
     * @return SubmitCertificateInformationResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCertificateInformationResponse SubmitCertificateInformation(SubmitCertificateInformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitCertificateInformation", SubmitCertificateInformationResponse.class);
    }

    /**
     *一键更新旧证书资源，本接口为异步接口， 调用之后DeployRecordId为0表示任务进行中， 重复请求这个接口， 当返回DeployRecordId大于0则表示任务创建成功。 未创建成功则会抛出异常
     * @param req UpdateCertificateInstanceRequest
     * @return UpdateCertificateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCertificateInstanceResponse UpdateCertificateInstance(UpdateCertificateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCertificateInstance", UpdateCertificateInstanceResponse.class);
    }

    /**
     *云资源更新重试部署记录
     * @param req UpdateCertificateRecordRetryRequest
     * @return UpdateCertificateRecordRetryResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCertificateRecordRetryResponse UpdateCertificateRecordRetry(UpdateCertificateRecordRetryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCertificateRecordRetry", UpdateCertificateRecordRetryResponse.class);
    }

    /**
     *云资源更新一键回滚
     * @param req UpdateCertificateRecordRollbackRequest
     * @return UpdateCertificateRecordRollbackResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCertificateRecordRollbackResponse UpdateCertificateRecordRollback(UpdateCertificateRecordRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCertificateRecordRollback", UpdateCertificateRecordRollbackResponse.class);
    }

    /**
     *本接口（UploadCertificate）用于上传证书。
     * @param req UploadCertificateRequest
     * @return UploadCertificateResponse
     * @throws TencentCloudSDKException
     */
    public UploadCertificateResponse UploadCertificate(UploadCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadCertificate", UploadCertificateResponse.class);
    }

    /**
     *本接口（UploadConfirmLetter）用于上传证书确认函。
     * @param req UploadConfirmLetterRequest
     * @return UploadConfirmLetterResponse
     * @throws TencentCloudSDKException
     */
    public UploadConfirmLetterResponse UploadConfirmLetter(UploadConfirmLetterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadConfirmLetter", UploadConfirmLetterResponse.class);
    }

    /**
     *本接口（UploadRevokeLetter）用于上传证书吊销确认函。
     * @param req UploadRevokeLetterRequest
     * @return UploadRevokeLetterResponse
     * @throws TencentCloudSDKException
     */
    public UploadRevokeLetterResponse UploadRevokeLetter(UploadRevokeLetterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadRevokeLetter", UploadRevokeLetterResponse.class);
    }

    /**
     *重新核验管理人
     * @param req VerifyManagerRequest
     * @return VerifyManagerResponse
     * @throws TencentCloudSDKException
     */
    public VerifyManagerResponse VerifyManager(VerifyManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyManager", VerifyManagerResponse.class);
    }

}
