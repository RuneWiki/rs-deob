package deob;

@ObfuscatedName("ah")
public class class27 implements class43 {

    @ObfuscatedName("ah.i")
    public int field392;

    @ObfuscatedName("ah.w")
    public int field377;

    @ObfuscatedName("ah.a")
    public int field387;

    @ObfuscatedName("ah.t")
    public int field389;

    @ObfuscatedName("ah.s")
    public int field380;

    @ObfuscatedName("ah.r")
    public int field381;

    @ObfuscatedName("ah.v")
    public int field393;

    @ObfuscatedName("ah.y")
    public int field383;

    @ObfuscatedName("ah.j")
    public int field384;

    @ObfuscatedName("ah.k")
    public int field385;

    @ObfuscatedName("ah.e")
    public int field386;

    @ObfuscatedName("ah.o")
    public int field382;

    @ObfuscatedName("ah.z")
    public int field388;

    @ObfuscatedName("ah.l")
    public int field379;

    @ObfuscatedName("ah.i(Lar;I)V")
    public void method162(class33 arg0) {
        if (arg0.field468 > this.field380) {
            arg0.field468 = this.field380;
        }
        if (arg0.field469 < this.field380) {
            arg0.field469 = this.field380;
        }
        if (arg0.field473 > this.field381) {
            arg0.field473 = this.field381;
        }
        if (arg0.field467 < this.field381) {
            arg0.field467 = this.field381;
        }
    }

    @ObfuscatedName("ah.w(IIII)Z")
    public boolean method167(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field392 && arg0 < this.field392 + this.field377) {
            return arg1 >= (this.field393 << 3) + (this.field387 << 6) && arg1 <= (this.field387 << 6) + (this.field384 << 3) + 7 && arg2 >= (this.field389 << 6) + (this.field383 << 3) && arg2 <= (this.field389 << 6) + (this.field385 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.a(III)Z")
    public boolean method189(int arg0, int arg1) {
        return arg0 >= (this.field386 << 3) + (this.field380 << 6) && arg0 <= (this.field388 << 3) + (this.field380 << 6) + 7 && arg1 >= (this.field382 << 3) + (this.field381 << 6) && arg1 <= (this.field381 << 6) + (this.field379 << 3) + 7;
    }

    @ObfuscatedName("ah.t(IIII)[I")
    public int[] method164(int arg0, int arg1, int arg2) {
        return this.method167(arg0, arg1, arg2) ? new int[] { this.field386 * 8 - this.field393 * 8 + this.field380 * 64 - this.field387 * 64 + arg1, this.field382 * 8 - this.field383 * 8 + this.field381 * 64 - this.field389 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.s(III)Lhb;")
    public class213 method165(int arg0, int arg1) {
        if (this.method189(arg0, arg1)) {
            int var3 = this.field393 * 8 - this.field386 * 8 + this.field387 * 64 - this.field380 * 64 + arg0;
            int var4 = this.field383 * 8 - this.field382 * 8 + this.field389 * 64 - this.field381 * 64 + arg1;
            return new class213(this.field392, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.r(Lfp;I)V")
    public void method166(class174 arg0) {
        this.field392 = arg0.method3061();
        this.field377 = arg0.method3061();
        this.field387 = arg0.method2882();
        this.field393 = arg0.method3061();
        this.field384 = arg0.method3061();
        this.field389 = arg0.method2882();
        this.field383 = arg0.method3061();
        this.field385 = arg0.method3061();
        this.field380 = arg0.method2882();
        this.field386 = arg0.method3061();
        this.field388 = arg0.method3061();
        this.field381 = arg0.method2882();
        this.field382 = arg0.method3061();
        this.field379 = arg0.method3061();
        this.method180();
    }

    @ObfuscatedName("ah.v(S)V")
    public void method180() {
    }
}
