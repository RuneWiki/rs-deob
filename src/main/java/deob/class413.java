package deob;

@ObfuscatedName("pi")
public class class413 extends class419 {

    public class413(class419 arg0) {
        super(arg0);
        this.field4553 = "SwapSongTask";
    }

    @ObfuscatedName("pi.at(I)Z")
    public boolean method7116() {
        if (class317.field3423.size() > 1 && class317.field3423.get(0) != null && ((class329) class317.field3423.get(0)).field3523.method5487() && class317.field3423.get(1) != null && ((class329) class317.field3423.get(1)).field3523.method5487()) {
            class329 var1 = (class329) class317.field3423.get(0);
            class317.field3423.set(0, class317.field3423.get(1));
            class317.field3423.set(1, var1);
        }
        return true;
    }
}
