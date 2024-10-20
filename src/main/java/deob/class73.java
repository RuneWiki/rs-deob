package deob;

@ObfuscatedName("bs")
public class class73 implements Runnable {

    @ObfuscatedName("bs.o")
    public class136 field1344;

    @ObfuscatedName("bs.f")
    public volatile class57[] field1348 = new class57[2];

    @ObfuscatedName("bs.i")
    public volatile boolean field1343 = false;

    @ObfuscatedName("bs.h")
    public volatile boolean field1341 = false;

    public void run() {
        this.field1341 = true;
        try {
            while (!this.field1343) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1348[var1];
                    if (var2 != null) {
                        var2.method1119();
                    }
                }
                class127.method16(10L);
                class142.method2714(this.field1344, (Object) null);
            }
        } catch (Exception var7) {
            class148.method2604((String) null, var7);
        } finally {
            this.field1341 = false;
        }
    }
}
