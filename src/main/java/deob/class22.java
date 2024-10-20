package deob;

@ObfuscatedName("o")
public final class class22 {

    @ObfuscatedName("o.l")
    public final int[] field203 = new int[4096];

    @ObfuscatedName("o.f(Lam;I)V")
    public final void method267(class33 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field203[var2 * 64 + var3] = arg0.method512(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("o.l(III)I")
    public final int method270(int arg0, int arg1) {
        return this.field203[arg0 * 64 + arg1];
    }
}
