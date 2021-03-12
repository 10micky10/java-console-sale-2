package container;

import models.item.Item;
import java.util.ArrayList;

public class ArrayItem {
	private static ArrayItem instanceItem;
	private static ArrayList<Item> itemList;

	private ArrayItem() {
		itemList = new ArrayList<>();
	}

	public static ArrayItem getInstanceItemList() {
		if (instanceItem == null) {
			instanceItem = new ArrayItem();
			return instanceItem;
		}
		return instanceItem;
	}
}
