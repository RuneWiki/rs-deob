package deob;

@ObfuscatedName("li")
public class class337 {

    @ObfuscatedName("li.v")
    public int field3910;

    @ObfuscatedName("li.n")
    public int field3909;

    @ObfuscatedName("li.f")
    public int field3911;

    @ObfuscatedName("li.y")
    public int field3912;

    public class337(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class337(int arg0, int arg1, int arg2, int arg3) {
        this.method5420(arg0, arg1);
        this.method5421(arg2, arg3);
    }

    @ObfuscatedName("li.v(III)V")
    public void method5420(int arg0, int arg1) {
        this.field3910 = arg0;
        this.field3909 = arg1;
    }

    @ObfuscatedName("li.n(III)V")
    public void method5421(int arg0, int arg1) {
        this.field3911 = arg0;
        this.field3912 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("li.f(Lli;Lli;B)V")
    public void method5419(class337 arg0, class337 arg1) {
        this.method5423(arg0, arg1);
        this.method5424(arg0, arg1);
    }

    @ObfuscatedName("li.y(Lli;Lli;I)V")
    public void method5423(class337 arg0, class337 arg1) {
        arg1.field3910 = this.field3910;
        arg1.field3911 = this.field3911;
        if (this.field3910 < arg0.field3910) {
            arg1.field3911 -= arg0.field3910 - this.field3910;
            arg1.field3910 = arg0.field3910;
        }
        if (arg1.method5425() > arg0.method5425()) {
            arg1.field3911 -= arg1.method5425() - arg0.method5425();
        }
        if (arg1.field3911 < 0) {
            arg1.field3911 = 0;
        }
    }

    @ObfuscatedName("li.p(Lli;Lli;S)V")
    public void method5424(class337 arg0, class337 arg1) {
        arg1.field3909 = this.field3909;
        arg1.field3912 = this.field3912;
        if (this.field3909 < arg0.field3909) {
            arg1.field3912 -= arg0.field3909 - this.field3909;
            arg1.field3909 = arg0.field3909;
        }
        if (arg1.method5426() > arg0.method5426()) {
            arg1.field3912 -= arg1.method5426() - arg0.method5426();
        }
        if (arg1.field3912 < 0) {
            arg1.field3912 = 0;
        }
    }

    @ObfuscatedName("li.j(B)I")
    public int method5425() {
        return this.field3911 + this.field3910;
    }

    @ObfuscatedName("li.r(B)I")
    public int method5426() {
        return this.field3912 + this.field3909;
    }
}
