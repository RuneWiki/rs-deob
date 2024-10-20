package deob;

@ObfuscatedName("au")
public class class46 implements Runnable {

    @ObfuscatedName("au.a")
    public volatile class44[] field331 = new class44[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class44 var2 = this.field331[var1];
                if (var2 != null) {
                    var2.method810();
                }
            }
        } catch (Exception var4) {
            class489.method7161((String) null, var4);
        }
    }
}
