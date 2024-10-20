package deob;

@ObfuscatedName("ce")
public class class95 extends class187 {

    @ObfuscatedName("ce.n")
    public int field1637;

    @ObfuscatedName("ce.x")
    public int field1636;

    @ObfuscatedName("ce.k")
    public int[] field1638;

    @ObfuscatedName("ce.i")
    public int[][] field1639;

    public class95(int arg0, byte[] arg1) {
        this.field1637 = arg0;
        class107 var3 = new class107(arg1);
        this.field1636 = var3.method2148();
        this.field1638 = new int[this.field1636];
        this.field1639 = new int[this.field1636][];
        for (int var4 = 0; var4 < this.field1636; var4++) {
            this.field1638[var4] = var3.method2148();
        }
        for (int var5 = 0; var5 < this.field1636; var5++) {
            this.field1639[var5] = new int[var3.method2148()];
        }
        for (int var6 = 0; var6 < this.field1636; var6++) {
            for (int var7 = 0; var7 < this.field1639[var6].length; var7++) {
                this.field1639[var6][var7] = var3.method2148();
            }
        }
    }
}
