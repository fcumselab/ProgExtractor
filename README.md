1.打包 mvn clean assembly:assembly 記得用名字長的

2.回到plugin import mvn install:install-file -Dfile="ProgExtractor-1.0.jar" -DgroupId="fcu.selab.progextractor" -DartifactId=ProgExtractor -Dversion="1.0" -Dpackaging=jar

3.使用 ExtractFeedback extractFeedback = new ExtractFeedback(assignmentType, status, console);
       extractFeedback.getFeedback()