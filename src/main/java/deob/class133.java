package deob;

@ObfuscatedName("en")
public class class133 extends class181 {

    @ObfuscatedName("en.c")
    public int field1765;

    @ObfuscatedName("en.x")
    public int field1762;

    @ObfuscatedName("en.t")
    public int[] field1763;

    @ObfuscatedName("en.g")
    public int[][] field1764;

    public class133(int arg0, byte[] arg1) {
        this.field1765 = arg0;
        class300 var3 = new class300(arg1);
        this.field1762 = var3.method5103();
        this.field1763 = new int[this.field1762];
        this.field1764 = new int[this.field1762][];
        for (int var4 = 0; var4 < this.field1762; var4++) {
            this.field1763[var4] = var3.method5103();
        }
        for (int var5 = 0; var5 < this.field1762; var5++) {
            this.field1764[var5] = new int[var3.method5103()];
        }
        for (int var6 = 0; var6 < this.field1762; var6++) {
            for (int var7 = 0; var7 < this.field1764[var6].length; var7++) {
                this.field1764[var6][var7] = var3.method5103();
            }
        }
    }
}
