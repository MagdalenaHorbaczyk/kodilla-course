package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TraineeTasks implements QueueObservable {
    private final List<MentorObserver> observers;
    private final Deque<String> tasks;
    private final Trainee trainee;

    public TraineeTasks(Trainee trainee) {
        this.trainee = trainee;
        tasks = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addTaskToQueue(String task) {
        tasks.offerLast(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(MentorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (MentorObserver observer : observers) {
            observer.notifyAboutNewTask(this);
        }
    }

    @Override
    public void removeObserver(MentorObserver observer) {
        observers.remove(observer);
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public Trainee getTrainee() {
        return trainee;
    }
}
