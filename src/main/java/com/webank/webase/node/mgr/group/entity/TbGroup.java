/**
 * Copyright 2014-2020  the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.webase.node.mgr.group.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity class of table tb_group.
 */
@Data
@NoArgsConstructor
public class TbGroup {

    private Integer groupId;
    private String groupName;
    /**
     * 1-normal, 2-invalid
     */
    private Integer groupStatus;
    private Integer nodeCount;
    private BigInteger latestBlock = BigInteger.ZERO;
    private BigInteger transCount = BigInteger.ZERO;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private String description;
    private Integer groupType;
    /**
     * group.x.genesis timestamp
     */
    private String groupTimestamp;
    /**
     * group peers nodeid
     */
    private String nodeIdList;

    public TbGroup(Integer groupId, String groupName, Integer nodeCount,
                   String description, Integer groupType) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.nodeCount = nodeCount;
        this.description = description;
        this.groupType = groupType;
    }

    public TbGroup(Integer groupId, String groupName, Integer nodeCount,
                   String description, Integer groupType, Integer groupStatus) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.nodeCount = nodeCount;
        this.description = description;
        this.groupType = groupType;
        this.groupStatus = groupStatus;
    }
}