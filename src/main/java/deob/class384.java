package deob;

@ObfuscatedName("nm")
public class class384 {

    @ObfuscatedName("nm.v")
    public int field4330;

    @ObfuscatedName("nm.c")
    public int field4328;

    @ObfuscatedName("nm.i")
    public int field4329;

    @ObfuscatedName("nm.f")
    public int field4327;

    public class384(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class384(int arg0, int arg1, int arg2, int arg3) {
        this.method6281(arg0, arg1);
        this.method6296(arg2, arg3);
    }

    @ObfuscatedName("nm.v(III)V")
    public void method6281(int arg0, int arg1) {
        this.field4330 = arg0;
        this.field4328 = arg1;
    }

    @ObfuscatedName("nm.c(III)V")
    public void method6296(int arg0, int arg1) {
        this.field4329 = arg0;
        this.field4327 = arg1;
    }

    @ObfuscatedName("nm.i(III)Z")
    public boolean method6283(int arg0, int arg1) {
        return arg0 >= this.field4330 && arg0 < this.field4330 + this.field4329 && arg1 >= this.field4328 && arg1 < this.field4328 + this.field4327;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("nm.f(Lnm;Lnm;I)V")
    public void method6284(class384 arg0, class384 arg1) {
        this.method6285(arg0, arg1);
        this.method6286(arg0, arg1);
    }

    @ObfuscatedName("nm.b(Lnm;Lnm;S)V")
    public void method6285(class384 arg0, class384 arg1) {
        arg1.field4330 = this.field4330;
        arg1.field4329 = this.field4329;
        if (this.field4330 < arg0.field4330) {
            arg1.field4329 -= arg0.field4330 - this.field4330;
            arg1.field4330 = arg0.field4330;
        }
        if (arg1.method6304() > arg0.method6304()) {
            arg1.field4329 -= arg1.method6304() - arg0.method6304();
        }
        if (arg1.field4329 < 0) {
            arg1.field4329 = 0;
        }
    }

    @ObfuscatedName("nm.n(Lnm;Lnm;B)V")
    public void method6286(class384 arg0, class384 arg1) {
        arg1.field4328 = this.field4328;
        arg1.field4327 = this.field4327;
        if (this.field4328 < arg0.field4328) {
            arg1.field4327 -= arg0.field4328 - this.field4328;
            arg1.field4328 = arg0.field4328;
        }
        if (arg1.method6288() > arg0.method6288()) {
            arg1.field4327 -= arg1.method6288() - arg0.method6288();
        }
        if (arg1.field4327 < 0) {
            arg1.field4327 = 0;
        }
    }

    @ObfuscatedName("nm.s(B)I")
    public int method6304() {
        return this.field4330 + this.field4329;
    }

    @ObfuscatedName("nm.l(I)I")
    public int method6288() {
        return this.field4328 + this.field4327;
    }
}
