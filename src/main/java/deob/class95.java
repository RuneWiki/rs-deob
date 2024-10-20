package deob;

@ObfuscatedName("cs")
public class class95 extends class186 {

    @ObfuscatedName("cs.i")
    public int field1659;

    @ObfuscatedName("cs.c")
    public int field1655;

    @ObfuscatedName("cs.h")
    public int[] field1656;

    @ObfuscatedName("cs.v")
    public int[][] field1660;

    public class95(int arg0, byte[] arg1) {
        this.field1659 = arg0;
        class107 var3 = new class107(arg1);
        this.field1655 = var3.method2151();
        this.field1656 = new int[this.field1655];
        this.field1660 = new int[this.field1655][];
        for (int var4 = 0; var4 < this.field1655; var4++) {
            this.field1656[var4] = var3.method2151();
        }
        for (int var5 = 0; var5 < this.field1655; var5++) {
            this.field1660[var5] = new int[var3.method2151()];
        }
        for (int var6 = 0; var6 < this.field1655; var6++) {
            for (int var7 = 0; var7 < this.field1660[var6].length; var7++) {
                this.field1660[var6][var7] = var3.method2151();
            }
        }
    }
}
