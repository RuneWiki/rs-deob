package deob;

@ObfuscatedName("bx")
public class class73 implements Runnable {

    @ObfuscatedName("bx.d")
    public class136 field1349;

    @ObfuscatedName("bx.p")
    public volatile class57[] field1350 = new class57[2];

    @ObfuscatedName("bx.v")
    public volatile boolean field1351 = false;

    @ObfuscatedName("bx.l")
    public volatile boolean field1352 = false;

    public void run() {
        this.field1352 = true;
        try {
            while (!this.field1351) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1350[var1];
                    if (var2 != null) {
                        var2.method1157();
                    }
                }
                class127.method724(10L);
                class142.method629(this.field1349, (Object) null);
            }
        } catch (Exception var7) {
            class148.method2734((String) null, var7);
        } finally {
            this.field1352 = false;
        }
    }
}
