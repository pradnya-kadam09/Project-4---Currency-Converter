# Currency Converter

## Description
Currency Converter is a simple Java console-based program that converts amounts from selected foreign currencies to Indian Rupees (INR).

The program supports USD, EUR, GBP, and AUD conversions using predefined example exchange rates.

## Technologies Used
- Java
- BigDecimal
- Scanner
- RoundingMode

## Supported Conversions

| Option | Conversion | Example Rate |
|---|---|---:|
| 1 | USD to INR | 83.50 |
| 2 | EUR to INR | 90.50 |
| 3 | GBP to INR | 105.00 |
| 4 | AUD to INR | 54.50 |
| 5 | Exit | - |

## How the Program Works
1. The program displays a currency conversion menu.
2. The user selects a conversion option.
3. The user enters the amount.
4. The program checks that the amount is not negative.
5. The selected predefined exchange rate is applied.
6. The converted amount is rounded to two decimal places.
7. The result is displayed in INR.
8. The program continues until the user selects Exit.

## Features
- USD to INR conversion
- EUR to INR conversion
- GBP to INR conversion
- AUD to INR conversion
- Rejects negative amounts
- Rounds converted values to two decimal places
- Menu-driven console interface
- Uses `BigDecimal` for monetary calculations

## How to Run

### Using VS Code
1. Open `CurrencyConverter.java` in VS Code.
2. Make sure Java/JDK is installed.
3. Click the **Run** button above the `main()` method, or press `Ctrl + F5`.

### Using Terminal

Compile the program:

```bash
javac CurrencyConverter.java
```

Run the program:

```bash
java CurrencyConverter
```

## Example

```text
===== CURRENCY CONVERTER =====
1. USD to INR
2. EUR to INR
3. GBP to INR
4. AUD to INR
5. Exit

Enter your choice: 1
Enter amount: 10
Converted Amount: ₹835.00
```

## Important Note
The exchange rates used in this program are **predefined example rates** in the source code. They are not live market exchange rates.

## Project Structure

```text
CurrencyConverter/
├── CurrencyConverter.java
└── README.md
```

## Author
Pradnya Kadam
