package deob;

@ObfuscatedName("cj")
public class class87 extends class128 {

    @ObfuscatedName("cj.u")
    public int field1464;

    @ObfuscatedName("cj.x")
    public int field1461;

    @ObfuscatedName("cj.i")
    public int[] field1463;

    @ObfuscatedName("cj.a")
    public int[][] field1462;

    public class87(int arg0, byte[] arg1) {
        this.field1464 = arg0;
        class154 var3 = new class154(arg1);
        this.field1461 = var3.method2708();
        this.field1463 = new int[this.field1461];
        this.field1462 = new int[this.field1461][];
        for (int var4 = 0; var4 < this.field1461; var4++) {
            this.field1463[var4] = var3.method2708();
        }
        for (int var5 = 0; var5 < this.field1461; var5++) {
            this.field1462[var5] = new int[var3.method2708()];
        }
        for (int var6 = 0; var6 < this.field1461; var6++) {
            for (int var7 = 0; var7 < this.field1462[var6].length; var7++) {
                this.field1462[var6][var7] = var3.method2708();
            }
        }
    }
}
