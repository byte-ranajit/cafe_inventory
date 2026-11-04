# Cafe Inventory

## Static and Instance Variables
`totalProducts` is static, so there is one shared count for the `Product` class and it increases whenever any product is constructed. `name` is an instance variable, so each `Product` object stores its own name.

## Copy Constructor
The copy constructor creates a new `Product` and copies the original product's name, price, and quantity into it. Changing `p2.name` changes only the copy's field; `String` values are immutable, and assigning a new string to `p2.name` does not assign to `p1.name`.

## Casting the Average
Java requires `(int) average` because converting a `double` to an `int` is a narrowing conversion that can lose information, so the cast makes that choice explicit. The decimal part is discarded by truncating toward zero; it is not rounded.
