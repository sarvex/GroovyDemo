def numbers = 1..10

for (number in numbers) {
	println number;
}

def range = 'a'..'g'
for (var in range) {
	println var
}

def enum DAYS {
	SUN, MON, TUE, WED, THU, FRI, SAT
}
def weekdays = DAYS.MON..DAYS.FRI
for (weekday in weekdays) {
	println	weekday
}

println "Extents: "
println weekdays.from
println weekdays.to