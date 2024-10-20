package deob;

@ObfuscatedName("iq")
public class class243 implements class246 {

    @ObfuscatedName("iq.c")
    public int field2884;

    @ObfuscatedName("iq.p")
    public int field2886;

    @ObfuscatedName("iq.f")
    public int field2882;

    @ObfuscatedName("iq.n")
    public int field2883;

    @ObfuscatedName("iq.k")
    public int field2881;

    @ObfuscatedName("iq.w")
    public int field2885;

    @ObfuscatedName("iq.c(Lht;I)V")
    public void method4310(class226 arg0) {
        if (arg0.field2737 > this.field2881) {
            arg0.field2737 = this.field2881;
        }
        if (arg0.field2745 < this.field2881) {
            arg0.field2745 = this.field2881;
        }
        if (arg0.field2739 > this.field2885) {
            arg0.field2739 = this.field2885;
        }
        if (arg0.field2731 < this.field2885) {
            arg0.field2731 = this.field2885;
        }
    }

    @ObfuscatedName("iq.p(IIIB)Z")
    public boolean method4311(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2884 && arg0 < this.field2886 + this.field2884) {
            return arg1 >> 6 == this.field2882 && arg2 >> 6 == this.field2883;
        } else {
            return false;
        }
    }

    @ObfuscatedName("iq.f(III)Z")
    public boolean method4312(int arg0, int arg1) {
        return arg0 >> 6 == this.field2881 && arg1 >> 6 == this.field2885;
    }

    @ObfuscatedName("iq.n(IIIB)[I")
    public int[] method4313(int arg0, int arg1, int arg2) {
        return this.method4311(arg0, arg1, arg2) ? new int[] { this.field2881 * 64 - this.field2882 * 64 + arg1, this.field2885 * 64 - this.field2883 * 64 + arg2 } : null;
    }

    @ObfuscatedName("iq.k(III)Lkz;")
    public class291 method4331(int arg0, int arg1) {
        if (this.method4312(arg0, arg1)) {
            int var3 = this.field2882 * 64 - this.field2881 * 64 + arg0;
            int var4 = this.field2883 * 64 - this.field2885 * 64 + arg1;
            return new class291(this.field2884, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("iq.w(Lqq;I)V")
    public void method4317(class445 arg0) {
        this.field2884 = arg0.method7196();
        this.field2886 = arg0.method7196();
        this.field2882 = arg0.method7198();
        this.field2883 = arg0.method7198();
        this.field2881 = arg0.method7198();
        this.field2885 = arg0.method7198();
        this.method4668();
    }

    @ObfuscatedName("iq.s(I)V")
    public void method4668() {
    }
}
