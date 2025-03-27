# Pizza Bill Generator

## Description
This is a simple Java program that simulates a pizza ordering system using Object-Oriented Programming (OOP) principles. It allows users to order pizzas, add extra cheese, extra toppings, and opt for takeout, while calculating the final bill.

## Features
- Choose between **Vegetarian** and **Non-Vegetarian** pizzas.
- Add **extra cheese** and **extra toppings**.
- Option for **takeaway packaging**.
- **Deluxe Pizza** option, which includes extra cheese and extra toppings by default.
- Calculates and displays the **final bill** with all chosen options.

## Classes & Functionality
### `Pizza.java`
- **Constructor:** Initializes the pizza type (Veg/Non-Veg) and sets base price.
- **Methods:**
  - `addExtraCheese()`: Adds extra cheese to the pizza.
  - `addExtraToppings()`: Adds extra toppings to the pizza.
  - `takeAway()`: Opts for a takeaway bag.
  - `getBill()`: Displays the final bill with all charges.

### `DeluxePizza.java`
- Inherits from `Pizza`.
- Automatically includes extra cheese and extra toppings.
- Overrides `addExtraCheese()` and `addExtraToppings()` to prevent additional modifications.

### `Main.java`
- Contains the `main` method to test the pizza ordering system.
- Demonstrates the functionality of `Pizza` and `DeluxePizza` classes.

## Example Output
```yaml
Pizza type: Non-Vegetarian
Pizza: 18
Extra cheese added: 3
Extra toppings added: 2
Bill: 23
```
