# NOMAD (java) client

Based on Nomad 0.2.0


### How to use

```java
Nomad nomad = NomadClient.getInstance("http://<ip>:<port>");

Job job = new Job(id);
...
...
JobEvaluation ev = nomad.createJob("", job);
```
