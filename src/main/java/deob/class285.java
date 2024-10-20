package deob;

@ObfuscatedName("kh")
public class class285 {

    @ObfuscatedName("kh.at")
    public boolean field3037 = false;

    @ObfuscatedName("kh.ah")
    public boolean field3039 = true;

    @ObfuscatedName("kh.ar")
    public int field3052 = 0;

    @ObfuscatedName("kh.au")
    public int field3042 = 512;

    @ObfuscatedName("kh.aa")
    public class289 field3043;

    @ObfuscatedName("kh.ax")
    public int field3038;

    @ObfuscatedName("kh.as")
    public int field3050;

    @ObfuscatedName("kh.ay")
    public int field3051;

    @ObfuscatedName("kh.ak")
    public int field3040;

    @ObfuscatedName("kh.aj")
    public int field3053;

    @ObfuscatedName("kh.am")
    public int field3054;

    @ObfuscatedName("kh.aq")
    public int field3055;

    @ObfuscatedName("kh.ai")
    public int field3056;

    @ObfuscatedName("kh.aw")
    public int[] field3048 = new int[1024];

    @ObfuscatedName("kh.at()V")
    public void method5179() {
        this.field3038 = this.field3051 / 2;
        this.field3050 = this.field3040 / 2;
        this.field3053 = -this.field3038;
        this.field3054 = this.field3051 - this.field3038;
        this.field3055 = -this.field3050;
        this.field3056 = this.field3040 - this.field3050;
    }

    @ObfuscatedName("kh.ah(IIII)V")
    public void method5180(int arg0, int arg1, int arg2, int arg3) {
        this.field3038 = arg0 - arg1;
        this.field3050 = arg2 - arg3;
        this.field3053 = -this.field3038;
        this.field3054 = this.field3051 - this.field3038;
        this.field3055 = -this.field3050;
        this.field3056 = this.field3040 - this.field3050;
    }

    @ObfuscatedName("kh.ar(III)V")
    public void method5181(int arg0, int arg1, int arg2) {
        this.field3037 = arg0 < 0 || arg0 > this.field3051 || arg1 < 0 || arg1 > this.field3051 || arg2 < 0 || arg2 > this.field3051;
    }
}
