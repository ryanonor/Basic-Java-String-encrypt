import java.util.*;

public class encrypt {
    final Random random = new Random();
    private final ArrayList<Integer> keys = new ArrayList<>();
    public encrypt(int key, int xor_amount) {
        for (int i = 0; i < xor_amount; i++) {
            keys.add(random.nextInt(1,30));
        }
        Collections.shuffle(keys);
    }

    public List<Integer> getKeys(){
        return keys;
    }
    public String encryptString(String str){
        for (Integer key : keys) {
            str = xorStr(str, key);
        }
        return str;
    }

    public String decryptString(String str){
        for (int i = keys.size()-1; i >= 0; i--) {
            str = xorStr(str, keys.get(i));
        }
        return str;
    }

    private String xorStr(String str, int key){
        StringBuilder xored_string = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            xored_string.append((char) (str.charAt(i) ^ key));
        }
        return xored_string.toString();
    }


}
