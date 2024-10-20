package deob;

@ObfuscatedName("lh")
public class class319 {

    @ObfuscatedName("lh.s")
    public int field3843;

    @ObfuscatedName("lh.j")
    public int field3841;

    @ObfuscatedName("lh.i")
    public int field3842;

    @ObfuscatedName("lh.k")
    public int field3840;

    public class319(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class319(int arg0, int arg1, int arg2, int arg3) {
        this.method5443(arg0, arg1);
        this.method5464(arg2, arg3);
    }

    @ObfuscatedName("lh.s(IIB)V")
    public void method5443(int arg0, int arg1) {
        this.field3843 = arg0;
        this.field3841 = arg1;
    }

    @ObfuscatedName("lh.j(III)V")
    public void method5464(int arg0, int arg1) {
        this.field3842 = arg0;
        this.field3840 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("lh.i(Llh;Llh;B)V")
    public void method5446(class319 arg0, class319 arg1) {
        this.method5469(arg0, arg1);
        this.method5448(arg0, arg1);
    }

    @ObfuscatedName("lh.k(Llh;Llh;I)V")
    public void method5469(class319 arg0, class319 arg1) {
        arg1.field3843 = this.field3843;
        arg1.field3842 = this.field3842;
        if (this.field3843 < arg0.field3843) {
            arg1.field3842 -= arg0.field3843 - this.field3843;
            arg1.field3843 = arg0.field3843;
        }
        if (arg1.method5447() > arg0.method5447()) {
            arg1.field3842 -= arg1.method5447() - arg0.method5447();
        }
        if (arg1.field3842 < 0) {
            arg1.field3842 = 0;
        }
    }

    @ObfuscatedName("lh.u(Llh;Llh;I)V")
    public void method5448(class319 arg0, class319 arg1) {
        arg1.field3841 = this.field3841;
        arg1.field3840 = this.field3840;
        if (this.field3841 < arg0.field3841) {
            arg1.field3840 -= arg0.field3841 - this.field3841;
            arg1.field3841 = arg0.field3841;
        }
        if (arg1.method5442() > arg0.method5442()) {
            arg1.field3840 -= arg1.method5442() - arg0.method5442();
        }
        if (arg1.field3840 < 0) {
            arg1.field3840 = 0;
        }
    }

    @ObfuscatedName("lh.n(I)I")
    public int method5447() {
        return this.field3843 + this.field3842;
    }

    @ObfuscatedName("lh.t(I)I")
    public int method5442() {
        return this.field3841 + this.field3840;
    }
}
