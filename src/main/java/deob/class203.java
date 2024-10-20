package deob;

@ObfuscatedName("ge")
public class class203 extends class411 {

    @ObfuscatedName("ge.q")
    public int field2374;

    @ObfuscatedName("ge.i")
    public int field2375;

    @ObfuscatedName("ge.k")
    public int[] field2377;

    @ObfuscatedName("ge.o")
    public int[][] field2373;

    @ObfuscatedName("ge.n")
    public class202 field2371;

    public class203(int arg0, byte[] arg1) {
        this.field2374 = arg0;
        class444 var3 = new class444(arg1);
        this.field2375 = var3.method6929();
        this.field2377 = new int[this.field2375];
        this.field2373 = new int[this.field2375][];
        for (int var4 = 0; var4 < this.field2375; var4++) {
            this.field2377[var4] = var3.method6929();
        }
        for (int var5 = 0; var5 < this.field2375; var5++) {
            this.field2373[var5] = new int[var3.method6929()];
        }
        for (int var6 = 0; var6 < this.field2375; var6++) {
            for (int var7 = 0; var7 < this.field2373[var6].length; var7++) {
                this.field2373[var6][var7] = var3.method6929();
            }
        }
        if (var3.field4708 < var3.field4707.length) {
            int var8 = var3.method7120();
            if (var8 > 0) {
                this.field2371 = new class202(var3, var8);
            }
        }
    }

    @ObfuscatedName("ge.s(B)I")
    public int method3700() {
        return this.field2375;
    }

    @ObfuscatedName("ge.h(B)Lgd;")
    public class202 method3702() {
        return this.field2371;
    }
}
