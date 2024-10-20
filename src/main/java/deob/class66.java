package deob;

@ObfuscatedName("bb")
public class class66 implements Runnable {

    @ObfuscatedName("bb.j")
    public class123 field1253;

    @ObfuscatedName("bb.z")
    public volatile class50[] field1254 = new class50[2];

    @ObfuscatedName("bb.y")
    public volatile boolean field1256 = false;

    @ObfuscatedName("bb.h")
    public volatile boolean field1259 = false;

    public void run() {
        this.field1259 = true;
        try {
            while (!this.field1256) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1254[var1];
                    if (var2 != null) {
                        var2.method976();
                    }
                }
                class114.method589(10L);
                class129.method472(this.field1253, (Object) null);
            }
        } catch (Exception var7) {
            class135.method495((String) null, var7);
        } finally {
            this.field1259 = false;
        }
    }
}
