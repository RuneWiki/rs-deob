package deob;

@ObfuscatedName("ap")
public final class class34 {

    @ObfuscatedName("ap.q")
    public final int[] field437 = new int[4096];

    @ObfuscatedName("ap.t(Law;I)V")
    public final void method330(class45 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field437[var2 * 64 + var3] = arg0.method586(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ap.q(III)I")
    public final int method329(int arg0, int arg1) {
        return this.field437[arg0 * 64 + arg1];
    }
}
