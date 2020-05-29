package me.github.andrekunitz.issueexemple.account;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class AccountMutation implements GraphQLMutationResolver {

	public AccountDTO createAccount(String email, String password) {
		return AccountDTO.builder().email("me@github.com").password("123").build();
	}

}
