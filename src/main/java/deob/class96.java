package deob;

@ObfuscatedName("cr")
public class class96 extends class191 {

    @ObfuscatedName("cr.p")
    public int field1658;

    @ObfuscatedName("cr.y")
    public int field1657;

    @ObfuscatedName("cr.d")
    public int[] field1656;

    @ObfuscatedName("cr.c")
    public int[][] field1654;

    public class96(int arg0, byte[] arg1) {
        this.field1658 = arg0;
        class110 var3 = new class110(arg1);
        this.field1657 = var3.method2309();
        this.field1656 = new int[this.field1657];
        this.field1654 = new int[this.field1657][];
        for (int var4 = 0; var4 < this.field1657; var4++) {
            this.field1656[var4] = var3.method2309();
        }
        for (int var5 = 0; var5 < this.field1657; var5++) {
            this.field1654[var5] = new int[var3.method2309()];
        }
        for (int var6 = 0; var6 < this.field1657; var6++) {
            for (int var7 = 0; var7 < this.field1654[var6].length; var7++) {
                this.field1654[var6][var7] = var3.method2309();
            }
        }
    }
}
