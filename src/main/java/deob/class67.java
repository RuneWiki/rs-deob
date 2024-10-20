package deob;

@ObfuscatedName("bf")
public class class67 implements Runnable {

    @ObfuscatedName("bf.a")
    public class127 field1256;

    @ObfuscatedName("bf.v")
    public volatile class51[] field1257 = new class51[2];

    @ObfuscatedName("bf.i")
    public volatile boolean field1258 = false;

    @ObfuscatedName("bf.b")
    public volatile boolean field1259 = false;

    public void run() {
        this.field1259 = true;
        try {
            while (!this.field1258) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1257[var1];
                    if (var2 != null) {
                        var2.method1005();
                    }
                }
                class118.method2072(10L);
                class133.method2063(this.field1256, (Object) null);
            }
        } catch (Exception var7) {
            class139.method2550((String) null, var7);
        } finally {
            this.field1259 = false;
        }
    }
}
