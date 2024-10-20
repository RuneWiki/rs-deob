package deob;

@ObfuscatedName("bu")
public class class67 implements Runnable {

    @ObfuscatedName("bu.c")
    public class125 field1250;

    @ObfuscatedName("bu.j")
    public volatile class51[] field1247 = new class51[2];

    @ObfuscatedName("bu.y")
    public volatile boolean field1248 = false;

    @ObfuscatedName("bu.r")
    public volatile boolean field1249 = false;

    public void run() {
        this.field1249 = true;
        try {
            while (!this.field1248) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1247[var1];
                    if (var2 != null) {
                        var2.method1005();
                    }
                }
                class116.method2713(10L);
                class131.method2723(this.field1250, (Object) null);
            }
        } catch (Exception var7) {
            class137.method880((String) null, var7);
        } finally {
            this.field1249 = false;
        }
    }
}
