    public static String caesarCipher(String s, int k) {
   StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if ( c >= 'a' && c<='z'){
                c = (char) ('a' + ( c- 'a' + k) % 26);
            }else if (c >= 'A' && c<='Z'){
                c = (char) ('A' + ( c- 'A' + k) % 26);
            }
            sb.append(c);
        }
        return sb.toString();
    }
