package deob;

@ObfuscatedName("ct")
public class class95 extends class186 {

    @ObfuscatedName("ct.k")
    public int field1669;

    @ObfuscatedName("ct.r")
    public int field1668;

    @ObfuscatedName("ct.y")
    public int[] field1671;

    @ObfuscatedName("ct.w")
    public int[][] field1670;

    public class95(int arg0, byte[] arg1) {
        this.field1669 = arg0;
        class107 var3 = new class107(arg1);
        this.field1668 = var3.method2111();
        this.field1671 = new int[this.field1668];
        this.field1670 = new int[this.field1668][];
        for (int var4 = 0; var4 < this.field1668; var4++) {
            this.field1671[var4] = var3.method2111();
        }
        for (int var5 = 0; var5 < this.field1668; var5++) {
            this.field1670[var5] = new int[var3.method2111()];
        }
        for (int var6 = 0; var6 < this.field1668; var6++) {
            for (int var7 = 0; var7 < this.field1670[var6].length; var7++) {
                this.field1670[var6][var7] = var3.method2111();
            }
        }
    }
}
