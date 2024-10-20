package deob;

@ObfuscatedName("aa")
public final class class34 {

    @ObfuscatedName("aa.i")
    public final int[] field445 = new int[4096];

    @ObfuscatedName("aa.c(Lad;I)V")
    public final void method341(class45 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field445[var2 * 64 + var3] = arg0.method577(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("aa.i(III)I")
    public final int method340(int arg0, int arg1) {
        return this.field445[arg0 * 64 + arg1];
    }
}
