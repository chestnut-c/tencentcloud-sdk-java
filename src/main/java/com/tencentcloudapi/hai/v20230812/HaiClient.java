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
package com.tencentcloudapi.hai.v20230812;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.hai.v20230812.models.*;

public class HaiClient extends AbstractClient{
    private static String endpoint = "hai.tencentcloudapi.com";
    private static String service = "hai";
    private static String version = "2023-08-12";
    
    public HaiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public HaiClient(Credential credential, String region, ClientProfile profile) {
        super(HaiClient.endpoint, HaiClient.version, credential, region, profile);
    }

    /**
     *查询应用
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplications", DescribeApplicationsResponse.class);
    }

    /**
     *查询实例的网络配置及消耗情况
     * @param req DescribeInstanceNetworkStatusRequest
     * @return DescribeInstanceNetworkStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNetworkStatusResponse DescribeInstanceNetworkStatus(DescribeInstanceNetworkStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNetworkStatus", DescribeInstanceNetworkStatusResponse.class);
    }

    /**
     *查询实例
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *查询地域列表
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *查询场景
     * @param req DescribeScenesRequest
     * @return DescribeScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenesResponse DescribeScenes(DescribeScenesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScenes", DescribeScenesResponse.class);
    }

    /**
     *查询服务登录配置
     * @param req DescribeServiceLoginSettingsRequest
     * @return DescribeServiceLoginSettingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceLoginSettingsResponse DescribeServiceLoginSettings(DescribeServiceLoginSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceLoginSettings", DescribeServiceLoginSettingsResponse.class);
    }

    /**
     *本接口 (InquirePriceRunInstances) 用于实例询价。
     * @param req InquirePriceRunInstancesRequest
     * @return InquirePriceRunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRunInstancesResponse InquirePriceRunInstances(InquirePriceRunInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRunInstances", InquirePriceRunInstancesResponse.class);
    }

    /**
     *本接口 (RunInstances) 用于创建一个或多个指定配置的实例。
     * @param req RunInstancesRequest
     * @return RunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunInstancesResponse RunInstances(RunInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunInstances", RunInstancesResponse.class);
    }

    /**
     *本接口 (TerminateInstances) 用于主动退还实例。
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

}
