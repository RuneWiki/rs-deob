package deob;

@ObfuscatedName("bo")
public class class55 implements Runnable {

    @ObfuscatedName("bo.a")
    public class74 field1167;

    @ObfuscatedName("bo.r")
    public volatile class52[] field1161 = new class52[2];

    @ObfuscatedName("bo.u")
    public volatile boolean field1160 = false;

    @ObfuscatedName("bo.t")
    public volatile boolean field1163 = false;

    public void run() {
        this.field1163 = true;
        try {
            while (!this.field1160) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1161[var1];
                    if (var2 != null) {
                        var2.method1087();
                    }
                }
                class127.method1598(10L);
                class69.method696(this.field1167, (Object) null);
            }
        } catch (Exception var7) {
            class80.method184((String) null, var7);
        } finally {
            this.field1163 = false;
        }
    }
}
