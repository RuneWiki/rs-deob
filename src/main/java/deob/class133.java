package deob;

@ObfuscatedName("ek")
public class class133 extends class188 {

    @ObfuscatedName("ek.f")
    public int field1772;

    @ObfuscatedName("ek.i")
    public int field1774;

    @ObfuscatedName("ek.y")
    public int[] field1773;

    @ObfuscatedName("ek.w")
    public int[][] field1776;

    public class133(int arg0, byte[] arg1) {
        this.field1772 = arg0;
        class300 var3 = new class300(arg1);
        this.field1774 = var3.method5110();
        this.field1773 = new int[this.field1774];
        this.field1776 = new int[this.field1774][];
        for (int var4 = 0; var4 < this.field1774; var4++) {
            this.field1773[var4] = var3.method5110();
        }
        for (int var5 = 0; var5 < this.field1774; var5++) {
            this.field1776[var5] = new int[var3.method5110()];
        }
        for (int var6 = 0; var6 < this.field1774; var6++) {
            for (int var7 = 0; var7 < this.field1776[var6].length; var7++) {
                this.field1776[var6][var7] = var3.method5110();
            }
        }
    }
}
