public class Task1 {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n" +
                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n" +
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n" +
                "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n" +
                "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n" +
                "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(str.split(" ").length);
        for (int i = 0; i < str.split(" ").length; i++) {
            System.out.println(str.split(" ")[i]);
        }


    }
}
