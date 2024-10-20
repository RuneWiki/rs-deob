package deob;

@ObfuscatedName("gs")
public class class196 extends class392 {

    @ObfuscatedName("gs.o")
    public int field2297;

    @ObfuscatedName("gs.i")
    public int field2299;

    @ObfuscatedName("gs.w")
    public int[] field2300;

    @ObfuscatedName("gs.v")
    public int[][] field2301;

    @ObfuscatedName("gs.a")
    public class195 field2296;

    public class196(int arg0, byte[] arg1) {
        this.field2297 = arg0;
        class421 var3 = new class421(arg1);
        this.field2299 = var3.method6686();
        this.field2300 = new int[this.field2299];
        this.field2301 = new int[this.field2299][];
        for (int var4 = 0; var4 < this.field2299; var4++) {
            this.field2300[var4] = var3.method6686();
        }
        for (int var5 = 0; var5 < this.field2299; var5++) {
            this.field2301[var5] = new int[var3.method6686()];
        }
        for (int var6 = 0; var6 < this.field2299; var6++) {
            for (int var7 = 0; var7 < this.field2301[var6].length; var7++) {
                this.field2301[var6][var7] = var3.method6686();
            }
        }
        if (var3.field4512 < var3.field4511.length) {
            int var8 = var3.method6666();
            if (var8 > 0) {
                this.field2296 = new class195(var3, var8);
            }
        }
    }

    @ObfuscatedName("gs.c(I)I")
    public int method3562() {
        return this.field2299;
    }

    @ObfuscatedName("gs.l(I)Lga;")
    public class195 method3563() {
        return this.field2296;
    }
}
