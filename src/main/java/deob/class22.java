package deob;

@ObfuscatedName("g")
public final class class22 {

    @ObfuscatedName("g.c")
    public final int[] field198 = new int[4096];

    @ObfuscatedName("g.y(Lav;I)V")
    public final void method272(class33 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field198[var2 * 64 + var3] = arg0.method514(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("g.c(IIB)I")
    public final int method269(int arg0, int arg1) {
        return this.field198[arg0 * 64 + arg1];
    }
}
