package deob;

@ObfuscatedName("eb")
public class class139 extends class193 {

    @ObfuscatedName("eb.a")
    public int field2051;

    @ObfuscatedName("eb.j")
    public int field2047;

    @ObfuscatedName("eb.n")
    public int[] field2049;

    @ObfuscatedName("eb.r")
    public int[][] field2048;

    public class139(int arg0, byte[] arg1) {
        this.field2051 = arg0;
        class174 var3 = new class174(arg1);
        this.field2047 = var3.method2871();
        this.field2049 = new int[this.field2047];
        this.field2048 = new int[this.field2047][];
        for (int var4 = 0; var4 < this.field2047; var4++) {
            this.field2049[var4] = var3.method2871();
        }
        for (int var5 = 0; var5 < this.field2047; var5++) {
            this.field2048[var5] = new int[var3.method2871()];
        }
        for (int var6 = 0; var6 < this.field2047; var6++) {
            for (int var7 = 0; var7 < this.field2048[var6].length; var7++) {
                this.field2048[var6][var7] = var3.method2871();
            }
        }
    }
}
