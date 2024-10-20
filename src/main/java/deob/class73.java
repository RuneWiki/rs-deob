package deob;

@ObfuscatedName("bn")
public class class73 implements Runnable {

    @ObfuscatedName("bn.i")
    public class136 field1359;

    @ObfuscatedName("bn.v")
    public volatile class57[] field1357 = new class57[2];

    @ObfuscatedName("bn.r")
    public volatile boolean field1355 = false;

    @ObfuscatedName("bn.n")
    public volatile boolean field1354 = false;

    public void run() {
        this.field1354 = true;
        try {
            while (!this.field1355) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1357[var1];
                    if (var2 != null) {
                        var2.method1188();
                    }
                }
                class127.method731(10L);
                class142.method603(this.field1359, (Object) null);
            }
        } catch (Exception var7) {
            class148.method145((String) null, var7);
        } finally {
            this.field1354 = false;
        }
    }
}
