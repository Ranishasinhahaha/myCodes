#!/bin/bash

echo -n "Enter the number of processes: "
read n

#input the number of processes
declare -a burstTime
declare -a waitingTime
declare -a turnAroundTime

# Input burst times for each process
for ((i = 0; i < n; i++)); do
    echo -n "Enter burst time for process P$((i + 1)): "
    read burstTime[i]
done

# Calculate waiting time and turn-around time
waitingTime[0]=0
for ((i = 1; i < n; i++)); do
    waitingTime[i]=$((waitingTime[i - 1] + burstTime[i - 1]))
done

for ((i = 0; i < n; i++)); do
    turnAroundTime[i]=$((waitingTime[i] + burstTime[i]))
done

# Calculate average waiting time and average turn-around time
totalWaitingTime=0
totalTurnAroundTime=0
for ((i = 0; i < n; i++)); do
    totalWaitingTime=$((totalWaitingTime + waitingTime[i]))
    totalTurnAroundTime=$((totalTurnAroundTime + turnAroundTime[i]))
done

avgWaitingTime=$(bc -l <<< "scale=2; $totalWaitingTime / $n")
avgTurnAroundTime=$(bc -l <<< "scale=2; $totalTurnAroundTime / $n")

# Display results
echo -e "\nProcess\tBurst Time\tWaiting Time\tTurn-Around Time"
for ((i = 0; i < n; i++)); do
    echo -e "P$((i + 1))\t\t${burstTime[i]}\t\t${waitingTime[i]}\t\t${turnAroundTime[i]}"
done

echo -e "\nAverage Waiting Time: $avgWaitingTime"
echo "Average Turn-Around Time: $avgTurnAroundTime"
