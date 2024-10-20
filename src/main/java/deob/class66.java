package deob;

@ObfuscatedName("bm")
public class class66 implements Runnable {

    @ObfuscatedName("bm.g")
    public class123 field1254;

    @ObfuscatedName("bm.i")
    public volatile class50[] field1248 = new class50[2];

    @ObfuscatedName("bm.k")
    public volatile boolean field1249 = false;

    @ObfuscatedName("bm.e")
    public volatile boolean field1251 = false;

    public void run() {
        this.field1251 = true;
        try {
            while (!this.field1249) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1248[var1];
                    if (var2 != null) {
                        var2.method980();
                    }
                }
                class114.method1935(10L);
                class129.method1311(this.field1254, (Object) null);
            }
        } catch (Exception var7) {
            class135.method33((String) null, var7);
        } finally {
            this.field1251 = false;
        }
    }
}
