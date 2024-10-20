package deob;

@ObfuscatedName("lw")
public class class319 {

    @ObfuscatedName("lw.u")
    public int field3841;

    @ObfuscatedName("lw.f")
    public int field3839;

    @ObfuscatedName("lw.b")
    public int field3840;

    @ObfuscatedName("lw.g")
    public int field3838;

    public class319(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class319(int arg0, int arg1, int arg2, int arg3) {
        this.method5561(arg0, arg1);
        this.method5562(arg2, arg3);
    }

    @ObfuscatedName("lw.u(III)V")
    public void method5561(int arg0, int arg1) {
        this.field3841 = arg0;
        this.field3839 = arg1;
    }

    @ObfuscatedName("lw.f(III)V")
    public void method5562(int arg0, int arg1) {
        this.field3840 = arg0;
        this.field3838 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lw.b(Llw;Llw;I)V")
    public void method5563(class319 arg0, class319 arg1) {
        this.method5564(arg0, arg1);
        this.method5565(arg0, arg1);
    }

    @ObfuscatedName("lw.g(Llw;Llw;B)V")
    public void method5564(class319 arg0, class319 arg1) {
        arg1.field3841 = this.field3841;
        arg1.field3840 = this.field3840;
        if (this.field3841 < arg0.field3841) {
            arg1.field3840 -= arg0.field3841 - this.field3841;
            arg1.field3841 = arg0.field3841;
        }
        if (arg1.method5580() > arg0.method5580()) {
            arg1.field3840 -= arg1.method5580() - arg0.method5580();
        }
        if (arg1.field3840 < 0) {
            arg1.field3840 = 0;
        }
    }

    @ObfuscatedName("lw.z(Llw;Llw;B)V")
    public void method5565(class319 arg0, class319 arg1) {
        arg1.field3839 = this.field3839;
        arg1.field3838 = this.field3838;
        if (this.field3839 < arg0.field3839) {
            arg1.field3838 -= arg0.field3839 - this.field3839;
            arg1.field3839 = arg0.field3839;
        }
        if (arg1.method5579() > arg0.method5579()) {
            arg1.field3838 -= arg1.method5579() - arg0.method5579();
        }
        if (arg1.field3838 < 0) {
            arg1.field3838 = 0;
        }
    }

    @ObfuscatedName("lw.p(S)I")
    public int method5580() {
        return this.field3841 + this.field3840;
    }

    @ObfuscatedName("lw.h(I)I")
    public int method5579() {
        return this.field3839 + this.field3838;
    }
}
