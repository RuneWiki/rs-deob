package deob;

@ObfuscatedName("bp")
public class class64 implements Runnable {

    @ObfuscatedName("bp.i")
    public class104 field1093;

    @ObfuscatedName("bp.e")
    public volatile class58[] field1091 = new class58[2];

    @ObfuscatedName("bp.f")
    public volatile boolean field1090 = false;

    @ObfuscatedName("bp.k")
    public volatile boolean field1092 = false;

    public void run() {
        this.field1092 = true;
        try {
            while (!this.field1090) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1091[var1];
                    if (var2 != null) {
                        var2.method999();
                    }
                }
                class162.method150(10L);
                class109.method1902(this.field1093, (Object) null);
            }
        } catch (Exception var7) {
            class102.method1780((String) null, var7);
        } finally {
            this.field1092 = false;
        }
    }
}
