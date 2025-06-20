# 💹 Financial Forecasting Tool

This Java application predicts future financial values based on past data using **recursive algorithms**.

## 🔍 Features

- Calculates future value using a recursive method.
- Optimized version with memoization.
- Useful for understanding recursion and financial modeling.

## 📘 Formula Used

```
FutureValue(n) = FutureValue(n-1) * (1 + growthRate)
```

## 📁 Project Structure

```
FinancialForecasting/
└── src/
    └── FinancialForecast.java
```

## 🏃 How to Run

1. Compile:
```bash
javac src/FinancialForecast.java
```

2. Execute:
```bash
java -cp src FinancialForecast
```

## 🧠 Time Complexity

- Recursive: O(n)
- Memoized: O(n) with better reuse in overlapping scenarios

## 🛠️ Sample Output

```
Future Value (Recursive): ₹14693.28
Future Value (Memoized): ₹14693.28
```

---

⭐ Star the repository if you found it helpful!