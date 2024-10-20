package deob;

@ObfuscatedName("bn")
public class class55 implements Runnable {

    @ObfuscatedName("bn.t")
    public class74 field1216;

    @ObfuscatedName("bn.l")
    public volatile class52[] field1209 = new class52[2];

    @ObfuscatedName("bn.c")
    public volatile boolean field1210 = false;

    @ObfuscatedName("bn.d")
    public volatile boolean field1211 = false;

    public void run() {
        this.field1211 = true;
        try {
            while (!this.field1210) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1209[var1];
                    if (var2 != null) {
                        var2.method1199();
                    }
                }
                class126.method3086(10L);
                class69.method564(this.field1216, (Object) null);
            }
        } catch (Exception var7) {
            class80.method3170((String) null, var7);
        } finally {
            this.field1211 = false;
        }
    }
}
