package deob;

@ObfuscatedName("bx")
public class class66 implements Runnable {

    @ObfuscatedName("bx.g")
    public class123 field1257;

    @ObfuscatedName("bx.s")
    public volatile class50[] field1245 = new class50[2];

    @ObfuscatedName("bx.h")
    public volatile boolean field1246 = false;

    @ObfuscatedName("bx.m")
    public volatile boolean field1247 = false;

    public void run() {
        this.field1247 = true;
        try {
            while (!this.field1246) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1245[var1];
                    if (var2 != null) {
                        var2.method977();
                    }
                }
                class114.method2036(10L);
                class129.method1838(this.field1257, (Object) null);
            }
        } catch (Exception var7) {
            class135.method1860((String) null, var7);
        } finally {
            this.field1247 = false;
        }
    }
}
