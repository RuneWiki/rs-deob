package deob;

@ObfuscatedName("id")
public class class233 {

    @ObfuscatedName("id.aq")
    public final int[][] field2463;

    @ObfuscatedName("id.aw")
    public final int[][] field2469;

    @ObfuscatedName("id.al")
    public int field2462;

    @ObfuscatedName("id.ai")
    public int field2465;

    @ObfuscatedName("id.ar")
    public final int[] field2464;

    @ObfuscatedName("id.as")
    public final int[] field2467;

    @ObfuscatedName("id.aa")
    public final int field2468;

    public class233(int arg0, int arg1) {
        this.field2463 = new int[arg0][arg1];
        this.field2469 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class320.method5477(var3 / 4);
        this.field2464 = new int[var4];
        this.field2467 = new int[var4];
        this.field2468 = var4 - 1;
    }

    @ObfuscatedName("id.aq(I)V")
    public void method4112() {
        for (int var1 = 0; var1 < this.field2463.length; var1++) {
            for (int var2 = 0; var2 < this.field2463[var1].length; var2++) {
                this.field2463[var1][var2] = 0;
                this.field2469[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("id.aw(III)V")
    public void method4113(int arg0, int arg1) {
        this.field2462 = arg0;
        this.field2465 = arg1;
    }

    @ObfuscatedName("id.al(B)I")
    public int method4145() {
        return this.field2462;
    }

    @ObfuscatedName("id.ai(B)I")
    public int method4150() {
        return this.field2465;
    }

    @ObfuscatedName("id.ar(B)I")
    public int method4116() {
        return this.field2463.length;
    }

    @ObfuscatedName("id.as(I)I")
    public int method4117() {
        return this.field2463[0].length;
    }

    @ObfuscatedName("id.aa(I)[[I")
    public int[][] method4139() {
        return this.field2463;
    }

    @ObfuscatedName("id.az(I)[[I")
    public int[][] method4119() {
        return this.field2469;
    }

    @ObfuscatedName("id.ao(I)[I")
    public int[] method4120() {
        return this.field2464;
    }

    @ObfuscatedName("id.au(I)[I")
    public int[] method4121() {
        return this.field2467;
    }

    @ObfuscatedName("id.ak(I)I")
    public int method4122() {
        return this.field2468;
    }
}
