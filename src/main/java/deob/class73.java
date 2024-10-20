package deob;

@ObfuscatedName("bk")
public class class73 implements Runnable {

    @ObfuscatedName("bk.g")
    public class136 field1344;

    @ObfuscatedName("bk.b")
    public volatile class57[] field1342 = new class57[2];

    @ObfuscatedName("bk.w")
    public volatile boolean field1341 = false;

    @ObfuscatedName("bk.d")
    public volatile boolean field1343 = false;

    public void run() {
        this.field1343 = true;
        try {
            while (!this.field1341) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1342[var1];
                    if (var2 != null) {
                        var2.method1200();
                    }
                }
                class127.method2632(10L);
                class142.method947(this.field1344, (Object) null);
            }
        } catch (Exception var7) {
            class148.method2631((String) null, var7);
        } finally {
            this.field1343 = false;
        }
    }
}
