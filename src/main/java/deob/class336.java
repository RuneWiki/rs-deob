package deob;

@ObfuscatedName("lj")
public class class336 {

    @ObfuscatedName("lj.f")
    public int field3916;

    @ObfuscatedName("lj.o")
    public int field3912;

    @ObfuscatedName("lj.u")
    public int field3911;

    @ObfuscatedName("lj.p")
    public int field3913;

    public class336(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class336(int arg0, int arg1, int arg2, int arg3) {
        this.method5297(arg0, arg1);
        this.method5286(arg2, arg3);
    }

    @ObfuscatedName("lj.f(IIS)V")
    public void method5297(int arg0, int arg1) {
        this.field3916 = arg0;
        this.field3912 = arg1;
    }

    @ObfuscatedName("lj.o(IIB)V")
    public void method5286(int arg0, int arg1) {
        this.field3911 = arg0;
        this.field3913 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lj.u(Llj;Llj;I)V")
    public void method5287(class336 arg0, class336 arg1) {
        this.method5288(arg0, arg1);
        this.method5293(arg0, arg1);
    }

    @ObfuscatedName("lj.p(Llj;Llj;I)V")
    public void method5288(class336 arg0, class336 arg1) {
        arg1.field3916 = this.field3916;
        arg1.field3911 = this.field3911;
        if (this.field3916 < arg0.field3916) {
            arg1.field3911 -= arg0.field3916 - this.field3916;
            arg1.field3916 = arg0.field3916;
        }
        if (arg1.method5290() > arg0.method5290()) {
            arg1.field3911 -= arg1.method5290() - arg0.method5290();
        }
        if (arg1.field3911 < 0) {
            arg1.field3911 = 0;
        }
    }

    @ObfuscatedName("lj.b(Llj;Llj;I)V")
    public void method5293(class336 arg0, class336 arg1) {
        arg1.field3912 = this.field3912;
        arg1.field3913 = this.field3913;
        if (this.field3912 < arg0.field3912) {
            arg1.field3913 -= arg0.field3912 - this.field3912;
            arg1.field3912 = arg0.field3912;
        }
        if (arg1.method5291() > arg0.method5291()) {
            arg1.field3913 -= arg1.method5291() - arg0.method5291();
        }
        if (arg1.field3913 < 0) {
            arg1.field3913 = 0;
        }
    }

    @ObfuscatedName("lj.e(B)I")
    public int method5290() {
        return this.field3916 + this.field3911;
    }

    @ObfuscatedName("lj.k(I)I")
    public int method5291() {
        return this.field3913 + this.field3912;
    }
}
