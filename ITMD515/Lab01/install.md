* Install JDK on my linux server:

`sudo apt install default-jdk`

`url: "http://127.0.0.1:8080/jaxrs21example/webresources/customercontroller/",`

![image-20210531110031137](/Users/mickeyzzq/Library/Application Support/typora-user-images/image-20210531110031137.png)

![image-20210531111947471](/Users/mickeyzzq/Library/Application Support/typora-user-images/image-20210531111947471.png)

install pazara 5



```
$ wget https://info.payara.fish/cs/c/?cta_guid=b9609f35-f630-492f-b3c0-238fc55f489b&file=payara-5.2021.3.zip
$ sudo mv payara-5.2021.3.zip /opt/
$ cd /opt
$ sudo unzip payara-5.2021.3.zip
$ cd payara5/bin/
$ sudo ./asadmin start-domain
Waiting for domain1 to start .......................
Successfully started the domain : domain1
domain  Location: /opt/payara5/glassfish/domains/domain1
Log File: /opt/payara5/glassfish/domains/domain1/logs/server.log
Admin Port: 4848
Command start-domain executed successfully.
```

![image-20210530110538332](/Users/mickeyzzq/Library/Application Support/typora-user-images/image-20210530110538332.png)



```bash
CREATE USER 'mickey'@'localhost' IDENTIFIED BY 'l4z3mzw';
export http_proxy="http://127.0.0.1:8001"; export HTTP_PROXY="http://127.0.0.1:8001"; export https_proxy="http://127.0.0.1:8001"; export HTTPS_PROXY="http://127.0.0.1:8001"
CREATE USER 'mickey'@'%' IDENTIFIED BY 'l4z3mzw';
GRANT ALL PRIVILEGES ON *.* TO 'mickey'@'%';
```



![image-20210531113007048](/Users/mickeyzzq/Library/Application Support/typora-user-images/image-20210531113007048.png)





fa084dbe31684e2f954a54f1cc7226b85dfab4cc

ZZHU38 ITMD4515 21S

