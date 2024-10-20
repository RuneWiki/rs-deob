package deob;

@ObfuscatedName("lt")
public class class302 implements class305 {

    @ObfuscatedName("lt.ap")
    public int field3256;

    @ObfuscatedName("lt.aw")
    public int field3253;

    @ObfuscatedName("lt.ak")
    public int field3254;

    @ObfuscatedName("lt.aj")
    public int field3255;

    @ObfuscatedName("lt.ai")
    public int field3257;

    @ObfuscatedName("lt.ay")
    public int field3258;

    @ObfuscatedName("lt.ap(Lkp;I)V")
    public void method5490(class285 arg0) {
        if (arg0.field3113 > this.field3257) {
            arg0.field3113 = this.field3257;
        }
        if (arg0.field3116 < this.field3257) {
            arg0.field3116 = this.field3257;
        }
        if (arg0.field3117 > this.field3258) {
            arg0.field3117 = this.field3258;
        }
        if (arg0.field3118 < this.field3258) {
            arg0.field3118 = this.field3258;
        }
    }

    @ObfuscatedName("lt.aw(IIII)Z")
    public boolean method5478(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3256 && arg0 < this.field3256 + this.field3253) {
            return arg1 >> 6 == this.field3254 && arg2 >> 6 == this.field3255;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lt.ak(IIB)Z")
    public boolean method5476(int arg0, int arg1) {
        return arg0 >> 6 == this.field3257 && arg1 >> 6 == this.field3258;
    }

    @ObfuscatedName("lt.aj(IIIB)[I")
    public int[] method5477(int arg0, int arg1, int arg2) {
        return this.method5478(arg0, arg1, arg2) ? new int[] { this.field3257 * 64 - this.field3254 * 64 + arg1, this.field3258 * 64 - this.field3255 * 64 + arg2 } : null;
    }

    @ObfuscatedName("lt.ai(III)Lnn;")
    public class351 method5499(int arg0, int arg1) {
        if (this.method5476(arg0, arg1)) {
            int var3 = this.field3254 * 64 - this.field3257 * 64 + arg0;
            int var4 = this.field3255 * 64 - this.field3258 * 64 + arg1;
            return new class351(this.field3256, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("lt.ay(Lvl;I)V")
    public void method5479(class558 arg0) {
        this.field3256 = arg0.method9258();
        this.field3253 = arg0.method9258();
        this.field3254 = arg0.method9260();
        this.field3255 = arg0.method9260();
        this.field3257 = arg0.method9260();
        this.field3258 = arg0.method9260();
        this.method5819();
    }

    @ObfuscatedName("lt.as(S)V")
    public void method5819() {
    }
}
