package deob;

@ObfuscatedName("ha")
public class class233 extends class409 {

    @ObfuscatedName("ha.n")
    public int field2587;

    @ObfuscatedName("ha.s")
    public int field2588;

    @ObfuscatedName("ha.l")
    public int[] field2583;

    @ObfuscatedName("ha.q")
    public int[][] field2590;

    @ObfuscatedName("ha.o")
    public class232 field2591;

    public class233(int arg0, byte[] arg1) {
        this.field2587 = arg0;
        class438 var3 = new class438(arg1);
        this.field2588 = var3.method6971();
        this.field2583 = new int[this.field2588];
        this.field2590 = new int[this.field2588][];
        for (int var4 = 0; var4 < this.field2588; var4++) {
            this.field2583[var4] = var3.method6971();
        }
        for (int var5 = 0; var5 < this.field2588; var5++) {
            this.field2590[var5] = new int[var3.method6971()];
        }
        for (int var6 = 0; var6 < this.field2588; var6++) {
            for (int var7 = 0; var7 < this.field2590[var6].length; var7++) {
                this.field2590[var6][var7] = var3.method6971();
            }
        }
        if (var3.field4621 < var3.field4618.length) {
            int var8 = var3.method7148();
            if (var8 > 0) {
                this.field2591 = new class232(var3, var8);
            }
        }
    }

    @ObfuscatedName("ha.v(B)I")
    public int method4242() {
        return this.field2588;
    }

    @ObfuscatedName("ha.c(I)Lhk;")
    public class232 method4243() {
        return this.field2591;
    }
}
