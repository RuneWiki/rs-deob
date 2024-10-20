package deob;

@ObfuscatedName("kc")
public class class284 implements class305 {

    @ObfuscatedName("kc.ap")
    public int field3104;

    @ObfuscatedName("kc.aw")
    public int field3105;

    @ObfuscatedName("kc.ak")
    public int field3100;

    @ObfuscatedName("kc.aj")
    public int field3101;

    @ObfuscatedName("kc.ai")
    public int field3102;

    @ObfuscatedName("kc.ay")
    public int field3103;

    @ObfuscatedName("kc.as")
    public int field3106;

    @ObfuscatedName("kc.ae")
    public int field3099;

    @ObfuscatedName("kc.am")
    public int field3107;

    @ObfuscatedName("kc.at")
    public int field3098;

    @ObfuscatedName("kc.ap(Lkp;I)V")
    public void method5490(class285 arg0) {
        if (arg0.field3113 > this.field3106) {
            arg0.field3113 = this.field3106;
        }
        if (arg0.field3116 < this.field3107) {
            arg0.field3116 = this.field3107;
        }
        if (arg0.field3117 > this.field3099) {
            arg0.field3117 = this.field3099;
        }
        if (arg0.field3118 < this.field3098) {
            arg0.field3118 = this.field3098;
        }
    }

    @ObfuscatedName("kc.aw(IIII)Z")
    public boolean method5478(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3104 && arg0 < this.field3105 + this.field3104) {
            return arg1 >> 6 >= this.field3100 && arg1 >> 6 <= this.field3102 && arg2 >> 6 >= this.field3101 && arg2 >> 6 <= this.field3103;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kc.ak(IIB)Z")
    public boolean method5476(int arg0, int arg1) {
        return arg0 >> 6 >= this.field3106 && arg0 >> 6 <= this.field3107 && arg1 >> 6 >= this.field3099 && arg1 >> 6 <= this.field3098;
    }

    @ObfuscatedName("kc.aj(IIIB)[I")
    public int[] method5477(int arg0, int arg1, int arg2) {
        return this.method5478(arg0, arg1, arg2) ? new int[] { this.field3106 * 64 - this.field3100 * 64 + arg1, this.field3099 * 64 - this.field3101 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kc.ai(III)Lnn;")
    public class351 method5499(int arg0, int arg1) {
        if (this.method5476(arg0, arg1)) {
            int var3 = this.field3100 * 64 - this.field3106 * 64 + arg0;
            int var4 = this.field3101 * 64 - this.field3099 * 64 + arg1;
            return new class351(this.field3104, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kc.ay(Lvl;I)V")
    public void method5479(class558 arg0) {
        this.field3104 = arg0.method9258();
        this.field3105 = arg0.method9258();
        this.field3100 = arg0.method9260();
        this.field3101 = arg0.method9260();
        this.field3102 = arg0.method9260();
        this.field3103 = arg0.method9260();
        this.field3106 = arg0.method9260();
        this.field3099 = arg0.method9260();
        this.field3107 = arg0.method9260();
        this.field3098 = arg0.method9260();
        this.method5480();
    }

    @ObfuscatedName("kc.as(B)V")
    public void method5480() {
    }
}
