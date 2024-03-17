#include <stdio.h>

// Structure to represent a process
struct Process {
    int processID;
    int arrivalTime;
    int burstTime;
    int priority;
    int remainingTime;
};

// Function to calculate average waiting time
float calculateAverageWaitingTime(struct Process processes[], int n) {
    int currentTime = 0;
    int totalWaitingTime = 0;

    while (1) {
        int allProcessesDone = 1; // Flag to check if all processes are done

        for (int i = 0; i < n; i++) {
            if (processes[i].remainingTime > 0) {
                allProcessesDone = 0; // At least one process is not done

                // Find the process with the highest priority
                int highestPriorityIndex = i;
                for (int j = 0; j < n; j++) {
                    if (processes[j].arrivalTime <= currentTime && processes[j].remainingTime > 0) {
                        if (processes[j].priority > processes[highestPriorityIndex].priority) {
                            highestPriorityIndex = j;
                        }
                    }
                }

                // Execute the process
                processes[highestPriorityIndex].remainingTime--;
                currentTime++;

                // Update waiting time for other processes
                for (int j = 0; j < n; j++) {
                    if (j != highestPriorityIndex && processes[j].arrivalTime <= currentTime && processes[j].remainingTime > 0) {
                        totalWaitingTime++;
                    }
                }
            }
        }

        if (allProcessesDone)
            break;
    }

    return (float)totalWaitingTime / n;
}

int main() {
    int n;
    printf("Enter the number of processes: ");
    scanf("%d", &n);

    struct Process processes[n];
    for (int i = 0; i < n; i++) {
        printf("Enter details for process P%d:\n", i + 1);
        processes[i].processID = i + 1;
        printf("Arrival time: ");
        scanf("%d", &processes[i].arrivalTime);
        printf("Burst time: ");
        scanf("%d", &processes[i].burstTime);
        printf("Priority (higher number indicates higher priority): ");
        scanf("%d", &processes[i].priority);
        processes[i].remainingTime = processes[i].burstTime;
    }

    float avgWaitingTime = calculateAverageWaitingTime(processes, n);
    printf("Average waiting time: %.2f\n", avgWaitingTime);

    printf("Completion order: ");
    for (int i = 0; i < n; i++) {
        printf("P%d ", processes[i].processID);
    }
    printf("\n");

    return 0;
}

