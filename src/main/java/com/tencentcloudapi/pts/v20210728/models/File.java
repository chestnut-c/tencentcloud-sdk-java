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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class File extends AbstractModel{

    /**
    * 文件 ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 文件种类，参数文件-1，协议文件-2，请求文件-3
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 文件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件字节数
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 文件类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 文件行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * 头部数据行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadLines")
    @Expose
    private String [] HeadLines;

    /**
    * 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TailLines")
    @Expose
    private String [] TailLines;

    /**
    * 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderInFile")
    @Expose
    private Boolean HeaderInFile;

    /**
    * 参数名数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderColumns")
    @Expose
    private String [] HeaderColumns;

    /**
    * 文件夹中的文件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileInfos")
    @Expose
    private FileInfo [] FileInfos;

    /**
    * 关联场景
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScenarioSet")
    @Expose
    private Scenario [] ScenarioSet;

    /**
    * 文件状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 文件 ID 
     * @return FileId 文件 ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件 ID
     * @param FileId 文件 ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件种类，参数文件-1，协议文件-2，请求文件-3 
     * @return Kind 文件种类，参数文件-1，协议文件-2，请求文件-3
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 文件种类，参数文件-1，协议文件-2，请求文件-3
     * @param Kind 文件种类，参数文件-1，协议文件-2，请求文件-3
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 文件名 
     * @return Name 文件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件名
     * @param Name 文件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件字节数 
     * @return Size 文件字节数
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件字节数
     * @param Size 文件字节数
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 文件类型 
     * @return Type 文件类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件类型
     * @param Type 文件类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 更新时间 
     * @return UpdatedAt 更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
     * @param UpdatedAt 更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 文件行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineCount 文件行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set 文件行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineCount 文件行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get 头部数据行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadLines 头部数据行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHeadLines() {
        return this.HeadLines;
    }

    /**
     * Set 头部数据行
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadLines 头部数据行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadLines(String [] HeadLines) {
        this.HeadLines = HeadLines;
    }

    /**
     * Get 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TailLines 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTailLines() {
        return this.TailLines;
    }

    /**
     * Set 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。
     * @param TailLines 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTailLines(String [] TailLines) {
        this.TailLines = TailLines;
    }

    /**
     * Get 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderInFile 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHeaderInFile() {
        return this.HeaderInFile;
    }

    /**
     * Set 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderInFile 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderInFile(Boolean HeaderInFile) {
        this.HeaderInFile = HeaderInFile;
    }

    /**
     * Get 参数名数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderColumns 参数名数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHeaderColumns() {
        return this.HeaderColumns;
    }

    /**
     * Set 参数名数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderColumns 参数名数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderColumns(String [] HeaderColumns) {
        this.HeaderColumns = HeaderColumns;
    }

    /**
     * Get 文件夹中的文件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileInfos 文件夹中的文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 文件夹中的文件
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileInfos 文件夹中的文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileInfos(FileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get 关联场景
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScenarioSet 关联场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Scenario [] getScenarioSet() {
        return this.ScenarioSet;
    }

    /**
     * Set 关联场景
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScenarioSet 关联场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScenarioSet(Scenario [] ScenarioSet) {
        this.ScenarioSet = ScenarioSet;
    }

    /**
     * Get 文件状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 文件状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 文件状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 文件状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public File() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public File(File source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.HeadLines != null) {
            this.HeadLines = new String[source.HeadLines.length];
            for (int i = 0; i < source.HeadLines.length; i++) {
                this.HeadLines[i] = new String(source.HeadLines[i]);
            }
        }
        if (source.TailLines != null) {
            this.TailLines = new String[source.TailLines.length];
            for (int i = 0; i < source.TailLines.length; i++) {
                this.TailLines[i] = new String(source.TailLines[i]);
            }
        }
        if (source.HeaderInFile != null) {
            this.HeaderInFile = new Boolean(source.HeaderInFile);
        }
        if (source.HeaderColumns != null) {
            this.HeaderColumns = new String[source.HeaderColumns.length];
            for (int i = 0; i < source.HeaderColumns.length; i++) {
                this.HeaderColumns[i] = new String(source.HeaderColumns[i]);
            }
        }
        if (source.FileInfos != null) {
            this.FileInfos = new FileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FileInfo(source.FileInfos[i]);
            }
        }
        if (source.ScenarioSet != null) {
            this.ScenarioSet = new Scenario[source.ScenarioSet.length];
            for (int i = 0; i < source.ScenarioSet.length; i++) {
                this.ScenarioSet[i] = new Scenario(source.ScenarioSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamArraySimple(map, prefix + "HeadLines.", this.HeadLines);
        this.setParamArraySimple(map, prefix + "TailLines.", this.TailLines);
        this.setParamSimple(map, prefix + "HeaderInFile", this.HeaderInFile);
        this.setParamArraySimple(map, prefix + "HeaderColumns.", this.HeaderColumns);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "ScenarioSet.", this.ScenarioSet);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}
