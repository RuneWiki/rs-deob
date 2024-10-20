package deob;

@ObfuscatedName("bg")
public class class68 implements Runnable {

    @ObfuscatedName("bg.n")
    public class128 field1304;

    @ObfuscatedName("bg.g")
    public volatile class52[] field1309 = new class52[2];

    @ObfuscatedName("bg.a")
    public volatile boolean field1305 = false;

    @ObfuscatedName("bg.m")
    public volatile boolean field1308 = false;

    public void run() {
        this.field1308 = true;
        try {
            while (!this.field1305) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1309[var1];
                    if (var2 != null) {
                        var2.method1067();
                    }
                }
                class119.method2154(10L);
                class134.method681(this.field1304, (Object) null);
            }
        } catch (Exception var7) {
            class140.method2829((String) null, var7);
        } finally {
            this.field1308 = false;
        }
    }
}
