package deob;

@ObfuscatedName("ci")
public class class95 extends class187 {

    @ObfuscatedName("ci.g")
    public int field1656;

    @ObfuscatedName("ci.s")
    public int field1659;

    @ObfuscatedName("ci.h")
    public int[] field1657;

    @ObfuscatedName("ci.m")
    public int[][] field1658;

    public class95(int arg0, byte[] arg1) {
        this.field1656 = arg0;
        class107 var3 = new class107(arg1);
        this.field1659 = var3.method2101();
        this.field1657 = new int[this.field1659];
        this.field1658 = new int[this.field1659][];
        for (int var4 = 0; var4 < this.field1659; var4++) {
            this.field1657[var4] = var3.method2101();
        }
        for (int var5 = 0; var5 < this.field1659; var5++) {
            this.field1658[var5] = new int[var3.method2101()];
        }
        for (int var6 = 0; var6 < this.field1659; var6++) {
            for (int var7 = 0; var7 < this.field1658[var6].length; var7++) {
                this.field1658[var6][var7] = var3.method2101();
            }
        }
    }
}
