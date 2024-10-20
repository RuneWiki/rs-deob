package deob;

@ObfuscatedName("hs")
public class class224 implements class245 {

    @ObfuscatedName("hs.s")
    public int field2695;

    @ObfuscatedName("hs.h")
    public int field2703;

    @ObfuscatedName("hs.w")
    public int field2708;

    @ObfuscatedName("hs.v")
    public int field2696;

    @ObfuscatedName("hs.c")
    public int field2698;

    @ObfuscatedName("hs.q")
    public int field2699;

    @ObfuscatedName("hs.i")
    public int field2704;

    @ObfuscatedName("hs.k")
    public int field2701;

    @ObfuscatedName("hs.o")
    public int field2702;

    @ObfuscatedName("hs.n")
    public int field2697;

    @ObfuscatedName("hs.s(Lht;I)V")
    public void method4122(class225 arg0) {
        if (arg0.field2722 > this.field2704) {
            arg0.field2722 = this.field2704;
        }
        if (arg0.field2718 < this.field2702) {
            arg0.field2718 = this.field2702;
        }
        if (arg0.field2720 > this.field2701) {
            arg0.field2720 = this.field2701;
        }
        if (arg0.field2719 < this.field2697) {
            arg0.field2719 = this.field2697;
        }
    }

    @ObfuscatedName("hs.h(IIIS)Z")
    public boolean method4123(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2695 && arg0 < this.field2703 + this.field2695) {
            return arg1 >> 6 >= this.field2708 && arg1 >> 6 <= this.field2698 && arg2 >> 6 >= this.field2696 && arg2 >> 6 <= this.field2699;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hs.w(III)Z")
    public boolean method4124(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2704 && arg0 >> 6 <= this.field2702 && arg1 >> 6 >= this.field2701 && arg1 >> 6 <= this.field2697;
    }

    @ObfuscatedName("hs.v(IIII)[I")
    public int[] method4125(int arg0, int arg1, int arg2) {
        return this.method4123(arg0, arg1, arg2) ? new int[] { this.field2704 * 64 - this.field2708 * 64 + arg1, this.field2701 * 64 - this.field2696 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hs.c(III)Lku;")
    public class290 method4126(int arg0, int arg1) {
        if (this.method4124(arg0, arg1)) {
            int var3 = this.field2708 * 64 - this.field2704 * 64 + arg0;
            int var4 = this.field2696 * 64 - this.field2701 * 64 + arg1;
            return new class290(this.field2695, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hs.q(Lqr;B)V")
    public void method4136(class444 arg0) {
        this.field2695 = arg0.method6929();
        this.field2703 = arg0.method6929();
        this.field2708 = arg0.method7120();
        this.field2696 = arg0.method7120();
        this.field2698 = arg0.method7120();
        this.field2699 = arg0.method7120();
        this.field2704 = arg0.method7120();
        this.field2701 = arg0.method7120();
        this.field2702 = arg0.method7120();
        this.field2697 = arg0.method7120();
        this.method4127();
    }

    @ObfuscatedName("hs.i(B)V")
    public void method4127() {
    }
}
