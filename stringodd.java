public class Stringodd {
    public static void main(String args[]){
        String text = "type here to search";
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<text.length();i++){
            if(i%2!=0 && (text.charAt(i)!=' ')){
                sb.append(text.charAt(i));
            }
        }
        System.out.println(sb);
    }
    
}