current_annual_income = float(input("Enter your current annual income: "))
current_annual_savings = float(input("Enter your current annual savings: "))
savings_rate = current_annual_savings / current_annual_income

current_annual_expenses = float(input("Enter your current annual expenses: "))
monthly_expenses = current_annual_expenses / 12

months_in_year = 12
monthly_savings = current_annual_savings / months_in_year

current_portfolio_value = float(input("Enter your current portfolio value: "))
annual_expenses = current_annual_expenses
annual_savings = current_annual_savings
monthly_savings = current_annual_savings / months_in_year
years_until_retirement = (current_portfolio_value / (annual_expenses - annual_savings)) / months_in_year

print("You can retire in: {:.1f} years".format(years_until_retirement))
print("with a savings rate of {:.0%}".format(savings_rate))
print("annual expenses: {:.2f}".format(annual_expenses))
print("annual savings: {:.2f}".format(annual_savings))
print("monthly expenses: {:.2f}".format(monthly_expenses))
print("monthly savings: {:.2f}".format(monthly_savings))
