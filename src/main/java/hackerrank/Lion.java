package hackerrank;




public class Lion extends Animal.Cat
    {
        public Lion()
        {
            System.out.println("Creating Lion");
        }
        public void speak()
        {
            super.speak();
            System.out.println("Roar");
            System.out.println("Lion says you cheated");
        }



    public static void main(String[] args)
    {
        Animal animal = new Cat();
        animal.speak();
    }
}
