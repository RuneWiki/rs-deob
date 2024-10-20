package deob;

@ObfuscatedName("ew")
public class class135 extends class107 {

    @ObfuscatedName("ew.o")
    public int field1717;

    @ObfuscatedName("ew.c")
    public int field1719;

    @ObfuscatedName("ew.h")
    public int[] field1718;

    @ObfuscatedName("ew.r")
    public int[][] field1716;

    public class135(int arg0, byte[] arg1) {
        this.field1717 = arg0;
        class136 var3 = new class136(arg1);
        this.field1719 = var3.method1602();
        this.field1718 = new int[this.field1719];
        this.field1716 = new int[this.field1719][];
        for (int var4 = 0; var4 < this.field1719; var4++) {
            this.field1718[var4] = var3.method1602();
        }
        for (int var5 = 0; var5 < this.field1719; var5++) {
            this.field1716[var5] = new int[var3.method1602()];
        }
        for (int var6 = 0; var6 < this.field1719; var6++) {
            for (int var7 = 0; var7 < this.field1716[var6].length; var7++) {
                this.field1716[var6][var7] = var3.method1602();
            }
        }
    }
}
