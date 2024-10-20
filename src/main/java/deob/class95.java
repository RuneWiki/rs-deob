package deob;

@ObfuscatedName("cc")
public class class95 extends class187 {

    @ObfuscatedName("cc.g")
    public int field1678;

    @ObfuscatedName("cc.s")
    public int field1675;

    @ObfuscatedName("cc.v")
    public int[] field1676;

    @ObfuscatedName("cc.o")
    public int[][] field1677;

    public class95(int arg0, byte[] arg1) {
        this.field1678 = arg0;
        class107 var3 = new class107(arg1);
        this.field1675 = var3.method2116();
        this.field1676 = new int[this.field1675];
        this.field1677 = new int[this.field1675][];
        for (int var4 = 0; var4 < this.field1675; var4++) {
            this.field1676[var4] = var3.method2116();
        }
        for (int var5 = 0; var5 < this.field1675; var5++) {
            this.field1677[var5] = new int[var3.method2116()];
        }
        for (int var6 = 0; var6 < this.field1675; var6++) {
            for (int var7 = 0; var7 < this.field1677[var6].length; var7++) {
                this.field1677[var6][var7] = var3.method2116();
            }
        }
    }
}
