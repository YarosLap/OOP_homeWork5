import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        StudentGroup studentGroup = new StudentGroup();
        controller.createStudent("Борис", "Иванович","Пострыкайло","14.11.1980");
        controller.createStudent("Алексей", "Петрович","Голдынский","13.10.1981");
        controller.createStudent("Сергей", "Сергеевич","Маратов","1.10.1980");
        controller.createStudent("Владимир", "Ярославович","Столыпин","20.10.1980");
        controller.createStudent("Дмитрий", "Максимович","Римский","14.10.1970");
        controller.createStudent("Анна", "Александровна","Пескова","11.01.1980");
        controller.createTeacher("Марина", "Владимировна","Шестова","12.03.1965");
//        controller.getAllStudent();
//        controller.getAllTeacher();
        controller.getAllUser();
    }
}