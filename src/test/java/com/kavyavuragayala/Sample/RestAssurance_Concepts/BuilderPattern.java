package com.kavyavuragayala.Sample.RestAssurance_Concepts;

public class BuilderPattern {

       // irregular way of printing the pattern

        public BuilderPattern method1() {
            System.out.println("Method1");
            return this;
        }

        public BuilderPattern method2() {
            System.out.println("Method2");
            return this;
        }

        public BuilderPattern method3(String param1) {
            System.out.println("Method3");
            return this;
        }

    public static void main(String[] args) {

            BuilderPattern bp = new BuilderPattern();
            bp.method2().method3("Alice").method1();
    }
}

