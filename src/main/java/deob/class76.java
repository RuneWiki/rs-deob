package deob;

@ObfuscatedName("bi")
public class class76 implements Runnable {

    @ObfuscatedName("bi.a")
    public class140 field1422;

    @ObfuscatedName("bi.d")
    public volatile class60[] field1425 = new class60[2];

    @ObfuscatedName("bi.v")
    public volatile boolean field1420 = false;

    @ObfuscatedName("bi.r")
    public volatile boolean field1423 = false;

    public void run() {
        this.field1423 = true;
        try {
            while (!this.field1420) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field1425[var1];
                    if (var2 != null) {
                        var2.method1213();
                    }
                }
                class131.method674(10L);
                class146.method2717(this.field1422, (Object) null);
            }
        } catch (Exception var7) {
            class152.method2703((String) null, var7);
        } finally {
            this.field1423 = false;
        }
    }
}
