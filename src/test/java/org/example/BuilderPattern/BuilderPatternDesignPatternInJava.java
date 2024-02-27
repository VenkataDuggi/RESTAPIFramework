package org.example.BuilderPattern;

public class BuilderPatternDesignPatternInJava {

    //Change return type of each method as class type
    //this will always points to current object
    public BuilderPatternDesignPatternInJava stage1()
    {
        System.out.println("Completed Builder Pattern Step 1 ");
        return this;
    }
    public BuilderPatternDesignPatternInJava stage2(String str)
    {
        System.out.println("Completed Builder Pattern Step 2");
        return this;

    }

    public BuilderPatternDesignPatternInJava stage3()
    {
        System.out.println("Completed Builder Pattern Step 3");
        return this;


    }

    public static void main(String[] args) {

        BuilderPatternDesignPatternInJava bp = new BuilderPatternDesignPatternInJava();
    bp.stage1().stage2("test").stage3();

    //Its also called Method Chaining
    }
}
