package deob;

@ObfuscatedName("in")
public class class243 implements class246 {

    @ObfuscatedName("in.o")
    public int field2892;

    @ObfuscatedName("in.q")
    public int field2893;

    @ObfuscatedName("in.l")
    public int field2896;

    @ObfuscatedName("in.k")
    public int field2895;

    @ObfuscatedName("in.a")
    public int field2897;

    @ObfuscatedName("in.m")
    public int field2894;

    @ObfuscatedName("in.o(Lhm;I)V")
    public void method4125(class226 arg0) {
        if (arg0.field2743 > this.field2897) {
            arg0.field2743 = this.field2897;
        }
        if (arg0.field2744 < this.field2897) {
            arg0.field2744 = this.field2897;
        }
        if (arg0.field2747 > this.field2894) {
            arg0.field2747 = this.field2894;
        }
        if (arg0.field2746 < this.field2894) {
            arg0.field2746 = this.field2894;
        }
    }

    @ObfuscatedName("in.q(IIIB)Z")
    public boolean method4120(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2892 && arg0 < this.field2893 + this.field2892) {
            return arg1 >> 6 == this.field2896 && arg2 >> 6 == this.field2895;
        } else {
            return false;
        }
    }

    @ObfuscatedName("in.l(IIB)Z")
    public boolean method4124(int arg0, int arg1) {
        return arg0 >> 6 == this.field2897 && arg1 >> 6 == this.field2894;
    }

    @ObfuscatedName("in.k(IIII)[I")
    public int[] method4110(int arg0, int arg1, int arg2) {
        return this.method4120(arg0, arg1, arg2) ? new int[] { this.field2897 * 64 - this.field2896 * 64 + arg1, this.field2894 * 64 - this.field2895 * 64 + arg2 } : null;
    }

    @ObfuscatedName("in.a(III)Lkd;")
    public class290 method4112(int arg0, int arg1) {
        if (this.method4124(arg0, arg1)) {
            int var3 = this.field2896 * 64 - this.field2897 * 64 + arg0;
            int var4 = this.field2895 * 64 - this.field2894 * 64 + arg1;
            return new class290(this.field2892, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("in.m(Lpx;I)V")
    public void method4113(class440 arg0) {
        this.field2892 = arg0.method7071();
        this.field2893 = arg0.method7071();
        this.field2896 = arg0.method7082();
        this.field2895 = arg0.method7082();
        this.field2897 = arg0.method7082();
        this.field2894 = arg0.method7082();
        this.method4449();
    }

    @ObfuscatedName("in.p(B)V")
    public void method4449() {
    }
}
