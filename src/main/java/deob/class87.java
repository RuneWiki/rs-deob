package deob;

@ObfuscatedName("cn")
public class class87 extends class128 {

    @ObfuscatedName("cn.s")
    public int field1468;

    @ObfuscatedName("cn.c")
    public int field1469;

    @ObfuscatedName("cn.f")
    public int[] field1470;

    @ObfuscatedName("cn.h")
    public int[][] field1472;

    public class87(int arg0, byte[] arg1) {
        this.field1468 = arg0;
        class154 var3 = new class154(arg1);
        this.field1469 = var3.method2545();
        this.field1470 = new int[this.field1469];
        this.field1472 = new int[this.field1469][];
        for (int var4 = 0; var4 < this.field1469; var4++) {
            this.field1470[var4] = var3.method2545();
        }
        for (int var5 = 0; var5 < this.field1469; var5++) {
            this.field1472[var5] = new int[var3.method2545()];
        }
        for (int var6 = 0; var6 < this.field1469; var6++) {
            for (int var7 = 0; var7 < this.field1472[var6].length; var7++) {
                this.field1472[var6][var7] = var3.method2545();
            }
        }
    }
}
