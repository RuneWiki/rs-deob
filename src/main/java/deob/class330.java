package deob;

@ObfuscatedName("lw")
public class class330 {

    @ObfuscatedName("lw.f")
    public int field3877;

    @ObfuscatedName("lw.b")
    public int field3879;

    @ObfuscatedName("lw.l")
    public int field3878;

    @ObfuscatedName("lw.m")
    public int field3880;

    public class330(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class330(int arg0, int arg1, int arg2, int arg3) {
        this.method5608(arg0, arg1);
        this.method5607(arg2, arg3);
    }

    @ObfuscatedName("lw.f(III)V")
    public void method5608(int arg0, int arg1) {
        this.field3877 = arg0;
        this.field3879 = arg1;
    }

    @ObfuscatedName("lw.b(III)V")
    public void method5607(int arg0, int arg1) {
        this.field3878 = arg0;
        this.field3880 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lw.l(Llw;Llw;I)V")
    public void method5621(class330 arg0, class330 arg1) {
        this.method5612(arg0, arg1);
        this.method5609(arg0, arg1);
    }

    @ObfuscatedName("lw.m(Llw;Llw;I)V")
    public void method5612(class330 arg0, class330 arg1) {
        arg1.field3877 = this.field3877;
        arg1.field3878 = this.field3878;
        if (this.field3877 < arg0.field3877) {
            arg1.field3878 -= arg0.field3877 - this.field3877;
            arg1.field3877 = arg0.field3877;
        }
        if (arg1.method5622() > arg0.method5622()) {
            arg1.field3878 -= arg1.method5622() - arg0.method5622();
        }
        if (arg1.field3878 < 0) {
            arg1.field3878 = 0;
        }
    }

    @ObfuscatedName("lw.z(Llw;Llw;I)V")
    public void method5609(class330 arg0, class330 arg1) {
        arg1.field3879 = this.field3879;
        arg1.field3880 = this.field3880;
        if (this.field3879 < arg0.field3879) {
            arg1.field3880 -= arg0.field3879 - this.field3879;
            arg1.field3879 = arg0.field3879;
        }
        if (arg1.method5614() > arg0.method5614()) {
            arg1.field3880 -= arg1.method5614() - arg0.method5614();
        }
        if (arg1.field3880 < 0) {
            arg1.field3880 = 0;
        }
    }

    @ObfuscatedName("lw.q(I)I")
    public int method5622() {
        return this.field3878 + this.field3877;
    }

    @ObfuscatedName("lw.k(I)I")
    public int method5614() {
        return this.field3880 + this.field3879;
    }
}
