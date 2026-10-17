class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder str = new StringBuilder();
        title = title.toLowerCase();

        for (int i = 0; i < title.length(); i++) {
            if (i == 0 || title.charAt(i - 1) == ' ') {
                str.append(Character.toUpperCase(title.charAt(i)));
            } else {
                str.append(title.charAt(i));
            }
        }

        String[] words = str.toString().split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 3) {
                ans.append(words[i].toLowerCase());
            } else {
                ans.append(words[i]);
            }

            if (i < words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}