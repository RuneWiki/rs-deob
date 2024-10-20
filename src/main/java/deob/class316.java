package deob;

@ObfuscatedName("lo")
public class class316 {

    @ObfuscatedName("lo.f")
    public int field3828;

    @ObfuscatedName("lo.l")
    public int field3829;

    @ObfuscatedName("lo.w")
    public int field3830;

    @ObfuscatedName("lo.s")
    public int field3831;

    public class316(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class316(int arg0, int arg1, int arg2, int arg3) {
        this.method5405(arg0, arg1);
        this.method5406(arg2, arg3);
    }

    @ObfuscatedName("lo.f(III)V")
    public void method5405(int arg0, int arg1) {
        this.field3828 = arg0;
        this.field3829 = arg1;
    }

    @ObfuscatedName("lo.l(III)V")
    public void method5406(int arg0, int arg1) {
        this.field3830 = arg0;
        this.field3831 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lo.w(Llo;Llo;B)V")
    public void method5428(class316 arg0, class316 arg1) {
        this.method5409(arg0, arg1);
        this.method5410(arg0, arg1);
    }

    @ObfuscatedName("lo.s(Llo;Llo;I)V")
    public void method5409(class316 arg0, class316 arg1) {
        arg1.field3828 = this.field3828;
        arg1.field3830 = this.field3830;
        if (this.field3828 < arg0.field3828) {
            arg1.field3830 -= arg0.field3828 - this.field3828;
            arg1.field3828 = arg0.field3828;
        }
        if (arg1.method5404() > arg0.method5404()) {
            arg1.field3830 -= arg1.method5404() - arg0.method5404();
        }
        if (arg1.field3830 < 0) {
            arg1.field3830 = 0;
        }
    }

    @ObfuscatedName("lo.e(Llo;Llo;I)V")
    public void method5410(class316 arg0, class316 arg1) {
        arg1.field3829 = this.field3829;
        arg1.field3831 = this.field3831;
        if (this.field3829 < arg0.field3829) {
            arg1.field3831 -= arg0.field3829 - this.field3829;
            arg1.field3829 = arg0.field3829;
        }
        if (arg1.method5411() > arg0.method5411()) {
            arg1.field3831 -= arg1.method5411() - arg0.method5411();
        }
        if (arg1.field3831 < 0) {
            arg1.field3831 = 0;
        }
    }

    @ObfuscatedName("lo.c(B)I")
    public int method5404() {
        return this.field3830 + this.field3828;
    }

    @ObfuscatedName("lo.p(I)I")
    public int method5411() {
        return this.field3831 + this.field3829;
    }
}
