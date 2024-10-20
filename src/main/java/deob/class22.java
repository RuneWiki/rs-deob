package deob;

@ObfuscatedName("a")
public final class class22 {

    @ObfuscatedName("a.q")
    public final int[] field198 = new int[4096];

    @ObfuscatedName("a.c(Lah;B)V")
    public final void method292(class33 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field198[var2 * 64 + var3] = arg0.method535(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("a.q(III)I")
    public final int method289(int arg0, int arg1) {
        return this.field198[arg0 * 64 + arg1];
    }
}
