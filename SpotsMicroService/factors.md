I have implemented 6 of the 12 factors :

I. Codebase
--> by adding my project to git 

II. Dependencies
by using maven in my java spring application

III. Config
by sotring my configurations in appplication.properties

IV. Backing services
--> by 
creating my database in a docker-compose file

VII. Port binding
--> by binding a port on the host  to a port on the container

XI. Logs
--> by using a logger and logging 



I would implement :
V. Build, release, run--> by creating seperate pipelines and writing seperate scripts for each process

VIII. Concurrency --> by using docker swarm for orchestration and scaling