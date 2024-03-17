#include <stdio.h>

struct Process {
    int processID;
    int arrivalTime;
    int burstTime;
    int remainingTime;
};

float calculateAverageWaitingTime(struct Process processes[], int n) {
    int currentTime = 0;
    int totalWaitingTime = 0;

    for (int i = 0; i < n; i++) {
        int shortestIndex = -1;
        int shortestTime = 1e9; 

        for (int j = 0; j < n; j++) {
            if (processes[j].arrivalTime <= currentTime && processes[j].remainingTime > 0) {
                if (processes[j].remainingTime < shortestTime) {
                    shortestTime = processes[j].remainingTime;
                    shortestIndex = j;
                }
            }
        }

        if (shortestIndex == -1) {
            currentTime++; 
            continue;
        }

        processes[shortestIndex].remainingTime--;
        currentTime++;

        for (int j = 0; j < n; j++) {
            if (j != shortestIndex && processes[j].arrivalTime <= currentTime && processes[j].remainingTime > 0) {
                totalWaitingTime++;
            }
        }
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

