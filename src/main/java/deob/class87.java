package deob;

@ObfuscatedName("cj")
public class class87 extends class128 {

    @ObfuscatedName("cj.q")
    public int field1484;

    @ObfuscatedName("cj.d")
    public int field1482;

    @ObfuscatedName("cj.h")
    public int[] field1485;

    @ObfuscatedName("cj.p")
    public int[][] field1483;

    public class87(int arg0, byte[] arg1) {
        this.field1484 = arg0;
        class154 var3 = new class154(arg1);
        this.field1482 = var3.method2666();
        this.field1485 = new int[this.field1482];
        this.field1483 = new int[this.field1482][];
        for (int var4 = 0; var4 < this.field1482; var4++) {
            this.field1485[var4] = var3.method2666();
        }
        for (int var5 = 0; var5 < this.field1482; var5++) {
            this.field1483[var5] = new int[var3.method2666()];
        }
        for (int var6 = 0; var6 < this.field1482; var6++) {
            for (int var7 = 0; var7 < this.field1483[var6].length; var7++) {
                this.field1483[var6][var7] = var3.method2666();
            }
        }
    }
}
