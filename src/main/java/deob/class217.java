package deob;

@ObfuscatedName("hv")
public class class217 implements class238 {

    @ObfuscatedName("hv.c")
    public int field2628;

    @ObfuscatedName("hv.l")
    public int field2623;

    @ObfuscatedName("hv.s")
    public int field2620;

    @ObfuscatedName("hv.e")
    public int field2618;

    @ObfuscatedName("hv.r")
    public int field2622;

    @ObfuscatedName("hv.o")
    public int field2621;

    @ObfuscatedName("hv.i")
    public int field2624;

    @ObfuscatedName("hv.w")
    public int field2619;

    @ObfuscatedName("hv.v")
    public int field2626;

    @ObfuscatedName("hv.a")
    public int field2627;

    @ObfuscatedName("hv.c(Lhm;I)V")
    public void method4003(class218 arg0) {
        if (arg0.field2635 > this.field2624) {
            arg0.field2635 = this.field2624;
        }
        if (arg0.field2636 < this.field2626) {
            arg0.field2636 = this.field2626;
        }
        if (arg0.field2630 > this.field2619) {
            arg0.field2630 = this.field2619;
        }
        if (arg0.field2637 < this.field2627) {
            arg0.field2637 = this.field2627;
        }
    }

    @ObfuscatedName("hv.l(IIII)Z")
    public boolean method4024(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2628 && arg0 < this.field2628 + this.field2623) {
            return arg1 >> 6 >= this.field2620 && arg1 >> 6 <= this.field2622 && arg2 >> 6 >= this.field2618 && arg2 >> 6 <= this.field2621;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hv.s(III)Z")
    public boolean method4007(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2624 && arg0 >> 6 <= this.field2626 && arg1 >> 6 >= this.field2619 && arg1 >> 6 <= this.field2627;
    }

    @ObfuscatedName("hv.e(IIII)[I")
    public int[] method4013(int arg0, int arg1, int arg2) {
        return this.method4024(arg0, arg1, arg2) ? new int[] { this.field2624 * 64 - this.field2620 * 64 + arg1, this.field2619 * 64 - this.field2618 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hv.r(IIB)Ljd;")
    public class282 method4006(int arg0, int arg1) {
        if (this.method4007(arg0, arg1)) {
            int var3 = this.field2620 * 64 - this.field2624 * 64 + arg0;
            int var4 = this.field2618 * 64 - this.field2619 * 64 + arg1;
            return new class282(this.field2628, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hv.o(Lpi;B)V")
    public void method4002(class421 arg0) {
        this.field2628 = arg0.method6686();
        this.field2623 = arg0.method6686();
        this.field2620 = arg0.method6666();
        this.field2618 = arg0.method6666();
        this.field2622 = arg0.method6666();
        this.field2621 = arg0.method6666();
        this.field2624 = arg0.method6666();
        this.field2619 = arg0.method6666();
        this.field2626 = arg0.method6666();
        this.field2627 = arg0.method6666();
        this.method4008();
    }

    @ObfuscatedName("hv.i(S)V")
    public void method4008() {
    }
}
