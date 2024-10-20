package deob;

@ObfuscatedName("bm")
public class class67 implements Runnable {

    @ObfuscatedName("bm.v")
    public class127 field1249;

    @ObfuscatedName("bm.t")
    public volatile class51[] field1250 = new class51[2];

    @ObfuscatedName("bm.f")
    public volatile boolean field1248 = false;

    @ObfuscatedName("bm.j")
    public volatile boolean field1246 = false;

    public void run() {
        this.field1246 = true;
        try {
            while (!this.field1248) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1250[var1];
                    if (var2 != null) {
                        var2.method997();
                    }
                }
                class118.method2729(10L);
                class133.method1604(this.field1249, (Object) null);
            }
        } catch (Exception var7) {
            class139.method2439((String) null, var7);
        } finally {
            this.field1246 = false;
        }
    }
}
