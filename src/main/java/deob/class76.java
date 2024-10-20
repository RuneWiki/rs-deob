package deob;

@ObfuscatedName("bb")
public class class76 implements Runnable {

    @ObfuscatedName("bb.m")
    public class140 field1426;

    @ObfuscatedName("bb.w")
    public volatile class60[] field1423 = new class60[2];

    @ObfuscatedName("bb.e")
    public volatile boolean field1424 = false;

    @ObfuscatedName("bb.o")
    public volatile boolean field1430 = false;

    public void run() {
        this.field1430 = true;
        try {
            while (!this.field1424) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field1423[var1];
                    if (var2 != null) {
                        var2.method1216();
                    }
                }
                class131.method2828(10L);
                class146.method2334(this.field1426, (Object) null);
            }
        } catch (Exception var7) {
            class152.method1096((String) null, var7);
        } finally {
            this.field1430 = false;
        }
    }
}
