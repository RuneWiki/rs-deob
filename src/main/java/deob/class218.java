package deob;

@ObfuscatedName("iq")
public class class218 {

    @ObfuscatedName("iq.aw")
    public final int[][] field2373;

    @ObfuscatedName("iq.ay")
    public final int[][] field2370;

    @ObfuscatedName("iq.ar")
    public int field2374;

    @ObfuscatedName("iq.am")
    public int field2372;

    @ObfuscatedName("iq.as")
    public final int[] field2375;

    @ObfuscatedName("iq.aj")
    public final int[] field2369;

    @ObfuscatedName("iq.ag")
    public final int field2371;

    public class218(int arg0, int arg1) {
        this.field2373 = new int[arg0][arg1];
        this.field2370 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class305.method2707(var3 / 4);
        this.field2375 = new int[var4];
        this.field2369 = new int[var4];
        this.field2371 = var4 - 1;
    }

    @ObfuscatedName("iq.aw(I)V")
    public void method3869() {
        for (int var1 = 0; var1 < this.field2373.length; var1++) {
            for (int var2 = 0; var2 < this.field2373[var1].length; var2++) {
                this.field2373[var1][var2] = 0;
                this.field2370[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("iq.ay(III)V")
    public void method3870(int arg0, int arg1) {
        this.field2374 = arg0;
        this.field2372 = arg1;
    }

    @ObfuscatedName("iq.ar(I)I")
    public int method3871() {
        return this.field2374;
    }

    @ObfuscatedName("iq.am(I)I")
    public int method3894() {
        return this.field2372;
    }

    @ObfuscatedName("iq.as(I)I")
    public int method3873() {
        return this.field2373.length;
    }

    @ObfuscatedName("iq.aj(B)I")
    public int method3874() {
        return this.field2373[0].length;
    }

    @ObfuscatedName("iq.ag(I)[[I")
    public int[][] method3875() {
        return this.field2373;
    }

    @ObfuscatedName("iq.az(B)[[I")
    public int[][] method3897() {
        return this.field2370;
    }

    @ObfuscatedName("iq.av(I)[I")
    public int[] method3877() {
        return this.field2375;
    }

    @ObfuscatedName("iq.ap(B)[I")
    public int[] method3878() {
        return this.field2369;
    }

    @ObfuscatedName("iq.aq(I)I")
    public int method3879() {
        return this.field2371;
    }
}
