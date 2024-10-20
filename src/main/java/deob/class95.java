package deob;

@ObfuscatedName("ca")
public class class95 extends class187 {

    @ObfuscatedName("ca.p")
    public int field1670;

    @ObfuscatedName("ca.g")
    public int field1663;

    @ObfuscatedName("ca.x")
    public int[] field1664;

    @ObfuscatedName("ca.c")
    public int[][] field1671;

    public class95(int arg0, byte[] arg1) {
        this.field1670 = arg0;
        class107 var3 = new class107(arg1);
        this.field1663 = var3.method2173();
        this.field1664 = new int[this.field1663];
        this.field1671 = new int[this.field1663][];
        for (int var4 = 0; var4 < this.field1663; var4++) {
            this.field1664[var4] = var3.method2173();
        }
        for (int var5 = 0; var5 < this.field1663; var5++) {
            this.field1671[var5] = new int[var3.method2173()];
        }
        for (int var6 = 0; var6 < this.field1663; var6++) {
            for (int var7 = 0; var7 < this.field1671[var6].length; var7++) {
                this.field1671[var6][var7] = var3.method2173();
            }
        }
    }
}
