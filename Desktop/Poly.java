public class Poly
    {
        void Print()
            { 
                System.out.println("Our Animal Sounds:");
            }
    }
        class AnimalSound
        {
            void Print()
            {
                System.out.println("Our Animal Sounds:");
            }
    
        }
        class DogSound extends Polymorphism
        {
            void Sound()
            {
                System.out.println("Bark Bark");
            }
        }
        class CatSound extends Polymorphism
        {
            void Sound()
            {
                 System.out.println("Meow Meow");
            }
        }
    class TestOne{
    
        static void main(String[] args)
    {
        Polymorphism dog;
    
        dog = new DogSound();
        dog.Print();
    
    
    
            }
        }
    
   