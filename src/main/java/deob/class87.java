package deob;

@ObfuscatedName("cp")
public class class87 extends class128 {

    @ObfuscatedName("cp.n")
    public int field1460;

    @ObfuscatedName("cp.d")
    public int field1462;

    @ObfuscatedName("cp.m")
    public int[] field1468;

    @ObfuscatedName("cp.h")
    public int[][] field1463;

    public class87(int arg0, byte[] arg1) {
        this.field1460 = arg0;
        class161 var3 = new class161(arg1);
        this.field1462 = var3.method2823();
        this.field1468 = new int[this.field1462];
        this.field1463 = new int[this.field1462][];
        for (int var4 = 0; var4 < this.field1462; var4++) {
            this.field1468[var4] = var3.method2823();
        }
        for (int var5 = 0; var5 < this.field1462; var5++) {
            this.field1463[var5] = new int[var3.method2823()];
        }
        for (int var6 = 0; var6 < this.field1462; var6++) {
            for (int var7 = 0; var7 < this.field1463[var6].length; var7++) {
                this.field1463[var6][var7] = var3.method2823();
            }
        }
    }
}
