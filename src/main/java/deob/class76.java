package deob;

@ObfuscatedName("bm")
public class class76 implements Runnable {

    @ObfuscatedName("bm.x")
    public class140 field1397;

    @ObfuscatedName("bm.r")
    public volatile class60[] field1393 = new class60[2];

    @ObfuscatedName("bm.j")
    public volatile boolean field1394 = false;

    @ObfuscatedName("bm.z")
    public volatile boolean field1395 = false;

    public void run() {
        this.field1395 = true;
        try {
            while (!this.field1394) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field1393[var1];
                    if (var2 != null) {
                        var2.method1184();
                    }
                }
                class131.method2672(10L);
                class146.method2706(this.field1397, (Object) null);
            }
        } catch (Exception var7) {
            class152.method2217((String) null, var7);
        } finally {
            this.field1395 = false;
        }
    }
}
