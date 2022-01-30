package com.company;

public class Human {
    String name;
    int age;
    double weight;
    double liftedWeight;

        public Human(String name, int age, double weight, double liftedWeight ) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.liftedWeight = liftedWeight;

    }
    public void generalInformation() {
        System.out.println("Hello my dear friend " + name + "!" + "Your age is: " + age +" And weight: " + weight);
        if (age > 0 && age <= 17){
            System.out.println("You are a child");
                    }
        else if(age >= 18 && age <= 150){
            System.out.println("You are an adult");
            personWeight();
        }
        else{
            System.out.println("Something wrong , may be you are note alive");
        }
    }
    public void personWeight() {
        if(weight >= 55 && weight <= 65 && liftedWeight > 0 && liftedWeight <=150){
            System.out.println("Your weight is light ");
            if(liftedWeight == 150){
                congratulations();
            }else{
                System.out.println("You need " + (150 - liftedWeight) + " kg to Master");
            }
        }
        else   if(weight >= 65 && weight <= 75 && liftedWeight > 150 && liftedWeight <=200){
            System.out.println("Your weight is middle");
            if(liftedWeight == 200){
                congratulations();
            }else{
                System.out.println("You need " + (200 - liftedWeight) + " kg to Master");
            }
        }
        else   if(weight > 75 && weight <= 90 && liftedWeight > 200 && liftedWeight <=250){
            System.out.println("Your weight is heavy");
            if(liftedWeight == 250){
                congratulations();
            }else{
                System.out.println("You need " + (250 - liftedWeight) + " kg to Master");
            }
        }
        else{
            System.out.println("You shoud go to another category");
        }
    }
    public void congratulations() {
        System.out.println("Сongratulations! You are a master in your category");
    }

}
