package deob;

@ObfuscatedName("ei")
public class class142 extends class190 {

    @ObfuscatedName("ei.f")
    public int field1824;

    @ObfuscatedName("ei.b")
    public int field1825;

    @ObfuscatedName("ei.l")
    public int[] field1827;

    @ObfuscatedName("ei.m")
    public int[][] field1826;

    public class142(int arg0, byte[] arg1) {
        this.field1824 = arg0;
        class311 var3 = new class311(arg1);
        this.field1825 = var3.method5276();
        this.field1827 = new int[this.field1825];
        this.field1826 = new int[this.field1825][];
        for (int var4 = 0; var4 < this.field1825; var4++) {
            this.field1827[var4] = var3.method5276();
        }
        for (int var5 = 0; var5 < this.field1825; var5++) {
            this.field1826[var5] = new int[var3.method5276()];
        }
        for (int var6 = 0; var6 < this.field1825; var6++) {
            for (int var7 = 0; var7 < this.field1826[var6].length; var7++) {
                this.field1826[var6][var7] = var3.method5276();
            }
        }
    }
}
