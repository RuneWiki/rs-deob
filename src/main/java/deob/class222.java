package deob;

@ObfuscatedName("hk")
public class class222 implements class238 {

    @ObfuscatedName("hk.c")
    public int field2691;

    @ObfuscatedName("hk.l")
    public int field2688;

    @ObfuscatedName("hk.s")
    public int field2682;

    @ObfuscatedName("hk.e")
    public int field2680;

    @ObfuscatedName("hk.r")
    public int field2689;

    @ObfuscatedName("hk.o")
    public int field2685;

    @ObfuscatedName("hk.i")
    public int field2686;

    @ObfuscatedName("hk.w")
    public int field2684;

    @ObfuscatedName("hk.v")
    public int field2687;

    @ObfuscatedName("hk.a")
    public int field2683;

    @ObfuscatedName("hk.c(Lhm;I)V")
    public void method4003(class218 arg0) {
        if (arg0.field2635 > this.field2689) {
            arg0.field2635 = this.field2689;
        }
        if (arg0.field2636 < this.field2689) {
            arg0.field2636 = this.field2689;
        }
        if (arg0.field2630 > this.field2685) {
            arg0.field2630 = this.field2685;
        }
        if (arg0.field2637 < this.field2685) {
            arg0.field2637 = this.field2685;
        }
    }

    @ObfuscatedName("hk.l(IIII)Z")
    public boolean method4024(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2691 && arg0 < this.field2691 + this.field2688) {
            return arg1 >= (this.field2686 << 3) + (this.field2682 << 6) && arg1 <= (this.field2686 << 3) + (this.field2682 << 6) + 7 && arg2 >= (this.field2684 << 3) + (this.field2680 << 6) && arg2 <= (this.field2684 << 3) + (this.field2680 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hk.s(III)Z")
    public boolean method4007(int arg0, int arg1) {
        return arg0 >= (this.field2689 << 6) + (this.field2687 << 3) && arg0 <= (this.field2689 << 6) + (this.field2687 << 3) + 7 && arg1 >= (this.field2685 << 6) + (this.field2683 << 3) && arg1 <= (this.field2685 << 6) + (this.field2683 << 3) + 7;
    }

    @ObfuscatedName("hk.e(IIII)[I")
    public int[] method4013(int arg0, int arg1, int arg2) {
        return this.method4024(arg0, arg1, arg2) ? new int[] { this.field2687 * 8 - this.field2686 * 8 + this.field2689 * 64 - this.field2682 * 64 + arg1, this.field2683 * 8 - this.field2684 * 8 + this.field2685 * 64 - this.field2680 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hk.r(IIB)Ljd;")
    public class282 method4006(int arg0, int arg1) {
        if (this.method4007(arg0, arg1)) {
            int var3 = this.field2686 * 8 - this.field2687 * 8 + this.field2682 * 64 - this.field2689 * 64 + arg0;
            int var4 = this.field2684 * 8 - this.field2683 * 8 + this.field2680 * 64 - this.field2685 * 64 + arg1;
            return new class282(this.field2691, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hk.o(Lpi;B)V")
    public void method4002(class421 arg0) {
        this.field2691 = arg0.method6686();
        this.field2688 = arg0.method6686();
        this.field2682 = arg0.method6666();
        this.field2686 = arg0.method6686();
        this.field2680 = arg0.method6666();
        this.field2684 = arg0.method6686();
        this.field2689 = arg0.method6666();
        this.field2687 = arg0.method6686();
        this.field2685 = arg0.method6666();
        this.field2683 = arg0.method6686();
        this.method4294();
    }

    @ObfuscatedName("hk.i(B)V")
    public void method4294() {
    }
}
