package deob;

@ObfuscatedName("de")
public class class37 extends class17 {

    @ObfuscatedName("de.b")
    public int field458;

    @ObfuscatedName("de.k")
    public int[] field455;

    @ObfuscatedName("de.h")
    public int field453;

    @ObfuscatedName("de.w")
    public int[][] field456;

    public class37(int arg0, byte[] arg1) {
        this.field458 = arg0;
        class50 var3 = new class50(arg1);
        this.field453 = var3.method726();
        this.field455 = new int[this.field453];
        this.field456 = new int[this.field453][];
        for (int var4 = 0; var4 < this.field453; var4++) {
            this.field455[var4] = var3.method726();
        }
        for (int var5 = 0; var5 < this.field453; var5++) {
            this.field456[var5] = new int[var3.method726()];
        }
        for (int var6 = 0; var6 < this.field453; var6++) {
            for (int var7 = 0; var7 < this.field456[var6].length; var7++) {
                this.field456[var6][var7] = var3.method726();
            }
        }
    }
}
