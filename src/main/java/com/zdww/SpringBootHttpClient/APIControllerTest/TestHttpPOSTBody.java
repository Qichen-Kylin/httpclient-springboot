//package com.zdww.SpringBootHttpClient.APIController;
//
//import com.zdww.SpringBootHttpClient.HttpClient.HttpPOSTBody;
//import com.zdww.SpringBootHttpClient.HttpClient.HttpResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
//@RestController
//public class TestHttpPOSTBody {
//
//    @Resource
//    private HttpPOSTBody httpPOSTBody;
//
//    private static final String Schema_Host_Port_Path = "http://worker3:18630/rest";
//    private static final String ContentType = "application/json;charset=UTF-8";
//    private static final String id = "null";
//
//    @RequestMapping("/postbody/v1/usermanagement/users")
//    //@RequestMapping(value = "/post/v1/usermanagement/users" , method = RequestMethod.POST , produces = ContentType)
//    public String PostUsermanagementUsers() throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/usermanagement/users";
//        String body = "{\n" +
//                "  \"envelopeVersion\": \"1\",\n" +
//                "  \"data\": {\n" +
//                "    \"id\": \"user3\",\n" +
//                "    \"email\": \"\",\n" +
//                "    \"groups\": [\n" +
//                "      \"test\"\n" +
//                "    ],\n" +
//                "    \"roles\": [\n" +
//                "      \"manager,creator\"\n" +
//                "    ]\n" +
//                "  }\n" +
//                "}";
//        HttpResult httpResult = httpPOSTBody.doPostbody(url,body);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//
//    @RequestMapping("/postbody/v1/pipeline/pipelineId")
//    public String PostPipeline() throws Exception {
//        String url = Schema_Host_Port_Path + "/v1/pipeline/HttpClient_TESTAPI";
//        String body = "{\n" +
//                "  \"schemaVersion\": 6,\n" +
//                "  \"version\": 19,\n" +
//                "  \"pipelineId\": \"HttpClient_TESTAPI\",\n" +
//                "  \"title\": \"HttpClient_TESTAPI\",\n" +
//                "  \"description\": \"HttpClient_TESTAPI通过名称更新现有管道配置\",\n" +
//                "  \"uuid\": \"a9724894-b15e-426e-abe9-051a43c534b6\",\n" +
//                "  \"configuration\": [\n" +
//                "    {\n" +
//                "      \"name\": \"executionMode\",\n" +
//                "      \"value\": \"STANDALONE\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"edgeHttpUrl\",\n" +
//                "      \"value\": \"http://localhost:18633\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"deliveryGuarantee\",\n" +
//                "      \"value\": \"AT_LEAST_ONCE\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"testOriginStage\",\n" +
//                "      \"value\": \"streamsets-datacollector-dev-lib::com_streamsets_pipeline_stage_devtest_rawdata_RawDataDSource::3\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"startEventStage\",\n" +
//                "      \"value\": \"streamsets-datacollector-basic-lib::com_streamsets_pipeline_stage_destination_devnull_ToErrorNullDTarget::1\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"stopEventStage\",\n" +
//                "      \"value\": \"streamsets-datacollector-basic-lib::com_streamsets_pipeline_stage_destination_devnull_ToErrorNullDTarget::1\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"shouldRetry\",\n" +
//                "      \"value\": true\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"triggerInterval\",\n" +
//                "      \"value\": 2000\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"retryAttempts\",\n" +
//                "      \"value\": -1\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"ludicrousMode\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"ludicrousModeInputCount\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"advancedErrorHandling\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"notifyOnStates\",\n" +
//                "      \"value\": [\n" +
//                "        \"RUN_ERROR\",\n" +
//                "        \"STOPPED\",\n" +
//                "        \"FINISHED\"\n" +
//                "      ]\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"emailIDs\",\n" +
//                "      \"value\": []\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"constants\",\n" +
//                "      \"value\": [\n" +
//                "        {\n" +
//                "          \"key\": \"\",\n" +
//                "          \"value\": \"\"\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"badRecordsHandling\",\n" +
//                "      \"value\": \"streamsets-datacollector-basic-lib::com_streamsets_pipeline_stage_destination_recordstolocalfilesystem_ToErrorLocalFSDTarget::1\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"errorRecordPolicy\",\n" +
//                "      \"value\": \"ORIGINAL_RECORD\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"statsAggregatorStage\",\n" +
//                "      \"value\": \"streamsets-datacollector-basic-lib::com_streamsets_pipeline_stage_destination_devnull_StatsDpmDirectlyDTarget::1\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"workerCount\",\n" +
//                "      \"value\": 0\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterSlaveMemory\",\n" +
//                "      \"value\": 2048\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterSlaveJavaOpts\",\n" +
//                "      \"value\": \"-XX:+UseConcMarkSweepGC -XX:+UseParNewGC -Dlog4j.debug\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterLauncherEnv\",\n" +
//                "      \"value\": []\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"mesosDispatcherURL\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"logLevel\",\n" +
//                "      \"value\": \"INFO\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"hdfsS3ConfDir\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"rateLimit\",\n" +
//                "      \"value\": 0\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"maxRunners\",\n" +
//                "      \"value\": 0\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"shouldCreateFailureSnapshot\",\n" +
//                "      \"value\": true\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"runnerIdleTIme\",\n" +
//                "      \"value\": 60\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"webhookConfigs\",\n" +
//                "      \"value\": []\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"sparkConfigs\",\n" +
//                "      \"value\": []\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"preprocessScript\",\n" +
//                "      \"value\": \"/*\\nThe following script define a method\\nthat increments an integer by 1 \\nand registers it as a UDF with \\nthe SparkSession, which can be accessed\\nusing the variable named \\\"spark\\\":\\ndef inc(i: Integer): Integer = {\\n  i + 1\\n}\\nspark.udf.register (\\\"inc\\\", inc _)\\n\\n*/\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.clusterType\",\n" +
//                "      \"value\": \"LOCAL\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.sparkMasterUrl\",\n" +
//                "      \"value\": \"local[*]\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.deployMode\",\n" +
//                "      \"value\": \"CLIENT\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.hadoopUserName\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.sparkAppName\",\n" +
//                "      \"value\": \"${pipeline:title()}\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.stagingDir\",\n" +
//                "      \"value\": \"/streamsets\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.useYarnKerberosKeytab\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.yarnKerberosKeytabSource\",\n" +
//                "      \"value\": \"PROPERTIES_FILE\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.yarnKerberosKeytab\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.yarnKerberosKeytabBase64Bytes\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.yarnKerberosPrincipal\",\n" +
//                "      \"value\": \"name@DOMAIN\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"clusterConfig.callbackUrl\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"databricksConfig.baseUrl\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"databricksConfig.credentialType\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"databricksConfig.username\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"databricksConfig.password\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"databricksConfig.token\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"databricksConfig.provisionNewCluster\",\n" +
//                "      \"value\": true\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"databricksConfig.clusterId\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"databricksConfig.clusterConfig\",\n" +
//                "      \"value\": \"{\\n    \\\"num_workers\\\": 8,\\n    \\\"spark_version\\\": \\\"5.3.x-scala2.11\\\",\\n    \\\"node_type_id\\\": \\\"i3.xlarge\\\"\\n}\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"databricksConfig.terminateCluster\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"livyConfig.baseUrl\",\n" +
//                "      \"value\": \"https://localhost:30443/gateway/default/livy/v1/\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"livyConfig.username\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"livyConfig.password\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.userRegion\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.userRegionCustom\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.accessKey\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.secretKey\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.s3StagingUri\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.provisionNewCluster\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.clusterId\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.clusterPrefix\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.terminateCluster\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.loggingEnabled\",\n" +
//                "      \"value\": true\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.s3LogUri\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.enableEMRDebugging\",\n" +
//                "      \"value\": true\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.serviceRole\",\n" +
//                "      \"value\": \"EMR_DefaultRole\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.jobFlowRole\",\n" +
//                "      \"value\": \"EMR_EC2_DefaultRole\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.visibleToAllUsers\",\n" +
//                "      \"value\": true\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.ec2SubnetId\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.masterSecurityGroup\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.slaveSecurityGroup\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.instanceCount\",\n" +
//                "      \"value\": 2\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.masterInstanceType\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.masterInstanceTypeCustom\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.slaveInstanceType\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"amazonEMRConfig.slaveInstanceTypeCustom\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.userRegion\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.userRegionCustom\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.useIAMRoles\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.accessKey\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.secretKey\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.s3StagingUri\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.provisionNewCluster\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.clusterId\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.emrVersion\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.clusterPrefix\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.terminateCluster\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.loggingEnabled\",\n" +
//                "      \"value\": true\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.s3LogUri\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.serviceRole\",\n" +
//                "      \"value\": \"EMR_DefaultRole\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.jobFlowRole\",\n" +
//                "      \"value\": \"EMR_EC2_DefaultRole\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.visibleToAllUsers\",\n" +
//                "      \"value\": true\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.ec2SubnetId\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.masterSecurityGroup\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.slaveSecurityGroup\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.serviceAccessSecurityGroup\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.instanceCount\",\n" +
//                "      \"value\": 2\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.masterInstanceType\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.masterInstanceTypeCustom\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.slaveInstanceType\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"transformerEMRConfig.slaveInstanceTypeCustom\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudCredentialsConfig.projectId\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudCredentialsConfig.credentialsProvider\",\n" +
//                "      \"value\": \"DEFAULT_PROVIDER\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudCredentialsConfig.path\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudCredentialsConfig.credentialsFileContent\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.region\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.customRegion\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.gcsStagingUri\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.create\",\n" +
//                "      \"value\": false\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.clusterPrefix\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.version\",\n" +
//                "      \"value\": \"1.4-ubuntu18\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.masterType\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.workerType\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.networkType\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.network\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.subnet\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.tags\",\n" +
//                "      \"value\": []\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.workerCount\",\n" +
//                "      \"value\": 2\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.clusterName\",\n" +
//                "      \"value\": null\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"name\": \"googleCloudConfig.terminate\",\n" +
//                "      \"value\": null\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"uiInfo\": {},\n" +
//                "  \"fragments\": [],\n" +
//                "      \"uiInfo\": {},\n" +
//                "      \"stages\": [\n" +
//                "            {\n" +
//                "          \"instanceName\": \"MySQLBinaryLog_01\",\n" +
//                "          \"library\": \"streamsets-datacollector-mysql-binlog-lib\",\n" +
//                "          \"stageName\": \"com_streamsets_pipeline_stage_origin_mysql_MysqlDSource\",\n" +
//                "          \"stageVersion\": \"2\",\n" +
//                "          \"configuration\": [\n" +
//                "            {\n" +
//                "              \"name\": \"config.hostname\",\n" +
//                "              \"value\": \"10.18.100.176\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.port\",\n" +
//                "              \"value\": \"3306\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.username\",\n" +
//                "              \"value\": \"root\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.password\",\n" +
//                "              \"value\": \"svjp#0k\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.serverId\",\n" +
//                "              \"value\": \"2\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.maxBatchSize\",\n" +
//                "              \"value\": 1000\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.maxWaitTime\",\n" +
//                "              \"value\": 1000\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.connectTimeout\",\n" +
//                "              \"value\": 5000\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.enableKeepAlive\",\n" +
//                "              \"value\": true\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.keepAliveInterval\",\n" +
//                "              \"value\": 60000\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.useSsl\",\n" +
//                "              \"value\": false\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.startFromBeginning\",\n" +
//                "              \"value\": false\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.initialOffset\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.includeTables\",\n" +
//                "              \"value\": \"streamsets.streamsets_test\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"config.ignoreTables\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageOnRecordError\",\n" +
//                "              \"value\": \"TO_ERROR\"\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"uiInfo\": {\n" +
//                "            \"yPos\": 48,\n" +
//                "            \"stageType\": \"SOURCE\",\n" +
//                "            \"icon\": \"mysql.png\",\n" +
//                "            \"description\": \"\",\n" +
//                "            \"label\": \"MySQL Binary Log\",\n" +
//                "            \"xPos\": 54,\n" +
//                "            \"displayMode\": \"ADVANCED\"\n" +
//                "          },\n" +
//                "          \"inputLanes\": [],\n" +
//                "          \"outputLanes\": [\n" +
//                "            \"MySQLBinaryLog_01OutputLane16012756857450\"\n" +
//                "          ],\n" +
//                "          \"eventLanes\": [],\n" +
//                "          \"services\": []\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"instanceName\": \"StreamSelector_01\",\n" +
//                "          \"library\": \"streamsets-datacollector-basic-lib\",\n" +
//                "          \"stageName\": \"com_streamsets_pipeline_stage_processor_selector_SelectorDProcessor\",\n" +
//                "          \"stageVersion\": \"1\",\n" +
//                "          \"configuration\": [\n" +
//                "            {\n" +
//                "              \"name\": \"lanePredicates\",\n" +
//                "              \"value\": [\n" +
//                "                {\n" +
//                "                  \"outputLane\": \"StreamSelector_01OutputLane1601278060442\",\n" +
//                "                  \"predicate\": \"${record:value('/Type')=='INSERT'}\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                  \"outputLane\": \"StreamSelector_01OutputLane1601278058559\",\n" +
//                "                  \"predicate\": \"${record:value('/Type')=='DELETE'}\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                  \"outputLane\": \"StreamSelector_01OutputLane1601278056299\",\n" +
//                "                  \"predicate\": \"${record:value('/Type')=='UPDATE'}\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                  \"outputLane\": \"StreamSelector_01OutputLane1601278030822\",\n" +
//                "                  \"predicate\": \"default\"\n" +
//                "                }\n" +
//                "              ]\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageOnRecordError\",\n" +
//                "              \"value\": \"TO_ERROR\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRequiredFields\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRecordPreconditions\",\n" +
//                "              \"value\": []\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"uiInfo\": {\n" +
//                "            \"yPos\": 48,\n" +
//                "            \"stageType\": \"PROCESSOR\",\n" +
//                "            \"icon\": \"laneSelector.png\",\n" +
//                "            \"description\": \"\",\n" +
//                "            \"label\": \"Stream Selector\",\n" +
//                "            \"xPos\": 281,\n" +
//                "            \"displayMode\": \"BASIC\"\n" +
//                "          },\n" +
//                "          \"inputLanes\": [\n" +
//                "            \"MySQLBinaryLog_01OutputLane16012756857450\"\n" +
//                "          ],\n" +
//                "          \"outputLanes\": [\n" +
//                "            \"StreamSelector_01OutputLane1601278060442\",\n" +
//                "            \"StreamSelector_01OutputLane1601278058559\",\n" +
//                "            \"StreamSelector_01OutputLane1601278056299\",\n" +
//                "            \"StreamSelector_01OutputLane1601278030822\"\n" +
//                "          ],\n" +
//                "          \"eventLanes\": [],\n" +
//                "          \"services\": []\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"instanceName\": \"JavaScriptEvaluator_01\",\n" +
//                "          \"library\": \"streamsets-datacollector-basic-lib\",\n" +
//                "          \"stageName\": \"com_streamsets_pipeline_stage_processor_javascript_JavaScriptDProcessor\",\n" +
//                "          \"stageVersion\": \"3\",\n" +
//                "          \"configuration\": [\n" +
//                "            {\n" +
//                "              \"name\": \"processingMode\",\n" +
//                "              \"value\": \"BATCH\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"initScript\",\n" +
//                "              \"value\": \"/**\\n * Available Objects:\\n *\\n *   sdc.state: a dict that is preserved between invocations of this script.\\n *         Useful for caching bits of data e.g. counters and long-lived resources.\\n *\\n *   sdc.log.<loglevel>(msg, obj...): use instead of print to send log messages to the log4j log instead of stdout.\\n *                               loglevel is any log4j level: e.g. info, error, warn, trace.\\n *   sdc.getFieldNull(Record, 'field path'): Receive a constant defined above\\n *                          to check if the field is typed field with value null\\n *   sdc.createMap(boolean listMap): Create a map for use as a field in a record.\\n *                          Pass true to this function to create a list map (ordered map)\\n */\\n\\n// sdc.state['connection'] = new Connection().open();\\n\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"script\",\n" +
//                "              \"value\": \"for(var i = 0; i < records.length; i++) {\\n    try {\\n        var newRecord = sdcFunctions.createRecord(true);\\n\\t\\t\\tnewRecord.value = records[i].value['Data'];\\n\\t\\t\\tnewRecord.value.Type = records[i].value['Type'];\\n\\t\\t\\tnewRecord.value.Database = records[i].value['Database'];\\n\\t\\t\\tnewRecord.value.Table = records[i].value['Table'];\\n\\t\\t\\tlog.info(records[i].value['Type'])\\n\\t\\t\\toutput.write(newRecord);\\n    } catch (e) {\\n        // Send record to error\\n        error.write(records[i], e);\\n    }\\n}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"destroyScript\",\n" +
//                "              \"value\": \"/**\\n * Available Objects:\\n *\\n *   sdc.state: a dict that is preserved between invocations of this script.\\n *        Useful for caching bits of data e.g. counters and long-lived resources.\\n *   sdc.log.<loglevel>(msg, obj...): use instead of print to send log messages to the log4j log instead of stdout.\\n *                               loglevel is any log4j level: e.g. info, error, warn, trace.\\n *   sdc.getFieldNull(Record, 'field path'): Receive a constant defined above\\n *                          to check if the field is typed field with value null\\n *   sdc.createMap(boolean listMap): Create a map for use as a field in a record.\\n *                          Pass true to this function to create a list map (ordered map)\\n *   sdc.createEvent(String type, int version): Creates a new event.\\n *                          Create new empty event with standard headers.\\n *   sdc.toEvent(Record): Send event to event stream\\n *                          Only events created with sdc.createEvent are supported.\\n */\\n\\n// sdc.state['connection'].close();\\n\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"scriptRecordType\",\n" +
//                "              \"value\": \"NATIVE_OBJECTS\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"userParams\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageOnRecordError\",\n" +
//                "              \"value\": \"TO_ERROR\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRequiredFields\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRecordPreconditions\",\n" +
//                "              \"value\": []\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"uiInfo\": {\n" +
//                "            \"yPos\": 49,\n" +
//                "            \"stageType\": \"PROCESSOR\",\n" +
//                "            \"icon\": \"javascript.png\",\n" +
//                "            \"description\": \"\",\n" +
//                "            \"label\": \"JavaScript Evaluator INSERT\",\n" +
//                "            \"xPos\": 500,\n" +
//                "            \"displayMode\": \"BASIC\"\n" +
//                "          },\n" +
//                "          \"inputLanes\": [\n" +
//                "            \"StreamSelector_01OutputLane1601278060442\"\n" +
//                "          ],\n" +
//                "          \"outputLanes\": [\n" +
//                "            \"JavaScriptEvaluator_01OutputLane16012798185570\"\n" +
//                "          ],\n" +
//                "          \"eventLanes\": [],\n" +
//                "          \"services\": []\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"instanceName\": \"JavaScriptEvaluator_02\",\n" +
//                "          \"library\": \"streamsets-datacollector-basic-lib\",\n" +
//                "          \"stageName\": \"com_streamsets_pipeline_stage_processor_javascript_JavaScriptDProcessor\",\n" +
//                "          \"stageVersion\": \"3\",\n" +
//                "          \"configuration\": [\n" +
//                "            {\n" +
//                "              \"name\": \"processingMode\",\n" +
//                "              \"value\": \"BATCH\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"initScript\",\n" +
//                "              \"value\": \"/**\\n * Available Objects:\\n *\\n *   sdc.state: a dict that is preserved between invocations of this script.\\n *         Useful for caching bits of data e.g. counters and long-lived resources.\\n *\\n *   sdc.log.<loglevel>(msg, obj...): use instead of print to send log messages to the log4j log instead of stdout.\\n *                               loglevel is any log4j level: e.g. info, error, warn, trace.\\n *   sdc.getFieldNull(Record, 'field path'): Receive a constant defined above\\n *                          to check if the field is typed field with value null\\n *   sdc.createMap(boolean listMap): Create a map for use as a field in a record.\\n *                          Pass true to this function to create a list map (ordered map)\\n */\\n\\n// sdc.state['connection'] = new Connection().open();\\n\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"script\",\n" +
//                "              \"value\": \"for(var i = 0; i < records.length; i++) {\\n    try {\\n        var newRecord = sdcFunctions.createRecord(true);\\n\\t\\t\\tnewRecord.value = records[i].value['OldData'];\\n\\t\\t\\tnewRecord.value.Type = records[i].value['Type'];\\n\\t\\t\\tnewRecord.value.Database = records[i].value['Database'];\\n\\t\\t\\tnewRecord.value.Table = records[i].value['Table'];\\n\\t\\t\\tlog.info(records[i].value['Type'])\\n\\t\\t\\toutput.write(newRecord);\\n    } catch (e) {\\n        // Send record to error\\n        error.write(records[i], e);\\n    }\\n}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"destroyScript\",\n" +
//                "              \"value\": \"/**\\n * Available Objects:\\n *\\n *   sdc.state: a dict that is preserved between invocations of this script.\\n *        Useful for caching bits of data e.g. counters and long-lived resources.\\n *   sdc.log.<loglevel>(msg, obj...): use instead of print to send log messages to the log4j log instead of stdout.\\n *                               loglevel is any log4j level: e.g. info, error, warn, trace.\\n *   sdc.getFieldNull(Record, 'field path'): Receive a constant defined above\\n *                          to check if the field is typed field with value null\\n *   sdc.createMap(boolean listMap): Create a map for use as a field in a record.\\n *                          Pass true to this function to create a list map (ordered map)\\n *   sdc.createEvent(String type, int version): Creates a new event.\\n *                          Create new empty event with standard headers.\\n *   sdc.toEvent(Record): Send event to event stream\\n *                          Only events created with sdc.createEvent are supported.\\n */\\n\\n// sdc.state['connection'].close();\\n\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"scriptRecordType\",\n" +
//                "              \"value\": \"NATIVE_OBJECTS\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"userParams\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageOnRecordError\",\n" +
//                "              \"value\": \"TO_ERROR\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRequiredFields\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRecordPreconditions\",\n" +
//                "              \"value\": []\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"uiInfo\": {\n" +
//                "            \"yPos\": 165,\n" +
//                "            \"stageType\": \"PROCESSOR\",\n" +
//                "            \"icon\": \"javascript.png\",\n" +
//                "            \"description\": \"\",\n" +
//                "            \"label\": \"JavaScript Evaluator DELETE\",\n" +
//                "            \"xPos\": 500,\n" +
//                "            \"displayMode\": \"BASIC\"\n" +
//                "          },\n" +
//                "          \"inputLanes\": [\n" +
//                "            \"StreamSelector_01OutputLane1601278058559\"\n" +
//                "          ],\n" +
//                "          \"outputLanes\": [\n" +
//                "            \"JavaScriptEvaluator_02OutputLane16012798197840\"\n" +
//                "          ],\n" +
//                "          \"eventLanes\": [],\n" +
//                "          \"services\": []\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"instanceName\": \"JavaScriptEvaluator_03\",\n" +
//                "          \"library\": \"streamsets-datacollector-basic-lib\",\n" +
//                "          \"stageName\": \"com_streamsets_pipeline_stage_processor_javascript_JavaScriptDProcessor\",\n" +
//                "          \"stageVersion\": \"3\",\n" +
//                "          \"configuration\": [\n" +
//                "            {\n" +
//                "              \"name\": \"processingMode\",\n" +
//                "              \"value\": \"BATCH\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"initScript\",\n" +
//                "              \"value\": \"/**\\n * Available Objects:\\n *\\n *   sdc.state: a dict that is preserved between invocations of this script.\\n *         Useful for caching bits of data e.g. counters and long-lived resources.\\n *\\n *   sdc.log.<loglevel>(msg, obj...): use instead of print to send log messages to the log4j log instead of stdout.\\n *                               loglevel is any log4j level: e.g. info, error, warn, trace.\\n *   sdc.getFieldNull(Record, 'field path'): Receive a constant defined above\\n *                          to check if the field is typed field with value null\\n *   sdc.createMap(boolean listMap): Create a map for use as a field in a record.\\n *                          Pass true to this function to create a list map (ordered map)\\n */\\n\\n// sdc.state['connection'] = new Connection().open();\\n\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"script\",\n" +
//                "              \"value\": \"for(var i = 0; i < records.length; i++) {\\n    try {\\n        var newRecord = sdcFunctions.createRecord(true);\\n\\t\\t\\tnewRecord.value = records[i].value['Data'];\\n\\t\\t\\tnewRecord.value.Type = records[i].value['Type'];\\n\\t\\t\\tnewRecord.value.Database = records[i].value['Database'];\\n\\t\\t\\tnewRecord.value.Table = records[i].value['Table'];\\n\\t\\t\\tlog.info(records[i].value['Type'])\\n\\t\\t\\toutput.write(newRecord);\\n    } catch (e) {\\n        // Send record to error\\n        error.write(records[i], e);\\n    }\\n}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"destroyScript\",\n" +
//                "              \"value\": \"/**\\n * Available Objects:\\n *\\n *   sdc.state: a dict that is preserved between invocations of this script.\\n *        Useful for caching bits of data e.g. counters and long-lived resources.\\n *   sdc.log.<loglevel>(msg, obj...): use instead of print to send log messages to the log4j log instead of stdout.\\n *                               loglevel is any log4j level: e.g. info, error, warn, trace.\\n *   sdc.getFieldNull(Record, 'field path'): Receive a constant defined above\\n *                          to check if the field is typed field with value null\\n *   sdc.createMap(boolean listMap): Create a map for use as a field in a record.\\n *                          Pass true to this function to create a list map (ordered map)\\n *   sdc.createEvent(String type, int version): Creates a new event.\\n *                          Create new empty event with standard headers.\\n *   sdc.toEvent(Record): Send event to event stream\\n *                          Only events created with sdc.createEvent are supported.\\n */\\n\\n// sdc.state['connection'].close();\\n\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"scriptRecordType\",\n" +
//                "              \"value\": \"NATIVE_OBJECTS\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"userParams\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageOnRecordError\",\n" +
//                "              \"value\": \"TO_ERROR\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRequiredFields\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRecordPreconditions\",\n" +
//                "              \"value\": []\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"uiInfo\": {\n" +
//                "            \"yPos\": 283,\n" +
//                "            \"stageType\": \"PROCESSOR\",\n" +
//                "            \"icon\": \"javascript.png\",\n" +
//                "            \"description\": \"\",\n" +
//                "            \"label\": \"JavaScript Evaluator UPDATE\",\n" +
//                "            \"xPos\": 501,\n" +
//                "            \"displayMode\": \"BASIC\"\n" +
//                "          },\n" +
//                "          \"inputLanes\": [\n" +
//                "            \"StreamSelector_01OutputLane1601278056299\"\n" +
//                "          ],\n" +
//                "          \"outputLanes\": [\n" +
//                "            \"JavaScriptEvaluator_03OutputLane16012798205500\"\n" +
//                "          ],\n" +
//                "          \"eventLanes\": [],\n" +
//                "          \"services\": []\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"instanceName\": \"Trash_01\",\n" +
//                "          \"library\": \"streamsets-datacollector-basic-lib\",\n" +
//                "          \"stageName\": \"com_streamsets_pipeline_stage_destination_devnull_NullDTarget\",\n" +
//                "          \"stageVersion\": \"1\",\n" +
//                "          \"configuration\": [],\n" +
//                "          \"uiInfo\": {\n" +
//                "            \"yPos\": 280,\n" +
//                "            \"stageType\": \"TARGET\",\n" +
//                "            \"icon\": \"trash.png\",\n" +
//                "            \"description\": \"\",\n" +
//                "            \"label\": \"Trash\",\n" +
//                "            \"xPos\": 289\n" +
//                "          },\n" +
//                "          \"inputLanes\": [\n" +
//                "            \"StreamSelector_01OutputLane1601278030822\"\n" +
//                "          ],\n" +
//                "          \"outputLanes\": [],\n" +
//                "          \"eventLanes\": [],\n" +
//                "          \"services\": []\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"instanceName\": \"JDBCProducer_01\",\n" +
//                "          \"library\": \"streamsets-datacollector-jdbc-lib\",\n" +
//                "          \"stageName\": \"com_streamsets_pipeline_stage_destination_jdbc_JdbcDTarget\",\n" +
//                "          \"stageVersion\": \"10\",\n" +
//                "          \"configuration\": [\n" +
//                "            {\n" +
//                "              \"name\": \"schema\",\n" +
//                "              \"value\": \"DGMS_TEST\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"tableNameTemplate\",\n" +
//                "              \"value\": \"STREAMSETS_TEST\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"columnNames\",\n" +
//                "              \"value\": [\n" +
//                "                {\n" +
//                "                  \"paramValue\": \"?\",\n" +
//                "                  \"dataType\": \"USE_COLUMN_TYPE\",\n" +
//                "                  \"columnName\": \"A\",\n" +
//                "                  \"field\": \"/a\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                  \"paramValue\": \"?\",\n" +
//                "                  \"dataType\": \"USE_COLUMN_TYPE\",\n" +
//                "                  \"columnName\": \"B\",\n" +
//                "                  \"field\": \"/b\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                  \"paramValue\": \"?\",\n" +
//                "                  \"dataType\": \"USE_COLUMN_TYPE\",\n" +
//                "                  \"columnName\": \"C\",\n" +
//                "                  \"field\": \"/c\"\n" +
//                "                }\n" +
//                "              ]\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"encloseTableName\",\n" +
//                "              \"value\": false\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"changeLogFormat\",\n" +
//                "              \"value\": \"MySQLBinLog\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"defaultOperation\",\n" +
//                "              \"value\": \"INSERT\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"unsupportedAction\",\n" +
//                "              \"value\": \"DISCARD\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"useMultiRowInsert\",\n" +
//                "              \"value\": false\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"maxPrepStmtParameters\",\n" +
//                "              \"value\": -1\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"rollbackOnError\",\n" +
//                "              \"value\": true\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.connectionString\",\n" +
//                "              \"value\": \"jdbc:oracle:thin:@10.18.100.100:1521:gsdb\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.useCredentials\",\n" +
//                "              \"value\": true\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.username\",\n" +
//                "              \"value\": \"dgms_test\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.password\",\n" +
//                "              \"value\": \"dgms_test\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.driverProperties\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.driverClassName\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.connectionTestQuery\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.maximumPoolSize\",\n" +
//                "              \"value\": 1\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.minIdle\",\n" +
//                "              \"value\": 1\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.connectionTimeout\",\n" +
//                "              \"value\": \"${30 * SECONDS}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.idleTimeout\",\n" +
//                "              \"value\": \"${10 * MINUTES}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.maxLifetime\",\n" +
//                "              \"value\": \"${30 * MINUTES}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.initialQuery\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.transactionIsolation\",\n" +
//                "              \"value\": \"DEFAULT\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"customDataSqlStateCodes\",\n" +
//                "              \"value\": [\n" +
//                "                \"\"\n" +
//                "              ]\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageOnRecordError\",\n" +
//                "              \"value\": \"TO_ERROR\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRequiredFields\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRecordPreconditions\",\n" +
//                "              \"value\": []\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"uiInfo\": {\n" +
//                "            \"yPos\": 35.061363220214844,\n" +
//                "            \"stageType\": \"TARGET\",\n" +
//                "            \"icon\": \"rdbms.png\",\n" +
//                "            \"description\": \"\",\n" +
//                "            \"label\": \"Oracle JDBC Producer\",\n" +
//                "            \"xPos\": 730,\n" +
//                "            \"displayMode\": \"ADVANCED\"\n" +
//                "          },\n" +
//                "          \"inputLanes\": [\n" +
//                "            \"JavaScriptEvaluator_01OutputLane16012798185570\"\n" +
//                "          ],\n" +
//                "          \"outputLanes\": [],\n" +
//                "          \"eventLanes\": [],\n" +
//                "          \"services\": []\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"instanceName\": \"JDBCProducer_02\",\n" +
//                "          \"library\": \"streamsets-datacollector-jdbc-lib\",\n" +
//                "          \"stageName\": \"com_streamsets_pipeline_stage_destination_jdbc_JdbcDTarget\",\n" +
//                "          \"stageVersion\": \"10\",\n" +
//                "          \"configuration\": [\n" +
//                "            {\n" +
//                "              \"name\": \"schema\",\n" +
//                "              \"value\": \"DGMS_TEST\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"tableNameTemplate\",\n" +
//                "              \"value\": \"STREAMSETS_TEST\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"columnNames\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"encloseTableName\",\n" +
//                "              \"value\": false\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"changeLogFormat\",\n" +
//                "              \"value\": \"MySQLBinLog\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"defaultOperation\",\n" +
//                "              \"value\": \"DELETE\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"unsupportedAction\",\n" +
//                "              \"value\": \"DISCARD\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"useMultiRowInsert\",\n" +
//                "              \"value\": false\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"maxPrepStmtParameters\",\n" +
//                "              \"value\": -1\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"rollbackOnError\",\n" +
//                "              \"value\": true\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.connectionString\",\n" +
//                "              \"value\": \"jdbc:oracle:thin:@10.18.100.100:1521:gsdb\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.useCredentials\",\n" +
//                "              \"value\": true\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.username\",\n" +
//                "              \"value\": \"dgms_test\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.password\",\n" +
//                "              \"value\": \"dgms_test\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.driverProperties\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.driverClassName\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.connectionTestQuery\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.maximumPoolSize\",\n" +
//                "              \"value\": 1\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.minIdle\",\n" +
//                "              \"value\": 1\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.connectionTimeout\",\n" +
//                "              \"value\": \"${30 * SECONDS}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.idleTimeout\",\n" +
//                "              \"value\": \"${10 * MINUTES}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.maxLifetime\",\n" +
//                "              \"value\": \"${30 * MINUTES}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.initialQuery\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.transactionIsolation\",\n" +
//                "              \"value\": \"DEFAULT\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"customDataSqlStateCodes\",\n" +
//                "              \"value\": [\n" +
//                "                \"\"\n" +
//                "              ]\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageOnRecordError\",\n" +
//                "              \"value\": \"TO_ERROR\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRequiredFields\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRecordPreconditions\",\n" +
//                "              \"value\": []\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"uiInfo\": {\n" +
//                "            \"yPos\": 169,\n" +
//                "            \"stageType\": \"TARGET\",\n" +
//                "            \"icon\": \"rdbms.png\",\n" +
//                "            \"description\": \"\",\n" +
//                "            \"label\": \"Oracle JDBC Producer\",\n" +
//                "            \"xPos\": 736,\n" +
//                "            \"displayMode\": \"ADVANCED\"\n" +
//                "          },\n" +
//                "          \"inputLanes\": [\n" +
//                "            \"JavaScriptEvaluator_02OutputLane16012798197840\"\n" +
//                "          ],\n" +
//                "          \"outputLanes\": [],\n" +
//                "          \"eventLanes\": [],\n" +
//                "          \"services\": []\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"instanceName\": \"JDBCProducer_03\",\n" +
//                "          \"library\": \"streamsets-datacollector-jdbc-lib\",\n" +
//                "          \"stageName\": \"com_streamsets_pipeline_stage_destination_jdbc_JdbcDTarget\",\n" +
//                "          \"stageVersion\": \"10\",\n" +
//                "          \"configuration\": [\n" +
//                "            {\n" +
//                "              \"name\": \"schema\",\n" +
//                "              \"value\": \"DGMS_TEST\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"tableNameTemplate\",\n" +
//                "              \"value\": \"STREAMSETS_TEST\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"columnNames\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"encloseTableName\",\n" +
//                "              \"value\": false\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"changeLogFormat\",\n" +
//                "              \"value\": \"MySQLBinLog\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"defaultOperation\",\n" +
//                "              \"value\": \"UPDATE\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"unsupportedAction\",\n" +
//                "              \"value\": \"DISCARD\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"useMultiRowInsert\",\n" +
//                "              \"value\": false\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"maxPrepStmtParameters\",\n" +
//                "              \"value\": -1\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"rollbackOnError\",\n" +
//                "              \"value\": true\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.connectionString\",\n" +
//                "              \"value\": \"jdbc:oracle:thin:@10.18.100.100:1521:gsdb\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.useCredentials\",\n" +
//                "              \"value\": true\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.username\",\n" +
//                "              \"value\": \"dgms_test\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.password\",\n" +
//                "              \"value\": \"dgms_test\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.driverProperties\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.driverClassName\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.connectionTestQuery\",\n" +
//                "              \"value\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.maximumPoolSize\",\n" +
//                "              \"value\": 1\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.minIdle\",\n" +
//                "              \"value\": 1\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.connectionTimeout\",\n" +
//                "              \"value\": \"${30 * SECONDS}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.idleTimeout\",\n" +
//                "              \"value\": \"${10 * MINUTES}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.maxLifetime\",\n" +
//                "              \"value\": \"${30 * MINUTES}\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.initialQuery\",\n" +
//                "              \"value\": \"\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"hikariConfigBean.transactionIsolation\",\n" +
//                "              \"value\": \"DEFAULT\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"customDataSqlStateCodes\",\n" +
//                "              \"value\": [\n" +
//                "                \"\"\n" +
//                "              ]\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageOnRecordError\",\n" +
//                "              \"value\": \"TO_ERROR\"\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRequiredFields\",\n" +
//                "              \"value\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "              \"name\": \"stageRecordPreconditions\",\n" +
//                "              \"value\": []\n" +
//                "            }\n" +
//                "          ],\n" +
//                "          \"uiInfo\": {\n" +
//                "            \"yPos\": 280,\n" +
//                "            \"stageType\": \"TARGET\",\n" +
//                "            \"icon\": \"rdbms.png\",\n" +
//                "            \"description\": \"\",\n" +
//                "            \"label\": \"Oracle JDBC Producer\",\n" +
//                "            \"xPos\": 740.8772583007812,\n" +
//                "            \"displayMode\": \"ADVANCED\"\n" +
//                "          },\n" +
//                "          \"inputLanes\": [\n" +
//                "            \"JavaScriptEvaluator_03OutputLane16012798205500\"\n" +
//                "          ],\n" +
//                "          \"outputLanes\": [],\n" +
//                "          \"eventLanes\": [],\n" +
//                "          \"services\": []\n" +
//                "        }\n" +
//                "      ],\n" +
//                "      \"errorStage\": {\n" +
//                "        \"instanceName\": \"WritetoFile_ErrorStage\",\n" +
//                "        \"library\": \"streamsets-datacollector-basic-lib\",\n" +
//                "        \"stageName\": \"com_streamsets_pipeline_stage_destination_recordstolocalfilesystem_ToErrorLocalFSDTarget\",\n" +
//                "        \"stageVersion\": \"1\",\n" +
//                "        \"configuration\": [\n" +
//                "          {\n" +
//                "            \"name\": \"directory\",\n" +
//                "            \"value\": \"/data/chenqi/streamsets/datacollector/sample_data/tutorial/error\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"uniquePrefix\",\n" +
//                "            \"value\": \"\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"rotationIntervalSecs\",\n" +
//                "            \"value\": \"${1 * HOURS}\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"maxFileSizeMbs\",\n" +
//                "            \"value\": 5\n" +
//                "          }\n" +
//                "        ],\n" +
//                "        \"uiInfo\": {\n" +
//                "          \"yPos\": 50,\n" +
//                "          \"stageType\": \"TARGET\",\n" +
//                "          \"icon\": \"\",\n" +
//                "          \"description\": \"\",\n" +
//                "          \"label\": \"Error Records - Write to File\",\n" +
//                "          \"xPos\": 60\n" +
//                "        },\n" +
//                "        \"inputLanes\": [],\n" +
//                "        \"outputLanes\": [],\n" +
//                "        \"eventLanes\": [],\n" +
//                "        \"services\": []\n" +
//                "      },\n" +
//                "      \"info\": {\n" +
//                "        \"pipelineId\": \"HttpClient_TESTAPI\",\n" +
//                "        \"title\": \"HttpClient_TESTAPI\",\n" +
//                "        \"description\": \"HttpClient_TESTAPI通过名称更新现有管道配置\",\n" +
//                "        \"created\": \"2020-10-10T03:57:05.061Z\",\n" +
//                "        \"lastModified\": \"2020-10-10T03:57:05.061Z\",\n" +
//                "        \"creator\": \"admin\",\n" +
//                "        \"lastModifier\": \"admin\",\n" +
//                "        \"lastRev\": \"0\",\n" +
//                "        \"uuid\": \"a9724894-b15e-426e-abe9-051a43c534b6\",\n" +
//                "        \"valid\": false,\n" +
//                "        \"metadata\": {\n" +
//                "           \"labels\": [\n" +
//                "             \"测试学习\"\n" +
//                "            ]\n" +
//                "        },\n" +
//                "        \"name\": \"HttpClient_TESTAPI\",\n" +
//                "        \"sdcVersion\": \"3.18.1\",\n" +
//                "        \"sdcId\": \"e2abb488-fd3c-11ea-9d0c-ad8bfc1c43cf\"\n" +
//                "      },\n" +
//                "      \"metadata\": {\n" +
//                "        \"labels\": [\n" +
//                "          \"测试学习\"\n" +
//                "        ]\n" +
//                "      },\n" +
//                "      \"statsAggregatorStage\": {\n" +
//                "    \"instanceName\": \"statsAggregatorStageInstance\",\n" +
//                "    \"library\": \"streamsets-datacollector-basic-lib\",\n" +
//                "    \"stageName\": \"com_streamsets_pipeline_stage_destination_devnull_StatsDpmDirectlyDTarget\",\n" +
//                "    \"stageVersion\": \"1\",\n" +
//                "    \"configuration\": [],\n" +
//                "    \"uiInfo\": {\n" +
//                "      \"stageType\": \"TARGET\",\n" +
//                "      \"label\": \"Stats Aggregator -Write Directly to Control Hub - statistics are not aggregated across Data Collectors\"\n" +
//                "    },\n" +
//                "    \"inputLanes\": [],\n" +
//                "    \"outputLanes\": [],\n" +
//                "    \"eventLanes\": [],\n" +
//                "    \"services\": []\n" +
//                "  },\n" +
//                "  \"startEventStages\": [\n" +
//                "    {\n" +
//                "      \"instanceName\": \"Discard_StartEventStage\",\n" +
//                "      \"library\": \"streamsets-datacollector-basic-lib\",\n" +
//                "      \"stageName\": \"com_streamsets_pipeline_stage_destination_devnull_ToErrorNullDTarget\",\n" +
//                "      \"stageVersion\": \"1\",\n" +
//                "      \"configuration\": [],\n" +
//                "      \"uiInfo\": {\n" +
//                "        \"yPos\": 50,\n" +
//                "        \"stageType\": \"TARGET\",\n" +
//                "        \"icon\": \"\",\n" +
//                "        \"description\": \"\",\n" +
//                "        \"label\": \"Start Event - Discard\",\n" +
//                "        \"xPos\": 60\n" +
//                "      },\n" +
//                "      \"inputLanes\": [],\n" +
//                "      \"outputLanes\": [],\n" +
//                "      \"eventLanes\": [],\n" +
//                "      \"services\": []\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"stopEventStages\": [\n" +
//                "    {\n" +
//                "      \"instanceName\": \"Discard_StopEventStage\",\n" +
//                "      \"library\": \"streamsets-datacollector-basic-lib\",\n" +
//                "      \"stageName\": \"com_streamsets_pipeline_stage_destination_devnull_ToErrorNullDTarget\",\n" +
//                "      \"stageVersion\": \"1\",\n" +
//                "      \"configuration\": [],\n" +
//                "      \"uiInfo\": {\n" +
//                "        \"yPos\": 50,\n" +
//                "        \"stageType\": \"TARGET\",\n" +
//                "        \"icon\": \"\",\n" +
//                "        \"description\": \"\",\n" +
//                "        \"label\": \"Stop Event - Discard\",\n" +
//                "        \"xPos\": 60\n" +
//                "      },\n" +
//                "      \"inputLanes\": [],\n" +
//                "      \"outputLanes\": [],\n" +
//                "      \"eventLanes\": [],\n" +
//                "      \"services\": []\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"testOriginStage\": {\n" +
//                "    \"instanceName\": \"com_streamsets_pipeline_stage_devtest_rawdata_RawDataDSource_TestOriginStage\",\n" +
//                "    \"library\": \"streamsets-datacollector-dev-lib\",\n" +
//                "    \"stageName\": \"com_streamsets_pipeline_stage_devtest_rawdata_RawDataDSource\",\n" +
//                "    \"stageVersion\": \"3\",\n" +
//                "    \"configuration\": [\n" +
//                "      {\n" +
//                "        \"name\": \"rawData\",\n" +
//                "        \"value\": \"{\\n  \\\"f1\\\": \\\"abc\\\",\\n  \\\"f2\\\": \\\"xyz\\\",\\n  \\\"f3\\\": \\\"lmn\\\"\\n}\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"name\": \"stopAfterFirstBatch\",\n" +
//                "        \"value\": false\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"name\": \"eventData\",\n" +
//                "        \"value\": null\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"name\": \"stageOnRecordError\",\n" +
//                "        \"value\": \"TO_ERROR\"\n" +
//                "      }\n" +
//                "    ],\n" +
//                "    \"uiInfo\": {\n" +
//                "      \"stageType\": \"SOURCE\",\n" +
//                "      \"label\": \"Test Origin - Dev Raw Data Source\"\n" +
//                "    },\n" +
//                "    \"inputLanes\": [],\n" +
//                "    \"outputLanes\": [\n" +
//                "      \"com_streamsets_pipeline_stage_devtest_rawdata_RawDataDSource_TestOriginStageOutputLane1\"\n" +
//                "    ],\n" +
//                "    \"eventLanes\": [],\n" +
//                "    \"services\": [\n" +
//                "      {\n" +
//                "        \"service\": \"com.streamsets.pipeline.api.service.dataformats.DataFormatParserService\",\n" +
//                "        \"serviceVersion\": 2,\n" +
//                "        \"configuration\": [\n" +
//                "          {\n" +
//                "            \"name\": \"displayFormats\",\n" +
//                "            \"value\": \"DELIMITED,JSON,LOG,SDC_JSON,TEXT,XML\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormat\",\n" +
//                "            \"value\": \"JSON\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.compression\",\n" +
//                "            \"value\": \"NONE\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.filePatternInArchive\",\n" +
//                "            \"value\": \"*\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.charset\",\n" +
//                "            \"value\": \"UTF-8\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.removeCtrlChars\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.textMaxLineLen\",\n" +
//                "            \"value\": 1024\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.useCustomDelimiter\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.customDelimiter\",\n" +
//                "            \"value\": \"\\\\r\\\\n\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.includeCustomDelimiterInTheText\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.jsonContent\",\n" +
//                "            \"value\": \"MULTIPLE_OBJECTS\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.jsonMaxObjectLen\",\n" +
//                "            \"value\": 4096\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvFileFormat\",\n" +
//                "            \"value\": \"CSV\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvHeader\",\n" +
//                "            \"value\": \"NO_HEADER\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvAllowExtraColumns\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvExtraColumnPrefix\",\n" +
//                "            \"value\": \"_extra_\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvMaxObjectLen\",\n" +
//                "            \"value\": 1024\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvCustomDelimiter\",\n" +
//                "            \"value\": \"|\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.multiCharacterFieldDelimiter\",\n" +
//                "            \"value\": \"||\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.multiCharacterLineDelimiter\",\n" +
//                "            \"value\": \"${str:unescapeJava('\\\\\\\\n')}\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvCustomEscape\",\n" +
//                "            \"value\": \"\\\\\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvCustomQuote\",\n" +
//                "            \"value\": \"\\\"\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvEnableComments\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvCommentMarker\",\n" +
//                "            \"value\": \"#\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvIgnoreEmptyLines\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvRecordType\",\n" +
//                "            \"value\": \"LIST_MAP\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.csvSkipStartLines\",\n" +
//                "            \"value\": 0\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.parseNull\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.nullConstant\",\n" +
//                "            \"value\": \"\\\\\\\\N\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.xmlRecordElement\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.preserveRootElement\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.includeFieldXpathAttributes\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.xPathNamespaceContext\",\n" +
//                "            \"value\": []\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.outputFieldAttributes\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.xmlMaxObjectLen\",\n" +
//                "            \"value\": 4096\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.logMode\",\n" +
//                "            \"value\": \"COMMON_LOG_FORMAT\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.logMaxObjectLen\",\n" +
//                "            \"value\": 1024\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.retainOriginalLine\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.customLogFormat\",\n" +
//                "            \"value\": \"%h %l %u %t \\\"%r\\\" %>s %b\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.regex\",\n" +
//                "            \"value\": \"^(\\\\S+) (\\\\S+) (\\\\S+) \\\\[([\\\\w:/]+\\\\s[+\\\\-]\\\\d{4})\\\\] \\\"(\\\\S+) (\\\\S+) (\\\\S+)\\\" (\\\\d{3}) (\\\\d+)\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.fieldPathsToGroupName\",\n" +
//                "            \"value\": [\n" +
//                "              {\n" +
//                "                \"fieldPath\": \"/\",\n" +
//                "                \"group\": 1\n" +
//                "              }\n" +
//                "            ]\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.grokPatternDefinition\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.grokPattern\",\n" +
//                "            \"value\": \"%{COMMONAPACHELOG}\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.onParseError\",\n" +
//                "            \"value\": \"ERROR\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.maxStackTraceLines\",\n" +
//                "            \"value\": 50\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.enableLog4jCustomLogFormat\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.log4jCustomLogFormat\",\n" +
//                "            \"value\": \"%r [%t] %-5p %c %x - %m%n\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.avroSchemaSource\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.avroSchema\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.schemaRegistryUrls\",\n" +
//                "            \"value\": []\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.basicAuth\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.schemaLookupMode\",\n" +
//                "            \"value\": \"SUBJECT\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.subject\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.schemaId\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.avroSkipUnionIndex\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.protoDescriptorFile\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.messageType\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.isDelimited\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.binaryMaxObjectLen\",\n" +
//                "            \"value\": 1024\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.datagramMode\",\n" +
//                "            \"value\": \"SYSLOG\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.typesDbPath\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.convertTime\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.excludeInterval\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.authFilePath\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.netflowOutputValuesMode\",\n" +
//                "            \"value\": \"RAW_AND_INTERPRETED\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.maxTemplateCacheSize\",\n" +
//                "            \"value\": -1\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.templateCacheTimeoutMs\",\n" +
//                "            \"value\": -1\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.netflowOutputValuesModeDatagram\",\n" +
//                "            \"value\": \"RAW_AND_INTERPRETED\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.maxTemplateCacheSizeDatagram\",\n" +
//                "            \"value\": -1\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.templateCacheTimeoutMsDatagram\",\n" +
//                "            \"value\": -1\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.wholeFileMaxObjectLen\",\n" +
//                "            \"value\": 8192\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.rateLimit\",\n" +
//                "            \"value\": \"-1\"\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.verifyChecksum\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.excelHeader\",\n" +
//                "            \"value\": null\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.excelSkipCellsWithNoHeader\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.excelReadAllSheets\",\n" +
//                "            \"value\": false\n" +
//                "          },\n" +
//                "          {\n" +
//                "            \"name\": \"dataFormatConfig.excelSheetNames\",\n" +
//                "            \"value\": []\n" +
//                "          }\n" +
//                "        ]\n" +
//                "      }\n" +
//                "    ]\n" +
//                "  },\n" +
//                "  \"valid\": false,\n" +
//                "  \"issues\": {\n" +
//                "    \"pipelineIssues\": [],\n" +
//                "    \"stageIssues\": {},\n" +
//                "    \"issueCount\": 0\n" +
//                "  },\n" +
//                "  \"previewable\": false\n" +
//                "}";
//        HttpResult httpResult = httpPOSTBody.doPostbody(url,body);
//        System.out.println(httpResult.getCode());
//        System.out.println(httpResult.getBody());
//        return httpResult.getBody();
//    }
//}
