# Lab Assignment 14

In this lab you will practice working with pass-by-reference parameters.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

For this lab your **main() method** is in the Main class. For this lab you can create new classes inside the Main.java file or create a new file in the **src/** directory.

Now let's begin!

## Pass-By-Copy

In Java, when passing variables from functions they are always `passed-by-copy`. What does this mean?

When a variable is passed-by-copy, a copy of the literal (a primitive data type value ex: "ab", 3.2f, 5, true) stored inside the original variable is made and stored into a **new variable**.

For example, look at the image below and see how variable `x` is passed to the function `example()` and received by the parameter variable `param`. Now, `param` and `x` are two seperate variables, this is because only a copy of the literal `5` stored inside `x` was passed into the **new variable** `param`.

**Passing Variables:**

<img src="img/pass_by_copy.png" width="300px">

## Pass-By-Reference

However, there are excemptions to passing-by-copy. When dealing with large data structures like arrays and objects it's inconvenient for Java to make copies of them, since this would waste a lot of memory. Instead, arrays and objects are `passed-by-reference`. What does this mean?

When something is passed-by-reference, the memory location of the original element is given and is then assigned a new alias or identifier. Thus, <ins>no new element was created</ins>.

For example, look at the image below and see how array `arr` is passed into function `example()` and received by the parameter array `p_arr`. Now, `arr` and `p_arr` are the same array, this is because the memory location of `arr` was assigned to `p_arr`. This means they are linked and modifying `p_arr` will modify `arr`.

**Passing Arrays:**

<img src="img/pass_by_reference.png" width="400px">

**Passing Objects:**

<img src="img/pass_by_reference2.png" width="400px">

## Your Program

### Increment by One

For this assignment you will practice working with **pass-by-copy** and **pass-by-reference** parameters.

Create the following **3 functions** and call them inside the main() function. See if which elements got updated to determine if they were passed-by-copy or passed-by-reference.

- `incrementVar( x )` method should have a single integer parameter and increment it by 1.
- `incrementArr( []x )` method should have a single integer array parameter and incrment all values by 1.
- `incrementObj( x )` method should have a single Dog object parameter and increment age by 1.

You can test your code by running the following command in your terminal. 
```
./test.sh
```

## Submit your assignment

[Grading Criteria](https://joselitoguardado.dev/3326/labs/Lab_14.pdf)

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
