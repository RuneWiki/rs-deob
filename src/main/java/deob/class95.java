package deob;

@ObfuscatedName("ce")
public class class95 extends class186 {

    @ObfuscatedName("ce.t")
    public int field1651;

    @ObfuscatedName("ce.o")
    public int field1649;

    @ObfuscatedName("ce.i")
    public int[] field1650;

    @ObfuscatedName("ce.p")
    public int[][] field1656;

    public class95(int arg0, byte[] arg1) {
        this.field1651 = arg0;
        class107 var3 = new class107(arg1);
        this.field1649 = var3.method2118();
        this.field1650 = new int[this.field1649];
        this.field1656 = new int[this.field1649][];
        for (int var4 = 0; var4 < this.field1649; var4++) {
            this.field1650[var4] = var3.method2118();
        }
        for (int var5 = 0; var5 < this.field1649; var5++) {
            this.field1656[var5] = new int[var3.method2118()];
        }
        for (int var6 = 0; var6 < this.field1649; var6++) {
            for (int var7 = 0; var7 < this.field1656[var6].length; var7++) {
                this.field1656[var6][var7] = var3.method2118();
            }
        }
    }
}
