package deob;

@ObfuscatedName("bf")
public class class64 implements Runnable {

    @ObfuscatedName("bf.f")
    public class104 field1116;

    @ObfuscatedName("bf.i")
    public volatile class58[] field1115 = new class58[2];

    @ObfuscatedName("bf.u")
    public volatile boolean field1114 = false;

    @ObfuscatedName("bf.h")
    public volatile boolean field1117 = false;

    public void run() {
        this.field1117 = true;
        try {
            while (!this.field1114) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1115[var1];
                    if (var2 != null) {
                        var2.method1060();
                    }
                }
                class162.method2141(10L);
                class109.method3196(this.field1116, (Object) null);
            }
        } catch (Exception var7) {
            Statics.method1851((String) null, var7);
        } finally {
            this.field1117 = false;
        }
    }
}
