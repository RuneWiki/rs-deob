package deob;

@ObfuscatedName("lr")
public class class329 {

    @ObfuscatedName("lr.z")
    public int field3874;

    @ObfuscatedName("lr.k")
    public int field3872;

    @ObfuscatedName("lr.s")
    public int field3871;

    @ObfuscatedName("lr.t")
    public int field3873;

    public class329(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class329(int arg0, int arg1, int arg2, int arg3) {
        this.method5618(arg0, arg1);
        this.method5620(arg2, arg3);
    }

    @ObfuscatedName("lr.z(III)V")
    public void method5618(int arg0, int arg1) {
        this.field3874 = arg0;
        this.field3872 = arg1;
    }

    @ObfuscatedName("lr.k(III)V")
    public void method5620(int arg0, int arg1) {
        this.field3871 = arg0;
        this.field3873 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lr.s(Llr;Llr;S)V")
    public void method5621(class329 arg0, class329 arg1) {
        this.method5622(arg0, arg1);
        this.method5619(arg0, arg1);
    }

    @ObfuscatedName("lr.t(Llr;Llr;I)V")
    public void method5622(class329 arg0, class329 arg1) {
        arg1.field3874 = this.field3874;
        arg1.field3871 = this.field3871;
        if (this.field3874 < arg0.field3874) {
            arg1.field3871 -= arg0.field3874 - this.field3874;
            arg1.field3874 = arg0.field3874;
        }
        if (arg1.method5623() > arg0.method5623()) {
            arg1.field3871 -= arg1.method5623() - arg0.method5623();
        }
        if (arg1.field3871 < 0) {
            arg1.field3871 = 0;
        }
    }

    @ObfuscatedName("lr.i(Llr;Llr;I)V")
    public void method5619(class329 arg0, class329 arg1) {
        arg1.field3872 = this.field3872;
        arg1.field3873 = this.field3873;
        if (this.field3872 < arg0.field3872) {
            arg1.field3873 -= arg0.field3872 - this.field3872;
            arg1.field3872 = arg0.field3872;
        }
        if (arg1.method5624() > arg0.method5624()) {
            arg1.field3873 -= arg1.method5624() - arg0.method5624();
        }
        if (arg1.field3873 < 0) {
            arg1.field3873 = 0;
        }
    }

    @ObfuscatedName("lr.o(I)I")
    public int method5623() {
        return this.field3874 + this.field3871;
    }

    @ObfuscatedName("lr.x(B)I")
    public int method5624() {
        return this.field3873 + this.field3872;
    }
}
