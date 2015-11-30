package es.bq.devops.nomad.client;

import java.lang.reflect.Member;
import java.util.List;

import es.bq.devops.nomad.client.model.v1.Agent;
import es.bq.devops.nomad.client.model.v1.Allocation;
import es.bq.devops.nomad.client.model.v1.BaseAllocation;
import es.bq.devops.nomad.client.model.v1.BaseJob;
import es.bq.devops.nomad.client.model.v1.BaseNode;
import es.bq.devops.nomad.client.model.v1.Evaluation;
import es.bq.devops.nomad.client.model.v1.Job;
import es.bq.devops.nomad.client.model.v1.JobEvaluation;
import es.bq.devops.nomad.client.model.v1.JoinResult;
import es.bq.devops.nomad.client.model.v1.Node;
import es.bq.devops.nomad.client.model.v1.NodeEvaluation;
import es.bq.devops.nomad.client.model.v1.NodeListEvaluation;
import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json") public interface Nomad {

    // Jobs
    @RequestLine("GET /v1/jobs?region={region}")
    List<BaseJob> getJobs(@Param("region") String region);

    @Headers("Content-Type: application/json")
    @RequestLine("POST /v1/jobs?region={region}")
    @Body("%7B\"job\": {job}%7D")
    JobEvaluation createJob(@Param("region") String region, @Param("job") Job job);

    @RequestLine("GET /v1/job/{id}?region={region}")
    Job getJob(@Param("id") String id, @Param("region") String region);

    @Headers("Content-Type: application/json")
    @RequestLine("PUT /v1/job/{id}?region={region}")
    JobEvaluation modifyJob(@Param("id") String id, @Param("region") String region, Job job);

    @RequestLine("DELETE /v1/job/{id}?region={region}")
    JobEvaluation deleteJob(@Param("id") String id, @Param("region") String region);

    @RequestLine("GET /v1/job/{id}/allocations?region={region}")
    List<BaseAllocation> getJobAllocations(@Param("id") String id, @Param("region") String region);

    @RequestLine("POST /v1/job/{id}/evaluate?region={region}")
    JobEvaluation evaluateJob(@Param("id") String id, @Param("region") String region);

    @RequestLine("GET /v1/job/{id}/evaluations?region={region}")
    List<Evaluation> getJobEvaluations(@Param("id") String id, @Param("region") String region);

    // Nodes

    @RequestLine("GET /v1/nodes?region={region}")
    List<BaseNode> getNodes(@Param("region") String region);

    @RequestLine("GET /v1/node/{id}?region={region}")
    Node getNode(@Param("id") String id, @Param("region") String region);

    @RequestLine("GET /v1/node/{id}/allocations?region={region}")
    List<BaseAllocation> getNodeAllocations(@Param("id") String id, @Param("region") String region);

    @RequestLine("POST /v1/node/{id}/evaluate?region={region}")
    NodeListEvaluation evaluateNode(@Param("id") String id, @Param("region") String region);

    @RequestLine("POST /v1/node/{id}/drain?enable={enable}&region={region}")
    NodeEvaluation drainNode(@Param("id") String id, @Param("enable") boolean enable, @Param("region") String region);

    // Allocations

    @RequestLine("GET /v1/allocations?region={region}")
    List<BaseAllocation> getAllocations(@Param("region") String region);

    @RequestLine("GET /v1/allocation/{id}?region={region}")
    Allocation getAllocation(@Param("id") String id, @Param("region") String region);

    // Evaluations

    @RequestLine("GET /v1/evaluations?region={region}")
    List<Evaluation> getEvaluations(@Param("region") String region);

    @RequestLine("GET /v1/evaluation/{id}?region={region}")
    Evaluation getEvaluation(@Param("id") String id, @Param("region") String region);

    @RequestLine("GET /v1/evaluation/{id}/allocations?region={region}")
    List<BaseAllocation> getEvaluationAllocations(@Param("id") String id, @Param("region") String region);

    // Agent
    @RequestLine("GET /v1/agent/self")
    Agent getSelf();

    @RequestLine("POST /v1/agent/join?address={address}") // TODO: address can be provided multiple times
    JoinResult join(@Param("address") String address);

    @RequestLine("GET /v1/agent/members")
    List<Member> getMembers();

    @RequestLine("GET /v1/agent/force-leave?node={node}")
    void forceLeave(@Param("node") String node);

    @RequestLine("GET /v1/agent/servers")
    List<String> getServers();

    @RequestLine("POST /v1/agent/servers?address={address}") // TODO: address can be provided multiple times
    void updateServers(@Param("address") String address);

    // Misc
    @RequestLine("GET /v1/status/leader?region={region}")
    String getLeader(@Param("region") String region);

    @RequestLine("GET /v1/status/peers?region={region}")
    List<String> getPeers(@Param("region") String region);
}
