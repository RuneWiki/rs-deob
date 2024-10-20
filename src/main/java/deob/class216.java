package deob;

@ObfuscatedName("is")
public class class216 {

    @ObfuscatedName("is.at")
    public final int[][] field2391;

    @ObfuscatedName("is.an")
    public final int[][] field2388;

    @ObfuscatedName("is.av")
    public int field2392;

    @ObfuscatedName("is.as")
    public int field2390;

    @ObfuscatedName("is.ax")
    public final int[] field2389;

    @ObfuscatedName("is.ap")
    public final int[] field2387;

    @ObfuscatedName("is.ab")
    public final int field2393;

    public class216(int arg0, int arg1) {
        this.field2391 = new int[arg0][arg1];
        this.field2388 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class303.method2820(var3 / 4);
        this.field2389 = new int[var4];
        this.field2387 = new int[var4];
        this.field2393 = var4 - 1;
    }

    @ObfuscatedName("is.at(I)V")
    public void method3899() {
        for (int var1 = 0; var1 < this.field2391.length; var1++) {
            for (int var2 = 0; var2 < this.field2391[var1].length; var2++) {
                this.field2391[var1][var2] = 0;
                this.field2388[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("is.an(III)V")
    public void method3869(int arg0, int arg1) {
        this.field2392 = arg0;
        this.field2390 = arg1;
    }

    @ObfuscatedName("is.av(I)I")
    public int method3889() {
        return this.field2392;
    }

    @ObfuscatedName("is.as(I)I")
    public int method3897() {
        return this.field2390;
    }

    @ObfuscatedName("is.ax(I)I")
    public int method3876() {
        return this.field2391.length;
    }

    @ObfuscatedName("is.ap(I)I")
    public int method3873() {
        return this.field2391[0].length;
    }

    @ObfuscatedName("is.ab(I)[[I")
    public int[][] method3891() {
        return this.field2391;
    }

    @ObfuscatedName("is.ak(I)[[I")
    public int[][] method3875() {
        return this.field2388;
    }

    @ObfuscatedName("is.ae(S)[I")
    public int[] method3871() {
        return this.field2389;
    }

    @ObfuscatedName("is.af(I)[I")
    public int[] method3867() {
        return this.field2387;
    }

    @ObfuscatedName("is.ao(I)I")
    public int method3878() {
        return this.field2393;
    }
}
