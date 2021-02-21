# Spring Cloud Client example project

This client example is useful in showing the plain integration between Kubernetes (Openshift in this case) and Spring Cloud Kubernetes project for : 

- Service Discovery

##To start: 
1) Login on openshift with CLI standard command
2) Use  "mvn oc:deploy -Popenshift" to activate JKube plugin  

##Service Discovery

To enable service discovery are imported dependencies with: 

<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-kubernetes</artifactId>
</dependency>

While in code put these annotation on a Spring configuration class or main class : 

@EnableDiscoveryClient
@EnableScheduling 

Last annotation serve as an activator of server discovery service from Kubernetes API. 

To reach a service on created namespace from code use Spring cloud discovery client : 

@Autowired private DiscoveryClient discoveryClient;

## To Test 

- Connect to <host>/services to list discovered services
