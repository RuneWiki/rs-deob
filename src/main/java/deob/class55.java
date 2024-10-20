package deob;

@ObfuscatedName("be")
public class class55 implements Runnable {

    @ObfuscatedName("be.y")
    public class74 field1165;

    @ObfuscatedName("be.m")
    public volatile class52[] field1166 = new class52[2];

    @ObfuscatedName("be.d")
    public volatile boolean field1169 = false;

    @ObfuscatedName("be.k")
    public volatile boolean field1163 = false;

    public void run() {
        this.field1163 = true;
        try {
            while (!this.field1169) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1166[var1];
                    if (var2 != null) {
                        var2.method1185();
                    }
                }
                class126.method1326(10L);
                class69.method1875(this.field1165, (Object) null);
            }
        } catch (Exception var7) {
            class80.method210((String) null, var7);
        } finally {
            this.field1163 = false;
        }
    }
}
