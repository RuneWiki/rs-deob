package deob;

@ObfuscatedName("lj")
public class class316 {

    @ObfuscatedName("lj.y")
    public int field3804;

    @ObfuscatedName("lj.c")
    public int field3805;

    @ObfuscatedName("lj.n")
    public int field3806;

    @ObfuscatedName("lj.u")
    public int field3807;

    public class316(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class316(int arg0, int arg1, int arg2, int arg3) {
        this.method5348(arg0, arg1);
        this.method5321(arg2, arg3);
    }

    @ObfuscatedName("lj.y(III)V")
    public void method5348(int arg0, int arg1) {
        this.field3805 = arg0;
        this.field3806 = arg1;
    }

    @ObfuscatedName("lj.c(III)V")
    public void method5321(int arg0, int arg1) {
        this.field3804 = arg0;
        this.field3807 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lj.n(Llj;Llj;I)V")
    public void method5323(class316 arg0, class316 arg1) {
        this.method5324(arg0, arg1);
        this.method5325(arg0, arg1);
    }

    @ObfuscatedName("lj.u(Llj;Llj;I)V")
    public void method5324(class316 arg0, class316 arg1) {
        arg1.field3805 = this.field3805;
        arg1.field3804 = this.field3804;
        if (this.field3805 < arg0.field3805) {
            arg1.field3804 -= arg0.field3805 - this.field3805;
            arg1.field3805 = arg0.field3805;
        }
        if (arg1.method5319() > arg0.method5319()) {
            arg1.field3804 -= arg1.method5319() - arg0.method5319();
        }
        if (arg1.field3804 < 0) {
            arg1.field3804 = 0;
        }
    }

    @ObfuscatedName("lj.i(Llj;Llj;I)V")
    public void method5325(class316 arg0, class316 arg1) {
        arg1.field3806 = this.field3806;
        arg1.field3807 = this.field3807;
        if (this.field3806 < arg0.field3806) {
            arg1.field3807 -= arg0.field3806 - this.field3806;
            arg1.field3806 = arg0.field3806;
        }
        if (arg1.method5327() > arg0.method5327()) {
            arg1.field3807 -= arg1.method5327() - arg0.method5327();
        }
        if (arg1.field3807 < 0) {
            arg1.field3807 = 0;
        }
    }

    @ObfuscatedName("lj.p(I)I")
    public int method5319() {
        return this.field3805 + this.field3804;
    }

    @ObfuscatedName("lj.e(I)I")
    public int method5327() {
        return this.field3807 + this.field3806;
    }
}
