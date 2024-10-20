package deob;

@ObfuscatedName("ax")
public class class39 implements class43 {

    @ObfuscatedName("ax.b")
    public int field486;

    @ObfuscatedName("ax.q")
    public int field481;

    @ObfuscatedName("ax.o")
    public int field480;

    @ObfuscatedName("ax.p")
    public int field483;

    @ObfuscatedName("ax.a")
    public int field484;

    @ObfuscatedName("ax.h")
    public int field482;

    @ObfuscatedName("ax.b(Lai;B)V")
    public void method193(class33 arg0) {
        if (arg0.field420 > this.field484) {
            arg0.field420 = this.field484;
        }
        if (arg0.field421 < this.field484) {
            arg0.field421 = this.field484;
        }
        if (arg0.field414 > this.field482) {
            arg0.field414 = this.field482;
        }
        if (arg0.field423 < this.field482) {
            arg0.field423 = this.field482;
        }
    }

    @ObfuscatedName("ax.q(IIII)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field486 && arg0 < this.field486 + this.field481) {
            return arg1 >> 6 == this.field480 && arg2 >> 6 == this.field483;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.o(IIB)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >> 6 == this.field484 && arg1 >> 6 == this.field482;
    }

    @ObfuscatedName("ax.p(IIII)[I")
    public int[] method214(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field484 * 64 - this.field480 * 64 + arg1, this.field482 * 64 - this.field483 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ax.a(III)Lhp;")
    public class233 method192(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field480 * 64 - this.field484 * 64 + arg0;
            int var4 = this.field483 * 64 - this.field482 * 64 + arg1;
            return new class233(this.field486, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.h(Lgn;I)V")
    public void method197(class194 arg0) {
        this.field486 = arg0.method3247();
        this.field481 = arg0.method3247();
        this.field480 = arg0.method3249();
        this.field483 = arg0.method3249();
        this.field484 = arg0.method3249();
        this.field482 = arg0.method3249();
        this.method485();
    }

    @ObfuscatedName("ax.l(I)V")
    public void method485() {
    }
}
