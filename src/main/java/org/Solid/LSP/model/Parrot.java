package org.Solid.LSP.model;

public class Parrot implements  FlyingBird{
    @Override
    public void dance() {
        System.out.println("I`m dancing");
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }
}
