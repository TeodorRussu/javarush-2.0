package com.javarush.task.task36.task3608;

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.FakeModel;
import com.javarush.task.task36.task3608.model.MainModel;
import com.javarush.task.task36.task3608.model.Model;
import com.javarush.task.task36.task3608.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
    //    EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();
        usersView.setController(controller);
  //      editUserView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
  //      controller.setEditUserView(editUserView);
        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126);
    //    editUserView.fireEventUserDeleted(124);
    //    editUserView.fireEventUserChanged("Ibragim",126, 10);
        usersView.fireEventShowDeletedUsers();

    }
}

/*В методе main класса Solution необходимо вызвать метод открытия формы редактирования для пользователя с id=126 у
объекта класса UsersView перед вызовом метода fireEventShowDeletedUsers().*/

/*Добавь в метод main класса Solution вызов метода fireEventOpenUserEditForm(126L) у объекта класса UsersView.*/