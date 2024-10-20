package deob;

@ObfuscatedName("bh")
public class class73 implements Runnable {

    @ObfuscatedName("bh.f")
    public class137 field1371;

    @ObfuscatedName("bh.u")
    public volatile class57[] field1365 = new class57[2];

    @ObfuscatedName("bh.x")
    public volatile boolean field1366 = false;

    @ObfuscatedName("bh.b")
    public volatile boolean field1370 = false;

    public void run() {
        this.field1370 = true;
        try {
            while (!this.field1366) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1365[var1];
                    if (var2 != null) {
                        var2.method1220();
                    }
                }
                class128.method2102(10L);
                class143.method3032(this.field1371, (Object) null);
            }
        } catch (Exception var7) {
            class149.method957((String) null, var7);
        } finally {
            this.field1370 = false;
        }
    }
}
