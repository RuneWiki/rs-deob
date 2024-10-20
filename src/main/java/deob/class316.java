package deob;

@ObfuscatedName("lo")
public class class316 {

    @ObfuscatedName("lo.f")
    public int field3830;

    @ObfuscatedName("lo.h")
    public int field3831;

    @ObfuscatedName("lo.e")
    public int field3832;

    @ObfuscatedName("lo.b")
    public int field3828;

    public class316(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class316(int arg0, int arg1, int arg2, int arg3) {
        this.method5294(arg0, arg1);
        this.method5296(arg2, arg3);
    }

    @ObfuscatedName("lo.f(IIB)V")
    public void method5294(int arg0, int arg1) {
        this.field3830 = arg0;
        this.field3831 = arg1;
    }

    @ObfuscatedName("lo.h(III)V")
    public void method5296(int arg0, int arg1) {
        this.field3832 = arg0;
        this.field3828 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lo.e(Llo;Llo;I)V")
    public void method5307(class316 arg0, class316 arg1) {
        this.method5297(arg0, arg1);
        this.method5302(arg0, arg1);
    }

    @ObfuscatedName("lo.b(Llo;Llo;I)V")
    public void method5297(class316 arg0, class316 arg1) {
        arg1.field3830 = this.field3830;
        arg1.field3832 = this.field3832;
        if (this.field3830 < arg0.field3830) {
            arg1.field3832 -= arg0.field3830 - this.field3830;
            arg1.field3830 = arg0.field3830;
        }
        if (arg1.method5298() > arg0.method5298()) {
            arg1.field3832 -= arg1.method5298() - arg0.method5298();
        }
        if (arg1.field3832 < 0) {
            arg1.field3832 = 0;
        }
    }

    @ObfuscatedName("lo.l(Llo;Llo;I)V")
    public void method5302(class316 arg0, class316 arg1) {
        arg1.field3831 = this.field3831;
        arg1.field3828 = this.field3828;
        if (this.field3831 < arg0.field3831) {
            arg1.field3828 -= arg0.field3831 - this.field3831;
            arg1.field3831 = arg0.field3831;
        }
        if (arg1.method5311() > arg0.method5311()) {
            arg1.field3828 -= arg1.method5311() - arg0.method5311();
        }
        if (arg1.field3828 < 0) {
            arg1.field3828 = 0;
        }
    }

    @ObfuscatedName("lo.w(I)I")
    public int method5298() {
        return this.field3832 + this.field3830;
    }

    @ObfuscatedName("lo.d(I)I")
    public int method5311() {
        return this.field3831 + this.field3828;
    }
}
