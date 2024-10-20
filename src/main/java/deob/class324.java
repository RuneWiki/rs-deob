package deob;

@ObfuscatedName("lj")
public class class324 {

    @ObfuscatedName("lj.d")
    public int field3940;

    @ObfuscatedName("lj.z")
    public int field3936;

    @ObfuscatedName("lj.n")
    public int field3938;

    @ObfuscatedName("lj.r")
    public int field3937;

    public class324(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class324(int arg0, int arg1, int arg2, int arg3) {
        this.method5303(arg0, arg1);
        this.method5299(arg2, arg3);
    }

    @ObfuscatedName("lj.d(III)V")
    public void method5303(int arg0, int arg1) {
        this.field3940 = arg0;
        this.field3936 = arg1;
    }

    @ObfuscatedName("lj.z(III)V")
    public void method5299(int arg0, int arg1) {
        this.field3938 = arg0;
        this.field3937 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lj.n(Llj;Llj;B)V")
    public void method5301(class324 arg0, class324 arg1) {
        this.method5302(arg0, arg1);
        this.method5308(arg0, arg1);
    }

    @ObfuscatedName("lj.r(Llj;Llj;B)V")
    public void method5302(class324 arg0, class324 arg1) {
        arg1.field3940 = this.field3940;
        arg1.field3938 = this.field3938;
        if (this.field3940 < arg0.field3940) {
            arg1.field3938 -= arg0.field3940 - this.field3940;
            arg1.field3940 = arg0.field3940;
        }
        if (arg1.method5304() > arg0.method5304()) {
            arg1.field3938 -= arg1.method5304() - arg0.method5304();
        }
        if (arg1.field3938 < 0) {
            arg1.field3938 = 0;
        }
    }

    @ObfuscatedName("lj.e(Llj;Llj;I)V")
    public void method5308(class324 arg0, class324 arg1) {
        arg1.field3936 = this.field3936;
        arg1.field3937 = this.field3937;
        if (this.field3936 < arg0.field3936) {
            arg1.field3937 -= arg0.field3936 - this.field3936;
            arg1.field3936 = arg0.field3936;
        }
        if (arg1.method5323() > arg0.method5323()) {
            arg1.field3937 -= arg1.method5323() - arg0.method5323();
        }
        if (arg1.field3937 < 0) {
            arg1.field3937 = 0;
        }
    }

    @ObfuscatedName("lj.y(I)I")
    public int method5304() {
        return this.field3940 + this.field3938;
    }

    @ObfuscatedName("lj.k(I)I")
    public int method5323() {
        return this.field3937 + this.field3936;
    }
}
