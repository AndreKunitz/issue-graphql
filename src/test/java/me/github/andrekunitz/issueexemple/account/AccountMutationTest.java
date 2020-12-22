package me.github.andrekunitz.issueexemple.account;

import java.io.IOException;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTest;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import static graphql.Assert.assertNotNull;
import static graphql.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

@GraphQLTest
@ComponentScan("me.github.andrekunitz.issueexemple")
class AccountMutationTest {

	@Autowired GraphQLTestTemplate graphQLTestTemplate;

	@Test
	public void crateAccount() throws IOException {
		GraphQLResponse response = graphQLTestTemplate.postForResource("account.graphql");

		assertNotNull(response);
		assertTrue(response.isOk());
	}
}