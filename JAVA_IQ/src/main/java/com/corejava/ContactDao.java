package com.corejava;

public class ContactDao {

	private static ContactDao dao = null;

	private ContactDao() {
	}

	public static ContactDao getInstance() {
		if (dao == null) {
			dao = new ContactDao();
		}
		return dao;
	}

	public static void main(String[] args) {
		ContactDao object1 = ContactDao.getInstance();
		System.out.println(object1);

		ContactDao object2 = ContactDao.getInstance();
		System.out.println(object2);
	}
}
