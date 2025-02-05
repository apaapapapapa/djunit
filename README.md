mvn clean test site -DgenerateReports=false surefire-report:report

mvn dependency:copy-dependencies -DoutputDirectory=lib