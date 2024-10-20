package deob;

@ObfuscatedName("gi")
public class class196 extends class387 {

    @ObfuscatedName("gi.s")
    public int field2284;

    @ObfuscatedName("gi.j")
    public int field2288;

    @ObfuscatedName("gi.w")
    public int[] field2289;

    @ObfuscatedName("gi.n")
    public int[][] field2290;

    @ObfuscatedName("gi.r")
    public class195 field2291;

    public class196(int arg0, byte[] arg1) {
        this.field2284 = arg0;
        class419 var3 = new class419(arg1);
        this.field2288 = var3.method6781();
        this.field2289 = new int[this.field2288];
        this.field2290 = new int[this.field2288][];
        for (int var4 = 0; var4 < this.field2288; var4++) {
            this.field2289[var4] = var3.method6781();
        }
        for (int var5 = 0; var5 < this.field2288; var5++) {
            this.field2290[var5] = new int[var3.method6781()];
        }
        for (int var6 = 0; var6 < this.field2288; var6++) {
            for (int var7 = 0; var7 < this.field2290[var6].length; var7++) {
                this.field2290[var6][var7] = var3.method6781();
            }
        }
        if (var3.field4475 < var3.field4477.length) {
            int var8 = var3.method6672();
            if (var8 > 0) {
                this.field2291 = new class195(var3, var8);
            }
        }
    }

    @ObfuscatedName("gi.c(I)I")
    public int method3633() {
        return this.field2288;
    }

    @ObfuscatedName("gi.b(I)Lgq;")
    public class195 method3627() {
        return this.field2291;
    }
}
