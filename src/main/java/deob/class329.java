package deob;

@ObfuscatedName("lv")
public class class329 {

    @ObfuscatedName("lv.m")
    public int field3866;

    @ObfuscatedName("lv.o")
    public int field3865;

    @ObfuscatedName("lv.q")
    public int field3867;

    @ObfuscatedName("lv.j")
    public int field3864;

    public class329(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class329(int arg0, int arg1, int arg2, int arg3) {
        this.method5656(arg0, arg1);
        this.method5653(arg2, arg3);
    }

    @ObfuscatedName("lv.m(III)V")
    public void method5656(int arg0, int arg1) {
        this.field3866 = arg0;
        this.field3865 = arg1;
    }

    @ObfuscatedName("lv.o(IIB)V")
    public void method5653(int arg0, int arg1) {
        this.field3867 = arg0;
        this.field3864 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lv.q(Llv;Llv;I)V")
    public void method5663(class329 arg0, class329 arg1) {
        this.method5660(arg0, arg1);
        this.method5655(arg0, arg1);
    }

    @ObfuscatedName("lv.j(Llv;Llv;B)V")
    public void method5660(class329 arg0, class329 arg1) {
        arg1.field3866 = this.field3866;
        arg1.field3867 = this.field3867;
        if (this.field3866 < arg0.field3866) {
            arg1.field3867 -= arg0.field3866 - this.field3866;
            arg1.field3866 = arg0.field3866;
        }
        if (arg1.method5654() > arg0.method5654()) {
            arg1.field3867 -= arg1.method5654() - arg0.method5654();
        }
        if (arg1.field3867 < 0) {
            arg1.field3867 = 0;
        }
    }

    @ObfuscatedName("lv.p(Llv;Llv;I)V")
    public void method5655(class329 arg0, class329 arg1) {
        arg1.field3865 = this.field3865;
        arg1.field3864 = this.field3864;
        if (this.field3865 < arg0.field3865) {
            arg1.field3864 -= arg0.field3865 - this.field3865;
            arg1.field3865 = arg0.field3865;
        }
        if (arg1.method5657() > arg0.method5657()) {
            arg1.field3864 -= arg1.method5657() - arg0.method5657();
        }
        if (arg1.field3864 < 0) {
            arg1.field3864 = 0;
        }
    }

    @ObfuscatedName("lv.g(I)I")
    public int method5654() {
        return this.field3867 + this.field3866;
    }

    @ObfuscatedName("lv.n(I)I")
    public int method5657() {
        return this.field3865 + this.field3864;
    }
}
