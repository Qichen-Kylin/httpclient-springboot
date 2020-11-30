package com.zdww.SpringBootHttpClient.APIService;

import javax.swing.text.Keymap;
import java.util.Map;

public interface ManagerService {
    String getPipelineIdMetrics(String pipelineId);

    String getPipelineIdHistory(String pipelineId);

    String deletePipelineIdHistory(String pipelineId);

    String postPipelineIdStart(String pipelineId, Map<String, Object> map);

    String postPipelineIdStop(String pipelineid);

    String getSnapshot(String pipelineid, String snapshotName);

    String postSnapshot(String pipelineid, String snapshotName);

    String putSnapshot(String pipelineid, String snapshotName);

    String deleteSnapshot(String pipelineid, String snapshotName);

    String deleteAlerts(String pipelineid);

    String getCommittedOffsets(String pipelineid);
}