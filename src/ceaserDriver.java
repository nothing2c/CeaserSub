public class ceaserDriver {
    public static void main(String[] args) {
        System.out.println(ceaserSubstition.encryptCeaserCipher("A",3));//D

        System.out.println(ceaserSubstition.encryptCeaserCipher("A",0));//A

        System.out.println(ceaserSubstition.encryptCeaserCipher("HELLO WORLD",3));//olssv dvysk

        System.out.println(ceaserSubstition.encryptCeaserCipher("THIS IS A LOT OF WORDS",27));//uijt jt b mpu pg xpset
    }
}
