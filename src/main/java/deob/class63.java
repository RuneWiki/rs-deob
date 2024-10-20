package deob;

@ObfuscatedName("bo")
public class class63 implements Runnable {

    @ObfuscatedName("bo.z")
    public class120 field1222;

    @ObfuscatedName("bo.n")
    public volatile class47[] field1219 = new class47[2];

    @ObfuscatedName("bo.u")
    public volatile boolean field1220 = false;

    @ObfuscatedName("bo.t")
    public volatile boolean field1221 = false;

    public void run() {
        this.field1221 = true;
        try {
            while (!this.field1220) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class47 var2 = this.field1219[var1];
                    if (var2 != null) {
                        var2.method996();
                    }
                }
                class111.method1306(10L);
                class126.method534(this.field1222, (Object) null);
            }
        } catch (Exception var7) {
            class132.method508((String) null, var7);
        } finally {
            this.field1221 = false;
        }
    }
}
