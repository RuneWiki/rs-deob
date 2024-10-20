package deob;

@ObfuscatedName("bi")
public class class73 implements Runnable {

    @ObfuscatedName("bi.v")
    public class136 field1351;

    @ObfuscatedName("bi.f")
    public volatile class57[] field1347 = new class57[2];

    @ObfuscatedName("bi.i")
    public volatile boolean field1354 = false;

    @ObfuscatedName("bi.d")
    public volatile boolean field1348 = false;

    public void run() {
        this.field1348 = true;
        try {
            while (!this.field1354) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1347[var1];
                    if (var2 != null) {
                        var2.method1156();
                    }
                }
                class127.method2134(10L);
                class142.method1232(this.field1351, (Object) null);
            }
        } catch (Exception var7) {
            class148.method1777((String) null, var7);
        } finally {
            this.field1348 = false;
        }
    }
}
