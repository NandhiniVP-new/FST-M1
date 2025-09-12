# Import pandas, ExcelFile and ExcelWriter
import pandas
from pandas import ExcelFile
from pandas import ExcelWriter

# Structure our data as a dictionary
data = {
    'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)

# Create an ExcelWriter object
writer = ExcelWriter("./Activities/sample.xlsx")

# Write the DataFrame to the Excel file
dataframe.to_excel(writer, "Sheet1", index=False)

# Close the file
writer.close()
#end of Act 19

#activity20
# Read data from Excel sheet
# Read data from Excel sheet
dataframe = pandas.read_excel('./Activities/sample.xlsx')
 
# Print the dataframe
print(dataframe)
 
# Print the number of rows and columns
print("====================================")
print("Number of rows and columns:", dataframe.shape)
 
# Print the data in the emails column only
print("====================================")
print("Emails:")
print(dataframe['Email'])
 
# Sort the data based on FirstName in ascending order and print the data
print("====================================")
print("Sorted data:")
print(dataframe.sort_values('FirstName'))


"""#dataframe = pandas.read_excel('./Activities/sample.xlsx')
dataframe = pandas.read_excel("./Activities/sample.xlsx", sheet_name='Sheet1') 
# Print the dataframe
#print(dataframe)
 
# Print the number of rows and columns
print("shape : ", dataframe.shape)
print("===============DataFrame Shape=====================")
#print("Number of rows and columns:", dataframe.shape)
print("rows :", dataframe.shape[0], "columns: ", dataframe.shape[1])
# Print the data in the emails column only
print("===============Email Column=====================")
#print("Emails:")
print(dataframe['Email'])
 
# Sort the data based on FirstName in ascending order and print the data
print("==============Sorted Data======================")
#print("Sorted data:")
print(dataframe.sort_values(by='FirstName'))"""""
