package deob;

@ObfuscatedName("ig")
public class class231 {

    @ObfuscatedName("ig.ac")
    public final int[][] field2421;

    @ObfuscatedName("ig.al")
    public final int[][] field2419;

    @ObfuscatedName("ig.ak")
    public int field2420;

    @ObfuscatedName("ig.ax")
    public int field2424;

    @ObfuscatedName("ig.ao")
    public final int[] field2422;

    @ObfuscatedName("ig.ah")
    public final int[] field2425;

    @ObfuscatedName("ig.ar")
    public final int field2418;

    public class231(int arg0, int arg1) {
        this.field2421 = new int[arg0][arg1];
        this.field2419 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class318.method3444(var3 / 4);
        this.field2422 = new int[var4];
        this.field2425 = new int[var4];
        this.field2418 = var4 - 1;
    }

    @ObfuscatedName("ig.ac(B)V")
    public void method3984() {
        for (int var1 = 0; var1 < this.field2421.length; var1++) {
            for (int var2 = 0; var2 < this.field2421[var1].length; var2++) {
                this.field2421[var1][var2] = 0;
                this.field2419[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("ig.al(IIB)V")
    public void method3985(int arg0, int arg1) {
        this.field2420 = arg0;
        this.field2424 = arg1;
    }

    @ObfuscatedName("ig.ak(S)I")
    public int method3986() {
        return this.field2420;
    }

    @ObfuscatedName("ig.ax(S)I")
    public int method3987() {
        return this.field2424;
    }

    @ObfuscatedName("ig.ao(I)I")
    public int method4021() {
        return this.field2421.length;
    }

    @ObfuscatedName("ig.ah(I)I")
    public int method3989() {
        return this.field2421[0].length;
    }

    @ObfuscatedName("ig.ar(I)[[I")
    public int[][] method3990() {
        return this.field2421;
    }

    @ObfuscatedName("ig.ab(B)[[I")
    public int[][] method3991() {
        return this.field2419;
    }

    @ObfuscatedName("ig.am(B)[I")
    public int[] method3992() {
        return this.field2422;
    }

    @ObfuscatedName("ig.av(I)[I")
    public int[] method3993() {
        return this.field2425;
    }

    @ObfuscatedName("ig.ag(I)I")
    public int method3994() {
        return this.field2418;
    }
}
