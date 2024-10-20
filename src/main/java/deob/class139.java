package deob;

@ObfuscatedName("ed")
public class class139 extends class193 {

    @ObfuscatedName("ed.i")
    public int field2058;

    @ObfuscatedName("ed.w")
    public int field2059;

    @ObfuscatedName("ed.a")
    public int[] field2063;

    @ObfuscatedName("ed.t")
    public int[][] field2062;

    public class139(int arg0, byte[] arg1) {
        this.field2058 = arg0;
        class174 var3 = new class174(arg1);
        this.field2059 = var3.method3061();
        this.field2063 = new int[this.field2059];
        this.field2062 = new int[this.field2059][];
        for (int var4 = 0; var4 < this.field2059; var4++) {
            this.field2063[var4] = var3.method3061();
        }
        for (int var5 = 0; var5 < this.field2059; var5++) {
            this.field2062[var5] = new int[var3.method3061()];
        }
        for (int var6 = 0; var6 < this.field2059; var6++) {
            for (int var7 = 0; var7 < this.field2062[var6].length; var7++) {
                this.field2062[var6][var7] = var3.method3061();
            }
        }
    }
}
