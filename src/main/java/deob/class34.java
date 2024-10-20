package deob;

@ObfuscatedName("af")
public final class class34 {

    @ObfuscatedName("af.z")
    public final int[] field468 = new int[4096];

    @ObfuscatedName("af.d(Lax;I)V")
    public final void method323(class45 arg0) {
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field468[var2 * 64 + var3] = arg0.method548(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("af.z(III)I")
    public final int method326(int arg0, int arg1) {
        return this.field468[arg0 * 64 + arg1];
    }
}
