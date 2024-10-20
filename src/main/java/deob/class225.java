package deob;

@ObfuscatedName("ho")
public class class225 implements class246 {

    @ObfuscatedName("ho.o")
    public int field2736;

    @ObfuscatedName("ho.q")
    public int field2725;

    @ObfuscatedName("ho.l")
    public int field2726;

    @ObfuscatedName("ho.k")
    public int field2727;

    @ObfuscatedName("ho.a")
    public int field2728;

    @ObfuscatedName("ho.m")
    public int field2732;

    @ObfuscatedName("ho.p")
    public int field2724;

    @ObfuscatedName("ho.s")
    public int field2731;

    @ObfuscatedName("ho.r")
    public int field2733;

    @ObfuscatedName("ho.v")
    public int field2730;

    @ObfuscatedName("ho.o(Lhm;I)V")
    public void method4125(class226 arg0) {
        if (arg0.field2743 > this.field2724) {
            arg0.field2743 = this.field2724;
        }
        if (arg0.field2744 < this.field2733) {
            arg0.field2744 = this.field2733;
        }
        if (arg0.field2747 > this.field2731) {
            arg0.field2747 = this.field2731;
        }
        if (arg0.field2746 < this.field2730) {
            arg0.field2746 = this.field2730;
        }
    }

    @ObfuscatedName("ho.q(IIIB)Z")
    public boolean method4120(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2736 && arg0 < this.field2736 + this.field2725) {
            return arg1 >> 6 >= this.field2726 && arg1 >> 6 <= this.field2728 && arg2 >> 6 >= this.field2727 && arg2 >> 6 <= this.field2732;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ho.l(IIB)Z")
    public boolean method4124(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2724 && arg0 >> 6 <= this.field2733 && arg1 >> 6 >= this.field2731 && arg1 >> 6 <= this.field2730;
    }

    @ObfuscatedName("ho.k(IIII)[I")
    public int[] method4110(int arg0, int arg1, int arg2) {
        return this.method4120(arg0, arg1, arg2) ? new int[] { this.field2724 * 64 - this.field2726 * 64 + arg1, this.field2731 * 64 - this.field2727 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ho.a(III)Lkd;")
    public class290 method4112(int arg0, int arg1) {
        if (this.method4124(arg0, arg1)) {
            int var3 = this.field2726 * 64 - this.field2724 * 64 + arg0;
            int var4 = this.field2727 * 64 - this.field2731 * 64 + arg1;
            return new class290(this.field2736, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ho.m(Lpx;I)V")
    public void method4113(class440 arg0) {
        this.field2736 = arg0.method7071();
        this.field2725 = arg0.method7071();
        this.field2726 = arg0.method7082();
        this.field2727 = arg0.method7082();
        this.field2728 = arg0.method7082();
        this.field2732 = arg0.method7082();
        this.field2724 = arg0.method7082();
        this.field2731 = arg0.method7082();
        this.field2733 = arg0.method7082();
        this.field2730 = arg0.method7082();
        this.method4114();
    }

    @ObfuscatedName("ho.p(B)V")
    public void method4114() {
    }
}
