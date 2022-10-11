package site.metacoding.frontproject.domain.users;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Users {
    private Integer id;
	private String username;
	private String password;
	private String email;
}
