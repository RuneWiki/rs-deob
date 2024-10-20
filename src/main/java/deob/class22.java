package deob;

@ObfuscatedName("z")
public final class class22 {

    @ObfuscatedName("z.r")
    public final int[] field208 = new int[4096];

    @ObfuscatedName("z.g(Laz;I)V")
    public final void method301(class33 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field208[var2 * 64 + var3] = arg0.method541(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("z.r(IIB)I")
    public final int method302(int arg0, int arg1) {
        return this.field208[arg0 * 64 + arg1];
    }
}
