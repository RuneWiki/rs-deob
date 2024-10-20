package deob;

@ObfuscatedName("li")
public class class289 implements class305 {

    @ObfuscatedName("li.ap")
    public int field3173;

    @ObfuscatedName("li.aw")
    public int field3164;

    @ObfuscatedName("li.ak")
    public int field3172;

    @ObfuscatedName("li.aj")
    public int field3171;

    @ObfuscatedName("li.ai")
    public int field3167;

    @ObfuscatedName("li.ay")
    public int field3168;

    @ObfuscatedName("li.as")
    public int field3169;

    @ObfuscatedName("li.ae")
    public int field3170;

    @ObfuscatedName("li.am")
    public int field3166;

    @ObfuscatedName("li.at")
    public int field3163;

    @ObfuscatedName("li.ap(Lkp;I)V")
    public void method5490(class285 arg0) {
        if (arg0.field3113 > this.field3167) {
            arg0.field3113 = this.field3167;
        }
        if (arg0.field3116 < this.field3167) {
            arg0.field3116 = this.field3167;
        }
        if (arg0.field3117 > this.field3168) {
            arg0.field3117 = this.field3168;
        }
        if (arg0.field3118 < this.field3168) {
            arg0.field3118 = this.field3168;
        }
    }

    @ObfuscatedName("li.aw(IIII)Z")
    public boolean method5478(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3173 && arg0 < this.field3173 + this.field3164) {
            return arg1 >= (this.field3172 << 6) + (this.field3169 << 3) && arg1 <= (this.field3172 << 6) + (this.field3169 << 3) + 7 && arg2 >= (this.field3171 << 6) + (this.field3170 << 3) && arg2 <= (this.field3171 << 6) + (this.field3170 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("li.ak(IIB)Z")
    public boolean method5476(int arg0, int arg1) {
        return arg0 >= (this.field3167 << 6) + (this.field3166 << 3) && arg0 <= (this.field3167 << 6) + (this.field3166 << 3) + 7 && arg1 >= (this.field3168 << 6) + (this.field3163 << 3) && arg1 <= (this.field3168 << 6) + (this.field3163 << 3) + 7;
    }

    @ObfuscatedName("li.aj(IIIB)[I")
    public int[] method5477(int arg0, int arg1, int arg2) {
        return this.method5478(arg0, arg1, arg2) ? new int[] { this.field3166 * 8 - this.field3169 * 8 + this.field3167 * 64 - this.field3172 * 64 + arg1, this.field3163 * 8 - this.field3170 * 8 + this.field3168 * 64 - this.field3171 * 64 + arg2 } : null;
    }

    @ObfuscatedName("li.ai(III)Lnn;")
    public class351 method5499(int arg0, int arg1) {
        if (this.method5476(arg0, arg1)) {
            int var3 = this.field3169 * 8 - this.field3166 * 8 + this.field3172 * 64 - this.field3167 * 64 + arg0;
            int var4 = this.field3170 * 8 - this.field3163 * 8 + this.field3171 * 64 - this.field3168 * 64 + arg1;
            return new class351(this.field3173, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("li.ay(Lvl;I)V")
    public void method5479(class558 arg0) {
        this.field3173 = arg0.method9258();
        this.field3164 = arg0.method9258();
        this.field3172 = arg0.method9260();
        this.field3169 = arg0.method9258();
        this.field3171 = arg0.method9260();
        this.field3170 = arg0.method9258();
        this.field3167 = arg0.method9260();
        this.field3166 = arg0.method9258();
        this.field3168 = arg0.method9260();
        this.field3163 = arg0.method9258();
        this.method5749();
    }

    @ObfuscatedName("li.as(I)V")
    public void method5749() {
    }
}
