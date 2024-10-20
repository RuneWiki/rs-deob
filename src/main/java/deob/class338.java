package deob;

@ObfuscatedName("lw")
public class class338 {

    @ObfuscatedName("lw.f")
    public int field3906;

    @ObfuscatedName("lw.e")
    public int field3908;

    @ObfuscatedName("lw.v")
    public int field3907;

    @ObfuscatedName("lw.y")
    public int field3905;

    public class338(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class338(int arg0, int arg1, int arg2, int arg3) {
        this.method5355(arg0, arg1);
        this.method5334(arg2, arg3);
    }

    @ObfuscatedName("lw.f(III)V")
    public void method5355(int arg0, int arg1) {
        this.field3906 = arg0;
        this.field3908 = arg1;
    }

    @ObfuscatedName("lw.e(IIB)V")
    public void method5334(int arg0, int arg1) {
        this.field3907 = arg0;
        this.field3905 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lw.v(Llw;Llw;B)V")
    public void method5336(class338 arg0, class338 arg1) {
        this.method5337(arg0, arg1);
        this.method5358(arg0, arg1);
    }

    @ObfuscatedName("lw.y(Llw;Llw;B)V")
    public void method5337(class338 arg0, class338 arg1) {
        arg1.field3906 = this.field3906;
        arg1.field3907 = this.field3907;
        if (this.field3906 < arg0.field3906) {
            arg1.field3907 -= arg0.field3906 - this.field3906;
            arg1.field3906 = arg0.field3906;
        }
        if (arg1.method5339() > arg0.method5339()) {
            arg1.field3907 -= arg1.method5339() - arg0.method5339();
        }
        if (arg1.field3907 < 0) {
            arg1.field3907 = 0;
        }
    }

    @ObfuscatedName("lw.j(Llw;Llw;I)V")
    public void method5358(class338 arg0, class338 arg1) {
        arg1.field3908 = this.field3908;
        arg1.field3905 = this.field3905;
        if (this.field3908 < arg0.field3908) {
            arg1.field3905 -= arg0.field3908 - this.field3908;
            arg1.field3908 = arg0.field3908;
        }
        if (arg1.method5359() > arg0.method5359()) {
            arg1.field3905 -= arg1.method5359() - arg0.method5359();
        }
        if (arg1.field3905 < 0) {
            arg1.field3905 = 0;
        }
    }

    @ObfuscatedName("lw.o(B)I")
    public int method5339() {
        return this.field3907 + this.field3906;
    }

    @ObfuscatedName("lw.m(I)I")
    public int method5359() {
        return this.field3908 + this.field3905;
    }
}
