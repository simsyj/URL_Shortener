import java.util.HashMap;

public class Shortener {
    private final String prefix = "short.io/";
    private HashMap<String, String> lookup = new HashMap<>();
    private final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";

    public Shortener(){
    }

    public String shortenURL(String URL){
        String generated;
        generated = generatePostfix(URL);
        if(lookup.containsKey(generated))
            shortenURL(URL);
        else
            lookup.put(generated, URL);
        return prefix + generated;
    }

    public String generatePostfix(String URL){
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < 6; i++){
            postfix.append(characters.charAt((int) (Math.random() * 62)));
        }
        return postfix.toString();
    }
}
