package deob;

@ObfuscatedName("ne")
public class class385 {

    @ObfuscatedName("ne.o")
    public int field4385;

    @ObfuscatedName("ne.q")
    public int field4386;

    @ObfuscatedName("ne.l")
    public int field4387;

    @ObfuscatedName("ne.k")
    public int field4388;

    public class385(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class385(int arg0, int arg1, int arg2, int arg3) {
        this.method6175(arg0, arg1);
        this.method6189(arg2, arg3);
    }

    @ObfuscatedName("ne.o(IIB)V")
    public void method6175(int arg0, int arg1) {
        this.field4385 = arg0;
        this.field4386 = arg1;
    }

    @ObfuscatedName("ne.q(III)V")
    public void method6189(int arg0, int arg1) {
        this.field4387 = arg0;
        this.field4388 = arg1;
    }

    @ObfuscatedName("ne.l(III)Z")
    public boolean method6169(int arg0, int arg1) {
        return arg0 >= this.field4385 && arg0 < this.field4387 + this.field4385 && arg1 >= this.field4386 && arg1 < this.field4388 + this.field4386;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ne.k(Lne;Lne;I)V")
    public void method6185(class385 arg0, class385 arg1) {
        this.method6166(arg0, arg1);
        this.method6173(arg0, arg1);
    }

    @ObfuscatedName("ne.a(Lne;Lne;B)V")
    public void method6166(class385 arg0, class385 arg1) {
        arg1.field4385 = this.field4385;
        arg1.field4387 = this.field4387;
        if (this.field4385 < arg0.field4385) {
            arg1.field4387 -= arg0.field4385 - this.field4385;
            arg1.field4385 = arg0.field4385;
        }
        if (arg1.method6174() > arg0.method6174()) {
            arg1.field4387 -= arg1.method6174() - arg0.method6174();
        }
        if (arg1.field4387 < 0) {
            arg1.field4387 = 0;
        }
    }

    @ObfuscatedName("ne.m(Lne;Lne;B)V")
    public void method6173(class385 arg0, class385 arg1) {
        arg1.field4386 = this.field4386;
        arg1.field4388 = this.field4388;
        if (this.field4386 < arg0.field4386) {
            arg1.field4388 -= arg0.field4386 - this.field4386;
            arg1.field4386 = arg0.field4386;
        }
        if (arg1.method6172() > arg0.method6172()) {
            arg1.field4388 -= arg1.method6172() - arg0.method6172();
        }
        if (arg1.field4388 < 0) {
            arg1.field4388 = 0;
        }
    }

    @ObfuscatedName("ne.p(I)I")
    public int method6174() {
        return this.field4387 + this.field4385;
    }

    @ObfuscatedName("ne.s(I)I")
    public int method6172() {
        return this.field4388 + this.field4386;
    }
}
