package deob;

@ObfuscatedName("aj")
public class class52 implements class47 {

    @ObfuscatedName("aj.m")
    public int field392;

    @ObfuscatedName("aj.o")
    public int field380;

    @ObfuscatedName("aj.q")
    public int field384;

    @ObfuscatedName("aj.j")
    public int field382;

    @ObfuscatedName("aj.p")
    public int field383;

    @ObfuscatedName("aj.g")
    public int field381;

    @ObfuscatedName("aj.n")
    public int field385;

    @ObfuscatedName("aj.u")
    public int field386;

    @ObfuscatedName("aj.a")
    public int field387;

    @ObfuscatedName("aj.z")
    public int field388;

    @ObfuscatedName("aj.m(Lad;I)V")
    public void method244(class36 arg0) {
        if (arg0.field247 > this.field383) {
            arg0.field247 = this.field383;
        }
        if (arg0.field248 < this.field383) {
            arg0.field248 = this.field383;
        }
        if (arg0.field249 > this.field381) {
            arg0.field249 = this.field381;
        }
        if (arg0.field241 < this.field381) {
            arg0.field241 = this.field381;
        }
    }

    @ObfuscatedName("aj.o(IIIB)Z")
    public boolean method245(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field392 && arg0 < this.field392 + this.field380) {
            return arg1 >= (this.field385 << 3) + (this.field384 << 6) && arg1 <= (this.field385 << 3) + (this.field384 << 6) + 7 && arg2 >= (this.field386 << 3) + (this.field382 << 6) && arg2 <= (this.field386 << 3) + (this.field382 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.q(IIB)Z")
    public boolean method246(int arg0, int arg1) {
        return arg0 >= (this.field387 << 3) + (this.field383 << 6) && arg0 <= (this.field387 << 3) + (this.field383 << 6) + 7 && arg1 >= (this.field388 << 3) + (this.field381 << 6) && arg1 <= (this.field388 << 3) + (this.field381 << 6) + 7;
    }

    @ObfuscatedName("aj.j(IIII)[I")
    public int[] method247(int arg0, int arg1, int arg2) {
        return this.method245(arg0, arg1, arg2) ? new int[] { this.field387 * 8 - this.field385 * 8 + this.field383 * 64 - this.field384 * 64 + arg1, this.field388 * 8 - this.field386 * 8 + this.field381 * 64 - this.field382 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aj.p(III)Lhg;")
    public class223 method248(int arg0, int arg1) {
        if (this.method246(arg0, arg1)) {
            int var3 = this.field385 * 8 - this.field387 * 8 + this.field384 * 64 - this.field383 * 64 + arg0;
            int var4 = this.field386 * 8 - this.field388 * 8 + this.field382 * 64 - this.field381 * 64 + arg1;
            return new class223(this.field392, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aj.g(Lkn;B)V")
    public void method249(class310 arg0) {
        this.field392 = arg0.method5227();
        this.field380 = arg0.method5227();
        this.field384 = arg0.method5283();
        this.field385 = arg0.method5227();
        this.field382 = arg0.method5283();
        this.field386 = arg0.method5227();
        this.field383 = arg0.method5283();
        this.field387 = arg0.method5227();
        this.field381 = arg0.method5283();
        this.field388 = arg0.method5227();
        this.method698();
    }

    @ObfuscatedName("aj.n(I)V")
    public void method698() {
    }
}
