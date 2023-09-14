public static boolean isPalin(String s) {
    // complete the function template
    int l = s.length();
    String rev ="";
    for(int i = 0; i<l; i++){
       rev = s.charAt(i) + rev;
    }
    if(rev.equals(s)){
    return true;
    }
    return false;
    
}
