package deob;

@ObfuscatedName("ce")
public class class95 extends class183 {

    @ObfuscatedName("ce.e")
    public int field1644;

    @ObfuscatedName("ce.p")
    public int field1641;

    @ObfuscatedName("ce.a")
    public int[] field1647;

    @ObfuscatedName("ce.g")
    public int[][] field1648;

    public class95(int arg0, byte[] arg1) {
        this.field1644 = arg0;
        class107 var3 = new class107(arg1);
        this.field1641 = var3.method2125();
        this.field1647 = new int[this.field1641];
        this.field1648 = new int[this.field1641][];
        for (int var4 = 0; var4 < this.field1641; var4++) {
            this.field1647[var4] = var3.method2125();
        }
        for (int var5 = 0; var5 < this.field1641; var5++) {
            this.field1648[var5] = new int[var3.method2125()];
        }
        for (int var6 = 0; var6 < this.field1641; var6++) {
            for (int var7 = 0; var7 < this.field1648[var6].length; var7++) {
                this.field1648[var6][var7] = var3.method2125();
            }
        }
    }
}
