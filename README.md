# 🧾 Employee Payroll Hierarchy (Java OOP)

**Author:** John Rex  
**Language:** Java  
**Topic:** Inheritance • Polymorphism • Abstract Classes • Encapsulation

## Overview
A small payroll system that models different employee types using an inheritance hierarchy:
- `Employee` (abstract)
- `SalariedEmployee`
- `CommissionEmployee`
- `BasePlusCommissionEmployee` (extends `CommissionEmployee`)

Demonstrates **polymorphism** by treating all employees uniformly via the `Employee` base type while allowing each subclass to provide its own `earnings()` implementation.

## Class Design (UML-ish)
