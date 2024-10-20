package deob;

@ObfuscatedName("cp")
public class class87 extends class128 {

    @ObfuscatedName("cp.x")
    public int field1471;

    @ObfuscatedName("cp.n")
    public int field1473;

    @ObfuscatedName("cp.g")
    public int[] field1472;

    @ObfuscatedName("cp.v")
    public int[][] field1474;

    public class87(int arg0, byte[] arg1) {
        this.field1471 = arg0;
        class154 var3 = new class154(arg1);
        this.field1473 = var3.method2878();
        this.field1472 = new int[this.field1473];
        this.field1474 = new int[this.field1473][];
        for (int var4 = 0; var4 < this.field1473; var4++) {
            this.field1472[var4] = var3.method2878();
        }
        for (int var5 = 0; var5 < this.field1473; var5++) {
            this.field1474[var5] = new int[var3.method2878()];
        }
        for (int var6 = 0; var6 < this.field1473; var6++) {
            for (int var7 = 0; var7 < this.field1474[var6].length; var7++) {
                this.field1474[var6][var7] = var3.method2878();
            }
        }
    }
}
