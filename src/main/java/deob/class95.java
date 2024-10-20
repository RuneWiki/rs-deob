package deob;

@ObfuscatedName("cc")
public class class95 extends class187 {

    @ObfuscatedName("cc.k")
    public int field1641;

    @ObfuscatedName("cc.y")
    public int field1650;

    @ObfuscatedName("cc.s")
    public int[] field1642;

    @ObfuscatedName("cc.g")
    public int[][] field1643;

    public class95(int arg0, byte[] arg1) {
        this.field1641 = arg0;
        class107 var3 = new class107(arg1);
        this.field1650 = var3.method2138();
        this.field1642 = new int[this.field1650];
        this.field1643 = new int[this.field1650][];
        for (int var4 = 0; var4 < this.field1650; var4++) {
            this.field1642[var4] = var3.method2138();
        }
        for (int var5 = 0; var5 < this.field1650; var5++) {
            this.field1643[var5] = new int[var3.method2138()];
        }
        for (int var6 = 0; var6 < this.field1650; var6++) {
            for (int var7 = 0; var7 < this.field1643[var6].length; var7++) {
                this.field1643[var6][var7] = var3.method2138();
            }
        }
    }
}
