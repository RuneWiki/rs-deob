package deob;

@ObfuscatedName("lw")
public class class292 implements class305 {

    @ObfuscatedName("lw.ap")
    public int field3178;

    @ObfuscatedName("lw.aw")
    public int field3185;

    @ObfuscatedName("lw.ak")
    public int field3180;

    @ObfuscatedName("lw.aj")
    public int field3184;

    @ObfuscatedName("lw.ai")
    public int field3182;

    @ObfuscatedName("lw.ay")
    public int field3183;

    @ObfuscatedName("lw.as")
    public int field3179;

    @ObfuscatedName("lw.ae")
    public int field3186;

    @ObfuscatedName("lw.am")
    public int field3181;

    @ObfuscatedName("lw.at")
    public int field3187;

    @ObfuscatedName("lw.au")
    public int field3188;

    @ObfuscatedName("lw.an")
    public int field3189;

    @ObfuscatedName("lw.ao")
    public int field3190;

    @ObfuscatedName("lw.af")
    public int field3191;

    @ObfuscatedName("lw.ap(Lkp;I)V")
    public void method5490(class285 arg0) {
        if (arg0.field3113 > this.field3182) {
            arg0.field3113 = this.field3182;
        }
        if (arg0.field3116 < this.field3182) {
            arg0.field3116 = this.field3182;
        }
        if (arg0.field3117 > this.field3183) {
            arg0.field3117 = this.field3183;
        }
        if (arg0.field3118 < this.field3183) {
            arg0.field3118 = this.field3183;
        }
    }

    @ObfuscatedName("lw.aw(IIII)Z")
    public boolean method5478(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3178 && arg0 < this.field3185 + this.field3178) {
            return arg1 >= (this.field3180 << 6) + (this.field3179 << 3) && arg1 <= (this.field3181 << 3) + (this.field3180 << 6) + 7 && arg2 >= (this.field3186 << 3) + (this.field3184 << 6) && arg2 <= (this.field3187 << 3) + (this.field3184 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lw.ak(IIB)Z")
    public boolean method5476(int arg0, int arg1) {
        return arg0 >= (this.field3188 << 3) + (this.field3182 << 6) && arg0 <= (this.field3190 << 3) + (this.field3182 << 6) + 7 && arg1 >= (this.field3189 << 3) + (this.field3183 << 6) && arg1 <= (this.field3191 << 3) + (this.field3183 << 6) + 7;
    }

    @ObfuscatedName("lw.aj(IIIB)[I")
    public int[] method5477(int arg0, int arg1, int arg2) {
        return this.method5478(arg0, arg1, arg2) ? new int[] { this.field3188 * 8 - this.field3179 * 8 + this.field3182 * 64 - this.field3180 * 64 + arg1, this.field3189 * 8 - this.field3186 * 8 + this.field3183 * 64 - this.field3184 * 64 + arg2 } : null;
    }

    @ObfuscatedName("lw.ai(III)Lnn;")
    public class351 method5499(int arg0, int arg1) {
        if (this.method5476(arg0, arg1)) {
            int var3 = this.field3179 * 8 - this.field3188 * 8 + this.field3180 * 64 - this.field3182 * 64 + arg0;
            int var4 = this.field3186 * 8 - this.field3189 * 8 + this.field3184 * 64 - this.field3183 * 64 + arg1;
            return new class351(this.field3178, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("lw.ay(Lvl;I)V")
    public void method5479(class558 arg0) {
        this.field3178 = arg0.method9258();
        this.field3185 = arg0.method9258();
        this.field3180 = arg0.method9260();
        this.field3179 = arg0.method9258();
        this.field3181 = arg0.method9258();
        this.field3184 = arg0.method9260();
        this.field3186 = arg0.method9258();
        this.field3187 = arg0.method9258();
        this.field3182 = arg0.method9260();
        this.field3188 = arg0.method9258();
        this.field3190 = arg0.method9258();
        this.field3183 = arg0.method9260();
        this.field3189 = arg0.method9258();
        this.field3191 = arg0.method9258();
        this.method5760();
    }

    @ObfuscatedName("lw.as(I)V")
    public void method5760() {
    }
}
