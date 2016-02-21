#!/usr/bin/env python
# Example of object initialization using 'dictionary'


# Classes
class Student(object):
	def __init__(self, student_dict):
		for k,v in student_dict.items():
			setattr(self, k, v)

	def __str__(self):
		out = "Student: %s, %s, %s" % (self.name,self.grade,self.country)
		return out

# Functions
def main():
	print("Running example of Initialization by Dict")
	stu_dict = {"name":"andy", "grade":"A+", "country":"RU"}
	new_student = Student(stu_dict)
	print(new_student)

if __name__ == "__main__":
	main()
