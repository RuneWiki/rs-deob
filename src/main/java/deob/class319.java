package deob;

@ObfuscatedName("lr")
public class class319 {

    @ObfuscatedName("lr.c")
    public int field3833;

    @ObfuscatedName("lr.x")
    public int field3834;

    @ObfuscatedName("lr.t")
    public int field3835;

    @ObfuscatedName("lr.g")
    public int field3836;

    public class319(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class319(int arg0, int arg1, int arg2, int arg3) {
        this.method5526(arg0, arg1);
        this.method5527(arg2, arg3);
    }

    @ObfuscatedName("lr.c(IIS)V")
    public void method5526(int arg0, int arg1) {
        this.field3833 = arg0;
        this.field3834 = arg1;
    }

    @ObfuscatedName("lr.x(III)V")
    public void method5527(int arg0, int arg1) {
        this.field3835 = arg0;
        this.field3836 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lr.t(Llr;Llr;S)V")
    public void method5543(class319 arg0, class319 arg1) {
        this.method5528(arg0, arg1);
        this.method5531(arg0, arg1);
    }

    @ObfuscatedName("lr.g(Llr;Llr;I)V")
    public void method5528(class319 arg0, class319 arg1) {
        arg1.field3833 = this.field3833;
        arg1.field3835 = this.field3835;
        if (this.field3833 < arg0.field3833) {
            arg1.field3835 -= arg0.field3833 - this.field3833;
            arg1.field3833 = arg0.field3833;
        }
        if (arg1.method5542() > arg0.method5542()) {
            arg1.field3835 -= arg1.method5542() - arg0.method5542();
        }
        if (arg1.field3835 < 0) {
            arg1.field3835 = 0;
        }
    }

    @ObfuscatedName("lr.l(Llr;Llr;B)V")
    public void method5531(class319 arg0, class319 arg1) {
        arg1.field3834 = this.field3834;
        arg1.field3836 = this.field3836;
        if (this.field3834 < arg0.field3834) {
            arg1.field3836 -= arg0.field3834 - this.field3834;
            arg1.field3834 = arg0.field3834;
        }
        if (arg1.method5533() > arg0.method5533()) {
            arg1.field3836 -= arg1.method5533() - arg0.method5533();
        }
        if (arg1.field3836 < 0) {
            arg1.field3836 = 0;
        }
    }

    @ObfuscatedName("lr.u(I)I")
    public int method5542() {
        return this.field3835 + this.field3833;
    }

    @ObfuscatedName("lr.j(I)I")
    public int method5533() {
        return this.field3836 + this.field3834;
    }
}
