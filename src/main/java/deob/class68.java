package deob;

@ObfuscatedName("by")
public class class68 implements Runnable {

    @ObfuscatedName("by.o")
    public class128 field1280;

    @ObfuscatedName("by.l")
    public volatile class52[] field1271 = new class52[2];

    @ObfuscatedName("by.g")
    public volatile boolean field1273 = false;

    @ObfuscatedName("by.u")
    public volatile boolean field1275 = false;

    public void run() {
        this.field1275 = true;
        try {
            while (!this.field1273) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1271[var1];
                    if (var2 != null) {
                        var2.method1069();
                    }
                }
                Statics.method832(10L);
                class134.method911(this.field1280, (Object) null);
            }
        } catch (Exception var7) {
            class140.method530((String) null, var7);
        } finally {
            this.field1275 = false;
        }
    }
}
