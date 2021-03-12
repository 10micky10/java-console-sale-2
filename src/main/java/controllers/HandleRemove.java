package controllers;

import java.util.ArrayList;

public class HandleRemove {

	public static <T> void remove(ArrayList<T> list, int index) {
		list.remove(index);
	}
}
