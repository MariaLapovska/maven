#Task:  
  
- Create project with 2 types of test - ITest and simple test.  
- Configure maven to run build without ITests.  
- Create profile to run build with ITests, only ITests.  
- Use maven properties to configure ITest name convention.

#Guide:  

Default profile is set to my-test (only <b>MyTest</b> class will run). To run:  
  
>test  
  
To change profile and run only <b>ITest</b> class:  
  
>test -P i-test  
  
To change profile and run both <b>MyTest</b> and <b>ITest</b> classes:  
  
>test -P all-tests
