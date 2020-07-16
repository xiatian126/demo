FROM registry.xxxcloud.cn/xxx.xxx.com/jdk8-tomcat8-filebeat:latest

WORKDIR /tomcat8
ADD target/demo-0.0.1-SNAPSHOT.war /tomcat8/webapps/ROOT
#COPY ../filebeat/filebeat-api.yml filebeat.yml
RUN cd /tomcat8/webapps/ROOT && unzip demo-0.0.1-SNAPSHOT.war && \
    rm -f demo-0.0.1-SNAPSHOT.war && ls -lha && \
    echo `date +%Y-%m-%d:%H:%M:%S` > /etc/docker.build
ENTRYPOINT /tomcat8/bin/catalina.sh run



