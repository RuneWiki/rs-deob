package deob;

@ObfuscatedName("af")
public final class class34 {

    @ObfuscatedName("af.k")
    public final int[] field465 = new int[4096];

    @ObfuscatedName("af.o(Lar;B)V")
    public final void method369(class45 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field465[var2 * 64 + var3] = arg0.method567(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("af.k(IIB)I")
    public final int method364(int arg0, int arg1) {
        return this.field465[arg0 * 64 + arg1];
    }
}
