package deob;

@ObfuscatedName("hh")
public class class230 implements class246 {

    @ObfuscatedName("hh.c")
    public int field2792;

    @ObfuscatedName("hh.p")
    public int field2787;

    @ObfuscatedName("hh.f")
    public int field2786;

    @ObfuscatedName("hh.n")
    public int field2788;

    @ObfuscatedName("hh.k")
    public int field2789;

    @ObfuscatedName("hh.w")
    public int field2790;

    @ObfuscatedName("hh.s")
    public int field2785;

    @ObfuscatedName("hh.q")
    public int field2791;

    @ObfuscatedName("hh.m")
    public int field2793;

    @ObfuscatedName("hh.x")
    public int field2794;

    @ObfuscatedName("hh.c(Lht;I)V")
    public void method4310(class226 arg0) {
        if (arg0.field2737 > this.field2789) {
            arg0.field2737 = this.field2789;
        }
        if (arg0.field2745 < this.field2789) {
            arg0.field2745 = this.field2789;
        }
        if (arg0.field2739 > this.field2790) {
            arg0.field2739 = this.field2790;
        }
        if (arg0.field2731 < this.field2790) {
            arg0.field2731 = this.field2790;
        }
    }

    @ObfuscatedName("hh.p(IIIB)Z")
    public boolean method4311(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2792 && arg0 < this.field2792 + this.field2787) {
            return arg1 >= (this.field2786 << 6) + (this.field2785 << 3) && arg1 <= (this.field2786 << 6) + (this.field2785 << 3) + 7 && arg2 >= (this.field2791 << 3) + (this.field2788 << 6) && arg2 <= (this.field2791 << 3) + (this.field2788 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hh.f(III)Z")
    public boolean method4312(int arg0, int arg1) {
        return arg0 >= (this.field2793 << 3) + (this.field2789 << 6) && arg0 <= (this.field2793 << 3) + (this.field2789 << 6) + 7 && arg1 >= (this.field2794 << 3) + (this.field2790 << 6) && arg1 <= (this.field2794 << 3) + (this.field2790 << 6) + 7;
    }

    @ObfuscatedName("hh.n(IIIB)[I")
    public int[] method4313(int arg0, int arg1, int arg2) {
        return this.method4311(arg0, arg1, arg2) ? new int[] { this.field2793 * 8 - this.field2785 * 8 + this.field2789 * 64 - this.field2786 * 64 + arg1, this.field2794 * 8 - this.field2791 * 8 + this.field2790 * 64 - this.field2788 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hh.k(III)Lkz;")
    public class291 method4331(int arg0, int arg1) {
        if (this.method4312(arg0, arg1)) {
            int var3 = this.field2785 * 8 - this.field2793 * 8 + this.field2786 * 64 - this.field2789 * 64 + arg0;
            int var4 = this.field2791 * 8 - this.field2794 * 8 + this.field2788 * 64 - this.field2790 * 64 + arg1;
            return new class291(this.field2792, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hh.w(Lqq;I)V")
    public void method4317(class445 arg0) {
        this.field2792 = arg0.method7196();
        this.field2787 = arg0.method7196();
        this.field2786 = arg0.method7198();
        this.field2785 = arg0.method7196();
        this.field2788 = arg0.method7198();
        this.field2791 = arg0.method7196();
        this.field2789 = arg0.method7198();
        this.field2793 = arg0.method7196();
        this.field2790 = arg0.method7198();
        this.field2794 = arg0.method7196();
        this.method4598();
    }

    @ObfuscatedName("hh.s(I)V")
    public void method4598() {
    }
}
