package deob;

@ObfuscatedName("ci")
public class class95 extends class186 {

    @ObfuscatedName("ci.g")
    public int field1653;

    @ObfuscatedName("ci.v")
    public int field1652;

    @ObfuscatedName("ci.z")
    public int[] field1657;

    @ObfuscatedName("ci.h")
    public int[][] field1654;

    public class95(int arg0, byte[] arg1) {
        this.field1653 = arg0;
        class107 var3 = new class107(arg1);
        this.field1652 = var3.method2139();
        this.field1657 = new int[this.field1652];
        this.field1654 = new int[this.field1652][];
        for (int var4 = 0; var4 < this.field1652; var4++) {
            this.field1657[var4] = var3.method2139();
        }
        for (int var5 = 0; var5 < this.field1652; var5++) {
            this.field1654[var5] = new int[var3.method2139()];
        }
        for (int var6 = 0; var6 < this.field1652; var6++) {
            for (int var7 = 0; var7 < this.field1654[var6].length; var7++) {
                this.field1654[var6][var7] = var3.method2139();
            }
        }
    }
}
