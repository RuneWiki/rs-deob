package deob;

@ObfuscatedName("ee")
public class class133 extends class181 {

    @ObfuscatedName("ee.a")
    public int field1776;

    @ObfuscatedName("ee.t")
    public int field1774;

    @ObfuscatedName("ee.n")
    public int[] field1777;

    @ObfuscatedName("ee.q")
    public int[][] field1773;

    public class133(int arg0, byte[] arg1) {
        this.field1776 = arg0;
        class300 var3 = new class300(arg1);
        this.field1774 = var3.method5123();
        this.field1777 = new int[this.field1774];
        this.field1773 = new int[this.field1774][];
        for (int var4 = 0; var4 < this.field1774; var4++) {
            this.field1777[var4] = var3.method5123();
        }
        for (int var5 = 0; var5 < this.field1774; var5++) {
            this.field1773[var5] = new int[var3.method5123()];
        }
        for (int var6 = 0; var6 < this.field1774; var6++) {
            for (int var7 = 0; var7 < this.field1773[var6].length; var7++) {
                this.field1773[var6][var7] = var3.method5123();
            }
        }
    }
}
