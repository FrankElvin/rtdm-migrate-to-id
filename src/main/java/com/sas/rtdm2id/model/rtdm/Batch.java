/*
Copyright © 2023, SAS Institute Inc., Cary, NC, USA.  All Rights Reserved.
SPDX-License-Identifier: Apache-2.0
*/
package com.sas.rtdm2id.model.rtdm;

import com.sas.rtdm2id.model.rtdm.extension.*;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "resultsSummary",
        "extractedFrom",
        "logicalUnit"
})
@XmlRootElement(name = "Batch")
@Getter
@Setter
public class Batch implements Serializable {

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ResultsSummary", required = true)
    protected ResultsSummary resultsSummary;
    @XmlElement(name = "ExtractedFrom", required = true)
    protected ExtractedFrom extractedFrom;
    @XmlElement(name = "LogicalUnit", required = true)
    protected LogicalUnit logicalUnit;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "businessContext",
            "businessContextId",
            "rootDataFolder"
    })
    @Getter
    @Setter
    public static class ExtractedFrom implements Serializable {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "BusinessContext", required = true)
        protected String businessContext;
        @XmlElement(name = "BusinessContextId", required = true)
        protected String businessContextId;
        @XmlElement(name = "RootDataFolder", required = true)
        protected String rootDataFolder;

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "campaignDO",
            "flowDO",
            "startNodeDataDO",
            "replyNodeDataDOs",
            "splitNodeDataDOs",
            "cellNodeDataDOs",
            "processNodeDataDOs",
            "multiSelectNodeDataDOs",
            "subDiagramNodeDataDOs",
            "assignmentNodeDataDOs",
            "cHandRHNodeDataDOs",
            "addStagedTreatmentsNodeDataDOs",
            "removeStagedTreatmentsNodeDataDOs"
    })
    @Getter
    @Setter
    public static class LogicalUnit implements Serializable {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "CampaignDO", required = true)
        protected CampaignDO campaignDO;
        @XmlElement(name = "FlowDO", required = true)
        protected FlowDO flowDO;
        @XmlElement(name = "StartNodeDataDO", required = true)
        protected StartNodeDataDO startNodeDataDO;
        @XmlElement(name = "ReplyNodeDataDO")
        protected List<ReplyNodeDataDO> replyNodeDataDOs = new ArrayList<>();
        @XmlElement(name = "SplitNodeDataDO", required = true)
        protected List<SplitNodeDataDO> splitNodeDataDOs = new ArrayList<>();
        @XmlElement(name = "CellNodeDataDO")
        protected List<CellNodeDataDO> cellNodeDataDOs = new ArrayList<>();
        @XmlElement(name = "ProcessNodeDataDO")
        protected List<ProcessNodeDataDO> processNodeDataDOs = new ArrayList<>();
        @XmlElement(name = "MultiSelectNodeDataDO")
        protected List<MultiSelectNodeDataDO> multiSelectNodeDataDOs = new ArrayList<>();
        @XmlElement(name = "SubDiagramNodeDataDO")
        protected List<SubDiagramNodeDataDO> subDiagramNodeDataDOs = new ArrayList<>();
        @XmlElement(name = "AssignmentNodeDataDO")
        protected List<AssignmentNodeDataDO> assignmentNodeDataDOs = new ArrayList<>();
        @XmlElement(name = "CHandRHNodeDataDO")
        protected List<CHandRHNodeDataDO> cHandRHNodeDataDOs = new ArrayList<>();
        @XmlElement(name = "AddStagedTreatmentsNodeDataDO")
        protected List<StagedTreatmentsNodeDataDO> addStagedTreatmentsNodeDataDOs = new ArrayList<>();
        @XmlElement(name = "RemoveStagedTreatmentsNodeDataDO")
        protected List<RemoveStagedTreatmentsNodeDataDO> removeStagedTreatmentsNodeDataDOs = new ArrayList<>();

    }
       
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "extractCount",
            "errorCount"
    })
    @Getter
    @Setter
    public static class ResultsSummary implements Serializable {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "ExtractCount")
        protected byte extractCount;
        @XmlElement(name = "ErrorCount")
        protected byte errorCount;

    }

}
