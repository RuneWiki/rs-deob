package deob;

@ObfuscatedName("z")
public final class class22 {

    @ObfuscatedName("z.m")
    public final int[] field188 = new int[4096];

    @ObfuscatedName("z.w(Las;I)V")
    public final void method274(class33 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field188[var2 * 64 + var3] = arg0.method528(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("z.m(IIB)I")
    public final int method283(int arg0, int arg1) {
        return this.field188[arg0 * 64 + arg1];
    }
}
