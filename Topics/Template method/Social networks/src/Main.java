import java.util.Scanner;

abstract class SocialNetwork {

    public void connect() {
        // write your code here ...
        login();
        postStatus();
        logout();

    }

    abstract void login();

    abstract void postStatus();

    abstract void logout();


}

class Instagram extends SocialNetwork {
    @Override
    public void login() {
        System.out.println("Log into " + getClass().getName());
    }
    @Override
    public void postStatus() {
        System.out.println("Post: Hello, " + getClass().getName() + "!");
    }
    @Override
    public void logout() {
        System.out.println("Log out of " + getClass().getName());
    }

}


class Facebook extends SocialNetwork {

    @Override
    public void login() {
        System.out.println("Log into " + getClass().getName());
    }
    @Override
    public void postStatus() {
        System.out.println("Post: Hello, " + getClass().getName() + "!");
    }
    @Override
    public void logout() {
        System.out.println("Log out of " + getClass().getName());
    }

}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        SocialNetwork network = null;
        if ("facebook".equalsIgnoreCase(type)) {
            network = new Facebook();
        } else if ("instagram".equalsIgnoreCase(type)) {
            network = new Instagram();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        network.connect();
    }
}