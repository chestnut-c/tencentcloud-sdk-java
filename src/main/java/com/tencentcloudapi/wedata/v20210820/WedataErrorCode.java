package com.tencentcloudapi.wedata.v20210820;
public enum WedataErrorCode {
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 工作空间不存在。
     INVALIDPARAMETER_WORKSPACENOTEXIST("InvalidParameter.WorkspaceNotExist");
     
    private String value;
    private WedataErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}
