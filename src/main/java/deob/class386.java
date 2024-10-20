package deob;

@ObfuscatedName("nk")
public class class386 {

    @ObfuscatedName("nk.c")
    public int field4421;

    @ObfuscatedName("nk.p")
    public int field4420;

    @ObfuscatedName("nk.f")
    public int field4422;

    @ObfuscatedName("nk.n")
    public int field4419;

    public class386(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class386(int arg0, int arg1, int arg2, int arg3) {
        this.method6421(arg0, arg1);
        this.method6422(arg2, arg3);
    }

    @ObfuscatedName("nk.c(III)V")
    public void method6421(int arg0, int arg1) {
        this.field4421 = arg0;
        this.field4420 = arg1;
    }

    @ObfuscatedName("nk.p(III)V")
    public void method6422(int arg0, int arg1) {
        this.field4422 = arg0;
        this.field4419 = arg1;
    }

    @ObfuscatedName("nk.f(III)Z")
    public boolean method6442(int arg0, int arg1) {
        return arg0 >= this.field4421 && arg0 < this.field4422 + this.field4421 && arg1 >= this.field4420 && arg1 < this.field4420 + this.field4419;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("nk.n(Lnk;Lnk;B)V")
    public void method6425(class386 arg0, class386 arg1) {
        this.method6426(arg0, arg1);
        this.method6427(arg0, arg1);
    }

    @ObfuscatedName("nk.k(Lnk;Lnk;I)V")
    public void method6426(class386 arg0, class386 arg1) {
        arg1.field4421 = this.field4421;
        arg1.field4422 = this.field4422;
        if (this.field4421 < arg0.field4421) {
            arg1.field4422 -= arg0.field4421 - this.field4421;
            arg1.field4421 = arg0.field4421;
        }
        if (arg1.method6446() > arg0.method6446()) {
            arg1.field4422 -= arg1.method6446() - arg0.method6446();
        }
        if (arg1.field4422 < 0) {
            arg1.field4422 = 0;
        }
    }

    @ObfuscatedName("nk.w(Lnk;Lnk;B)V")
    public void method6427(class386 arg0, class386 arg1) {
        arg1.field4420 = this.field4420;
        arg1.field4419 = this.field4419;
        if (this.field4420 < arg0.field4420) {
            arg1.field4419 -= arg0.field4420 - this.field4420;
            arg1.field4420 = arg0.field4420;
        }
        if (arg1.method6434() > arg0.method6434()) {
            arg1.field4419 -= arg1.method6434() - arg0.method6434();
        }
        if (arg1.field4419 < 0) {
            arg1.field4419 = 0;
        }
    }

    @ObfuscatedName("nk.s(I)I")
    public int method6446() {
        return this.field4422 + this.field4421;
    }

    @ObfuscatedName("nk.q(I)I")
    public int method6434() {
        return this.field4420 + this.field4419;
    }
}
