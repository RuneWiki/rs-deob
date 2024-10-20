package deob;

@ObfuscatedName("lw")
public class class314 {

    @ObfuscatedName("lw.v")
    public int field3781;

    @ObfuscatedName("lw.s")
    public int field3782;

    @ObfuscatedName("lw.o")
    public int field3783;

    @ObfuscatedName("lw.k")
    public int field3784;

    public class314(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class314(int arg0, int arg1, int arg2, int arg3) {
        this.method5336(arg0, arg1);
        this.method5329(arg2, arg3);
    }

    @ObfuscatedName("lw.v(III)V")
    public void method5336(int arg0, int arg1) {
        this.field3781 = arg0;
        this.field3782 = arg1;
    }

    @ObfuscatedName("lw.s(III)V")
    public void method5329(int arg0, int arg1) {
        this.field3783 = arg0;
        this.field3784 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lw.o(Llw;Llw;B)V")
    public void method5325(class314 arg0, class314 arg1) {
        this.method5328(arg0, arg1);
        this.method5327(arg0, arg1);
    }

    @ObfuscatedName("lw.k(Llw;Llw;I)V")
    public void method5328(class314 arg0, class314 arg1) {
        arg1.field3781 = this.field3781;
        arg1.field3783 = this.field3783;
        if (this.field3781 < arg0.field3781) {
            arg1.field3783 -= arg0.field3781 - this.field3781;
            arg1.field3781 = arg0.field3781;
        }
        if (arg1.method5326() > arg0.method5326()) {
            arg1.field3783 -= arg1.method5326() - arg0.method5326();
        }
        if (arg1.field3783 < 0) {
            arg1.field3783 = 0;
        }
    }

    @ObfuscatedName("lw.u(Llw;Llw;I)V")
    public void method5327(class314 arg0, class314 arg1) {
        arg1.field3782 = this.field3782;
        arg1.field3784 = this.field3784;
        if (this.field3782 < arg0.field3782) {
            arg1.field3784 -= arg0.field3782 - this.field3782;
            arg1.field3782 = arg0.field3782;
        }
        if (arg1.method5333() > arg0.method5333()) {
            arg1.field3784 -= arg1.method5333() - arg0.method5333();
        }
        if (arg1.field3784 < 0) {
            arg1.field3784 = 0;
        }
    }

    @ObfuscatedName("lw.i(I)I")
    public int method5326() {
        return this.field3783 + this.field3781;
    }

    @ObfuscatedName("lw.t(I)I")
    public int method5333() {
        return this.field3784 + this.field3782;
    }
}
