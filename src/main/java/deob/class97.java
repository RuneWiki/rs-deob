package deob;

@ObfuscatedName("cn")
public class class97 extends class199 {

    @ObfuscatedName("cn.t")
    public int field1678;

    @ObfuscatedName("cn.b")
    public int field1679;

    @ObfuscatedName("cn.p")
    public int[] field1680;

    @ObfuscatedName("cn.e")
    public int[][] field1681;

    public class97(int arg0, byte[] arg1) {
        this.field1678 = arg0;
        class111 var3 = new class111(arg1);
        this.field1679 = var3.method2172();
        this.field1680 = new int[this.field1679];
        this.field1681 = new int[this.field1679][];
        for (int var4 = 0; var4 < this.field1679; var4++) {
            this.field1680[var4] = var3.method2172();
        }
        for (int var5 = 0; var5 < this.field1679; var5++) {
            this.field1681[var5] = new int[var3.method2172()];
        }
        for (int var6 = 0; var6 < this.field1679; var6++) {
            for (int var7 = 0; var7 < this.field1681[var6].length; var7++) {
                this.field1681[var6][var7] = var3.method2172();
            }
        }
    }
}
