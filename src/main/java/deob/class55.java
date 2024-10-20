package deob;

@ObfuscatedName("bf")
public class class55 implements Runnable {

    @ObfuscatedName("bf.q")
    public class74 field1169;

    @ObfuscatedName("bf.c")
    public volatile class52[] field1168 = new class52[2];

    @ObfuscatedName("bf.p")
    public volatile boolean field1167 = false;

    @ObfuscatedName("bf.z")
    public volatile boolean field1170 = false;

    public void run() {
        this.field1170 = true;
        try {
            while (!this.field1167) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1168[var1];
                    if (var2 != null) {
                        var2.method1168();
                    }
                }
                class126.method210(10L);
                class69.method150(this.field1169, (Object) null);
            }
        } catch (Exception var7) {
            class80.method2321((String) null, var7);
        } finally {
            this.field1170 = false;
        }
    }
}
