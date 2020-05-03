package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutNewTask(TraineeTasks traineeTasks) {
        System.out.println("Your trainee " + traineeTasks.getTrainee().getName() +
                " has done task: " + traineeTasks.getTasks().peekLast() +
                ". Total tasks done by this trainee: " + traineeTasks.getTasks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
