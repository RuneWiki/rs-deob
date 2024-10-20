package deob;

@ObfuscatedName("bs")
public class class73 implements Runnable {

    @ObfuscatedName("bs.t")
    public class137 field1358;

    @ObfuscatedName("bs.i")
    public volatile class57[] field1353 = new class57[2];

    @ObfuscatedName("bs.g")
    public volatile boolean field1356 = false;

    @ObfuscatedName("bs.h")
    public volatile boolean field1355 = false;

    public void run() {
        this.field1355 = true;
        try {
            while (!this.field1356) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1353[var1];
                    if (var2 != null) {
                        var2.method1136();
                    }
                }
                class128.method894(10L);
                class143.method2558(this.field1358, (Object) null);
            }
        } catch (Exception var7) {
            class149.method635((String) null, var7);
        } finally {
            this.field1355 = false;
        }
    }
}
