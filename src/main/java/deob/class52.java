package deob;

@ObfuscatedName("ad")
public class class52 implements class47 {

    @ObfuscatedName("ad.f")
    public int field382;

    @ObfuscatedName("ad.b")
    public int field388;

    @ObfuscatedName("ad.l")
    public int field383;

    @ObfuscatedName("ad.m")
    public int field384;

    @ObfuscatedName("ad.z")
    public int field385;

    @ObfuscatedName("ad.q")
    public int field386;

    @ObfuscatedName("ad.k")
    public int field387;

    @ObfuscatedName("ad.c")
    public int field390;

    @ObfuscatedName("ad.u")
    public int field389;

    @ObfuscatedName("ad.t")
    public int field392;

    @ObfuscatedName("ad.f(Lak;I)V")
    public void method268(class36 arg0) {
        if (arg0.field244 > this.field385) {
            arg0.field244 = this.field385;
        }
        if (arg0.field238 < this.field385) {
            arg0.field238 = this.field385;
        }
        if (arg0.field239 > this.field386) {
            arg0.field239 = this.field386;
        }
        if (arg0.field240 < this.field386) {
            arg0.field240 = this.field386;
        }
    }

    @ObfuscatedName("ad.b(IIIB)Z")
    public boolean method269(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field382 && arg0 < this.field388 + this.field382) {
            return arg1 >= (this.field387 << 3) + (this.field383 << 6) && arg1 <= (this.field387 << 3) + (this.field383 << 6) + 7 && arg2 >= (this.field390 << 3) + (this.field384 << 6) && arg2 <= (this.field390 << 3) + (this.field384 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.l(IIB)Z")
    public boolean method284(int arg0, int arg1) {
        return arg0 >= (this.field389 << 3) + (this.field385 << 6) && arg0 <= (this.field389 << 3) + (this.field385 << 6) + 7 && arg1 >= (this.field392 << 3) + (this.field386 << 6) && arg1 <= (this.field392 << 3) + (this.field386 << 6) + 7;
    }

    @ObfuscatedName("ad.m(IIIB)[I")
    public int[] method282(int arg0, int arg1, int arg2) {
        return this.method269(arg0, arg1, arg2) ? new int[] { this.field389 * 8 - this.field387 * 8 + this.field385 * 64 - this.field383 * 64 + arg1, this.field392 * 8 - this.field390 * 8 + this.field386 * 64 - this.field384 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.z(IIB)Lhw;")
    public class223 method271(int arg0, int arg1) {
        if (this.method284(arg0, arg1)) {
            int var3 = this.field387 * 8 - this.field389 * 8 + this.field383 * 64 - this.field385 * 64 + arg0;
            int var4 = this.field390 * 8 - this.field392 * 8 + this.field384 * 64 - this.field386 * 64 + arg1;
            return new class223(this.field382, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.q(Lkb;I)V")
    public void method288(class311 arg0) {
        this.field382 = arg0.method5276();
        this.field388 = arg0.method5276();
        this.field383 = arg0.method5163();
        this.field387 = arg0.method5276();
        this.field384 = arg0.method5163();
        this.field390 = arg0.method5276();
        this.field385 = arg0.method5163();
        this.field389 = arg0.method5276();
        this.field386 = arg0.method5163();
        this.field392 = arg0.method5276();
        this.method731();
    }

    @ObfuscatedName("ad.k(B)V")
    public void method731() {
    }
}
