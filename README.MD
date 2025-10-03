# Tips
* Before releasing, remember to run all tests locally, because currently they are not able to be run on CI/CD pipeline
* Used commands locally: `mvn clean install`
* In case of changing tika version remember to change name of folder in `modeshape\deploy\jbossas\kit\jboss-wf\org\apache\tika`.
Without this change tika full text search won't work correctly. 