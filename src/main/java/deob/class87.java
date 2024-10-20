package deob;

@ObfuscatedName("ck")
public class class87 extends class128 {

    @ObfuscatedName("ck.x")
    public int field1486;

    @ObfuscatedName("ck.j")
    public int field1483;

    @ObfuscatedName("ck.c")
    public int[] field1479;

    @ObfuscatedName("ck.d")
    public int[][] field1480;

    public class87(int arg0, byte[] arg1) {
        this.field1486 = arg0;
        class154 var3 = new class154(arg1);
        this.field1483 = var3.method2701();
        this.field1479 = new int[this.field1483];
        this.field1480 = new int[this.field1483][];
        for (int var4 = 0; var4 < this.field1483; var4++) {
            this.field1479[var4] = var3.method2701();
        }
        for (int var5 = 0; var5 < this.field1483; var5++) {
            this.field1480[var5] = new int[var3.method2701()];
        }
        for (int var6 = 0; var6 < this.field1483; var6++) {
            for (int var7 = 0; var7 < this.field1480[var6].length; var7++) {
                this.field1480[var6][var7] = var3.method2701();
            }
        }
    }
}
