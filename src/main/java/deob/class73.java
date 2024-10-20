package deob;

@ObfuscatedName("bk")
public class class73 implements Runnable {

    @ObfuscatedName("bk.s")
    public class137 field1355;

    @ObfuscatedName("bk.j")
    public volatile class57[] field1358 = new class57[2];

    @ObfuscatedName("bk.p")
    public volatile boolean field1356 = false;

    @ObfuscatedName("bk.x")
    public volatile boolean field1357 = false;

    public void run() {
        this.field1357 = true;
        try {
            while (!this.field1356) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1358[var1];
                    if (var2 != null) {
                        var2.method1128();
                    }
                }
                class128.method2294(10L);
                Statics.method197(this.field1355, (Object) null);
            }
        } catch (Exception var7) {
            class149.method1942((String) null, var7);
        } finally {
            this.field1357 = false;
        }
    }
}
