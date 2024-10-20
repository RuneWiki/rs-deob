package deob;

@ObfuscatedName("cs")
public class class95 extends class186 {

    @ObfuscatedName("cs.e")
    public int field1661;

    @ObfuscatedName("cs.o")
    public int field1659;

    @ObfuscatedName("cs.y")
    public int[] field1660;

    @ObfuscatedName("cs.b")
    public int[][] field1658;

    public class95(int arg0, byte[] arg1) {
        this.field1661 = arg0;
        class107 var3 = new class107(arg1);
        this.field1659 = var3.method2123();
        this.field1660 = new int[this.field1659];
        this.field1658 = new int[this.field1659][];
        for (int var4 = 0; var4 < this.field1659; var4++) {
            this.field1660[var4] = var3.method2123();
        }
        for (int var5 = 0; var5 < this.field1659; var5++) {
            this.field1658[var5] = new int[var3.method2123()];
        }
        for (int var6 = 0; var6 < this.field1659; var6++) {
            for (int var7 = 0; var7 < this.field1658[var6].length; var7++) {
                this.field1658[var6][var7] = var3.method2123();
            }
        }
    }
}
