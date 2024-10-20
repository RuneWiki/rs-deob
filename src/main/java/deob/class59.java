package deob;

@ObfuscatedName("bh")
public class class59 {

    @ObfuscatedName("bh.j")
    public final int field512;

    @ObfuscatedName("bh.i")
    public final class236 field511;

    @ObfuscatedName("bh.k")
    public int field510 = 0;

    public class59(class236 arg0, String arg1) {
        this.field511 = arg0;
        this.field512 = arg0.method3777();
    }

    @ObfuscatedName("bh.s(I)Z")
    public boolean method974() {
        this.field510 = 0;
        for (int var1 = 0; var1 < this.field512; var1++) {
            if (!this.field511.method3891(var1) || this.field511.method3883(var1)) {
                this.field510++;
            }
        }
        return this.field510 >= this.field512;
    }
}
