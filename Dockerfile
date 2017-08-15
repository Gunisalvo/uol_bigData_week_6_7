FROM java:8u111-jre
MAINTAINER Gunisalvo

RUN mkdir -p /opt/camel-app/inbox
VOLUME /opt/camel-app/inbox
ADD target/camel-app.jar /opt/camel-app/

WORKDIR /opt/camel-app

CMD java -jar camel-app.jar
