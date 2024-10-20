package deob;

@ObfuscatedName("gb")
public class class198 extends class353 {

    @ObfuscatedName("gb.f")
    public int field2289;

    @ObfuscatedName("gb.e")
    public int field2290;

    @ObfuscatedName("gb.v")
    public int[] field2288;

    @ObfuscatedName("gb.y")
    public int[][] field2287;

    public class198(int arg0, byte[] arg1) {
        this.field2289 = arg0;
        class384 var3 = new class384(arg1);
        this.field2290 = var3.method5902();
        this.field2288 = new int[this.field2290];
        this.field2287 = new int[this.field2290][];
        for (int var4 = 0; var4 < this.field2290; var4++) {
            this.field2288[var4] = var3.method5902();
        }
        for (int var5 = 0; var5 < this.field2290; var5++) {
            this.field2287[var5] = new int[var3.method5902()];
        }
        for (int var6 = 0; var6 < this.field2290; var6++) {
            for (int var7 = 0; var7 < this.field2287[var6].length; var7++) {
                this.field2287[var6][var7] = var3.method5902();
            }
        }
    }
}
