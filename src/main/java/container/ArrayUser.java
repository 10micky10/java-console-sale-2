package container;

import models.user.User;

import java.util.ArrayList;

public class ArrayUser {
	private static ArrayUser instanceUser;
	private static ArrayList<User> userList;

	private ArrayUser() {
		userList = new ArrayList<>();
	}

	public static ArrayUser getInstanceUserList() {
		if (instanceUser == null) {
			instanceUser = new ArrayUser();
			return instanceUser;
		}
		return instanceUser;
	}

	public ArrayList<User> getList() {
		return userList;
	}
}
