# java-graphql-unit-tests

### Summary:
Issue when unit testing project with `GraphQLTest` library using a package by feature/domain approach, instead of a package by layer.  

[Discussion](https://github.com/graphql-java-kickstart/graphql-spring-boot/discussions/416)

Package by feature:  
![package-by-feature](/docs/83407480-2ca4eb80-a3e7-11ea-86ba-83315fddbc27.png)  

Package by layer:  
![package-by-layer](/docs/83407484-329acc80-a3e7-11ea-9f65-4145c514fba2.png)  

### Issue:
When running unit test for QueryResolver, is given an error:

`graphql.kickstart.tools.SchemaClassScannerError: No Root resolvers for mutation type 'Mutation' found!`

The same occurs when unit testing MutationResolver:

`graphql.kickstart.tools.SchemaClassScannerError: No Root resolvers for query type 'Query' found! Provide one or more graphql.kickstart.tools.GraphQLQueryResolver to the builder.`

### Solution:
Adding `@ComponentScan("me.github.andrekunitz.issueexemple")` to test classes.  
There's a `@ComponentScan` without specifying any packages on the `@GraphQLTest` annotation, which results in it scanning only the package that test class is defined in, instead of the root package.

### Acknowledgement:
Thanks to [Michiel Oliemans](https://github.com/oliemansm) for the effort into [GraphQL Java Kickstart](https://github.com/graphql-java-kickstart) projetc.