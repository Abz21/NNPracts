public class StringDemo {
    public static void main(String[] args) {
        String str = "  hello WORLDl";//101
        str = "HI";
        //String str = new String();
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.replace("e","ee"));
        System.out.println(str);
        System.out.println("Character At:"+str.charAt(6));
        System.out.println(str.compareTo("Hello WORLDl"));
        // 0-9= 48-57
        //A-Z =65-90
        // a-z 97-122
        // 0- String are equal
        //+ve- First mismatch of first string> First mismatch of second string
        //-ve- First mismatch of first string< First mismatch of second string
        System.out.println(str.trim());
        System.out.println(str.concat("World"));

}}
