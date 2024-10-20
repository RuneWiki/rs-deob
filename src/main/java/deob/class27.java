package deob;

@ObfuscatedName("ag")
public class class27 implements class43 {

    @ObfuscatedName("ag.e")
    public int field386;

    @ObfuscatedName("ag.n")
    public int field378;

    @ObfuscatedName("ag.g")
    public int field385;

    @ObfuscatedName("ag.y")
    public int field380;

    @ObfuscatedName("ag.w")
    public int field384;

    @ObfuscatedName("ag.k")
    public int field382;

    @ObfuscatedName("ag.v")
    public int field383;

    @ObfuscatedName("ag.z")
    public int field390;

    @ObfuscatedName("ag.r")
    public int field381;

    @ObfuscatedName("ag.u")
    public int field392;

    @ObfuscatedName("ag.d")
    public int field387;

    @ObfuscatedName("ag.o")
    public int field388;

    @ObfuscatedName("ag.l")
    public int field389;

    @ObfuscatedName("ag.h")
    public int field379;

    @ObfuscatedName("ag.e(Lae;B)V")
    public void method181(class33 arg0) {
        if (arg0.field458 > this.field384) {
            arg0.field458 = this.field384;
        }
        if (arg0.field461 < this.field384) {
            arg0.field461 = this.field384;
        }
        if (arg0.field454 > this.field382) {
            arg0.field454 = this.field382;
        }
        if (arg0.field463 < this.field382) {
            arg0.field463 = this.field382;
        }
    }

    @ObfuscatedName("ag.n(IIII)Z")
    public boolean method209(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field386 && arg0 < this.field386 + this.field378) {
            return arg1 >= (this.field385 << 6) + (this.field383 << 3) && arg1 <= (this.field385 << 6) + (this.field381 << 3) + 7 && arg2 >= (this.field390 << 3) + (this.field380 << 6) && arg2 <= (this.field392 << 3) + (this.field380 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.g(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >= (this.field387 << 3) + (this.field384 << 6) && arg0 <= (this.field389 << 3) + (this.field384 << 6) + 7 && arg1 >= (this.field388 << 3) + (this.field382 << 6) && arg1 <= (this.field382 << 6) + (this.field379 << 3) + 7;
    }

    @ObfuscatedName("ag.y(IIII)[I")
    public int[] method184(int arg0, int arg1, int arg2) {
        return this.method209(arg0, arg1, arg2) ? new int[] { this.field387 * 8 - this.field383 * 8 + this.field384 * 64 - this.field385 * 64 + arg1, this.field388 * 8 - this.field390 * 8 + this.field382 * 64 - this.field380 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ag.w(III)Lhq;")
    public class214 method198(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field383 * 8 - this.field387 * 8 + this.field385 * 64 - this.field384 * 64 + arg0;
            int var4 = this.field390 * 8 - this.field388 * 8 + this.field380 * 64 - this.field382 * 64 + arg1;
            return new class214(this.field386, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ag.k(Lfh;B)V")
    public void method186(class175 arg0) {
        this.field386 = arg0.method2928();
        this.field378 = arg0.method2928();
        this.field385 = arg0.method3091();
        this.field383 = arg0.method2928();
        this.field381 = arg0.method2928();
        this.field380 = arg0.method3091();
        this.field390 = arg0.method2928();
        this.field392 = arg0.method2928();
        this.field384 = arg0.method3091();
        this.field387 = arg0.method2928();
        this.field389 = arg0.method2928();
        this.field382 = arg0.method3091();
        this.field388 = arg0.method2928();
        this.field379 = arg0.method2928();
        this.method187();
    }

    @ObfuscatedName("ag.v(I)V")
    public void method187() {
    }
}
