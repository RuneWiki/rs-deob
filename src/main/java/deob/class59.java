package deob;

@ObfuscatedName("bh")
public class class59 {

    @ObfuscatedName("bh.t")
    public final class236 field518;

    @ObfuscatedName("bh.n")
    public final int field519;

    @ObfuscatedName("bh.q")
    public int field523 = 0;

    public class59(class236 arg0, String arg1) {
        this.field518 = arg0;
        this.field519 = arg0.method3886();
    }

    @ObfuscatedName("bh.a(I)Z")
    public boolean method1067() {
        this.field523 = 0;
        for (int var1 = 0; var1 < this.field519; var1++) {
            if (!this.field518.method3998(var1) || this.field518.method3987(var1)) {
                this.field523++;
            }
        }
        return this.field523 >= this.field519;
    }
}
