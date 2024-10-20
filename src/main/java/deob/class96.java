package deob;

@ObfuscatedName("cu")
public class class96 extends class189 {

    @ObfuscatedName("cu.f")
    public int field1672;

    @ObfuscatedName("cu.k")
    public int field1671;

    @ObfuscatedName("cu.y")
    public int[] field1676;

    @ObfuscatedName("cu.e")
    public int[][] field1673;

    public class96(int arg0, byte[] arg1) {
        this.field1672 = arg0;
        class108 var3 = new class108(arg1);
        this.field1671 = var3.method2158();
        this.field1676 = new int[this.field1671];
        this.field1673 = new int[this.field1671][];
        for (int var4 = 0; var4 < this.field1671; var4++) {
            this.field1676[var4] = var3.method2158();
        }
        for (int var5 = 0; var5 < this.field1671; var5++) {
            this.field1673[var5] = new int[var3.method2158()];
        }
        for (int var6 = 0; var6 < this.field1671; var6++) {
            for (int var7 = 0; var7 < this.field1673[var6].length; var7++) {
                this.field1673[var6][var7] = var3.method2158();
            }
        }
    }
}
