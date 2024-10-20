package deob;

@ObfuscatedName("am")
public class class43 implements class38 {

    @ObfuscatedName("am.z")
    public int field338;

    @ObfuscatedName("am.n")
    public int field339;

    @ObfuscatedName("am.v")
    public int field340;

    @ObfuscatedName("am.u")
    public int field343;

    @ObfuscatedName("am.r")
    public int field342;

    @ObfuscatedName("am.p")
    public int field352;

    @ObfuscatedName("am.q")
    public int field344;

    @ObfuscatedName("am.m")
    public int field345;

    @ObfuscatedName("am.y")
    public int field346;

    @ObfuscatedName("am.i")
    public int field341;

    @ObfuscatedName("am.z(Lac;I)V")
    public void method210(class27 arg0) {
        if (arg0.field209 > this.field342) {
            arg0.field209 = this.field342;
        }
        if (arg0.field213 < this.field342) {
            arg0.field213 = this.field342;
        }
        if (arg0.field214 > this.field352) {
            arg0.field214 = this.field352;
        }
        if (arg0.field206 < this.field352) {
            arg0.field206 = this.field352;
        }
    }

    @ObfuscatedName("am.n(IIII)Z")
    public boolean method211(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field338 && arg0 < this.field339 + this.field338) {
            return arg1 >= (this.field344 << 3) + (this.field340 << 6) && arg1 <= (this.field344 << 3) + (this.field340 << 6) + 7 && arg2 >= (this.field345 << 3) + (this.field343 << 6) && arg2 <= (this.field345 << 3) + (this.field343 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.v(III)Z")
    public boolean method212(int arg0, int arg1) {
        return arg0 >= (this.field346 << 3) + (this.field342 << 6) && arg0 <= (this.field346 << 3) + (this.field342 << 6) + 7 && arg1 >= (this.field352 << 6) + (this.field341 << 3) && arg1 <= (this.field352 << 6) + (this.field341 << 3) + 7;
    }

    @ObfuscatedName("am.u(IIII)[I")
    public int[] method223(int arg0, int arg1, int arg2) {
        return this.method211(arg0, arg1, arg2) ? new int[] { this.field346 * 8 - this.field344 * 8 + this.field342 * 64 - this.field340 * 64 + arg1, this.field341 * 8 - this.field345 * 8 + this.field352 * 64 - this.field343 * 64 + arg2 } : null;
    }

    @ObfuscatedName("am.r(III)Lhb;")
    public class214 method214(int arg0, int arg1) {
        if (this.method212(arg0, arg1)) {
            int var3 = this.field344 * 8 - this.field346 * 8 + this.field340 * 64 - this.field342 * 64 + arg0;
            int var4 = this.field345 * 8 - this.field341 * 8 + this.field343 * 64 - this.field352 * 64 + arg1;
            return new class214(this.field338, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("am.p(Lkl;B)V")
    public void method215(class300 arg0) {
        this.field338 = arg0.method4990();
        this.field339 = arg0.method4990();
        this.field340 = arg0.method4992();
        this.field344 = arg0.method4990();
        this.field343 = arg0.method4992();
        this.field345 = arg0.method4990();
        this.field342 = arg0.method4992();
        this.field346 = arg0.method4990();
        this.field352 = arg0.method4992();
        this.field341 = arg0.method4990();
        this.method671();
    }

    @ObfuscatedName("am.q(I)V")
    public void method671() {
    }
}
