package deob;

@ObfuscatedName("br")
public class class73 implements Runnable {

    @ObfuscatedName("br.b")
    public class137 field1328;

    @ObfuscatedName("br.g")
    public volatile class57[] field1318 = new class57[2];

    @ObfuscatedName("br.j")
    public volatile boolean field1316 = false;

    @ObfuscatedName("br.d")
    public volatile boolean field1319 = false;

    public void run() {
        this.field1319 = true;
        try {
            while (!this.field1316) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1318[var1];
                    if (var2 != null) {
                        var2.method1161();
                    }
                }
                class128.method2289(10L);
                class143.method2681(this.field1328, (Object) null);
            }
        } catch (Exception var7) {
            class149.method93((String) null, var7);
        } finally {
            this.field1319 = false;
        }
    }
}
