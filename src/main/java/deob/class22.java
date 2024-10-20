package deob;

@ObfuscatedName("x")
public final class class22 {

    @ObfuscatedName("x.s")
    public final int[] field193 = new int[4096];

    @ObfuscatedName("x.v(Laf;I)V")
    public final void method296(class33 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field193[var2 * 64 + var3] = arg0.method531(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("x.s(III)I")
    public final int method301(int arg0, int arg1) {
        return this.field193[arg0 * 64 + arg1];
    }
}
