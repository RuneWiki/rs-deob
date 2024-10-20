package deob;

@ObfuscatedName("ls")
public class class320 {

    @ObfuscatedName("ls.q")
    public int field3864;

    @ObfuscatedName("ls.w")
    public int field3865;

    @ObfuscatedName("ls.e")
    public int field3866;

    @ObfuscatedName("ls.p")
    public int field3867;

    public class320(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class320(int arg0, int arg1, int arg2, int arg3) {
        this.method5487(arg0, arg1);
        this.method5488(arg2, arg3);
    }

    @ObfuscatedName("ls.q(IIB)V")
    public void method5487(int arg0, int arg1) {
        this.field3864 = arg0;
        this.field3865 = arg1;
    }

    @ObfuscatedName("ls.w(IIB)V")
    public void method5488(int arg0, int arg1) {
        this.field3866 = arg0;
        this.field3867 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ls.e(Lls;Lls;I)V")
    public void method5507(class320 arg0, class320 arg1) {
        this.method5495(arg0, arg1);
        this.method5491(arg0, arg1);
    }

    @ObfuscatedName("ls.p(Lls;Lls;B)V")
    public void method5495(class320 arg0, class320 arg1) {
        arg1.field3864 = this.field3864;
        arg1.field3866 = this.field3866;
        if (this.field3864 < arg0.field3864) {
            arg1.field3866 -= arg0.field3864 - this.field3864;
            arg1.field3864 = arg0.field3864;
        }
        if (arg1.method5503() > arg0.method5503()) {
            arg1.field3866 -= arg1.method5503() - arg0.method5503();
        }
        if (arg1.field3866 < 0) {
            arg1.field3866 = 0;
        }
    }

    @ObfuscatedName("ls.k(Lls;Lls;I)V")
    public void method5491(class320 arg0, class320 arg1) {
        arg1.field3865 = this.field3865;
        arg1.field3867 = this.field3867;
        if (this.field3865 < arg0.field3865) {
            arg1.field3867 -= arg0.field3865 - this.field3865;
            arg1.field3865 = arg0.field3865;
        }
        if (arg1.method5492() > arg0.method5492()) {
            arg1.field3867 -= arg1.method5492() - arg0.method5492();
        }
        if (arg1.field3867 < 0) {
            arg1.field3867 = 0;
        }
    }

    @ObfuscatedName("ls.l(I)I")
    public int method5503() {
        return this.field3866 + this.field3864;
    }

    @ObfuscatedName("ls.b(I)I")
    public int method5492() {
        return this.field3867 + this.field3865;
    }
}
