package deob;

@ObfuscatedName("ch")
public class class96 extends class189 {

    @ObfuscatedName("ch.g")
    public int field1649;

    @ObfuscatedName("ch.j")
    public int field1646;

    @ObfuscatedName("ch.z")
    public int[] field1650;

    @ObfuscatedName("ch.b")
    public int[][] field1648;

    public class96(int arg0, byte[] arg1) {
        this.field1649 = arg0;
        class108 var3 = new class108(arg1);
        this.field1646 = var3.method2083();
        this.field1650 = new int[this.field1646];
        this.field1648 = new int[this.field1646][];
        for (int var4 = 0; var4 < this.field1646; var4++) {
            this.field1650[var4] = var3.method2083();
        }
        for (int var5 = 0; var5 < this.field1646; var5++) {
            this.field1648[var5] = new int[var3.method2083()];
        }
        for (int var6 = 0; var6 < this.field1646; var6++) {
            for (int var7 = 0; var7 < this.field1648[var6].length; var7++) {
                this.field1648[var6][var7] = var3.method2083();
            }
        }
    }
}
