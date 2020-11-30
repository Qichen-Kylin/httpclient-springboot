package com.zdww.SpringBootHttpClient.APIController;

import com.zdww.SpringBootHttpClient.APIService.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * author:zhouzeru
 * date:2020.11.27
 */
@RestController
public class ManagerController {
   @Autowired
   private ManagerService managerService;
   //返回管道指标
   @RequestMapping(value = "/rest/v1/pipeline/{pipelineId}/metrics")
   public String getPipelineIdMetrics(@PathVariable("pipelineId") String pipelineId) {
      String pipelineIdMetrics = managerService.getPipelineIdMetrics(pipelineId);
      return pipelineIdMetrics;
   }
   //通过管道名称查找历史
   @RequestMapping("/rest/v1/pipeline/{pipelineId}/history")
   public String getPipelineIdHistory(@PathVariable("pipelineId") String pipelineId) {
      String pipelineIdHistory = managerService.getPipelineIdHistory(pipelineId);
      return pipelineIdHistory;
   }
   //按管道名称删除历史记录
   @RequestMapping("/delete/v1/pipeline/{pipelineId}/history")
   public String deletePipelineIdHistory(String pipelineId) {
      String deletePipelineIdHistory = managerService.deletePipelineIdHistory(pipelineId);
      return deletePipelineIdHistory;
   }
   //启动管道
   @RequestMapping(value = "/post/v1/pipeline/{pipelineId}/start",method = RequestMethod.POST)
   public String postPipelineIdStart(@PathVariable("pipelineId") String pipelineId,@RequestParam Map<String, Object>map) {
      String postPipelineIdStart = managerService.postPipelineIdStart(pipelineId,map);
      return postPipelineIdStart;
   }
   //停止管道
   @RequestMapping(value = "/post/v1/pipeline/{pipelineId}/stop",method = RequestMethod.POST)
   public String postPipelineIdStop(@PathVariable("pipelineId") String pipelineId) {
      String postPipelineIdStop = managerService.postPipelineIdStop(pipelineId);
      return postPipelineIdStop;
   }
   //返回快照数据
   @RequestMapping("/rest/v1/pipeline/{pipelineId}/snapshot/{snapshotName}")
   public String getSnapshot(@PathVariable("pipelineId") String pipelineId,@PathVariable("snapshotName") String snapshotName){
      String getsnapshot = managerService.getSnapshot(pipelineId,snapshotName);
      return getsnapshot;
   }
   //更新快照标签
   @RequestMapping(value = "/post/v1/pipeline/{pipelineId}/snapshot/{snapshotName}",method = RequestMethod.POST)
   public String postSnapshot(@PathVariable("pipelineId") String pipelineId,@PathVariable("snapshotName") String snapshotName){
      String postSnapshot = managerService.postSnapshot(pipelineId,snapshotName);
      return postSnapshot;
   }
   //捕捉快照
   @RequestMapping(value = "/put/v1/pipeline/{pipelineId}/snapshot/{snapshotName}",method = RequestMethod.PUT)
   public String putSnapshot(@PathVariable("pipelineId") String pipelineId,@PathVariable("snapshotName") String snapshotName){
      String putSnapshot = managerService.putSnapshot(pipelineId,snapshotName);
      return putSnapshot;
   }
   //删除快照数据
   @RequestMapping(value = "/delete/v1/pipeline/{pipelineId}/snapshot/{snapshotName}",method = RequestMethod.DELETE)
   public String deleteSnapshot(@PathVariable("pipelineId") String pipelineId,@PathVariable("snapshotName") String snapshotName){
      String deleteSnapshot = managerService.deleteSnapshot(pipelineId,snapshotName);
      return deleteSnapshot;
   }
   //通过管道名称，修订和警报ID删除警报
   @RequestMapping(value = "/delete/v1/pipeline/{pipelineId}/alerts",method = RequestMethod.DELETE)
   public String deleteAlerts(@PathVariable("pipelineId") String pipelineId){
      String deleteAlerts = managerService.deleteAlerts(pipelineId);
      return deleteAlerts;
   }
   //退货承诺抵销。注意：返回的偏移格式将在版本之间改变
   @RequestMapping(value = "/v1/pipeline/{pipelineId}/committedOffsets",method = RequestMethod.GET)
   public String getCommittedOffsets(@PathVariable("pipelineId") String pipelineId){
      String committedOffsets = managerService.getCommittedOffsets(pipelineId);
      return committedOffsets;
   }
}
