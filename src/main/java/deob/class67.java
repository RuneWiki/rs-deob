package deob;

@ObfuscatedName("bh")
public class class67 implements Runnable {

    @ObfuscatedName("bh.b")
    public class127 field1259;

    @ObfuscatedName("bh.e")
    public volatile class51[] field1251 = new class51[2];

    @ObfuscatedName("bh.i")
    public volatile boolean field1252 = false;

    @ObfuscatedName("bh.k")
    public volatile boolean field1253 = false;

    public void run() {
        this.field1253 = true;
        try {
            while (!this.field1252) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1251[var1];
                    if (var2 != null) {
                        var2.method977();
                    }
                }
                class118.method2490(10L);
                class133.method28(this.field1259, (Object) null);
            }
        } catch (Exception var7) {
            class139.method1404((String) null, var7);
        } finally {
            this.field1253 = false;
        }
    }
}
