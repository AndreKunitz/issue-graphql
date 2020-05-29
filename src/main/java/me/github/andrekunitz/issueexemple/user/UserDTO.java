package me.github.andrekunitz.issueexemple.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {

	private Integer id;
	private String name;
}
