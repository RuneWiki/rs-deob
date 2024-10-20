package deob;

@ObfuscatedName("lb")
public class class319 {

    @ObfuscatedName("lb.n")
    public int field3834;

    @ObfuscatedName("lb.h")
    public int field3837;

    @ObfuscatedName("lb.l")
    public int field3835;

    @ObfuscatedName("lb.g")
    public int field3836;

    public class319(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class319(int arg0, int arg1, int arg2, int arg3) {
        this.method5557(arg0, arg1);
        this.method5552(arg2, arg3);
    }

    @ObfuscatedName("lb.n(III)V")
    public void method5557(int arg0, int arg1) {
        this.field3834 = arg0;
        this.field3837 = arg1;
    }

    @ObfuscatedName("lb.h(III)V")
    public void method5552(int arg0, int arg1) {
        this.field3835 = arg0;
        this.field3836 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lb.l(Llb;Llb;B)V")
    public void method5553(class319 arg0, class319 arg1) {
        this.method5554(arg0, arg1);
        this.method5555(arg0, arg1);
    }

    @ObfuscatedName("lb.g(Llb;Llb;I)V")
    public void method5554(class319 arg0, class319 arg1) {
        arg1.field3834 = this.field3834;
        arg1.field3835 = this.field3835;
        if (this.field3834 < arg0.field3834) {
            arg1.field3835 -= arg0.field3834 - this.field3834;
            arg1.field3834 = arg0.field3834;
        }
        if (arg1.method5556() > arg0.method5556()) {
            arg1.field3835 -= arg1.method5556() - arg0.method5556();
        }
        if (arg1.field3835 < 0) {
            arg1.field3835 = 0;
        }
    }

    @ObfuscatedName("lb.b(Llb;Llb;I)V")
    public void method5555(class319 arg0, class319 arg1) {
        arg1.field3837 = this.field3837;
        arg1.field3836 = this.field3836;
        if (this.field3837 < arg0.field3837) {
            arg1.field3836 -= arg0.field3837 - this.field3837;
            arg1.field3837 = arg0.field3837;
        }
        if (arg1.method5550() > arg0.method5550()) {
            arg1.field3836 -= arg1.method5550() - arg0.method5550();
        }
        if (arg1.field3836 < 0) {
            arg1.field3836 = 0;
        }
    }

    @ObfuscatedName("lb.a(I)I")
    public int method5556() {
        return this.field3835 + this.field3834;
    }

    @ObfuscatedName("lb.c(I)I")
    public int method5550() {
        return this.field3837 + this.field3836;
    }
}
