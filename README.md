# About this project

There are five microservice that communicate with each other. Each microservice gets configuration information from the config server. One of this information is about Eureka server URI(that contain the address that each microservice will use to registrate themselfes). 

Each microservice represents one word, and the lab-4-sentence microservice assemble the phrase with these words. 
To test this project run all services, then access "http://localhost:8020/sentence" in some browser
