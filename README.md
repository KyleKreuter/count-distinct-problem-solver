# Count-Distinct Problem Solver

## Overview

This project provides an implementation of the count-distinct problem, also known as the cardinality estimation problem, in computer science. This problem involves determining the number of distinct elements in a data stream that may contain repeated elements. The implementation simulates the process for large datasets and tests the accuracy of the cardinality estimation under simulated conditions.

## Project Structure

The codebase is organized into several Java classes designed to simulate the count-distinct problem and measure the deviation of the estimated number from the actual number of distinct elements.

### Classes and Interfaces

- `Element`: An interface representing the elements in the data stream.
- `Memory`: Manages the storage and probability adjustment based on the count-distinct algorithm.
- `VisitorProblem`: Contains the main method to run the simulation and calculate deviations.

## Features

- **Simulation of Element Streams**: Simulate streams of data to analyze the effectiveness of the count-distinct problem solving.
- **Dynamic Probability Adjustment**: Adjusts the probability of counting a new element to manage memory constraints.
- **Deviation Calculation**: Calculates the deviation between the estimated number of distinct elements and the actual number.

## Example Output
`Deviation: 1,239%`

This output indicates the percentage deviation from the actual number of distinct elements calculated by the simulation.


## Future Work

- Implement and compare other algorithms like HyperLogLog for better accuracy.