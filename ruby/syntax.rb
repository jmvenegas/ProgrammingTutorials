=begin
	@author justin.venegas@gmail.com
	@file syntax.rb
	@brief Examples of basic Ruby syntax
	@notes
		1. Ruby is whitespace agnostic unlike Python
		2. Because of rule one, you need to use 'end' keyword to control conditionals, loops, classes, functions...

=end

# Constants
STR_CONSTANT = "This is a string constant" # constants should at minimum begin with a capital letter
NUM_CONSTANT = 5
GR_LIST = ["alpha", "beta", "gamma", "omega"]

# Conditionals
mynum = 1
if mynum < NUM_CONSTANT
	puts '"puts" is the ruby println!' 
end # conditional control flow is stopped with the 'end' keyword

unless mynum > NUM_CONSTANT
	puts "This will print"
else
	puts "This wont print"
end

# Looping
print "'for each' looping example:\n"
for letter in GR_LIST
	puts "#{letter}" # variables are dereferences using the '#{var}' notation
end

# Methods
def method_without_args # Do not use parens when method takes no arguments
	puts "This method has no arguments"
end

def method_with_args(num1, num2)
	sum = num1 + num2
	puts "The sum is: #{sum}"
end

method_without_args 

method_with_args(4, 5)

# Classes
# TODO - add class example