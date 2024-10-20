package deob;

@ObfuscatedName("ba")
public class class64 implements Runnable {

    @ObfuscatedName("ba.o")
    public class104 field1089;

    @ObfuscatedName("ba.m")
    public volatile class58[] field1093 = new class58[2];

    @ObfuscatedName("ba.b")
    public volatile boolean field1091 = false;

    @ObfuscatedName("ba.g")
    public volatile boolean field1092 = false;

    public void run() {
        this.field1092 = true;
        try {
            while (!this.field1091) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1093[var1];
                    if (var2 != null) {
                        var2.method1002();
                    }
                }
                class162.method238(10L);
                class109.method593(this.field1089, (Object) null);
            }
        } catch (Exception var7) {
            class102.method1762((String) null, var7);
        } finally {
            this.field1092 = false;
        }
    }
}
