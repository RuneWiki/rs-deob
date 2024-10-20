package deob;

@ObfuscatedName("iz")
public class class233 {

    @ObfuscatedName("iz.az")
    public final int[][] field2477;

    @ObfuscatedName("iz.ah")
    public final int[][] field2480;

    @ObfuscatedName("iz.af")
    public int field2482;

    @ObfuscatedName("iz.at")
    public int field2478;

    @ObfuscatedName("iz.an")
    public final int[] field2479;

    @ObfuscatedName("iz.ao")
    public final int[] field2475;

    @ObfuscatedName("iz.ab")
    public final int field2481;

    public class233(int arg0, int arg1) {
        this.field2477 = new int[arg0][arg1];
        this.field2480 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class320.method3400(var3 / 4);
        this.field2479 = new int[var4];
        this.field2475 = new int[var4];
        this.field2481 = var4 - 1;
    }

    @ObfuscatedName("iz.az(B)V")
    public void method4042() {
        for (int var1 = 0; var1 < this.field2477.length; var1++) {
            for (int var2 = 0; var2 < this.field2477[var1].length; var2++) {
                this.field2477[var1][var2] = 0;
                this.field2480[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("iz.ah(IIB)V")
    public void method4043(int arg0, int arg1) {
        this.field2482 = arg0;
        this.field2478 = arg1;
    }

    @ObfuscatedName("iz.af(B)I")
    public int method4044() {
        return this.field2482;
    }

    @ObfuscatedName("iz.at(I)I")
    public int method4045() {
        return this.field2478;
    }

    @ObfuscatedName("iz.an(I)I")
    public int method4046() {
        return this.field2477.length;
    }

    @ObfuscatedName("iz.ao(I)I")
    public int method4041() {
        return this.field2477[0].length;
    }

    @ObfuscatedName("iz.ab(I)[[I")
    public int[][] method4047() {
        return this.field2477;
    }

    @ObfuscatedName("iz.aw(I)[[I")
    public int[][] method4068() {
        return this.field2480;
    }

    @ObfuscatedName("iz.ad(S)[I")
    public int[] method4050() {
        return this.field2479;
    }

    @ObfuscatedName("iz.al(I)[I")
    public int[] method4069() {
        return this.field2475;
    }

    @ObfuscatedName("iz.as(B)I")
    public int method4071() {
        return this.field2481;
    }
}
