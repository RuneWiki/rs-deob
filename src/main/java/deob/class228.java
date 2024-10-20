package deob;

@ObfuscatedName("ig")
public class class228 {

    @ObfuscatedName("ig.at")
    public final int[][] field2404;

    @ObfuscatedName("ig.ah")
    public final int[][] field2400;

    @ObfuscatedName("ig.ar")
    public int field2401;

    @ObfuscatedName("ig.ao")
    public int field2402;

    @ObfuscatedName("ig.ab")
    public final int[] field2403;

    @ObfuscatedName("ig.au")
    public final int[] field2405;

    @ObfuscatedName("ig.aa")
    public final int field2399;

    public class228(int arg0, int arg1) {
        this.field2404 = new int[arg0][arg1];
        this.field2400 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class315.method3369(var3 / 4);
        this.field2403 = new int[var4];
        this.field2405 = new int[var4];
        this.field2399 = var4 - 1;
    }

    @ObfuscatedName("ig.at(I)V")
    public void method4021() {
        for (int var1 = 0; var1 < this.field2404.length; var1++) {
            for (int var2 = 0; var2 < this.field2404[var1].length; var2++) {
                this.field2404[var1][var2] = 0;
                this.field2400[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("ig.ah(IIB)V")
    public void method4022(int arg0, int arg1) {
        this.field2401 = arg0;
        this.field2402 = arg1;
    }

    @ObfuscatedName("ig.ar(I)I")
    public int method4034() {
        return this.field2401;
    }

    @ObfuscatedName("ig.ao(I)I")
    public int method4024() {
        return this.field2402;
    }

    @ObfuscatedName("ig.ab(I)I")
    public int method4025() {
        return this.field2404.length;
    }

    @ObfuscatedName("ig.au(B)I")
    public int method4026() {
        return this.field2404[0].length;
    }

    @ObfuscatedName("ig.aa(I)[[I")
    public int[][] method4027() {
        return this.field2404;
    }

    @ObfuscatedName("ig.ac(I)[[I")
    public int[][] method4028() {
        return this.field2400;
    }

    @ObfuscatedName("ig.al(B)[I")
    public int[] method4048() {
        return this.field2403;
    }

    @ObfuscatedName("ig.az(I)[I")
    public int[] method4030() {
        return this.field2405;
    }

    @ObfuscatedName("ig.ap(S)I")
    public int method4053() {
        return this.field2399;
    }
}
