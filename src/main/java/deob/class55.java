package deob;

@ObfuscatedName("bn")
public class class55 implements Runnable {

    @ObfuscatedName("bn.p")
    public class74 field1175;

    @ObfuscatedName("bn.e")
    public volatile class52[] field1166 = new class52[2];

    @ObfuscatedName("bn.a")
    public volatile boolean field1169 = false;

    @ObfuscatedName("bn.h")
    public volatile boolean field1168 = false;

    public void run() {
        this.field1168 = true;
        try {
            while (!this.field1169) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1166[var1];
                    if (var2 != null) {
                        var2.method1169();
                    }
                }
                class126.method47(10L);
                Statics.method3124(this.field1175, (Object) null);
            }
        } catch (Exception var7) {
            class80.method838((String) null, var7);
        } finally {
            this.field1168 = false;
        }
    }
}
