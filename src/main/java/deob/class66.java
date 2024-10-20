package deob;

@ObfuscatedName("bd")
public class class66 implements Runnable {

    @ObfuscatedName("bd.b")
    public class123 field1249;

    @ObfuscatedName("bd.u")
    public volatile class50[] field1250 = new class50[2];

    @ObfuscatedName("bd.x")
    public volatile boolean field1244 = false;

    @ObfuscatedName("bd.j")
    public volatile boolean field1245 = false;

    public void run() {
        this.field1245 = true;
        try {
            while (!this.field1244) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1250[var1];
                    if (var2 != null) {
                        var2.method985();
                    }
                }
                class114.method2914(10L);
                class129.method2577(this.field1249, (Object) null);
            }
        } catch (Exception var7) {
            class135.method3292((String) null, var7);
        } finally {
            this.field1245 = false;
        }
    }
}
