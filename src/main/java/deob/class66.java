package deob;

@ObfuscatedName("br")
public class class66 implements Runnable {

    @ObfuscatedName("br.e")
    public class123 field1242;

    @ObfuscatedName("br.p")
    public volatile class50[] field1241 = new class50[2];

    @ObfuscatedName("br.a")
    public volatile boolean field1246 = false;

    @ObfuscatedName("br.g")
    public volatile boolean field1243 = false;

    public void run() {
        this.field1243 = true;
        try {
            while (!this.field1246) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1241[var1];
                    if (var2 != null) {
                        var2.method1029();
                    }
                }
                class114.method658(10L);
                class129.method745(this.field1242, (Object) null);
            }
        } catch (Exception var7) {
            class135.method95((String) null, var7);
        } finally {
            this.field1243 = false;
        }
    }
}
