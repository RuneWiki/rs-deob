package deob;

@ObfuscatedName("cp")
public class class95 extends class183 {

    @ObfuscatedName("cp.y")
    public int field1670;

    @ObfuscatedName("cp.u")
    public int field1659;

    @ObfuscatedName("cp.k")
    public int[] field1658;

    @ObfuscatedName("cp.v")
    public int[][] field1660;

    public class95(int arg0, byte[] arg1) {
        this.field1670 = arg0;
        class107 var3 = new class107(arg1);
        this.field1659 = var3.method2109();
        this.field1658 = new int[this.field1659];
        this.field1660 = new int[this.field1659][];
        for (int var4 = 0; var4 < this.field1659; var4++) {
            this.field1658[var4] = var3.method2109();
        }
        for (int var5 = 0; var5 < this.field1659; var5++) {
            this.field1660[var5] = new int[var3.method2109()];
        }
        for (int var6 = 0; var6 < this.field1659; var6++) {
            for (int var7 = 0; var7 < this.field1660[var6].length; var7++) {
                this.field1660[var6][var7] = var3.method2109();
            }
        }
    }
}
