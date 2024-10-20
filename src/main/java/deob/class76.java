package deob;

@ObfuscatedName("bv")
public class class76 implements Runnable {

    @ObfuscatedName("bv.k")
    public class140 field1413;

    @ObfuscatedName("bv.q")
    public volatile class60[] field1408 = new class60[2];

    @ObfuscatedName("bv.f")
    public volatile boolean field1409 = false;

    @ObfuscatedName("bv.c")
    public volatile boolean field1410 = false;

    public void run() {
        this.field1410 = true;
        try {
            while (!this.field1409) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field1408[var1];
                    if (var2 != null) {
                        var2.method1183();
                    }
                }
                class131.method2702(10L);
                class146.method205(this.field1413, (Object) null);
            }
        } catch (Exception var7) {
            class152.method2817((String) null, var7);
        } finally {
            this.field1410 = false;
        }
    }
}
