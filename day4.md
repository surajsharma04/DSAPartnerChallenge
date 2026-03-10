# Day 4 — switch case (Java & C++) / match case (Python)

> **DSA Partner Challenge** | Week 1: Language Basics + Maths for DSA

---

## 📌 Topic of the Day

##notes:  https://drive.google.com/file/d/1zICbYGLxtGIG28DUc229gbpiOFoua2bO/view?usp=sharing

**switch / match case — keeping it light**

When you have one variable and many possible values to check, switch/match is cleaner than a chain of if-else. Today we learn all three flavours.

---

## 🎥 Resource

| Language | Resource |
|----------|----------|
| ☕ Java | [switch case Tutorial](https://youtu.be/mA23x39DjbI?si=FgHFgJqnV48Sv1sr) |
| 🐍 Python | Same video + match-case docs (Python 3.10+) |
| ⚙️ C++ | Same video — C++ switch is identical to Java's traditional syntax |

---

## 🧠 What to Learn Today

### Java — switch

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // fallback
        break;
}
```

**Enhanced switch (Java 14+) — no break needed:**
```java
switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    default -> System.out.println("Other");
}
```

Key rules:
- `break` is required in traditional switch — without it, execution falls into the next case
- `default` is like `else` — runs when nothing matches
- Supported types: `int`, `char`, `String` (Java 7+), `byte`, `short`, `enum`
- NOT supported: `long`, `double`, `float`, `boolean`

---

### Python — match / case (Python 3.10+)

```python
match expression:
    case value1:
        # code
    case value2:
        # code
    case _:         # _ is the wildcard / default
        # fallback
```

**Group cases with `|` (OR):**
```python
match month:
    case 4 | 6 | 9 | 11:
        print("30 days")
    case 2:
        print("28 or 29 days")
    case _:
        print("31 days")
```

Key rules:
- NO `break` needed — Python match-case does not fall through
- `_` is the wildcard — acts as default
- Works with Python 3.10+ only
- Supports structural pattern matching (more powerful than Java's switch)

**Before Python 3.10 — use a dict:**
```python
days = {1: "Monday", 2: "Tuesday", 3: "Wednesday"}
print(days.get(3, "Invalid"))   # Wednesday
```

---

### C++ — switch

Same as Java's traditional switch:

```cpp
switch (x) {
    case 1:
        cout << "One";
        break;
    case 2:
        cout << "Two";
        break;
    default:
        cout << "Other";
        break;
}
```

Key differences from Java:
- No `String` support in C++ switch — use `if-else` for strings
- Only integer types: `int`, `char`, `short`, `long`, `long long`, `enum`
- C++17 added `[[fallthrough]]` attribute for intentional fall-through

---

### Quick Comparison

| Feature | Java switch | Python match | C++ switch |
|---------|-------------|--------------|------------|
| Default | `default:` | `case _:` | `default:` |
| Fall-through | Yes — needs `break` | No (auto-isolated) | Yes — needs `break` |
| String support | Yes (Java 7+) | Yes | No |
| OR in cases | `case 1: case 2:` | `case 1 \| 2:` | `case 1: case 2:` |
| Pattern matching | Limited | Full structural | No |

---

## 💻 Practice Questions

Solve in your language. Push solutions to your fork.

**1.** Perimeter of Rectangle
> Formula: 2 × (length + breadth)

**2.** Perimeter of Square
> Formula: 4 × side

**3.** Perimeter of Rhombus
> Formula: 4 × side

**4.** Volume of Prism
> Formula: base area × height

**5.** Volume of Cylinder
> Formula: π × r² × h

**6.** Volume of Sphere
> Formula: (4/3) × π × r³

**7.** Volume of Pyramid
> Formula: (1/3) × base area × height

**8.** Curved Surface Area of Cylinder
> Formula: 2 × π × r × h

**9.** Total Surface Area of Cube
> Formula: 6 × side²

**10.** Fibonacci Series up to n numbers
> 0, 1, 1, 2, 3, 5, 8, 13, 21 ...
> Each number = sum of previous two

**11.** Subtract the Product and Sum of Digits of an Integer
> Given: 234
> Product of digits: 2 × 3 × 4 = 24
> Sum of digits: 2 + 3 + 4 = 9
> Answer: 24 - 9 = 15

---

## ✅ Checklist Before You Sleep

- [ ] I know the basic switch syntax in Java and C++
- [ ] I understand fall-through and why `break` is needed
- [ ] I know which types are supported in switch (Java/C++)
- [ ] I know how Python `match-case` is different from `switch`
- [ ] I know `_` is the wildcard/default in Python
- [ ] I can use `|` to group cases in Python match-case
- [ ] Solved at least 7 of the 11 practice questions

---

## 💬 Community

Stuck on any question? Drop the number in the community.

**Solved all 11? Drop a 🔥 in the community.**

---

*Next up → Day 5: Functions & Methods — writing reusable code*
