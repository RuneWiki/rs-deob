package deob;

@ObfuscatedName("dj")
public class class44 extends class13 {

    @ObfuscatedName("dj.b")
    public int[] field511;

    @ObfuscatedName("dj.c")
    public int field514;

    @ObfuscatedName("dj.i")
    public int[][] field517;

    @ObfuscatedName("dj.v")
    public int field513;

    public class44(int arg0, byte[] arg1) {
        this.field513 = arg0;
        class28 var3 = new class28(arg1);
        this.field514 = var3.method450();
        this.field511 = new int[this.field514];
        this.field517 = new int[this.field514][];
        for (int var4 = 0; var4 < this.field514; var4++) {
            this.field511[var4] = var3.method450();
        }
        for (int var5 = 0; var5 < this.field514; var5++) {
            this.field517[var5] = new int[var3.method450()];
        }
        for (int var6 = 0; var6 < this.field514; var6++) {
            for (int var7 = 0; var7 < this.field517[var6].length; var7++) {
                this.field517[var6][var7] = var3.method450();
            }
        }
    }
}
