package deob;

@ObfuscatedName("bm")
public class class68 {

    @ObfuscatedName("bm.v")
    public final class247 field552;

    @ObfuscatedName("bm.d")
    public final int field553;

    @ObfuscatedName("bm.c")
    public int field550 = 0;

    public class68(class247 arg0, String arg1) {
        this.field552 = arg0;
        this.field553 = arg0.method4039();
    }

    @ObfuscatedName("bm.n(I)Z")
    public boolean method1098() {
        this.field550 = 0;
        for (int var1 = 0; var1 < this.field553; var1++) {
            if (!this.field552.method4087(var1) || this.field552.method4086(var1)) {
                this.field550++;
            }
        }
        return this.field550 >= this.field553;
    }
}
