public class StringMethodss {
    public static void main(String[] args){

    //String s1 = new String("JAVA");
    //String s2 = new String("JAVA");
    //System.out.println(s1==s2);
    //System.out.println(s1.equals(s2));

        //String s1 = new String("java");
        //String s2 = new String("JAVA");
        // System.out.println(s1.equalsIgnoreCase(s2));

        // String s = "java";
        //System.out.println(s.toUpperCase());
       // System.out.println(s.toLowerCase());

        //String s = "Hello World";
        //System.out.println(s.trim());

        //String s = "Automation Testing";
        //System.out.println(s.contains("Testing"));

        //String s = "Computer Science engineering";
        //System.out.println(s.contains("Engineering"));

        //String s = "Java Programming";
        //System.out.println(s.startsWith("Java"));
        //System.out.println(s.endsWith("ing"));

        String s ="Java,C++,Python";
        String[] arr = s.split(",");
        for(String lang : arr){
            System.out.println(lang);
        }

}

}
