def beatles = ["John", "Paul", "George", "Ringo"]
for (def i = 0; i < beatles.size; i++) {
	println "Hello, ${beatles[i]}"
	println "${i*10}"
}

for (beatle in beatles) {
	println "Hello, $beatle"
}

