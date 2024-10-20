package deob;

@ObfuscatedName("ey")
public class class134 extends class106 {

    @ObfuscatedName("ey.h")
    public int field1718;

    @ObfuscatedName("ey.k")
    public int field1717;

    @ObfuscatedName("ey.r")
    public int[] field1719;

    @ObfuscatedName("ey.l")
    public int[][] field1720;

    public class134(int arg0, byte[] arg1) {
        this.field1718 = arg0;
        class135 var3 = new class135(arg1);
        this.field1717 = var3.method1571();
        this.field1719 = new int[this.field1717];
        this.field1720 = new int[this.field1717][];
        for (int var4 = 0; var4 < this.field1717; var4++) {
            this.field1719[var4] = var3.method1571();
        }
        for (int var5 = 0; var5 < this.field1717; var5++) {
            this.field1720[var5] = new int[var3.method1571()];
        }
        for (int var6 = 0; var6 < this.field1717; var6++) {
            for (int var7 = 0; var7 < this.field1720[var6].length; var7++) {
                this.field1720[var6][var7] = var3.method1571();
            }
        }
    }
}
