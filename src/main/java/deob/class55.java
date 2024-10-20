package deob;

@ObfuscatedName("bb")
public class class55 implements Runnable {

    @ObfuscatedName("bb.j")
    public class74 field1184;

    @ObfuscatedName("bb.f")
    public volatile class52[] field1181 = new class52[2];

    @ObfuscatedName("bb.o")
    public volatile boolean field1180 = false;

    @ObfuscatedName("bb.h")
    public volatile boolean field1183 = false;

    public void run() {
        this.field1183 = true;
        try {
            while (!this.field1180) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1181[var1];
                    if (var2 != null) {
                        var2.method1165();
                    }
                }
                class126.method768(10L);
                class69.method653(this.field1184, (Object) null);
            }
        } catch (Exception var7) {
            class80.method1544((String) null, var7);
        } finally {
            this.field1183 = false;
        }
    }
}
