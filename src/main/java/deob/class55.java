package deob;

@ObfuscatedName("be")
public class class55 implements Runnable {

    @ObfuscatedName("be.c")
    public class74 field1201;

    @ObfuscatedName("be.q")
    public volatile class52[] field1193 = new class52[2];

    @ObfuscatedName("be.y")
    public volatile boolean field1195 = false;

    @ObfuscatedName("be.v")
    public volatile boolean field1196 = false;

    public void run() {
        this.field1196 = true;
        try {
            while (!this.field1195) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1193[var1];
                    if (var2 != null) {
                        var2.method1134();
                    }
                }
                class126.method577(10L);
                class69.method1179(this.field1201, (Object) null);
            }
        } catch (Exception var7) {
            class80.method789((String) null, var7);
        } finally {
            this.field1196 = false;
        }
    }
}
