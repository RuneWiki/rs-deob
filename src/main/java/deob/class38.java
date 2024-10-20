package deob;

@ObfuscatedName("ak")
public class class38 implements class32 {

    @ObfuscatedName("ak.v")
    public int field338;

    @ObfuscatedName("ak.s")
    public int field336;

    @ObfuscatedName("ak.o")
    public int field337;

    @ObfuscatedName("ak.k")
    public int field340;

    @ObfuscatedName("ak.u")
    public int field335;

    @ObfuscatedName("ak.i")
    public int field345;

    @ObfuscatedName("ak.t")
    public int field344;

    @ObfuscatedName("ak.p")
    public int field342;

    @ObfuscatedName("ak.l")
    public int field343;

    @ObfuscatedName("ak.b")
    public int field339;

    @ObfuscatedName("ak.v(Lh;I)V")
    public void method147(class21 arg0) {
        if (arg0.field173 > this.field335) {
            arg0.field173 = this.field335;
        }
        if (arg0.field178 < this.field335) {
            arg0.field178 = this.field335;
        }
        if (arg0.field181 > this.field345) {
            arg0.field181 = this.field345;
        }
        if (arg0.field182 < this.field345) {
            arg0.field182 = this.field345;
        }
    }

    @ObfuscatedName("ak.s(IIII)Z")
    public boolean method167(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field338 && arg0 < this.field338 + this.field336) {
            return arg1 >= (this.field344 << 3) + (this.field337 << 6) && arg1 <= (this.field344 << 3) + (this.field337 << 6) + 7 && arg2 >= (this.field342 << 3) + (this.field340 << 6) && arg2 <= (this.field342 << 3) + (this.field340 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ak.o(III)Z")
    public boolean method149(int arg0, int arg1) {
        return arg0 >= (this.field343 << 3) + (this.field335 << 6) && arg0 <= (this.field343 << 3) + (this.field335 << 6) + 7 && arg1 >= (this.field345 << 6) + (this.field339 << 3) && arg1 <= (this.field345 << 6) + (this.field339 << 3) + 7;
    }

    @ObfuscatedName("ak.k(IIIB)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method167(arg0, arg1, arg2) ? new int[] { this.field343 * 8 - this.field344 * 8 + this.field335 * 64 - this.field337 * 64 + arg1, this.field339 * 8 - this.field342 * 8 + this.field345 * 64 - this.field340 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ak.u(IIB)Lhv;")
    public class229 method151(int arg0, int arg1) {
        if (this.method149(arg0, arg1)) {
            int var3 = this.field344 * 8 - this.field343 * 8 + this.field337 * 64 - this.field335 * 64 + arg0;
            int var4 = this.field342 * 8 - this.field339 * 8 + this.field340 * 64 - this.field345 * 64 + arg1;
            return new class229(this.field338, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ak.i(Lgx;I)V")
    public void method152(class185 arg0) {
        this.field338 = arg0.method3274();
        this.field336 = arg0.method3274();
        this.field337 = arg0.method3276();
        this.field344 = arg0.method3274();
        this.field340 = arg0.method3276();
        this.field342 = arg0.method3274();
        this.field335 = arg0.method3276();
        this.field343 = arg0.method3274();
        this.field345 = arg0.method3276();
        this.field339 = arg0.method3274();
        this.method624();
    }

    @ObfuscatedName("ak.t(B)V")
    public void method624() {
    }
}
