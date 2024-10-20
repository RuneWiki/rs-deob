package deob;

@ObfuscatedName("bm")
public class class55 implements Runnable {

    @ObfuscatedName("bm.d")
    public class74 field1176;

    @ObfuscatedName("bm.g")
    public volatile class52[] field1177 = new class52[2];

    @ObfuscatedName("bm.a")
    public volatile boolean field1179 = false;

    @ObfuscatedName("bm.t")
    public volatile boolean field1181 = false;

    public void run() {
        this.field1181 = true;
        try {
            while (!this.field1179) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1177[var1];
                    if (var2 != null) {
                        var2.method1135();
                    }
                }
                class126.method112(10L);
                Statics.method60(this.field1176, (Object) null);
            }
        } catch (Exception var7) {
            class80.method2305((String) null, var7);
        } finally {
            this.field1181 = false;
        }
    }
}
