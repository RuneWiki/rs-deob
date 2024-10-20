package deob;

@ObfuscatedName("ce")
public class class87 extends class128 {

    @ObfuscatedName("ce.b")
    public int field1461;

    @ObfuscatedName("ce.l")
    public int field1453;

    @ObfuscatedName("ce.i")
    public int[] field1457;

    @ObfuscatedName("ce.t")
    public int[][] field1455;

    public class87(int arg0, byte[] arg1) {
        this.field1461 = arg0;
        class154 var3 = new class154(arg1);
        this.field1453 = var3.method2678();
        this.field1457 = new int[this.field1453];
        this.field1455 = new int[this.field1453][];
        for (int var4 = 0; var4 < this.field1453; var4++) {
            this.field1457[var4] = var3.method2678();
        }
        for (int var5 = 0; var5 < this.field1453; var5++) {
            this.field1455[var5] = new int[var3.method2678()];
        }
        for (int var6 = 0; var6 < this.field1453; var6++) {
            for (int var7 = 0; var7 < this.field1455[var6].length; var7++) {
                this.field1455[var6][var7] = var3.method2678();
            }
        }
    }
}
