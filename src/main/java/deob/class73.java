package deob;

@ObfuscatedName("bz")
public class class73 implements Runnable {

    @ObfuscatedName("bz.c")
    public class136 field1341;

    @ObfuscatedName("bz.h")
    public volatile class57[] field1343 = new class57[2];

    @ObfuscatedName("bz.k")
    public volatile boolean field1344 = false;

    @ObfuscatedName("bz.t")
    public volatile boolean field1347 = false;

    public void run() {
        this.field1347 = true;
        try {
            while (!this.field1344) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1343[var1];
                    if (var2 != null) {
                        var2.method1137();
                    }
                }
                class127.method2079(10L);
                class142.method2569(this.field1341, (Object) null);
            }
        } catch (Exception var7) {
            class148.method2598((String) null, var7);
        } finally {
            this.field1347 = false;
        }
    }
}
