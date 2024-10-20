package deob;

@ObfuscatedName("bg")
public class class55 implements Runnable {

    @ObfuscatedName("bg.p")
    public class74 field1178;

    @ObfuscatedName("bg.l")
    public volatile class52[] field1181 = new class52[2];

    @ObfuscatedName("bg.d")
    public volatile boolean field1183 = false;

    @ObfuscatedName("bg.x")
    public volatile boolean field1180 = false;

    public void run() {
        this.field1180 = true;
        try {
            while (!this.field1183) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1181[var1];
                    if (var2 != null) {
                        var2.method1197();
                    }
                }
                class126.method1463(10L);
                class69.method3061(this.field1178, (Object) null);
            }
        } catch (Exception var7) {
            class80.method2076((String) null, var7);
        } finally {
            this.field1180 = false;
        }
    }
}
