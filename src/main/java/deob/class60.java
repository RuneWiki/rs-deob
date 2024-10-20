package deob;

@ObfuscatedName("by")
public class class60 implements Runnable {

    @ObfuscatedName("by.d")
    public volatile class58[] field1062 = new class58[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class58 var2 = this.field1062[var1];
                if (var2 != null) {
                    var2.method1050();
                }
            }
        } catch (Exception var4) {
            class102.method3059((String) null, var4);
        }
    }
}
