package deob;

@ObfuscatedName("z")
public final class class22 {

    @ObfuscatedName("z.h")
    public final int[] field179 = new int[4096];

    @ObfuscatedName("z.f(Lag;I)V")
    public final void method292(class33 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field179[var2 * 64 + var3] = arg0.method520(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("z.h(III)I")
    public final int method295(int arg0, int arg1) {
        return this.field179[arg0 * 64 + arg1];
    }
}
