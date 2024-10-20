package deob;

@ObfuscatedName("cb")
public class class95 extends class187 {

    @ObfuscatedName("cb.g")
    public int field1660;

    @ObfuscatedName("cb.i")
    public int field1659;

    @ObfuscatedName("cb.k")
    public int[] field1661;

    @ObfuscatedName("cb.e")
    public int[][] field1662;

    public class95(int arg0, byte[] arg1) {
        this.field1660 = arg0;
        class107 var3 = new class107(arg1);
        this.field1659 = var3.method2092();
        this.field1661 = new int[this.field1659];
        this.field1662 = new int[this.field1659][];
        for (int var4 = 0; var4 < this.field1659; var4++) {
            this.field1661[var4] = var3.method2092();
        }
        for (int var5 = 0; var5 < this.field1659; var5++) {
            this.field1662[var5] = new int[var3.method2092()];
        }
        for (int var6 = 0; var6 < this.field1659; var6++) {
            for (int var7 = 0; var7 < this.field1662[var6].length; var7++) {
                this.field1662[var6][var7] = var3.method2092();
            }
        }
    }
}
