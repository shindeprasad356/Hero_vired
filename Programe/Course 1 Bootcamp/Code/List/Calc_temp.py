# 1) Convert a list of Celsius to Fahrenheit temperatures using map()

celsius_temps = [23.4, 31.2, 17.5, 28.9, 20.1]

fahrenheit_temps = list(map(lambda c: (c * 9/5) + 32, celsius_temps))

print("Celsius temperatures:", celsius_temps)
print("Fahrenheit temperatures:", fahrenheit_temps)


