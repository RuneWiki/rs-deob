package deob;

@ObfuscatedName("gf")
public class class204 extends class411 {

    @ObfuscatedName("gf.m")
    public int field2412;

    @ObfuscatedName("gf.p")
    public int field2413;

    @ObfuscatedName("gf.s")
    public int[] field2408;

    @ObfuscatedName("gf.r")
    public int[][] field2414;

    @ObfuscatedName("gf.v")
    public class203 field2410;

    public class204(int arg0, byte[] arg1) {
        this.field2412 = arg0;
        class440 var3 = new class440(arg1);
        this.field2413 = var3.method7071();
        this.field2408 = new int[this.field2413];
        this.field2414 = new int[this.field2413][];
        for (int var4 = 0; var4 < this.field2413; var4++) {
            this.field2408[var4] = var3.method7071();
        }
        for (int var5 = 0; var5 < this.field2413; var5++) {
            this.field2414[var5] = new int[var3.method7071()];
        }
        for (int var6 = 0; var6 < this.field2413; var6++) {
            for (int var7 = 0; var7 < this.field2414[var6].length; var7++) {
                this.field2414[var6][var7] = var3.method7071();
            }
        }
        if (var3.field4678 < var3.field4679.length) {
            int var8 = var3.method7082();
            if (var8 > 0) {
                this.field2410 = new class203(var3, var8);
            }
        }
    }

    @ObfuscatedName("gf.o(I)I")
    public int method3715() {
        return this.field2413;
    }

    @ObfuscatedName("gf.q(I)Lgb;")
    public class203 method3720() {
        return this.field2410;
    }
}
