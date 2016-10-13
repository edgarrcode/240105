public String getRandString(int length) {
	String[] letters = {A,B,C,....Z};
	Stirng output = "";
	for (int i = 0; i < length; i++) {
		output = output + letters[int(math.round(Math.random() * 25))]
	}
	return output;
}