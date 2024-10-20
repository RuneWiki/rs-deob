package deob;

@ObfuscatedName("cl")
public class class95 extends class184 {

    @ObfuscatedName("cl.z")
    public int field1640;

    @ObfuscatedName("cl.j")
    public int field1638;

    @ObfuscatedName("cl.a")
    public int[] field1639;

    @ObfuscatedName("cl.y")
    public int[][] field1645;

    public class95(int arg0, byte[] arg1) {
        this.field1640 = arg0;
        class107 var3 = new class107(arg1);
        this.field1638 = var3.method2122();
        this.field1639 = new int[this.field1638];
        this.field1645 = new int[this.field1638][];
        for (int var4 = 0; var4 < this.field1638; var4++) {
            this.field1639[var4] = var3.method2122();
        }
        for (int var5 = 0; var5 < this.field1638; var5++) {
            this.field1645[var5] = new int[var3.method2122()];
        }
        for (int var6 = 0; var6 < this.field1638; var6++) {
            for (int var7 = 0; var7 < this.field1645[var6].length; var7++) {
                this.field1645[var6][var7] = var3.method2122();
            }
        }
    }
}
