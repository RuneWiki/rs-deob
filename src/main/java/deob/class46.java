package deob;

@ObfuscatedName("aw")
public class class46 implements Runnable {

    @ObfuscatedName("aw.h")
    public volatile class44[] field350 = new class44[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class44 var2 = this.field350[var1];
                if (var2 != null) {
                    var2.method809();
                }
            }
        } catch (Exception var4) {
            class493.method2879((String) null, var4);
        }
    }
}
