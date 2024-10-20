package deob;

@ObfuscatedName("he")
public class class230 implements class246 {

    @ObfuscatedName("he.o")
    public int field2804;

    @ObfuscatedName("he.q")
    public int field2799;

    @ObfuscatedName("he.l")
    public int field2796;

    @ObfuscatedName("he.k")
    public int field2794;

    @ObfuscatedName("he.a")
    public int field2798;

    @ObfuscatedName("he.m")
    public int field2795;

    @ObfuscatedName("he.p")
    public int field2800;

    @ObfuscatedName("he.s")
    public int field2801;

    @ObfuscatedName("he.r")
    public int field2802;

    @ObfuscatedName("he.v")
    public int field2803;

    @ObfuscatedName("he.o(Lhm;I)V")
    public void method4125(class226 arg0) {
        if (arg0.field2743 > this.field2798) {
            arg0.field2743 = this.field2798;
        }
        if (arg0.field2744 < this.field2798) {
            arg0.field2744 = this.field2798;
        }
        if (arg0.field2747 > this.field2795) {
            arg0.field2747 = this.field2795;
        }
        if (arg0.field2746 < this.field2795) {
            arg0.field2746 = this.field2795;
        }
    }

    @ObfuscatedName("he.q(IIIB)Z")
    public boolean method4120(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2804 && arg0 < this.field2804 + this.field2799) {
            return arg1 >= (this.field2800 << 3) + (this.field2796 << 6) && arg1 <= (this.field2800 << 3) + (this.field2796 << 6) + 7 && arg2 >= (this.field2801 << 3) + (this.field2794 << 6) && arg2 <= (this.field2801 << 3) + (this.field2794 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("he.l(IIB)Z")
    public boolean method4124(int arg0, int arg1) {
        return arg0 >= (this.field2802 << 3) + (this.field2798 << 6) && arg0 <= (this.field2802 << 3) + (this.field2798 << 6) + 7 && arg1 >= (this.field2803 << 3) + (this.field2795 << 6) && arg1 <= (this.field2803 << 3) + (this.field2795 << 6) + 7;
    }

    @ObfuscatedName("he.k(IIII)[I")
    public int[] method4110(int arg0, int arg1, int arg2) {
        return this.method4120(arg0, arg1, arg2) ? new int[] { this.field2802 * 8 - this.field2800 * 8 + this.field2798 * 64 - this.field2796 * 64 + arg1, this.field2803 * 8 - this.field2801 * 8 + this.field2795 * 64 - this.field2794 * 64 + arg2 } : null;
    }

    @ObfuscatedName("he.a(III)Lkd;")
    public class290 method4112(int arg0, int arg1) {
        if (this.method4124(arg0, arg1)) {
            int var3 = this.field2800 * 8 - this.field2802 * 8 + this.field2796 * 64 - this.field2798 * 64 + arg0;
            int var4 = this.field2801 * 8 - this.field2803 * 8 + this.field2794 * 64 - this.field2795 * 64 + arg1;
            return new class290(this.field2804, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("he.m(Lpx;I)V")
    public void method4113(class440 arg0) {
        this.field2804 = arg0.method7071();
        this.field2799 = arg0.method7071();
        this.field2796 = arg0.method7082();
        this.field2800 = arg0.method7071();
        this.field2794 = arg0.method7082();
        this.field2801 = arg0.method7071();
        this.field2798 = arg0.method7082();
        this.field2802 = arg0.method7071();
        this.field2795 = arg0.method7082();
        this.field2803 = arg0.method7071();
        this.method4386();
    }

    @ObfuscatedName("he.p(B)V")
    public void method4386() {
    }
}
