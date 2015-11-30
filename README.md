# Nomad (java) client

Based on [Nomad](https://nomadproject.io/) 0.2.0


### How to use

Insert on your pom.xmInsert on your pom.xml:

```xml
<dependency>
  <groupId>com.github.devopsbq</groupId>
  <artifactId>nomad-client</artifactId>
  <version>0.1.0</version>
</dependency>
```

On your code:

```java
Nomad nomad = NomadClient.getInstance("http://<ip>:<port>");

Job job = new Job(id);
...
...
JobEvaluation ev = nomad.createJob("", job);
```
