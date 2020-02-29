rm ./logs/my-web*.log
rm nohup.out
#nohup java -jar -Xms1024m -Xmx1024m -javaagent:/home/test/sw/scouter/agent.java/scouter.agent.jar -Dobj_name=app1 -Dscouter.config=/home/test/sw/scouter/agent.java/conf/app1.conf  -Djava.security.egd=file:/dev/./urandom ./target/was1-0.0.1-SNAPSHOT.jar &
nohup java -jar -Xms1024m -Xmx1024m  -Djava.security.egd=file:/dev/./urandom ./target/was1-0.0.1-SNAPSHOT.jar &
