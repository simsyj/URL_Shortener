public class Test {
    public static void main(String[] args){
        Shortener shortener = new Shortener();
        System.out.println(shortener.shortenURL("Facebook.com"));

        System.out.println(shortener.shortenURL("bbc.co.uk"));

    }
}
