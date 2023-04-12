package hackerrank;

public abstract class Animal {
        public Animal() {
            System.out.println("Creating Animal");
        }

        public void speak() {
            System.out.println("Who am I?");
        }

        public static class Cat extends Animal {
            public void speak() {
                System.out.println("Meow");
            }
        }

        public static void main(String[] args) {
            Animal animal = new Cat();
            animal.speak();
        }
    }