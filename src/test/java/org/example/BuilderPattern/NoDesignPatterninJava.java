package org.example.BuilderPattern;

public class NoDesignPatterninJava {

    public void stage1()
    {
        System.out.println("Completed Step 1 ");
    }
    public void stage2()
    {
        System.out.println("Completed Step 2");
    }

    public void stage3()
    {
        System.out.println("Completed Step 3");

    }

    public static void main(String[] args) {
        NoDesignPatterninJava nd = new NoDesignPatterninJava();
        nd.stage1();
        nd.stage2();
        nd.stage3();
    }

}

