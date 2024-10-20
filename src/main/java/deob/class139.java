package deob;

@ObfuscatedName("eu")
public class class139 extends class193 {

    @ObfuscatedName("eu.p")
    public int field2058;

    @ObfuscatedName("eu.m")
    public int field2050;

    @ObfuscatedName("eu.e")
    public int[] field2051;

    @ObfuscatedName("eu.t")
    public int[][] field2053;

    public class139(int arg0, byte[] arg1) {
        this.field2058 = arg0;
        class174 var3 = new class174(arg1);
        this.field2050 = var3.method2810();
        this.field2051 = new int[this.field2050];
        this.field2053 = new int[this.field2050][];
        for (int var4 = 0; var4 < this.field2050; var4++) {
            this.field2051[var4] = var3.method2810();
        }
        for (int var5 = 0; var5 < this.field2050; var5++) {
            this.field2053[var5] = new int[var3.method2810()];
        }
        for (int var6 = 0; var6 < this.field2050; var6++) {
            for (int var7 = 0; var7 < this.field2053[var6].length; var7++) {
                this.field2053[var6][var7] = var3.method2810();
            }
        }
    }
}
