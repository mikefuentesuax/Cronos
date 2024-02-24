package com;

import java.util.ArrayList;
import java.util.List;

class Task {
    String description;
    int duration;
    CrewMember assignedMember;

    public CrewMember(String name) {
        this.name = name;
    }

    int calculateWorkload() {
        return tasks.stream().mapToInt(task -> task.duration).sum();
    }
}

class Scheduler {
    List<CrewMember> crewMembers = new ArrayList<>();

    void assignTask(Task task, CrewMember crewMember) {
        task.assignedMember = crewMember;
        crewMember.tasks.add(task);
    }

    void displaySchedule() {
        for (CrewMember crewMember : crewMembers) {
            System.out.println("Schedule for " + crewMember.name + ":");
            for (Task task : crewMember.tasks) {
                System.out.println(task.description + " (" + task.duration + " hours)");
            }
        }
    }

    void adjustSchedule() {
    }
}



