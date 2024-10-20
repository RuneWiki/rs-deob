package deob;

@ObfuscatedName("g")
public class class20 implements Runnable {

    @ObfuscatedName("g.q")
    public class35 field291;

    @ObfuscatedName("g.l")
    public volatile class18[] field290 = new class18[2];

    @ObfuscatedName("g.a")
    public volatile boolean field292 = false;

    @ObfuscatedName("g.o")
    public volatile boolean field293 = false;

    public void run() {
        this.field293 = true;
        try {
            while (!this.field292) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class18 var2 = this.field290[var1];
                    if (var2 != null) {
                        var2.method187();
                    }
                }
                class68.method86(10L);
                class31.method1177(this.field291, (Object) null);
            }
        } catch (Exception var7) {
            Statics.method244((String) null, var7);
        } finally {
            this.field293 = false;
        }
    }
}
