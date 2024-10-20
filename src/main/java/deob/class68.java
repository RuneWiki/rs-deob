package deob;

@ObfuscatedName("bp")
public class class68 implements Runnable {

    @ObfuscatedName("bp.y")
    public class128 field1278;

    @ObfuscatedName("bp.k")
    public volatile class52[] field1286 = new class52[2];

    @ObfuscatedName("bp.g")
    public volatile boolean field1279 = false;

    @ObfuscatedName("bp.n")
    public volatile boolean field1280 = false;

    public void run() {
        this.field1280 = true;
        try {
            while (!this.field1279) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1286[var1];
                    if (var2 != null) {
                        var2.method1049();
                    }
                }
                class119.method488(10L);
                class134.method1387(this.field1278, (Object) null);
            }
        } catch (Exception var7) {
            class140.method793((String) null, var7);
        } finally {
            this.field1280 = false;
        }
    }
}
