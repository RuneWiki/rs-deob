package deob;

@ObfuscatedName("kj")
public class class274 {

    @ObfuscatedName("kj.ap")
    public final int[][] field3039;

    @ObfuscatedName("kj.aw")
    public final int[][] field3040;

    @ObfuscatedName("kj.ak")
    public int field3036;

    @ObfuscatedName("kj.aj")
    public int field3037;

    @ObfuscatedName("kj.ai")
    public final int[] field3038;

    @ObfuscatedName("kj.ay")
    public final int[] field3034;

    @ObfuscatedName("kj.as")
    public final int field3035;

    public class274(int arg0, int arg1) {
        this.field3039 = new int[arg0][arg1];
        this.field3040 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class332.method2832(var3 / 4);
        this.field3038 = new int[var4];
        this.field3034 = new int[var4];
        this.field3035 = var4 - 1;
    }

    @ObfuscatedName("kj.ap(B)V")
    public void method5312() {
        for (int var1 = 0; var1 < this.field3039.length; var1++) {
            for (int var2 = 0; var2 < this.field3039[var1].length; var2++) {
                this.field3039[var1][var2] = 0;
                this.field3040[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("kj.aw(III)V")
    public void method5313(int arg0, int arg1) {
        this.field3036 = arg0;
        this.field3037 = arg1;
    }

    @ObfuscatedName("kj.ak(I)I")
    public int method5314() {
        return this.field3036;
    }

    @ObfuscatedName("kj.aj(B)I")
    public int method5315() {
        return this.field3037;
    }

    @ObfuscatedName("kj.ai(B)I")
    public int method5316() {
        return this.field3039.length;
    }

    @ObfuscatedName("kj.ay(S)I")
    public int method5317() {
        return this.field3039[0].length;
    }

    @ObfuscatedName("kj.as(I)[[I")
    public int[][] method5330() {
        return this.field3039;
    }

    @ObfuscatedName("kj.ae(I)[[I")
    public int[][] method5319() {
        return this.field3040;
    }

    @ObfuscatedName("kj.am(I)[I")
    public int[] method5324() {
        return this.field3038;
    }

    @ObfuscatedName("kj.at(I)[I")
    public int[] method5321() {
        return this.field3034;
    }

    @ObfuscatedName("kj.au(B)I")
    public int method5331() {
        return this.field3035;
    }
}
