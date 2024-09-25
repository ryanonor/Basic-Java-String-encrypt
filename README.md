Basic string encryption and decryption via the bitwise-xor operator. The idea I had with this is that you would be unable to create a static string decryption for this due to its usage of random keys that are shuffled. 
Here is some example usage: 
```
encrypt str_encrypt = new encrypt(5); //however many keys you want it to be xored with
System.out.println("abcdefg");
System.out.println(str_encrypt.encryptString("abcdefg"));
System.out.println(str_encrypt.decryptString(str_encrypt.encryptString("abcdefg")));
```
