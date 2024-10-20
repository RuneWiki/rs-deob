package deob;

@ObfuscatedName("ha")
public class class219 extends class440 {

    @ObfuscatedName("ha.j")
    public int field2525;

    @ObfuscatedName("ha.i")
    public int field2526;

    @ObfuscatedName("ha.n")
    public int[] field2527;

    @ObfuscatedName("ha.l")
    public int[][] field2532;

    @ObfuscatedName("ha.k")
    public class218 field2524;

    public class219(int arg0, byte[] arg1) {
        this.field2525 = arg0;
        class474 var3 = new class474(arg1);
        this.field2526 = var3.method7964();
        this.field2527 = new int[this.field2526];
        this.field2532 = new int[this.field2526][];
        for (int var4 = 0; var4 < this.field2526; var4++) {
            this.field2527[var4] = var3.method7964();
        }
        for (int var5 = 0; var5 < this.field2526; var5++) {
            this.field2532[var5] = new int[var3.method7964()];
        }
        for (int var6 = 0; var6 < this.field2526; var6++) {
            for (int var7 = 0; var7 < this.field2532[var6].length; var7++) {
                this.field2532[var6][var7] = var3.method7964();
            }
        }
        if (var3.field4939 < var3.field4936.length) {
            int var8 = var3.method8032();
            if (var8 > 0) {
                this.field2524 = new class218(var3, var8);
            }
        }
    }

    @ObfuscatedName("ha.f(I)I")
    public int method4102() {
        return this.field2526;
    }

    @ObfuscatedName("ha.w(I)Lhk;")
    public class218 method4106() {
        return this.field2524;
    }
}
