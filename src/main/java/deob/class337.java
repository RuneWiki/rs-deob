package deob;

@ObfuscatedName("lo")
public class class337 {

    @ObfuscatedName("lo.s")
    public int field3925;

    @ObfuscatedName("lo.t")
    public int field3922;

    @ObfuscatedName("lo.v")
    public int field3923;

    @ObfuscatedName("lo.j")
    public int field3921;

    public class337(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class337(int arg0, int arg1, int arg2, int arg3) {
        this.method5374(arg0, arg1);
        this.method5375(arg2, arg3);
    }

    @ObfuscatedName("lo.s(III)V")
    public void method5374(int arg0, int arg1) {
        this.field3925 = arg0;
        this.field3922 = arg1;
    }

    @ObfuscatedName("lo.t(IIB)V")
    public void method5375(int arg0, int arg1) {
        this.field3923 = arg0;
        this.field3921 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lo.v(Llo;Llo;I)V")
    public void method5376(class337 arg0, class337 arg1) {
        this.method5378(arg0, arg1);
        this.method5384(arg0, arg1);
    }

    @ObfuscatedName("lo.j(Llo;Llo;S)V")
    public void method5378(class337 arg0, class337 arg1) {
        arg1.field3925 = this.field3925;
        arg1.field3923 = this.field3923;
        if (this.field3925 < arg0.field3925) {
            arg1.field3923 -= arg0.field3925 - this.field3925;
            arg1.field3925 = arg0.field3925;
        }
        if (arg1.method5379() > arg0.method5379()) {
            arg1.field3923 -= arg1.method5379() - arg0.method5379();
        }
        if (arg1.field3923 < 0) {
            arg1.field3923 = 0;
        }
    }

    @ObfuscatedName("lo.l(Llo;Llo;B)V")
    public void method5384(class337 arg0, class337 arg1) {
        arg1.field3922 = this.field3922;
        arg1.field3921 = this.field3921;
        if (this.field3922 < arg0.field3922) {
            arg1.field3921 -= arg0.field3922 - this.field3922;
            arg1.field3922 = arg0.field3922;
        }
        if (arg1.method5380() > arg0.method5380()) {
            arg1.field3921 -= arg1.method5380() - arg0.method5380();
        }
        if (arg1.field3921 < 0) {
            arg1.field3921 = 0;
        }
    }

    @ObfuscatedName("lo.n(I)I")
    public int method5379() {
        return this.field3925 + this.field3923;
    }

    @ObfuscatedName("lo.w(I)I")
    public int method5380() {
        return this.field3922 + this.field3921;
    }
}
