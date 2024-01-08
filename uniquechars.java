/** String processing exercise 2. */
public class uniquechars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String a="";
        for (int i=0;i<s.length();i++){
            if(a.indexOf(s.charAt(i))==-1 || s.charAt(i)==' '){
                a+=s.charAt(i);
            }
             
        }        
        
        return a;
    }
}
