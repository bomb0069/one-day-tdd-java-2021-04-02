# One Day TDD for Java 2021-04-02

## รายชื่อ Software ที่ต้องติดตั้ง

1. IntelliJ IDEA Community Version
  - https://www.jetbrains.com/idea/download/#section=windows
2. Java Development Kit (Adobe OpenJDK)
3. demo.zip

## URL ที่ต้องขอ Access Internet
    -  https://repo.maven.apache.org/

## ขั้นตอนการตรวจสอบความพร้อมของเครื่อง

1.  download demo.zip
2.  Extract File ลงในเครื่อง
3.  เข้า CMD ไปที่ Folder ที่ Extract ไว้
4.  ตรวจสอบ Folder จะต้องประกอบไปด้วย

```tree
    |- HELP.md
    |- mvnw (Folder)
    |- mvnw.cmd
    |- pom.xml
    |- src (Folder)
```
5.  รัน Command 'mvnw test' แล้วขึ้นข้อมูลว่าผ่าน ดังนี้ 
    
```cmd
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 21.974 s - in com.example.demo.DemoApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  29.966 s
[INFO] Finished at: 2021-03-29T11:11:09+07:00
[INFO] ------------------------------------------------------------------------
```

## Robot Framework เพื่อใช้ทดสอบ Oracle PL/SQL
    
1. Robot Framework with SeleniumLibrary ขั้นตอนตาม https://sck.pub/install-robot-windows

2. Robot Framework - Database Library 
    
```cmd
pip install robotframework-databaselibrary
```

3. Robot Framework - Oracle Database Connector 

```cmd       
pip install JayDeBeApi
```
