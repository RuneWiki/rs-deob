package deob;

@ObfuscatedName("bv")
public class class59 {

    @ObfuscatedName("bv.x")
    public final class236 field504;

    @ObfuscatedName("bv.t")
    public final int field510;

    @ObfuscatedName("bv.g")
    public int field506 = 0;

    public class59(class236 arg0, String arg1) {
        this.field504 = arg0;
        this.field510 = arg0.method3826();
    }

    @ObfuscatedName("bv.c(I)Z")
    public boolean method969() {
        this.field506 = 0;
        for (int var1 = 0; var1 < this.field510; var1++) {
            if (!this.field504.method3942(var1) || this.field504.method3958(var1)) {
                this.field506++;
            }
        }
        return this.field506 >= this.field510;
    }
}
