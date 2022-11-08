package com.github.sdoward;

import java.util.HashMap;
import java.util.Map;

public class Redi {

    private final static String ENCAPSULATION = "Encapsulation";
    private final static String POLYMORPHISM = "Polymorphism";
    private final static String INHERITANCE = "Inheritance";

    private Map<String, Boolean> knowledge = new HashMap();
    private String name;

    public Redi() {
        knowledge.put(ENCAPSULATION, false);
        knowledge.put(POLYMORPHISM, false);
        knowledge.put(INHERITANCE, false);
    }

    public void login(String studentName) {
        this.name = studentName;
    }

    public void setEncapsulationAsKnown(boolean isKnown) {
        knowledge.put(ENCAPSULATION, isKnown);
    }

    public void setPolymorphismAsKnown(boolean isKnown) {
        knowledge.put(POLYMORPHISM, isKnown);
    }

    public void setInheritanceAsKnown(boolean isKnown) {
        knowledge.put(INHERITANCE, isKnown);
    }

    public void setCustomKnowledgeAsKnown(String knowledge, boolean isKnown) {
        this.knowledge.put(knowledge, isKnown);
    }

    public String getBestStudent() {
        if (name == null) {
            throw new IllegalStateException("You must call login() first");
        } else {
            return name;
        }
    }

    public void printKnownKnowledge() {
        if (name == null) {
            throw new IllegalStateException("You must call login() first");
        } else {
            System.out.println(name + " knows the following topics...");
            boolean knowsSomething = false;
            for (Map.Entry<String, Boolean> knowledge : knowledge.entrySet()) {
                if (knowledge.getValue()) {
                    System.out.println("- " + knowledge.getKey());
                    knowsSomething = true;
                }
            }
            if (knowsSomething == false) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("... actually nothing");
            }
        }
    }

    public void printUnknownKnowledge() {
        if (name == null) {
            throw new IllegalStateException("You must call login() first");
        } else {
            System.out.println(name + " does not know the following topics...");
            for (Map.Entry<String, Boolean> knowledge : knowledge.entrySet()) {
                if (knowledge.getValue() == false) {
                    System.out.println("- " + knowledge.getKey());
                }
            }
        }
    }


}
