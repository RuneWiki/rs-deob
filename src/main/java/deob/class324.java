package deob;

@ObfuscatedName("ls")
public class class324 {

    @ObfuscatedName("ls.g")
    public int field3948;

    @ObfuscatedName("ls.e")
    public int field3946;

    @ObfuscatedName("ls.b")
    public int field3947;

    @ObfuscatedName("ls.z")
    public int field3945;

    public class324(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class324(int arg0, int arg1, int arg2, int arg3) {
        this.method5322(arg0, arg1);
        this.method5318(arg2, arg3);
    }

    @ObfuscatedName("ls.g(III)V")
    public void method5322(int arg0, int arg1) {
        this.field3948 = arg0;
        this.field3946 = arg1;
    }

    @ObfuscatedName("ls.e(III)V")
    public void method5318(int arg0, int arg1) {
        this.field3947 = arg0;
        this.field3945 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ls.b(Lls;Lls;I)V")
    public void method5319(class324 arg0, class324 arg1) {
        this.method5320(arg0, arg1);
        this.method5321(arg0, arg1);
    }

    @ObfuscatedName("ls.z(Lls;Lls;I)V")
    public void method5320(class324 arg0, class324 arg1) {
        arg1.field3948 = this.field3948;
        arg1.field3947 = this.field3947;
        if (this.field3948 < arg0.field3948) {
            arg1.field3947 -= arg0.field3948 - this.field3948;
            arg1.field3948 = arg0.field3948;
        }
        if (arg1.method5333() > arg0.method5333()) {
            arg1.field3947 -= arg1.method5333() - arg0.method5333();
        }
        if (arg1.field3947 < 0) {
            arg1.field3947 = 0;
        }
    }

    @ObfuscatedName("ls.n(Lls;Lls;I)V")
    public void method5321(class324 arg0, class324 arg1) {
        arg1.field3946 = this.field3946;
        arg1.field3945 = this.field3945;
        if (this.field3946 < arg0.field3946) {
            arg1.field3945 -= arg0.field3946 - this.field3946;
            arg1.field3946 = arg0.field3946;
        }
        if (arg1.method5323() > arg0.method5323()) {
            arg1.field3945 -= arg1.method5323() - arg0.method5323();
        }
        if (arg1.field3945 < 0) {
            arg1.field3945 = 0;
        }
    }

    @ObfuscatedName("ls.l(B)I")
    public int method5333() {
        return this.field3948 + this.field3947;
    }

    @ObfuscatedName("ls.s(I)I")
    public int method5323() {
        return this.field3946 + this.field3945;
    }
}
