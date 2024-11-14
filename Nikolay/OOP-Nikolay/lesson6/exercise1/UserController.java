package Nikolay.OOP-Nikolay.lesson6.exercise1;

public interface UserController<T extends User> {
	void create(String surname, String firstname, String patronymic);
}
