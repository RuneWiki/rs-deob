package deob;

@ObfuscatedName("be")
public class class55 implements Runnable {

    @ObfuscatedName("be.p")
    public class74 field1183;

    @ObfuscatedName("be.i")
    public volatile class52[] field1182 = new class52[2];

    @ObfuscatedName("be.o")
    public volatile boolean field1179 = false;

    @ObfuscatedName("be.n")
    public volatile boolean field1180 = false;

    public void run() {
        this.field1180 = true;
        try {
            while (!this.field1179) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1182[var1];
                    if (var2 != null) {
                        var2.method1192();
                    }
                }
                class126.method2420(10L);
                class69.method147(this.field1183, (Object) null);
            }
        } catch (Exception var7) {
            class80.method1379((String) null, var7);
        } finally {
            this.field1180 = false;
        }
    }
}
