#Task:  

- Create project with exec plugin.  
- Main class should work with parameters.  
- Write command examples for maven to run project.  
- Create build profile that will turn on exec plugin.  
- Use property to specify main class.

#Guide:  

Exec plugin here is set to <b>'test'</b> phase.  
To run exec plugin with default settings from .pom file, choose <b>execute</b> profile:  
  
>test -P execute  
  
To change main class and arguments:  
  
>test -P execute -Dexec.main=com.projects.maven.AppRunnerTwo -Dexec.args="'hello' 'world' '!'"
