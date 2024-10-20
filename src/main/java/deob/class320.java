package deob;

@ObfuscatedName("la")
public class class320 {

    @ObfuscatedName("la.m")
    public int field3856;

    @ObfuscatedName("la.f")
    public int field3854;

    @ObfuscatedName("la.q")
    public int field3855;

    @ObfuscatedName("la.w")
    public int field3853;

    public class320(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class320(int arg0, int arg1, int arg2, int arg3) {
        this.method5428(arg0, arg1);
        this.method5429(arg2, arg3);
    }

    @ObfuscatedName("la.m(IIB)V")
    public void method5428(int arg0, int arg1) {
        this.field3856 = arg0;
        this.field3854 = arg1;
    }

    @ObfuscatedName("la.f(III)V")
    public void method5429(int arg0, int arg1) {
        this.field3855 = arg0;
        this.field3853 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("la.q(Lla;Lla;I)V")
    public void method5432(class320 arg0, class320 arg1) {
        this.method5431(arg0, arg1);
        this.method5443(arg0, arg1);
    }

    @ObfuscatedName("la.w(Lla;Lla;I)V")
    public void method5431(class320 arg0, class320 arg1) {
        arg1.field3856 = this.field3856;
        arg1.field3855 = this.field3855;
        if (this.field3856 < arg0.field3856) {
            arg1.field3855 -= arg0.field3856 - this.field3856;
            arg1.field3856 = arg0.field3856;
        }
        if (arg1.method5433() > arg0.method5433()) {
            arg1.field3855 -= arg1.method5433() - arg0.method5433();
        }
        if (arg1.field3855 < 0) {
            arg1.field3855 = 0;
        }
    }

    @ObfuscatedName("la.o(Lla;Lla;S)V")
    public void method5443(class320 arg0, class320 arg1) {
        arg1.field3854 = this.field3854;
        arg1.field3853 = this.field3853;
        if (this.field3854 < arg0.field3854) {
            arg1.field3853 -= arg0.field3854 - this.field3854;
            arg1.field3854 = arg0.field3854;
        }
        if (arg1.method5434() > arg0.method5434()) {
            arg1.field3853 -= arg1.method5434() - arg0.method5434();
        }
        if (arg1.field3853 < 0) {
            arg1.field3853 = 0;
        }
    }

    @ObfuscatedName("la.u(I)I")
    public int method5433() {
        return this.field3856 + this.field3855;
    }

    @ObfuscatedName("la.g(B)I")
    public int method5434() {
        return this.field3854 + this.field3853;
    }
}
