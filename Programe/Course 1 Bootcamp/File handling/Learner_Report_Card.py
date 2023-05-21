import pandas as pd
import csv
from csv import writer
 
# List that we want to add as a new row
List = [6, 'William', 100, 22, 0, 50, 34, 0, 0, 0]
 
# Open our existing CSV file in append mode
# Create a file object for this file
with open('students4.csv', 'w') as f_object:
 
    # Pass this file object to csv.writer()
    # and get a writer object
    writer_object = writer(f_object)
 
    # Pass the list as an argument into
    # the writerow()
    writer_object.writerow(List)
 
    # Close the file object
    f_object.close()

headerList = ['ID', 'Student name', 'Total Grade', 'GitHub', 'Ajax', 'Wordpress', 'Java script', 'DSA', 'Linked list', 'Portfolio', ' number of assignments', 'submission date', 'points for each assignment' ]
  
# open CSV file and assign header
with open("students4.csv", 'w') as file:
    dw = csv.DictWriter(file, delimiter=',', fieldnames=headerList)
    dw.writeheader()

file1 = open("students4.csv")
print(file1.read())