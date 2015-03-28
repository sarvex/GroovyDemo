def numbers = 0..9
for (number in numbers) {
	if (isEven(number)) {
		println number
	}
}

def isEven (number) {
	number % 2 == 0
}