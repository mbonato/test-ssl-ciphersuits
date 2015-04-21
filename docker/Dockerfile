FROM java:openjdk-7

ENV JAVA_VERSION 7

ADD test-ssl-ciphersuits-0.0.1-SNAPSHOT.jar /
ADD truststore.jks /

#ADD iaik_ecc_signed-2.19.jar /usr/lib/jvm/java-$JAVA_VERSION-openjdk-amd64/jre/lib/ext/
#ADD iaik_jce_full_signed-5.01.jar /usr/lib/jvm/java-$JAVA_VERSION-openjdk-amd64/jre/lib/ext/

ADD iaik_jce_full.jar /usr/lib/jvm/java-$JAVA_VERSION-openjdk-amd64/jre/lib/ext/
ADD iaik_eccelerate.jar /usr/lib/jvm/java-$JAVA_VERSION-openjdk-amd64/jre/lib/ext/

ADD java.security /tmp/
RUN cat /tmp/java.security >> /etc/java-$JAVA_VERSION-openjdk/security/java.security

ENTRYPOINT ["java", "-showversion", "-Djavax.net.debug=all", "-jar", "-Djavax.net.ssl.trustStore=/truststore.jks", "test-ssl-ciphersuits-0.0.1-SNAPSHOT.jar"]