#Take user's name as input
name = input("Enter your name: ")
#Take user's age as input
age = int(input("Enter your age: "))
#print the input
print(name)
print(age)
#calculate the year they turn 100
year_100 = (100 - age) + 2025
print(f"{name} will turn 100 in {year_100}")# f means formatted string shortcut for format is f
