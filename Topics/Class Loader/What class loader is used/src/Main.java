class Main {
    public static void main(String[] args) {
        // code
        ClassLoader classLoader = Main.class.getClassLoader();
        String classLoaderName = classLoader.getName();
        System.out.println(classLoaderName);
    }
}