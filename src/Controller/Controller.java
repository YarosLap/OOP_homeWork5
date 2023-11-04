package Controller;

import Data.Teacher;
import Data.Type;
import Data.User;
import Data.Student;
import Service.DataService;
import View.StudentView;
import View.TeacherView;
import View.UserView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final UserView userView = new UserView();
    private final List<StudentGroup> groups;

    public void createStudent(String firstName, String secondName, String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

//    public void getAllStudent() {
//        List<User> userList = service.getAllStudent();
//        for (User user : userList) {
//            studentView.printOnConsole((Student) user);
//        }

//    public void getAllTeacher() {
//        List<User> userList = service.getAllTeacher();
//        for (User user : userList) {
//            teacherView.printOnConsole((Teacher) user);
//        }
//        }

        public void getAllUser() {
            List<User> userList = service.getAllUser();
            for (User user : userList) {
                userView.printOnConsole(user);
            }
        }

        public void FormingStudentGroup() {

        }
}



