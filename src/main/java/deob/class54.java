package deob;

@ObfuscatedName("bs")
public class class54 implements Runnable {

    @ObfuscatedName("bs.v")
    public class73 field1163;

    @ObfuscatedName("bs.f")
    public volatile class51[] field1156 = new class51[2];

    @ObfuscatedName("bs.n")
    public volatile boolean field1157 = false;

    @ObfuscatedName("bs.c")
    public volatile boolean field1160 = false;

    public void run() {
        this.field1160 = true;
        try {
            while (!this.field1157) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1156[var1];
                    if (var2 != null) {
                        var2.method1175();
                    }
                }
                class125.method2683(10L);
                class68.method1407(this.field1163, (Object) null);
            }
        } catch (Exception var7) {
            class79.method811((String) null, var7);
        } finally {
            this.field1160 = false;
        }
    }
}
