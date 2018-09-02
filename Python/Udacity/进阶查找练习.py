# Assume text is a variable that
# holds a string. Write Python code
# that prints out the position
# of the second occurrence of 'zip'
# in text, or -1 if it does not occur
# at least twice.

# The Python code should be general enough
# to pass every possible case where 'zip' 
# can occur in a string

# Here are two example test cases:
#text = 'all zip files are zipped' 
# >>> 18
# text = 'all zip files are compressed'
# >>> -1

text = "all zip files are zipped" 

# ENTER CODE BELOW HERE

first_zip=text.find("zip")

#print(text[first_zip+1:].find("zip")+first_zip+1) 尽量不使用进行字符串的划分进行查找，因为find查找的位置是划分之后的位置，不是原字符串位置

#应该使用find(str,start,end)

print (text.find("zip",first_zip+1))



# IMPORTANT BEFORE SUBMITTING: 
# You should only have one print command in your function
