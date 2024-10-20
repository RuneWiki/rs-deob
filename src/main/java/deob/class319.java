package deob;

@ObfuscatedName("lh")
public class class319 {

    @ObfuscatedName("lh.f")
    public int field3837;

    @ObfuscatedName("lh.i")
    public int field3836;

    @ObfuscatedName("lh.y")
    public int field3835;

    @ObfuscatedName("lh.w")
    public int field3838;

    public class319(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class319(int arg0, int arg1, int arg2, int arg3) {
        this.method5509(arg0, arg1);
        this.method5515(arg2, arg3);
    }

    @ObfuscatedName("lh.f(III)V")
    public void method5509(int arg0, int arg1) {
        this.field3837 = arg0;
        this.field3836 = arg1;
    }

    @ObfuscatedName("lh.i(IIB)V")
    public void method5515(int arg0, int arg1) {
        this.field3835 = arg0;
        this.field3838 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lh.y(Llh;Llh;I)V")
    public void method5511(class319 arg0, class319 arg1) {
        this.method5519(arg0, arg1);
        this.method5513(arg0, arg1);
    }

    @ObfuscatedName("lh.w(Llh;Llh;I)V")
    public void method5519(class319 arg0, class319 arg1) {
        arg1.field3837 = this.field3837;
        arg1.field3835 = this.field3835;
        if (this.field3837 < arg0.field3837) {
            arg1.field3835 -= arg0.field3837 - this.field3837;
            arg1.field3837 = arg0.field3837;
        }
        if (arg1.method5514() > arg0.method5514()) {
            arg1.field3835 -= arg1.method5514() - arg0.method5514();
        }
        if (arg1.field3835 < 0) {
            arg1.field3835 = 0;
        }
    }

    @ObfuscatedName("lh.p(Llh;Llh;B)V")
    public void method5513(class319 arg0, class319 arg1) {
        arg1.field3836 = this.field3836;
        arg1.field3838 = this.field3838;
        if (this.field3836 < arg0.field3836) {
            arg1.field3838 -= arg0.field3836 - this.field3836;
            arg1.field3836 = arg0.field3836;
        }
        if (arg1.method5508() > arg0.method5508()) {
            arg1.field3838 -= arg1.method5508() - arg0.method5508();
        }
        if (arg1.field3838 < 0) {
            arg1.field3838 = 0;
        }
    }

    @ObfuscatedName("lh.b(I)I")
    public int method5514() {
        return this.field3837 + this.field3835;
    }

    @ObfuscatedName("lh.e(B)I")
    public int method5508() {
        return this.field3838 + this.field3836;
    }
}
