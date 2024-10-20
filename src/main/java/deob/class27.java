package deob;

@ObfuscatedName("ap")
public class class27 implements class43 {

    @ObfuscatedName("ap.w")
    public int field392;

    @ObfuscatedName("ap.o")
    public int field389;

    @ObfuscatedName("ap.x")
    public int field390;

    @ObfuscatedName("ap.k")
    public int field391;

    @ObfuscatedName("ap.f")
    public int field395;

    @ObfuscatedName("ap.i")
    public int field393;

    @ObfuscatedName("ap.j")
    public int field402;

    @ObfuscatedName("ap.m")
    public int field388;

    @ObfuscatedName("ap.u")
    public int field397;

    @ObfuscatedName("ap.r")
    public int field396;

    @ObfuscatedName("ap.v")
    public int field398;

    @ObfuscatedName("ap.h")
    public int field399;

    @ObfuscatedName("ap.a")
    public int field400;

    @ObfuscatedName("ap.p")
    public int field401;

    @ObfuscatedName("ap.w(Laq;I)V")
    public void method203(class33 arg0) {
        if (arg0.field461 > this.field395) {
            arg0.field461 = this.field395;
        }
        if (arg0.field468 < this.field395) {
            arg0.field468 = this.field395;
        }
        if (arg0.field474 > this.field393) {
            arg0.field474 = this.field393;
        }
        if (arg0.field470 < this.field393) {
            arg0.field470 = this.field393;
        }
    }

    @ObfuscatedName("ap.o(IIIB)Z")
    public boolean method177(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field392 && arg0 < this.field392 + this.field389) {
            return arg1 >= (this.field402 << 3) + (this.field390 << 6) && arg1 <= (this.field397 << 3) + (this.field390 << 6) + 7 && arg2 >= (this.field391 << 6) + (this.field388 << 3) && arg2 <= (this.field396 << 3) + (this.field391 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.x(III)Z")
    public boolean method176(int arg0, int arg1) {
        return arg0 >= (this.field398 << 3) + (this.field395 << 6) && arg0 <= (this.field400 << 3) + (this.field395 << 6) + 7 && arg1 >= (this.field399 << 3) + (this.field393 << 6) && arg1 <= (this.field401 << 3) + (this.field393 << 6) + 7;
    }

    @ObfuscatedName("ap.k(IIII)[I")
    public int[] method179(int arg0, int arg1, int arg2) {
        return this.method177(arg0, arg1, arg2) ? new int[] { this.field398 * 8 - this.field402 * 8 + this.field395 * 64 - this.field390 * 64 + arg1, this.field399 * 8 - this.field388 * 8 + this.field393 * 64 - this.field391 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ap.f(III)Lhp;")
    public class216 method180(int arg0, int arg1) {
        if (this.method176(arg0, arg1)) {
            int var3 = this.field402 * 8 - this.field398 * 8 + this.field390 * 64 - this.field395 * 64 + arg0;
            int var4 = this.field388 * 8 - this.field399 * 8 + this.field391 * 64 - this.field393 * 64 + arg1;
            return new class216(this.field392, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.i(Lfi;B)V")
    public void method181(class177 arg0) {
        this.field392 = arg0.method2931();
        this.field389 = arg0.method2931();
        this.field390 = arg0.method2886();
        this.field402 = arg0.method2931();
        this.field397 = arg0.method2931();
        this.field391 = arg0.method2886();
        this.field388 = arg0.method2931();
        this.field396 = arg0.method2931();
        this.field395 = arg0.method2886();
        this.field398 = arg0.method2931();
        this.field400 = arg0.method2931();
        this.field393 = arg0.method2886();
        this.field399 = arg0.method2931();
        this.field401 = arg0.method2931();
        this.method193();
    }

    @ObfuscatedName("ap.j(B)V")
    public void method193() {
    }
}
