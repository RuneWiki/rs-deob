package deob;

@ObfuscatedName("bf")
public class class54 implements Runnable {

    @ObfuscatedName("bf.p")
    public class73 field1177;

    @ObfuscatedName("bf.j")
    public volatile class51[] field1176 = new class51[2];

    @ObfuscatedName("bf.w")
    public volatile boolean field1171 = false;

    @ObfuscatedName("bf.h")
    public volatile boolean field1168 = false;

    public void run() {
        this.field1168 = true;
        try {
            while (!this.field1171) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1176[var1];
                    if (var2 != null) {
                        var2.method1117();
                    }
                }
                class125.method123(10L);
                class68.method218(this.field1177, (Object) null);
            }
        } catch (Exception var7) {
            class79.method720((String) null, var7);
        } finally {
            this.field1168 = false;
        }
    }
}
