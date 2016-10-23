#Task:  
  
- Create project with sql data.  
- Use Flyway* or liquibase plugin to populate dbdata.

#Guide:  

I used liquibase plugin. To run write:  
  
>install  

#Output:  

```bash  
Flowers and colors:   
***  
id: 1  
flower name: rose  
price: 15  
color: red  
***  
id: 2  
flower name: tulip  
price: 9  
color: yellow  
***   
  
Info about tables creation:  
  
Table flower created  
ChangeSet changelog/db-changelog.xml::CR1::mariia.lapovska ran successfully in 12ms  
Table color created  
ChangeSet changelog/db-changelog.xml::CR2::mariia.lapovska ran successfully in 1ms  
Foreign key constraint added to color (flower_id)  
ChangeSet changelog/db-changelog.xml::FK1::mariia.lapovska ran successfully in 23ms  
New row inserted into flower  
New row inserted into flower  
ChangeSet changelog/db-changelog.xml::IN1::mariia.lapovska ran successfully in 1ms  
New row inserted into color  
New row inserted into color  
ChangeSet changelog/db-changelog.xml::IN2::mariia.lapovska ran successfully in 1ms  ```
