数据库用户名：root
数据库用户密码：root

配置文件：在/Exam-12747-20161229-1/src/main/resources文件中，dbconfig.properties为
数据库文件，applicationContext.xml为Spring配置文件，sqlMapConfig.xml为mybatis配置文件

运行方法：
第一种：cmd命令行，进入我项目的路径，先输入mvn clean再输入mvn compile最后输入
mvn exec:java -Dexec.mainClass="test.SMTest"运行项目，根据提示输入，
如果输入错误，控制台会打印相应的提示，请您根据提示进行相应的操作，
如果输入正确，数据会插入数据库中


第二种：进入项目下/Exam-12747-20161229-1/src/main/java/test包中的SMTest.java类
进行测试直接运行main方法即可，根据提示输入，如果输入错误，控制台会打印
相应的提示，请您根据提示进行相应的操作，如果输入正确，数据会插入数据库中


