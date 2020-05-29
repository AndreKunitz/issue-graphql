package me.github.andrekunitz.issueexemple.user;

import java.io.IOException;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTest;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static graphql.Assert.assertNotNull;
import static graphql.Assert.assertTrue;

@GraphQLTest
class UserQueryTest {

	@Autowired GraphQLTestTemplate graphQLTestTemplate;

	@Test
	public void getUser() throws IOException {
		GraphQLResponse response = graphQLTestTemplate.postForResource("user.graphql");

		assertNotNull(response);
		assertTrue(response.isOk());
	}

}