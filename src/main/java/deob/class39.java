package deob;

@ObfuscatedName("ah")
public class class39 implements class43 {

    @ObfuscatedName("ah.b")
    public int field486;

    @ObfuscatedName("ah.s")
    public int field481;

    @ObfuscatedName("ah.r")
    public int field482;

    @ObfuscatedName("ah.g")
    public int field483;

    @ObfuscatedName("ah.x")
    public int field484;

    @ObfuscatedName("ah.f")
    public int field480;

    @ObfuscatedName("ah.b(Lam;I)V")
    public void method184(class33 arg0) {
        if (arg0.field424 > this.field484) {
            arg0.field424 = this.field484;
        }
        if (arg0.field425 < this.field484) {
            arg0.field425 = this.field484;
        }
        if (arg0.field418 > this.field480) {
            arg0.field418 = this.field480;
        }
        if (arg0.field427 < this.field480) {
            arg0.field427 = this.field480;
        }
    }

    @ObfuscatedName("ah.s(IIIB)Z")
    public boolean method172(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field486 && arg0 < this.field486 + this.field481) {
            return arg1 >> 6 == this.field482 && arg2 >> 6 == this.field483;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.r(III)Z")
    public boolean method173(int arg0, int arg1) {
        return arg0 >> 6 == this.field484 && arg1 >> 6 == this.field480;
    }

    @ObfuscatedName("ah.g(IIII)[I")
    public int[] method174(int arg0, int arg1, int arg2) {
        return this.method172(arg0, arg1, arg2) ? new int[] { this.field484 * 64 - this.field482 * 64 + arg1, this.field480 * 64 - this.field483 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.x(III)Lhk;")
    public class220 method175(int arg0, int arg1) {
        if (this.method173(arg0, arg1)) {
            int var3 = this.field482 * 64 - this.field484 * 64 + arg0;
            int var4 = this.field483 * 64 - this.field480 * 64 + arg1;
            return new class220(this.field486, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.f(Lfs;I)V")
    public void method176(class181 arg0) {
        this.field486 = arg0.method2945();
        this.field481 = arg0.method2945();
        this.field482 = arg0.method3081();
        this.field483 = arg0.method3081();
        this.field484 = arg0.method3081();
        this.field480 = arg0.method3081();
        this.method455();
    }

    @ObfuscatedName("ah.u(I)V")
    public void method455() {
    }
}
