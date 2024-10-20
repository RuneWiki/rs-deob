package deob;

@ObfuscatedName("kp")
public class class274 {

    @ObfuscatedName("kp.ab")
    public final int[][] field2980;

    @ObfuscatedName("kp.ay")
    public final int[][] field2973;

    @ObfuscatedName("kp.an")
    public int field2974;

    @ObfuscatedName("kp.au")
    public int field2972;

    @ObfuscatedName("kp.ax")
    public final int[] field2976;

    @ObfuscatedName("kp.ao")
    public final int[] field2975;

    @ObfuscatedName("kp.am")
    public final int field2978;

    public class274(int arg0, int arg1) {
        this.field2980 = new int[arg0][arg1];
        this.field2973 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class331.method5556(var3 / 4);
        this.field2976 = new int[var4];
        this.field2975 = new int[var4];
        this.field2978 = var4 - 1;
    }

    @ObfuscatedName("kp.ab(B)V")
    public void method5011() {
        for (int var1 = 0; var1 < this.field2980.length; var1++) {
            for (int var2 = 0; var2 < this.field2980[var1].length; var2++) {
                this.field2980[var1][var2] = 0;
                this.field2973[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("kp.ay(IIB)V")
    public void method5012(int arg0, int arg1) {
        this.field2974 = arg0;
        this.field2972 = arg1;
    }

    @ObfuscatedName("kp.an(I)I")
    public int method5046() {
        return this.field2974;
    }

    @ObfuscatedName("kp.au(B)I")
    public int method5014() {
        return this.field2972;
    }

    @ObfuscatedName("kp.ax(I)I")
    public int method5015() {
        return this.field2980.length;
    }

    @ObfuscatedName("kp.ao(I)I")
    public int method5016() {
        return this.field2980[0].length;
    }

    @ObfuscatedName("kp.am(B)[[I")
    public int[][] method5017() {
        return this.field2980;
    }

    @ObfuscatedName("kp.ac(I)[[I")
    public int[][] method5018() {
        return this.field2973;
    }

    @ObfuscatedName("kp.ae(B)[I")
    public int[] method5019() {
        return this.field2976;
    }

    @ObfuscatedName("kp.ad(B)[I")
    public int[] method5020() {
        return this.field2975;
    }

    @ObfuscatedName("kp.aq(I)I")
    public int method5021() {
        return this.field2978;
    }
}
