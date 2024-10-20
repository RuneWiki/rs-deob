package deob;

@ObfuscatedName("br")
public class class66 implements Runnable {

    @ObfuscatedName("br.g")
    public class123 field1245;

    @ObfuscatedName("br.v")
    public volatile class50[] field1242 = new class50[2];

    @ObfuscatedName("br.z")
    public volatile boolean field1243 = false;

    @ObfuscatedName("br.h")
    public volatile boolean field1244 = false;

    public void run() {
        this.field1244 = true;
        try {
            while (!this.field1243) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1242[var1];
                    if (var2 != null) {
                        var2.method1016();
                    }
                }
                class114.method2962(10L);
                class129.method1625(this.field1245, (Object) null);
            }
        } catch (Exception var7) {
            class135.method495((String) null, var7);
        } finally {
            this.field1244 = false;
        }
    }
}
