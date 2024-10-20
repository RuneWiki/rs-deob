package deob;

@ObfuscatedName("jl")
public class class261 extends class202 {

    @ObfuscatedName("jl.x")
    public static class197 field3467 = new class197(64);

    @ObfuscatedName("jl.k")
    public char field3465;

    @ObfuscatedName("jl.z")
    public char field3471;

    @ObfuscatedName("jl.v")
    public String field3469 = "null";

    @ObfuscatedName("jl.m")
    public int field3470;

    @ObfuscatedName("jl.b")
    public int field3474 = 0;

    @ObfuscatedName("jl.t")
    public int[] field3472;

    @ObfuscatedName("jl.p")
    public int[] field3473;

    @ObfuscatedName("jl.r")
    public String[] field3468;

    @ObfuscatedName("jl.d(Lfr;I)V")
    public void method4298(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4299(arg0, var2);
        }
    }

    @ObfuscatedName("jl.x(Lfr;II)V")
    public void method4299(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3465 = (char) arg0.method3204();
        } else if (arg1 == 2) {
            this.field3471 = (char) arg0.method3204();
        } else if (arg1 == 3) {
            this.field3469 = arg0.method3045();
        } else if (arg1 == 4) {
            this.field3470 = arg0.method3041();
        } else if (arg1 == 5) {
            this.field3474 = arg0.method3179();
            this.field3472 = new int[this.field3474];
            this.field3468 = new String[this.field3474];
            for (int var3 = 0; var3 < this.field3474; var3++) {
                this.field3472[var3] = arg0.method3041();
                this.field3468[var3] = arg0.method3045();
            }
        } else if (arg1 == 6) {
            this.field3474 = arg0.method3179();
            this.field3472 = new int[this.field3474];
            this.field3473 = new int[this.field3474];
            for (int var4 = 0; var4 < this.field3474; var4++) {
                this.field3472[var4] = arg0.method3041();
                this.field3473[var4] = arg0.method3041();
            }
        }
    }
}
