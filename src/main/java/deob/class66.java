package deob;

@ObfuscatedName("by")
public class class66 implements Runnable {

    @ObfuscatedName("by.y")
    public class123 field1236;

    @ObfuscatedName("by.u")
    public volatile class50[] field1233 = new class50[2];

    @ObfuscatedName("by.k")
    public volatile boolean field1241 = false;

    @ObfuscatedName("by.v")
    public volatile boolean field1234 = false;

    public void run() {
        this.field1234 = true;
        try {
            while (!this.field1241) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1233[var1];
                    if (var2 != null) {
                        var2.method977();
                    }
                }
                class114.method140(10L);
                class129.method149(this.field1236, (Object) null);
            }
        } catch (Exception var7) {
            class135.method583((String) null, var7);
        } finally {
            this.field1234 = false;
        }
    }
}
