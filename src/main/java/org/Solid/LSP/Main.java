package org.Solid.LSP;

import org.Solid.LSP.model.Bird;
import org.Solid.LSP.model.FlyingBird;
import org.Solid.LSP.model.Ostrich;
import org.Solid.LSP.model.Parrot;

public class Main {
    public static void main(String[] args) {
        FlyingBird parrot = new Parrot();

        FlyingBird[] birds = new FlyingBird[]{parrot};

        for (FlyingBird bird : birds) {
            bird.fly();
            bird.dance();
        }

        Bird[] dancingBirds = new Bird[]{new Ostrich()};
    }
}
