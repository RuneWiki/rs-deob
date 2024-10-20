package deob;

@ObfuscatedName("bi")
public class class73 implements Runnable {

    @ObfuscatedName("bi.a")
    public class136 field1353;

    @ObfuscatedName("bi.r")
    public volatile class57[] field1350 = new class57[2];

    @ObfuscatedName("bi.f")
    public volatile boolean field1354 = false;

    @ObfuscatedName("bi.s")
    public volatile boolean field1355 = false;

    public void run() {
        this.field1355 = true;
        try {
            while (!this.field1354) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1350[var1];
                    if (var2 != null) {
                        var2.method1168();
                    }
                }
                class127.method2148(10L);
                class142.method2232(this.field1353, (Object) null);
            }
        } catch (Exception var7) {
            class148.method643((String) null, var7);
        } finally {
            this.field1355 = false;
        }
    }
}
