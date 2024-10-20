package deob;

@ObfuscatedName("hy")
public class class225 implements class238 {

    @ObfuscatedName("hy.c")
    public int field2707;

    @ObfuscatedName("hy.l")
    public int field2699;

    @ObfuscatedName("hy.s")
    public int field2709;

    @ObfuscatedName("hy.e")
    public int field2702;

    @ObfuscatedName("hy.r")
    public int field2703;

    @ObfuscatedName("hy.o")
    public int field2704;

    @ObfuscatedName("hy.i")
    public int field2711;

    @ObfuscatedName("hy.w")
    public int field2706;

    @ObfuscatedName("hy.v")
    public int field2700;

    @ObfuscatedName("hy.a")
    public int field2708;

    @ObfuscatedName("hy.y")
    public int field2705;

    @ObfuscatedName("hy.u")
    public int field2710;

    @ObfuscatedName("hy.h")
    public int field2701;

    @ObfuscatedName("hy.q")
    public int field2712;

    @ObfuscatedName("hy.c(Lhm;I)V")
    public void method4003(class218 arg0) {
        if (arg0.field2635 > this.field2703) {
            arg0.field2635 = this.field2703;
        }
        if (arg0.field2636 < this.field2703) {
            arg0.field2636 = this.field2703;
        }
        if (arg0.field2630 > this.field2704) {
            arg0.field2630 = this.field2704;
        }
        if (arg0.field2637 < this.field2704) {
            arg0.field2637 = this.field2704;
        }
    }

    @ObfuscatedName("hy.l(IIII)Z")
    public boolean method4024(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2707 && arg0 < this.field2707 + this.field2699) {
            return arg1 >= (this.field2711 << 3) + (this.field2709 << 6) && arg1 <= (this.field2709 << 6) + (this.field2700 << 3) + 7 && arg2 >= (this.field2706 << 3) + (this.field2702 << 6) && arg2 <= (this.field2708 << 3) + (this.field2702 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hy.s(III)Z")
    public boolean method4007(int arg0, int arg1) {
        return arg0 >= (this.field2705 << 3) + (this.field2703 << 6) && arg0 <= (this.field2703 << 6) + (this.field2701 << 3) + 7 && arg1 >= (this.field2710 << 3) + (this.field2704 << 6) && arg1 <= (this.field2712 << 3) + (this.field2704 << 6) + 7;
    }

    @ObfuscatedName("hy.e(IIII)[I")
    public int[] method4013(int arg0, int arg1, int arg2) {
        return this.method4024(arg0, arg1, arg2) ? new int[] { this.field2705 * 8 - this.field2711 * 8 + this.field2703 * 64 - this.field2709 * 64 + arg1, this.field2710 * 8 - this.field2706 * 8 + this.field2704 * 64 - this.field2702 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hy.r(IIB)Ljd;")
    public class282 method4006(int arg0, int arg1) {
        if (this.method4007(arg0, arg1)) {
            int var3 = this.field2711 * 8 - this.field2705 * 8 + this.field2709 * 64 - this.field2703 * 64 + arg0;
            int var4 = this.field2706 * 8 - this.field2710 * 8 + this.field2702 * 64 - this.field2704 * 64 + arg1;
            return new class282(this.field2707, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hy.o(Lpi;B)V")
    public void method4002(class421 arg0) {
        this.field2707 = arg0.method6686();
        this.field2699 = arg0.method6686();
        this.field2709 = arg0.method6666();
        this.field2711 = arg0.method6686();
        this.field2700 = arg0.method6686();
        this.field2702 = arg0.method6666();
        this.field2706 = arg0.method6686();
        this.field2708 = arg0.method6686();
        this.field2703 = arg0.method6666();
        this.field2705 = arg0.method6686();
        this.field2701 = arg0.method6686();
        this.field2704 = arg0.method6666();
        this.field2710 = arg0.method6686();
        this.field2712 = arg0.method6686();
        this.method4303();
    }

    @ObfuscatedName("hy.i(I)V")
    public void method4303() {
    }
}
