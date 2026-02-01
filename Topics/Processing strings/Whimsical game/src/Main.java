class WhimsicalGame {

    public String isMagicalMirror(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        if (input.equals(reversed.toString())) {
            return input + " is a palindrome";
        } else {
            return input + " is not a palindrome";
        }
    }
}
