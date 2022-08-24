
public class App {
    public static void main(String[] args) throws Exception {
        Human human = new Human("John", "male", 20, 1.7, 70);
        human.setName("Janne");
        System.out.println(human.getName() + "\n" + human.getSex() + "\n" + human.getAge() + "\n" + human.getHeight()
                + "\n" + human.getWeight());
    }

}
