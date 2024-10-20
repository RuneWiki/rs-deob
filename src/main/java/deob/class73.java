package deob;

@ObfuscatedName("bs")
public class class73 implements Runnable {

    @ObfuscatedName("bs.m")
    public class136 field1314;

    @ObfuscatedName("bs.l")
    public volatile class57[] field1305 = new class57[2];

    @ObfuscatedName("bs.y")
    public volatile boolean field1304 = false;

    @ObfuscatedName("bs.u")
    public volatile boolean field1307 = false;

    public void run() {
        this.field1307 = true;
        try {
            while (!this.field1304) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1305[var1];
                    if (var2 != null) {
                        var2.method1192();
                    }
                }
                class127.method3199(10L);
                class142.method600(this.field1314, (Object) null);
            }
        } catch (Exception var7) {
            class148.method1554((String) null, var7);
        } finally {
            this.field1307 = false;
        }
    }
}
