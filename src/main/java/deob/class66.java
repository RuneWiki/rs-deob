package deob;

@ObfuscatedName("bd")
public class class66 implements Runnable {

    @ObfuscatedName("bd.i")
    public class123 field1256;

    @ObfuscatedName("bd.c")
    public volatile class50[] field1257 = new class50[2];

    @ObfuscatedName("bd.h")
    public volatile boolean field1263 = false;

    @ObfuscatedName("bd.v")
    public volatile boolean field1259 = false;

    public void run() {
        this.field1259 = true;
        try {
            while (!this.field1263) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1257[var1];
                    if (var2 != null) {
                        var2.method995();
                    }
                }
                class114.method743(10L);
                class129.method29(this.field1256, (Object) null);
            }
        } catch (Exception var7) {
            class135.method2595((String) null, var7);
        } finally {
            this.field1259 = false;
        }
    }
}
