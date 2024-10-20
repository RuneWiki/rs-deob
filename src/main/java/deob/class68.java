package deob;

@ObfuscatedName("bf")
public class class68 implements Runnable {

    @ObfuscatedName("bf.n")
    public class128 field1286;

    @ObfuscatedName("bf.w")
    public volatile class52[] field1278 = new class52[2];

    @ObfuscatedName("bf.i")
    public volatile boolean field1279 = false;

    @ObfuscatedName("bf.e")
    public volatile boolean field1281 = false;

    public void run() {
        this.field1281 = true;
        try {
            while (!this.field1279) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1278[var1];
                    if (var2 != null) {
                        var2.method1037();
                    }
                }
                Statics.method849(10L);
                class134.method610(this.field1286, (Object) null);
            }
        } catch (Exception var7) {
            class140.method1403((String) null, var7);
        } finally {
            this.field1281 = false;
        }
    }
}
