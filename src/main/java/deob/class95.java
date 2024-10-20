package deob;

@ObfuscatedName("cm")
public class class95 extends class184 {

    @ObfuscatedName("cm.b")
    public int field1657;

    @ObfuscatedName("cm.u")
    public int field1656;

    @ObfuscatedName("cm.x")
    public int[] field1658;

    @ObfuscatedName("cm.j")
    public int[][] field1659;

    public class95(int arg0, byte[] arg1) {
        this.field1657 = arg0;
        class107 var3 = new class107(arg1);
        this.field1656 = var3.method2134();
        this.field1658 = new int[this.field1656];
        this.field1659 = new int[this.field1656][];
        for (int var4 = 0; var4 < this.field1656; var4++) {
            this.field1658[var4] = var3.method2134();
        }
        for (int var5 = 0; var5 < this.field1656; var5++) {
            this.field1659[var5] = new int[var3.method2134()];
        }
        for (int var6 = 0; var6 < this.field1656; var6++) {
            for (int var7 = 0; var7 < this.field1659[var6].length; var7++) {
                this.field1659[var6][var7] = var3.method2134();
            }
        }
    }
}
