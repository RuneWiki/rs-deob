package deob;

@ObfuscatedName("bd")
public class class68 implements Runnable {

    @ObfuscatedName("bd.p")
    public class128 field1289;

    @ObfuscatedName("bd.k")
    public volatile class52[] field1288 = new class52[2];

    @ObfuscatedName("bd.e")
    public volatile boolean field1287 = false;

    @ObfuscatedName("bd.f")
    public volatile boolean field1290 = false;

    public void run() {
        this.field1290 = true;
        try {
            while (!this.field1287) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1288[var1];
                    if (var2 != null) {
                        var2.method1023();
                    }
                }
                class119.method1371(10L);
                class134.method1909(this.field1289, (Object) null);
            }
        } catch (Exception var7) {
            class140.method1((String) null, var7);
        } finally {
            this.field1290 = false;
        }
    }
}
