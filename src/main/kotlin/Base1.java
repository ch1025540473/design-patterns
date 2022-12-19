public class Base1 {

    public static void main(String[] args) {
        Home home = new Home();
        home.feeding(new Zoo<Dog>(new Dog()));
    }

    static class Home{

        void feeding(Zoo<? super Taidi> zoo){
            Do dog = (Animal) zoo.t;
            zoo.setType(new Taidi());
        }

        void feeding1(Zoo<? extends Animal> zoo){
            Animal animal = (Animal) zoo.t;
            System.out.println(zoo.getType());
        }
    }

    static class Zoo<T> {
        T t;

        public Zoo(T t) {
            this.t = t;
        }

        T getType() {
            return t;
        }

        void setType(T t) {
            this.t = t;
        }
    }

    interface Do {
        void jump();
    }

    static class Animal implements Do {

        @Override
        public void jump() {

        }
    }

    static class Dog extends Animal {

    }

    static class Taidi extends Dog {

    }
}
