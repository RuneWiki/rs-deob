package deob;

@ObfuscatedName("ag")
public class class29 implements class47 {

    @ObfuscatedName("ag.n")
    public int field180;

    @ObfuscatedName("ag.v")
    public int field174;

    @ObfuscatedName("ag.d")
    public int field169;

    @ObfuscatedName("ag.c")
    public int field182;

    @ObfuscatedName("ag.y")
    public int field175;

    @ObfuscatedName("ag.h")
    public int field171;

    @ObfuscatedName("ag.z")
    public int field173;

    @ObfuscatedName("ag.e")
    public int field179;

    @ObfuscatedName("ag.q")
    public int field168;

    @ObfuscatedName("ag.l")
    public int field176;

    @ObfuscatedName("ag.s")
    public int field177;

    @ObfuscatedName("ag.b")
    public int field178;

    @ObfuscatedName("ag.a")
    public int field167;

    @ObfuscatedName("ag.w")
    public int field172;

    @ObfuscatedName("ag.n(Lar;B)V")
    public void method280(class36 arg0) {
        if (arg0.field246 > this.field175) {
            arg0.field246 = this.field175;
        }
        if (arg0.field247 < this.field175) {
            arg0.field247 = this.field175;
        }
        if (arg0.field248 > this.field171) {
            arg0.field248 = this.field171;
        }
        if (arg0.field251 < this.field171) {
            arg0.field251 = this.field171;
        }
    }

    @ObfuscatedName("ag.v(IIIB)Z")
    public boolean method269(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field180 && arg0 < this.field180 + this.field174) {
            return arg1 >= (this.field173 << 3) + (this.field169 << 6) && arg1 <= (this.field169 << 6) + (this.field168 << 3) + 7 && arg2 >= (this.field182 << 6) + (this.field179 << 3) && arg2 <= (this.field182 << 6) + (this.field176 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.d(IIB)Z")
    public boolean method267(int arg0, int arg1) {
        return arg0 >= (this.field177 << 3) + (this.field175 << 6) && arg0 <= (this.field175 << 6) + (this.field167 << 3) + 7 && arg1 >= (this.field178 << 3) + (this.field171 << 6) && arg1 <= (this.field172 << 3) + (this.field171 << 6) + 7;
    }

    @ObfuscatedName("ag.c(IIIB)[I")
    public int[] method271(int arg0, int arg1, int arg2) {
        return this.method269(arg0, arg1, arg2) ? new int[] { this.field177 * 8 - this.field173 * 8 + this.field175 * 64 - this.field169 * 64 + arg1, this.field178 * 8 - this.field179 * 8 + this.field171 * 64 - this.field182 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ag.y(III)Lhd;")
    public class223 method266(int arg0, int arg1) {
        if (this.method267(arg0, arg1)) {
            int var3 = this.field173 * 8 - this.field177 * 8 + this.field169 * 64 - this.field175 * 64 + arg0;
            int var4 = this.field179 * 8 - this.field178 * 8 + this.field182 * 64 - this.field171 * 64 + arg1;
            return new class223(this.field180, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ag.h(Lkx;I)V")
    public void method270(class311 arg0) {
        this.field180 = arg0.method5310();
        this.field174 = arg0.method5310();
        this.field169 = arg0.method5247();
        this.field173 = arg0.method5310();
        this.field168 = arg0.method5310();
        this.field182 = arg0.method5247();
        this.field179 = arg0.method5310();
        this.field176 = arg0.method5310();
        this.field175 = arg0.method5247();
        this.field177 = arg0.method5310();
        this.field167 = arg0.method5310();
        this.field171 = arg0.method5247();
        this.field178 = arg0.method5310();
        this.field172 = arg0.method5310();
        this.method268();
    }

    @ObfuscatedName("ag.z(I)V")
    public void method268() {
    }
}
