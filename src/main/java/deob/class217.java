package deob;

@ObfuscatedName("ij")
public class class217 {

    @ObfuscatedName("ij.au")
    public final int[][] field2403;

    @ObfuscatedName("ij.ae")
    public final int[][] field2399;

    @ObfuscatedName("ij.ao")
    public int field2400;

    @ObfuscatedName("ij.at")
    public int field2401;

    @ObfuscatedName("ij.ac")
    public final int[] field2404;

    @ObfuscatedName("ij.ai")
    public final int[] field2398;

    @ObfuscatedName("ij.az")
    public final int field2402;

    public class217(int arg0, int arg1) {
        this.field2403 = new int[arg0][arg1];
        this.field2399 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class304.method4709(var3 / 4);
        this.field2404 = new int[var4];
        this.field2398 = new int[var4];
        this.field2402 = var4 - 1;
    }

    @ObfuscatedName("ij.au(B)V")
    public void method3913() {
        for (int var1 = 0; var1 < this.field2403.length; var1++) {
            for (int var2 = 0; var2 < this.field2403[var1].length; var2++) {
                this.field2403[var1][var2] = 0;
                this.field2399[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("ij.ae(III)V")
    public void method3875(int arg0, int arg1) {
        this.field2400 = arg0;
        this.field2401 = arg1;
    }

    @ObfuscatedName("ij.ao(B)I")
    public int method3876() {
        return this.field2400;
    }

    @ObfuscatedName("ij.at(B)I")
    public int method3877() {
        return this.field2401;
    }

    @ObfuscatedName("ij.ac(I)I")
    public int method3878() {
        return this.field2403.length;
    }

    @ObfuscatedName("ij.ai(B)I")
    public int method3895() {
        return this.field2403[0].length;
    }

    @ObfuscatedName("ij.az(I)[[I")
    public int[][] method3901() {
        return this.field2403;
    }

    @ObfuscatedName("ij.ap(I)[[I")
    public int[][] method3881() {
        return this.field2399;
    }

    @ObfuscatedName("ij.aa(I)[I")
    public int[] method3882() {
        return this.field2404;
    }

    @ObfuscatedName("ij.af(I)[I")
    public int[] method3883() {
        return this.field2398;
    }

    @ObfuscatedName("ij.ad(B)I")
    public int method3884() {
        return this.field2402;
    }
}
