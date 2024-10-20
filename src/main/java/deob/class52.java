package deob;

@ObfuscatedName("ac")
public class class52 implements class47 {

    @ObfuscatedName("ac.z")
    public int field392;

    @ObfuscatedName("ac.k")
    public int field382;

    @ObfuscatedName("ac.s")
    public int field383;

    @ObfuscatedName("ac.t")
    public int field393;

    @ObfuscatedName("ac.i")
    public int field385;

    @ObfuscatedName("ac.o")
    public int field386;

    @ObfuscatedName("ac.x")
    public int field390;

    @ObfuscatedName("ac.w")
    public int field388;

    @ObfuscatedName("ac.g")
    public int field381;

    @ObfuscatedName("ac.m")
    public int field387;

    @ObfuscatedName("ac.z(Lar;B)V")
    public void method265(class36 arg0) {
        if (arg0.field242 > this.field385) {
            arg0.field242 = this.field385;
        }
        if (arg0.field243 < this.field385) {
            arg0.field243 = this.field385;
        }
        if (arg0.field247 > this.field386) {
            arg0.field247 = this.field386;
        }
        if (arg0.field241 < this.field386) {
            arg0.field241 = this.field386;
        }
    }

    @ObfuscatedName("ac.k(IIII)Z")
    public boolean method280(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field392 && arg0 < this.field392 + this.field382) {
            return arg1 >= (this.field390 << 3) + (this.field383 << 6) && arg1 <= (this.field390 << 3) + (this.field383 << 6) + 7 && arg2 >= (this.field393 << 6) + (this.field388 << 3) && arg2 <= (this.field393 << 6) + (this.field388 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ac.s(III)Z")
    public boolean method279(int arg0, int arg1) {
        return arg0 >= (this.field385 << 6) + (this.field381 << 3) && arg0 <= (this.field385 << 6) + (this.field381 << 3) + 7 && arg1 >= (this.field387 << 3) + (this.field386 << 6) && arg1 <= (this.field387 << 3) + (this.field386 << 6) + 7;
    }

    @ObfuscatedName("ac.t(IIII)[I")
    public int[] method267(int arg0, int arg1, int arg2) {
        return this.method280(arg0, arg1, arg2) ? new int[] { this.field381 * 8 - this.field390 * 8 + this.field385 * 64 - this.field383 * 64 + arg1, this.field387 * 8 - this.field388 * 8 + this.field386 * 64 - this.field393 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ac.i(III)Lhg;")
    public class223 method284(int arg0, int arg1) {
        if (this.method279(arg0, arg1)) {
            int var3 = this.field390 * 8 - this.field381 * 8 + this.field383 * 64 - this.field385 * 64 + arg0;
            int var4 = this.field388 * 8 - this.field387 * 8 + this.field393 * 64 - this.field386 * 64 + arg1;
            return new class223(this.field392, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ac.o(Lkf;I)V")
    public void method269(class310 arg0) {
        this.field392 = arg0.method5193();
        this.field382 = arg0.method5193();
        this.field383 = arg0.method5195();
        this.field390 = arg0.method5193();
        this.field393 = arg0.method5195();
        this.field388 = arg0.method5193();
        this.field385 = arg0.method5195();
        this.field381 = arg0.method5193();
        this.field386 = arg0.method5195();
        this.field387 = arg0.method5193();
        this.method705();
    }

    @ObfuscatedName("ac.x(I)V")
    public void method705() {
    }
}
