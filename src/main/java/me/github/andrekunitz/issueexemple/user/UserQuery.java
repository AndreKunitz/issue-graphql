package me.github.andrekunitz.issueexemple.user;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class UserQuery implements GraphQLQueryResolver {

	public UserDTO getUser(String name) {
		return UserDTO.builder()
			.id(1)
			.name("Andre")
			.build();
	}

}
