-this project uses maven, java 17, and mysql-server so those will need to be installed and the mysql server daemon will need to be running.
-the database url, database username, and database password are specified in application.properties, feel free to change these if you want to use a different set.
-it is suggested to setup a new database for this project inside of your mysql server.
-the server port is also specified in application.properties, please make note of this port number and change it if you would like to.
TO RUN:
-open a terminal in the main folder of the project
-run command: mvn clean install
-once mvn is finished, cd into the target directory from the main submission directory
-run command: java -jar submission-INTERVIEW-SUBMISSION.jar
-the server should now be running on the port specified in application.properties.
-auto-generated api documentation should be available at http://<serveraddress>/<serverport>/v3/api-docs