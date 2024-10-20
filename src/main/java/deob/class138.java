package deob;

@ObfuscatedName("ej")
public class class138 extends class200 {

    @ObfuscatedName("ej.m")
    public int field1967;

    @ObfuscatedName("ej.p")
    public int field1968;

    @ObfuscatedName("ej.i")
    public int[] field1965;

    @ObfuscatedName("ej.j")
    public int[][] field1966;

    public class138(int arg0, byte[] arg1) {
        this.field1967 = arg0;
        class181 var3 = new class181(arg1);
        this.field1968 = var3.method3012();
        this.field1965 = new int[this.field1968];
        this.field1966 = new int[this.field1968][];
        for (int var4 = 0; var4 < this.field1968; var4++) {
            this.field1965[var4] = var3.method3012();
        }
        for (int var5 = 0; var5 < this.field1968; var5++) {
            this.field1966[var5] = new int[var3.method3012()];
        }
        for (int var6 = 0; var6 < this.field1968; var6++) {
            for (int var7 = 0; var7 < this.field1966[var6].length; var7++) {
                this.field1966[var6][var7] = var3.method3012();
            }
        }
    }
}
