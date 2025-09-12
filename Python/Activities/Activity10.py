input_nums = input("Enter 5 numbers ") #"10, 20, 33, 43, 45"
num_list = input_nums.split(", ")
num_tuple =tuple(num_list)

print("Numbers divisible by5 are : ")
for num in num_tuple:
    if int(num) % 5 == 0:
        print(num)