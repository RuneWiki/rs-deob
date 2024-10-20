package deob;

@ObfuscatedName("bs")
public class class67 implements Runnable {

    @ObfuscatedName("bs.f")
    public class125 field1270;

    @ObfuscatedName("bs.k")
    public volatile class51[] field1263 = new class51[2];

    @ObfuscatedName("bs.y")
    public volatile boolean field1265 = false;

    @ObfuscatedName("bs.e")
    public volatile boolean field1266 = false;

    public void run() {
        this.field1266 = true;
        try {
            while (!this.field1265) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1263[var1];
                    if (var2 != null) {
                        var2.method1032();
                    }
                }
                class116.method557(10L);
                class131.method3376(this.field1270, (Object) null);
            }
        } catch (Exception var7) {
            class137.method94((String) null, var7);
        } finally {
            this.field1266 = false;
        }
    }
}
