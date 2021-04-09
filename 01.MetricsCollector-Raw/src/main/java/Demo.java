public class Demo {
    public static void main(String[] args) {
        UserController userController = new UserController();
        UserVo regUserVo = userController.register("13913900000", "asdf1234");
        UserVo loginUserVo = userController.login("13913900000", "asdf1234");
    }
}
