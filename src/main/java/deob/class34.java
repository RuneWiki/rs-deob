package deob;

@ObfuscatedName("av")
public final class class34 {

    @ObfuscatedName("av.e")
    public final int[] field459 = new int[4096];

    @ObfuscatedName("av.g(Lap;I)V")
    public final void method336(class45 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field459[var2 * 64 + var3] = arg0.method589(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("av.e(III)I")
    public final int method332(int arg0, int arg1) {
        return this.field459[arg0 * 64 + arg1];
    }
}
