package PetShelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShelterApp {


    public static void main(String[] args) {
        boolean end = false;
        Map<String, Pets> myPets = new HashMap<String, Pets>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the new Pet Shelter of the Future!");
        System.out.println("How many pets do you want to add to the shelter?");

        int answer = input.nextInt();
        input.nextLine();

        for (int i = 0; i < answer; i++) {
            String name;
            String catOrDog;
            String petType;

            System.out.println("What is your pets name?");
            name = input.nextLine();
            System.out.println("Is your pet a Cat or a Dog?");
            catOrDog = input.nextLine().toLowerCase();
            System.out.println("Is your " + catOrDog + " is your pet Living or a Robot?");
            petType = input.nextLine().toLowerCase();

            if (catOrDog.equals("dog") && petType.equals("living")) {

                Dog test = new Dog(name, 10,25, 25, 25, 0, true);
                myPets.put(name, test);

            } else if (catOrDog.equals("dog") && petType.equals("robot")) {
                RoboDog test = new RoboDog(name, 10,25, 25, false);
                myPets.put(name, test);

            } else if (catOrDog.equals("cat") && petType.equals("living")) {
                Cat test = new Cat(name, 10, 25, 25, 25, true);
                myPets.put(name, test);

            } else if (catOrDog.equals("cat") && petType.equals("robot")) {
                RoboCat test = new RoboCat(name, 10, 25, 25, false);
                myPets.put(name, test);

            } else {
                System.out.println("Invalid selection, please try again");
                i = i - 1;
            }


        }


        while (!end) {

            System.out.println("Your Current Pet Shelter");
            System.out.println("----------------------------------------------");
            for (Map.Entry<String, Pets> entry : myPets.entrySet()) {


                if (entry.getValue().getClass().getName().equals("PetShelter.Dog")) {

                    Dog placeHolder = (Dog) entry.getValue();


                    System.out.println("Name: " + placeHolder.getName() + " Animal Type: Dog" + " Health: " + placeHolder.getHealth() + " Hunger: " + placeHolder.getHunger() + " Thirst: " + placeHolder.getThirst() + " Happiness: " + placeHolder.getHappiness() + " Cage Soil Level: " + placeHolder.getSoilLevel());
                    placeHolder.tick();
                    placeHolder.editHealth();

                } else if (entry.getValue().getClass().getName().equals("PetShelter.Cat")) {
                    Cat placeHolder = (Cat) entry.getValue();


                    System.out.println("Name: " + placeHolder.getName() + " Animal Type: Cat" + " Health: " + placeHolder.getHealth() + " Hunger: " + placeHolder.getHunger() + " Thirst: " + placeHolder.getThirst() + " Happiness: " + placeHolder.getHappiness() + " Litterbox Soil Level: " + placeHolder.getSoilLevel());
                    placeHolder.tick();
                    placeHolder.editHealth();
                } else if (entry.getValue().getClass().getName().equals("PetShelter.RoboDog")) {

                    RoboDog placeHolder = (RoboDog) entry.getValue();
                    System.out.println("Name: " + placeHolder.getName() + " Animal Type: Robot Dog Health: " + placeHolder.getHealth() + " Happiness: " + placeHolder.getHappiness() + "Oil Level: " + placeHolder.getOilLevel());
                    placeHolder.tick();
                    placeHolder.editHealth();

                } else {
                    RoboCat placeHolder = (RoboCat) entry.getValue();
                    System.out.println("Name: " + placeHolder.getName() + " Animal Type: Robot Dog Health: " + placeHolder.getHealth() + " Happiness: " + placeHolder.getHappiness() + "Oil Level: " + placeHolder.getOilLevel());
                    placeHolder.tick();
                    placeHolder.editHealth();
                }


            }

            System.out.println("What do you want to do next?");
            System.out.println("Press 1: To feed all the living pets");
            System.out.println("Press 2: To hydrate all the living pets");
            System.out.println("Press 3: to oil all the robotic pets");
            System.out.println("Press 4: to take a dog on a walk");
            System.out.println("Press 5: to clean all the dog cages");
            System.out.println("Press 6: to clean out the cat litterbox");

            answer = input.nextInt();

            if (answer == 1) {
                for (Map.Entry<String, Pets> entry : myPets.entrySet()) {
                    if (entry.getValue().getClass().getName().equals("PetShelter.Dog")) {
                        Dog placeHolder = (Dog) entry.getValue();
                        placeHolder.feed();


                    } else if (entry.getValue().getClass().getName().equals("PetShelter.Cat")) {
                        Cat placeHolder = (Cat) entry.getValue();
                        placeHolder.feed();

                    }

                }
            } else if (answer == 2) {
                for (Map.Entry<String, Pets> entry : myPets.entrySet()) {
                    if (entry.getValue().getClass().getName().equals("PetShelter.Dog")) {
                        Dog placeHolder = (Dog) entry.getValue();
                        placeHolder.drink();


                    } else if (entry.getValue().getClass().getName().equals("PetShelter.Cat")) {
                        Cat placeHolder = (Cat) entry.getValue();
                        placeHolder.drink();

                    }

                }

            } else if (answer == 3) {
                for (Map.Entry<String, Pets> entry : myPets.entrySet()) {
                    if (entry.getValue().getClass().getName().equals("PetShelter.RoboDog")) {
                        RoboDog placeHolder = (RoboDog) entry.getValue();
                        placeHolder.oil();


                    } else if (entry.getValue().getClass().getName().equals("PetShelter.RoboCat")) {
                        RoboCat placeHolder = (RoboCat) entry.getValue();
                        placeHolder.oil();

                    }
                }
            } else if (answer == 4) {

                System.out.println("Who do you want to take on a walk?");
                for (Map.Entry<String, Pets> entry : myPets.entrySet()) {

                    if (entry.getValue().getClass().getName().equals("PetShelter.Dog")) {
                        System.out.println(entry.getValue().name);
                    }

                    else if (entry.getValue().getClass().getName().equals("PetShelter.RoboDog")){
                        System.out.println(entry.getValue().name);
                    }
                }
                input.nextLine();
                String answerHold = input.nextLine();

             if(myPets.get(answerHold).getClass().getName().equals("PetShelter.RoboDog")) {

               RoboDog placeHolder = (RoboDog) myPets.get(answerHold);
               placeHolder.goOnWalk();



            }
             else if(myPets.get(answerHold).getClass().getName().equals("PetShelter.Dog")){
                 Dog placeHolder = (Dog) myPets.get(answerHold);
                 placeHolder.walk();
             }

            } else if (answer == 6) {
                for (Map.Entry<String, Pets> entry : myPets.entrySet()) {
                    if (entry.getValue().getClass().getName().equals("PetShelter.Cat")) {
                        Cat placeHolder = (Cat) entry.getValue();
                        placeHolder.cleanLitterbox();
                    }
                }
            }

        }
    }
}
//        Dog pet1 = new Dog("Frank",100,100,100,0,true,"Dog");
//        Cat pet2 = new Cat("Jonathon", 100, 20, 50, true);
//
//        Map<String, Pets> myPets = new HashMap<String, Pets>();
//
//        myPets.put("Frank", pet1);
//        myPets.put("Jonathon", pet2);
//
//
//        Pets test = myPets.get("Frank");
//    //    Pets test2 = myPets.get("Jonathon");
//
//
//       // System.out.println(test2.name);
//

//
//        else if(entry.getValue().getClass().getName() == "PetShelter.Cat") {
//
//            System.out.println(entry.getKey() + "Is a cat!");
//
//
//
//
//        }