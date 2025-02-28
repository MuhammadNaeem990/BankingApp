package com.example.bankingapp.Repository

import com.example.bankingapp.Domain.BudgetDomain
import com.example.bankingapp.Domain.ExpenseDomain

class MainRepository {

	val items = mutableListOf(
		ExpenseDomain("Restaurant", 573.12,"img1", "17 jun 2024 19:15"),
		ExpenseDomain("Mcdonald", 77.82,"img2", "16 jun 2024 13:57"),
		ExpenseDomain("Cinema", 23.47,"img3", "16 jun 2024 20:45"),
		ExpenseDomain("Restaurant", 341.12,"img1", "15 jun 2024 22:18"),
		ExpenseDomain("Coffee Shop", 12.99, "img3", "18 jun 2024 08:30"),
		ExpenseDomain("Grocery Store", 57.45, "img2", "17 jun 2024 10:12"),
		ExpenseDomain("Bookstore", 29.99, "img1", "14 jun 2024 14:05"),
		ExpenseDomain("Gym", 45.00, "img3", "13 jun 2024 07:20"),
	)
	
	
	val budget = mutableListOf(
		BudgetDomain("Home Loan", 1200.0,80.0),
		BudgetDomain("Subscription",1200.0,30.0),
		BudgetDomain("Car Loan",800.0, 30.0),
		BudgetDomain("Car Loan",800.0, 30.0),
		BudgetDomain("Car Loan",800.0, 30.0),
		BudgetDomain("Car Loan",800.0, 30.0),
	)
}