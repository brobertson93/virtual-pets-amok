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
                    placeHolder.editHealth();
                    placeHolder.tick();


                } else if (entry.getValue().getClass().getName().equals("PetShelter.Cat")) {
                    Cat placeHolder = (Cat) entry.getValue();


                    System.out.println("Name: " + placeHolder.getName() + " Animal Type: Cat" + " Health: " + placeHolder.getHealth() + " Hunger: " + placeHolder.getHunger() + " Thirst: " + placeHolder.getThirst() + " Happiness: " + placeHolder.getHappiness() + " Litterbox Soil Level: " + placeHolder.getSoilLevel());
                    placeHolder.editHealth();
                    placeHolder.tick();
                } else if (entry.getValue().getClass().getName().equals("PetShelter.RoboDog")) {

                    RoboDog placeHolder = (RoboDog) entry.getValue();
                    System.out.println("Name: " + placeHolder.getName() + " Animal Type: Robot Dog Health: " + placeHolder.getHealth() + " Happiness: " + placeHolder.getHappiness() + " Oil Level: " + placeHolder.getOilLevel());
                    placeHolder.editHealth();
                    placeHolder.tick();

                } else {
                    RoboCat placeHolder = (RoboCat) entry.getValue();
                    System.out.println("Name: " + placeHolder.getName() + " Animal Type: Robot Cat Health: " + placeHolder.getHealth() + " Happiness: " + placeHolder.getHappiness() + " Oil Level: " + placeHolder.getOilLevel());
                    placeHolder.editHealth();
                    placeHolder.tick();
                }


            }

            System.out.println("What do you want to do next?");
            System.out.println("Press 1: To feed all the living pets");
            System.out.println("Press 2: To hydrate all the living pets");
            System.out.println("Press 3: To oil all the robotic pets");
            System.out.println("Press 4: To take a dog on a walk");
            System.out.println("Press 5: To clean all the dog cages");
            System.out.println("Press 6: To clean out the cat litterbox");
            System.out.println("Press 7: To add a new pet");
            System.out.println("Press 8: To adopt a pet");

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

               for (Map.Entry<String, Pets> entry : myPets.entrySet()) {

                   if (answerHold.toLowerCase().equals(entry.getValue().name.toLowerCase())){

                       if(entry.getValue().getClass().getName().equals("PetShelter.RoboDog")) {

                           RoboDog placeHolder = (RoboDog) entry.getValue();
                           placeHolder.goOnWalk();



                       }
                       else if(entry.getValue().getClass().getName().equals("PetShelter.Dog")){
                           Dog placeHolder = (Dog) entry.getValue();
                           placeHolder.walk();
                       }


                   }
               }





            }
            else if( answer == 5) {
                for (Map.Entry<String, Pets> entry : myPets.entrySet()) {


                    if(entry.getValue().getClass().getName().equals("PetShelter.Dog")){

                    Dog placeHolder = (Dog) entry.getValue();
                    placeHolder.cleanCages();


                    }


                    }
                }






            else if (answer == 6) {
                for (Map.Entry<String, Pets> entry : myPets.entrySet()) {
                    if (entry.getValue().getClass().getName().equals("PetShelter.Cat")) {
                        Cat placeHolder = (Cat) entry.getValue();
                        placeHolder.cleanLitterbox();
                    }
                }
            }
            else if (answer == 7) {
                input.nextLine();
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

                }
            }

            else if (answer == 8) {
                input.nextLine();
                String key = "";
                System.out.println("Who do you want to adopt from the shelter?");
                String removeAnimal = input.nextLine().toLowerCase();
                for (Map.Entry<String, Pets> entry : myPets.entrySet()) {

                    if(entry.getValue().name.toLowerCase().equals(removeAnimal)){

                        key = entry.getKey();

                    }



                }
                myPets.remove(key);
            }
            if (myPets.size() == 0) {

                String name;
                String catOrDog;
                String petType;
                System.out.println("Oh no! The shelter is out of pets, would you like to add another?");
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

                }

            }
        }
    }
}
