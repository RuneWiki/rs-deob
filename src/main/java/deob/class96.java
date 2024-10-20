package deob;

@ObfuscatedName("cu")
public class class96 extends class189 {

    @ObfuscatedName("cu.x")
    public int field1667;

    @ObfuscatedName("cu.v")
    public int field1665;

    @ObfuscatedName("cu.m")
    public int[] field1666;

    @ObfuscatedName("cu.e")
    public int[][] field1664;

    public class96(int arg0, byte[] arg1) {
        this.field1667 = arg0;
        class108 var3 = new class108(arg1);
        this.field1665 = var3.method2299();
        this.field1666 = new int[this.field1665];
        this.field1664 = new int[this.field1665][];
        for (int var4 = 0; var4 < this.field1665; var4++) {
            this.field1666[var4] = var3.method2299();
        }
        for (int var5 = 0; var5 < this.field1665; var5++) {
            this.field1664[var5] = new int[var3.method2299()];
        }
        for (int var6 = 0; var6 < this.field1665; var6++) {
            for (int var7 = 0; var7 < this.field1664[var6].length; var7++) {
                this.field1664[var6][var7] = var3.method2299();
            }
        }
    }
}
