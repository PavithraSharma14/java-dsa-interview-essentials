# Java DSA Interview Essentials

A curated collection of fundamental Java programs covering number theory,
recursion, and string manipulation — the core building blocks tested in
technical interview screening rounds.

Each program includes:
- Brute force approach with time/space complexity
- Optimized approach with time/space complexity
- Edge cases commonly tested in interviews
- Clean, commented, interview-ready code

## Why this repo

Most "DSA practice" repos are scattered collections of random LeetCode
solutions. This repo focuses specifically on **basic programming
fundamentals** — the questions that decide whether a candidate clears
the first technical screening round.

## Structure

```
java-dsa-interview-essentials/
│
├── README.md
├── .gitignore
│
├── src/
│   ├── numbertheory/
│   │   ├── Palindrome.java
│   │   ├── ArmstrongNumber.java
│   │   ├── PrimeNumber.java
│   │   ├── Factorial.java
│   │   ├── PerfectNumber.java
│   │   ├── PerfectSquare.java
│   │   ├── GCDAndLCM.java
│   │   ├── ReverseNumber.java
│   │   ├── DigitOperations.java
│   │   ├── PowerOfNumber.java
│   │   └── StrongNumber.java
│   │
│   ├── series/
│   │   ├── Fibonacci.java
│   │   └── Patterns.java
│   │
│   └── strings/
│       └── StringOperations.java
│
└── docs/
    └── complexity-cheatsheet.md
```

| Folder | Contents |
|---|---|
| `src/numbertheory/` | Prime, Armstrong, Factorial, GCD/LCM, Perfect Number, Perfect Square, Strong Number, Power, Digit Operations |
| `src/series/` | Fibonacci, Star/Number patterns |
| `src/strings/` | Palindrome, Anagram, Reverse, Vowel/Consonant count |
| `docs/` | Time and space complexity quick reference |

## Programs included

| # | Program | Optimal time | Optimal space |
|---|---|---|---|
| 1 | Fibonacci (Nth term + series) | O(n) | O(1) |
| 2 | Palindrome (number + string) | O(d) | O(1) |
| 3 | Armstrong number | O(d) | O(1) |
| 4 | Prime number check + Sieve | O(√n) | O(1) |
| 5 | Factorial | O(n) | O(1) |
| 6 | Perfect number | O(√n) | O(1) |
| 7 | Perfect square check | O(log n) | O(1) |
| 8 | GCD and LCM | O(log(min(a,b))) | O(1) |
| 9 | Reverse a number | O(d) | O(1) |
| 10 | Sum & count of digits | O(d) | O(1) |
| 11 | Power of a number (x^n) | O(log n) | O(log n) |
| 12 | Star/number patterns | O(n²) | O(1) |
| 13 | String reverse & anagram | O(n) | O(1) |
| 14 | Strong (Krishnamurthy) number | O(d) | O(1) |

*(d = number of digits, n = input size)*

## How to run

Compile and run any program individually:

```bash
javac src/numbertheory/PrimeNumber.java -d out/
java -cp out numbertheory.PrimeNumber
```

Or compile everything at once:

```bash
javac -d out src/numbertheory/*.java src/series/*.java src/strings/*.java
```

## Design notes

Every program in this repo explicitly handles edge cases — negative
inputs, zero, overflow boundaries, and off-by-one digit counts. These
details are usually where interview candidates lose marks, not in the
core logic itself.

Each file also documents the brute force approach alongside the
optimized one, so the reasoning behind the optimization is visible,
not just the final answer.

## Complexity reference

See [`docs/complexity-cheatsheet.md`](docs/complexity-cheatsheet.md)
for a quick revision sheet of every approach used in this repo.

## Author

Maintained as part of ongoing technical interview preparation.
