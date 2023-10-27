# Scheduler (Two different APIs)
Tournament scheduler for storing & publishing input data and their combinations.(8080 port)
scheduler_output for storing & publishing output combination with their respective date.(8090 port)

These both are connected with postgresql database.

this contains four main folders called model,controller,service and repository for ensuring the flow from client to controller then controller to service where business lgic are being written and service to repo and finally repository to database
