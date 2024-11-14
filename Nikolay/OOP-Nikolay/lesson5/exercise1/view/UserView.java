package Nikolay.OOP-Nikolay.lesson5.exercise1.view;

import Nikolay.OOP-Nikolay.lesson5.exercise1.model.User;

import java.util.List;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> list);
}
