package models.user;

import container.ArrayUser;

public class DefaultUser {
	private static ArrayUser arrayUser = ArrayUser.getInstanceUserList();

	public static void defaultUser() {

		User user1 = new User();
		user1.name = "miguel";
		user1.lastName = "aguilar";
		user1.dni = 645121;
		user1.userName = "micky123";
		user1.password = "admin1234";
		arrayUser.getList().add(user1);
	}
}
