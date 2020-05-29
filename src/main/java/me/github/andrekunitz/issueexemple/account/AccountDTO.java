package me.github.andrekunitz.issueexemple.account;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTO {

	private String email;
	private String password;
}
