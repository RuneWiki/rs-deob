package deob;

@ObfuscatedName("ai")
public class class27 implements class43 {

    @ObfuscatedName("ai.a")
    public int field380;

    @ObfuscatedName("ai.j")
    public int field388;

    @ObfuscatedName("ai.n")
    public int field385;

    @ObfuscatedName("ai.r")
    public int field378;

    @ObfuscatedName("ai.v")
    public int field379;

    @ObfuscatedName("ai.e")
    public int field390;

    @ObfuscatedName("ai.l")
    public int field377;

    @ObfuscatedName("ai.s")
    public int field389;

    @ObfuscatedName("ai.w")
    public int field383;

    @ObfuscatedName("ai.p")
    public int field384;

    @ObfuscatedName("ai.m")
    public int field382;

    @ObfuscatedName("ai.u")
    public int field386;

    @ObfuscatedName("ai.g")
    public int field387;

    @ObfuscatedName("ai.k")
    public int field375;

    @ObfuscatedName("ai.a(Lam;I)V")
    public void method170(class33 arg0) {
        if (arg0.field448 > this.field379) {
            arg0.field448 = this.field379;
        }
        if (arg0.field449 < this.field379) {
            arg0.field449 = this.field379;
        }
        if (arg0.field442 > this.field390) {
            arg0.field442 = this.field390;
        }
        if (arg0.field451 < this.field390) {
            arg0.field451 = this.field390;
        }
    }

    @ObfuscatedName("ai.j(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field380 && arg0 < this.field388 + this.field380) {
            return arg1 >= (this.field385 << 6) + (this.field377 << 3) && arg1 <= (this.field385 << 6) + (this.field383 << 3) + 7 && arg2 >= (this.field389 << 3) + (this.field378 << 6) && arg2 <= (this.field384 << 3) + (this.field378 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.n(III)Z")
    public boolean method197(int arg0, int arg1) {
        return arg0 >= (this.field382 << 3) + (this.field379 << 6) && arg0 <= (this.field387 << 3) + (this.field379 << 6) + 7 && arg1 >= (this.field390 << 6) + (this.field386 << 3) && arg1 <= (this.field390 << 6) + (this.field375 << 3) + 7;
    }

    @ObfuscatedName("ai.r(IIIB)[I")
    public int[] method173(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field382 * 8 - this.field377 * 8 + this.field379 * 64 - this.field385 * 64 + arg1, this.field386 * 8 - this.field389 * 8 + this.field390 * 64 - this.field378 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ai.v(III)Lhd;")
    public class213 method174(int arg0, int arg1) {
        if (this.method197(arg0, arg1)) {
            int var3 = this.field377 * 8 - this.field382 * 8 + this.field385 * 64 - this.field379 * 64 + arg0;
            int var4 = this.field389 * 8 - this.field386 * 8 + this.field378 * 64 - this.field390 * 64 + arg1;
            return new class213(this.field380, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ai.e(Lfe;I)V")
    public void method182(class174 arg0) {
        this.field380 = arg0.method2871();
        this.field388 = arg0.method2871();
        this.field385 = arg0.method2873();
        this.field377 = arg0.method2871();
        this.field383 = arg0.method2871();
        this.field378 = arg0.method2873();
        this.field389 = arg0.method2871();
        this.field384 = arg0.method2871();
        this.field379 = arg0.method2873();
        this.field382 = arg0.method2871();
        this.field387 = arg0.method2871();
        this.field390 = arg0.method2873();
        this.field386 = arg0.method2871();
        this.field375 = arg0.method2871();
        this.method176();
    }

    @ObfuscatedName("ai.l(B)V")
    public void method176() {
    }
}
