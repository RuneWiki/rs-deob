package deob;

@ObfuscatedName("bz")
public class class54 implements Runnable {

    @ObfuscatedName("bz.j")
    public class73 field1158;

    @ObfuscatedName("bz.y")
    public volatile class51[] field1156 = new class51[2];

    @ObfuscatedName("bz.x")
    public volatile boolean field1157 = false;

    @ObfuscatedName("bz.z")
    public volatile boolean field1160 = false;

    public void run() {
        this.field1160 = true;
        try {
            while (!this.field1157) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1156[var1];
                    if (var2 != null) {
                        var2.method1129();
                    }
                }
                class125.method112(10L);
                class68.method1486(this.field1158, (Object) null);
            }
        } catch (Exception var7) {
            class79.method2299((String) null, var7);
        } finally {
            this.field1160 = false;
        }
    }
}
