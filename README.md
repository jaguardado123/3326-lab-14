# Lab 14

In this lab you will practice working with **parameters & pointers referencing memory**.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

For this lab your **main() method** is in the Main class. For this lab you can create new classes inside the Main.java file or create a new file in the **src/** directory.

Now let's begin!

## Passing Primitive Data Types

In Java, when passing variables from functions they are always `passed-by-copy`. What does this mean?

When a variable is passed-by-copy, a copy of the literal (a primitive data type value ex: "ab", 3.2f, 5, true) stored inside the original variable is made and stored into a **new variable**.

For example, look at the image below and see how variable `x` is passed to the function `example()` and received by the parameter variable `param`. Now, `param` and `x` are two seperate variables, this is because only a copy of the literal `5` stored inside `x` was passed into the **new variable** `param`.

**Passing Variables:**

<img src="img/pass_by_copy.png" width="300px">

## Passing Array and Object Memory Address

When dealing with large data structures like arrays and objects it's inconvenient for Java to make copies of them, since this would waste a lot of memory. Instead, arrays and objects are passed uisng `pointers` that point to or reference their location in memory. What does this mean?

**Pointers** are variables that store a memory address rather than a literal value. These special variables reference or point to a location in memory where the element is stored. Keep in mind, the parameter pointer and the original pointer are two seperate variables.

For example, look at the image below and see how array `arr` is passed into function `example()` and received by the parameter array `p_arr`. Now, `arr` and `p_arr` are the same array, this is because `arr` and `p_arr` are both pointers storing the same memory address. This means they are both referencing or pointing to the same memory location, thus modifying `p_arr` will modify `arr`.

**Passing Arrays:**

<img src="img/pass_by_reference.png" width="400px">

**Passing Objects:**

<img src="img/pass_by_reference2.png" width="400px">

## Your Program

### Increment by One

For this assignment you will practice working with different **function parameters** by creating functions that receive **primitive data types** and **memory addresses**.

Create the following **3 void functions** and call them inside the main() function. See which elements got updated to determine if they were pass-by-copy or passed via pointer.

Remember to make the functions **static**.

- `incrementVar( x )` method should have a single integer parameter and increment it by 1.
- `incrementArr( []x )` method should have a single integer array parameter and incrment all values by 1.
- `incrementObj( x )` method should have a single Dog object parameter and increment age by 1.

You can test your code by running the following command in your terminal. 
```
./test.sh
```

<br>

**Grading Criteria:**
| Criteria | Points |
|---|---|
| Program passes all the test cases. | 60 (20 per test) |
| Functions are the correct type (void, int, float, etc.).  | 15 |
| Functions have the correct amount and type of parameters. | 15 |
| Functions are static. | 10 |

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
