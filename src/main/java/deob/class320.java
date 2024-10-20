package deob;

@ObfuscatedName("lh")
public class class320 {

    @ObfuscatedName("lh.a")
    public int field3845;

    @ObfuscatedName("lh.s")
    public int field3846;

    @ObfuscatedName("lh.g")
    public int field3847;

    @ObfuscatedName("lh.x")
    public int field3848;

    public class320(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class320(int arg0, int arg1, int arg2, int arg3) {
        this.method5498(arg0, arg1);
        this.method5497(arg2, arg3);
    }

    @ObfuscatedName("lh.a(III)V")
    public void method5498(int arg0, int arg1) {
        this.field3845 = arg0;
        this.field3846 = arg1;
    }

    @ObfuscatedName("lh.s(IIB)V")
    public void method5497(int arg0, int arg1) {
        this.field3847 = arg0;
        this.field3848 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lh.g(Llh;Llh;I)V")
    public void method5518(class320 arg0, class320 arg1) {
        this.method5510(arg0, arg1);
        this.method5499(arg0, arg1);
    }

    @ObfuscatedName("lh.x(Llh;Llh;I)V")
    public void method5510(class320 arg0, class320 arg1) {
        arg1.field3845 = this.field3845;
        arg1.field3847 = this.field3847;
        if (this.field3845 < arg0.field3845) {
            arg1.field3847 -= arg0.field3845 - this.field3845;
            arg1.field3845 = arg0.field3845;
        }
        if (arg1.method5502() > arg0.method5502()) {
            arg1.field3847 -= arg1.method5502() - arg0.method5502();
        }
        if (arg1.field3847 < 0) {
            arg1.field3847 = 0;
        }
    }

    @ObfuscatedName("lh.h(Llh;Llh;I)V")
    public void method5499(class320 arg0, class320 arg1) {
        arg1.field3846 = this.field3846;
        arg1.field3848 = this.field3848;
        if (this.field3846 < arg0.field3846) {
            arg1.field3848 -= arg0.field3846 - this.field3846;
            arg1.field3846 = arg0.field3846;
        }
        if (arg1.method5503() > arg0.method5503()) {
            arg1.field3848 -= arg1.method5503() - arg0.method5503();
        }
        if (arg1.field3848 < 0) {
            arg1.field3848 = 0;
        }
    }

    @ObfuscatedName("lh.f(B)I")
    public int method5502() {
        return this.field3847 + this.field3845;
    }

    @ObfuscatedName("lh.p(I)I")
    public int method5503() {
        return this.field3848 + this.field3846;
    }
}
