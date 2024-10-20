package deob;

@ObfuscatedName("bj")
public class class68 implements Runnable {

    @ObfuscatedName("bj.e")
    public class128 field1232;

    @ObfuscatedName("bj.a")
    public volatile class52[] field1228 = new class52[2];

    @ObfuscatedName("bj.l")
    public volatile boolean field1229 = false;

    @ObfuscatedName("bj.c")
    public volatile boolean field1227 = false;

    public void run() {
        this.field1227 = true;
        try {
            while (!this.field1229) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1228[var1];
                    if (var2 != null) {
                        var2.method1042();
                    }
                }
                class119.method837(10L);
                class134.method2006(this.field1232, (Object) null);
            }
        } catch (Exception var7) {
            class140.method2555((String) null, var7);
        } finally {
            this.field1227 = false;
        }
    }
}
