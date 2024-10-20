package deob;

@ObfuscatedName("nh")
public class class385 {

    @ObfuscatedName("nh.s")
    public int field4378;

    @ObfuscatedName("nh.h")
    public int field4379;

    @ObfuscatedName("nh.w")
    public int field4382;

    @ObfuscatedName("nh.v")
    public int field4381;

    public class385(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class385(int arg0, int arg1, int arg2, int arg3) {
        this.method6186(arg0, arg1);
        this.method6198(arg2, arg3);
    }

    @ObfuscatedName("nh.s(IIB)V")
    public void method6186(int arg0, int arg1) {
        this.field4378 = arg0;
        this.field4379 = arg1;
    }

    @ObfuscatedName("nh.h(III)V")
    public void method6198(int arg0, int arg1) {
        this.field4382 = arg0;
        this.field4381 = arg1;
    }

    @ObfuscatedName("nh.w(III)Z")
    public boolean method6193(int arg0, int arg1) {
        return arg0 >= this.field4378 && arg0 < this.field4382 + this.field4378 && arg1 >= this.field4379 && arg1 < this.field4381 + this.field4379;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("nh.v(Lnh;Lnh;B)V")
    public void method6188(class385 arg0, class385 arg1) {
        this.method6187(arg0, arg1);
        this.method6190(arg0, arg1);
    }

    @ObfuscatedName("nh.c(Lnh;Lnh;B)V")
    public void method6187(class385 arg0, class385 arg1) {
        arg1.field4378 = this.field4378;
        arg1.field4382 = this.field4382;
        if (this.field4378 < arg0.field4378) {
            arg1.field4382 -= arg0.field4378 - this.field4378;
            arg1.field4378 = arg0.field4378;
        }
        if (arg1.method6191() > arg0.method6191()) {
            arg1.field4382 -= arg1.method6191() - arg0.method6191();
        }
        if (arg1.field4382 < 0) {
            arg1.field4382 = 0;
        }
    }

    @ObfuscatedName("nh.q(Lnh;Lnh;I)V")
    public void method6190(class385 arg0, class385 arg1) {
        arg1.field4379 = this.field4379;
        arg1.field4381 = this.field4381;
        if (this.field4379 < arg0.field4379) {
            arg1.field4381 -= arg0.field4379 - this.field4379;
            arg1.field4379 = arg0.field4379;
        }
        if (arg1.method6192() > arg0.method6192()) {
            arg1.field4381 -= arg1.method6192() - arg0.method6192();
        }
        if (arg1.field4381 < 0) {
            arg1.field4381 = 0;
        }
    }

    @ObfuscatedName("nh.i(B)I")
    public int method6191() {
        return this.field4382 + this.field4378;
    }

    @ObfuscatedName("nh.k(B)I")
    public int method6192() {
        return this.field4381 + this.field4379;
    }
}
