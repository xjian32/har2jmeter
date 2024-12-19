# har2jmeter
*.har格式的文件转为Jmeter的jmx文件

# 使用方法
1. clone代码
2. 在项目目录下的target目录中，运行HarJmeter.jar文件
   ```
   java -jar Har2Jmeter.jar /your/har/path/har_file.har /your/output/path/jmeter_file.jmx
   ```

# jmx文件说明
1. 默认一次生成的接口都是同一个Domain下的，所以设置了用户自定义参数BASE_URL
2. 默认为每个请求都生成了一个 响应码=200 的断言，可以根据实际情况进行修改